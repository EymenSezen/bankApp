/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.transactions;

import database.DBVeriMerkezi;
import database.DBconnection;
import database.IBilgicontroller;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author EYMEN SEZEN
 */
public class HesapBilgileri extends DBVeriMerkezi implements IBilgicontroller {//hesaba girildiğinde çağrılacak //singleton yapısı veri çekmek ve statik olarak kontrol etmek için 

    /**
     * tek bir obje uzerinden her sınıfa erişeceğiz SINGLETON BU ŞEKİLDEDİR
     */
    
    /*
    *Singleton
    */
    private static HesapBilgileri hesapbilgileri = null;
    public static HesapBilgileri getInstance() {
        if (hesapbilgileri == null) {
            hesapbilgileri = new HesapBilgileri();
        }
        return hesapbilgileri;
    }

    
    public void girisYap(String musteriKimlik) {
        this.kullaniciyiAl(musteriKimlik);
        this.bakiyeAl();
        this.faturalariAl();
    }
    public void cikisYap()
    {
        super.kullanıcıid = 0;
        super.adsoyad = null;
        super.telno = null;
        super.müşterino = null;
        super.tcno = null;
        super.bakiye = 0;
        super.elektrikfat = 0;
        super.sufat = 0;
        super.doğalgazfat = 0;
        super.internetfat = 0;

        
    }
    /*
    
    KULLANICI HESAP BİLGİLERİNİ ALMA 
    
    */
    
    
     private void kullaniciyiAl(String musteriKimlik) {
        String query = "SELECT * FROM kullanıcılar WHERE "
                + "tc_no = '" + musteriKimlik + "'"
                + " OR "
                + "musteri_no = '" + musteriKimlik + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                super.kullanıcıid = rs.getInt("kullanici_id");
                super.adsoyad = rs.getNString("ad_soyad");
                super.tcno = rs.getNString("tc_no");
                super.telno = rs.getNString("tel_no");
                super.müşterino = rs.getNString("musteri_no");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

private void bakiyeAl()
{
    if(this.bilgilergecerlimi())
    {
    String query = "SELECT * FROM kullanıcı_bakiye "
            + " WHERE "
            + "kullanici_id= '"+super.getKullanıcıid()+"'";
        try {
            super.statement=super.connection.createStatement();
            
            ResultSet rs=statement.executeQuery(query);
            while(rs.next())
            {
            super.bakiye=rs.getDouble("bakiye");
            }         
                    } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }


}
private void faturalariAl()
{
if(this.bilgilergecerlimi())
    {
    String query = "SELECT * FROM kullanıcı_faturalar "
            + " WHERE "
            + "kullanici_id= '"+super.getKullanıcıid()+"'";
        try {
            super.statement=super.connection.createStatement();
            
            ResultSet rs=statement.executeQuery(query);
            while(rs.next())
            {
            super.elektrikfat=rs.getDouble("elektrik");
            super.sufat=rs.getDouble("su");
            super.internetfat=rs.getDouble("internet");
            super.doğalgazfat=rs.getDouble("doğalgaz");
            }         
                    } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
  
}


}

    @Override
    public boolean bilgilergecerlimi() {
         return !(super.kullanıcıid==0);
    }

    @Override
    public HesapBilgileri gethesapbilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}

