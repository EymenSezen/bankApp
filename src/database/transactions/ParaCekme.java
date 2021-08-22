/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.transactions;

import database.DBconnection;
import database.IBilgicontroller;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.ResultSet;

/**
 *
 * @author EYMEN
 */
public class ParaCekme extends DBconnection implements IBilgicontroller{
    private int cekilecekMiktar=0;

    @Override
    public boolean bilgilergecerlimi() {
   
        return !(this.cekilecekMiktar==0
                ||gethesapbilgileri().getBakiye()<this.cekilecekMiktar);//bakiye cekilecek miktardan kücükse
    }
    public boolean paracekildiMi()
    {
    if(bilgilergecerlimi())
    {
    
    String query="UPDATE kullanıcı_bakiye "
            + "SET bakiye = bakiye - '" +this.cekilecekMiktar + "'"
            + " WHERE kullanici_id = '" +gethesapbilgileri().getKullanıcıid() + "'";
        try {
            super.statement=super.connection.createStatement();
            statement.executeUpdate(query);
            gethesapbilgileri().setBakiye(gethesapbilgileri().getBakiye() - this.cekilecekMiktar);
        } catch (SQLException ex) {
            Logger.getLogger(ParaCekme.class.getName()).log(Level.SEVERE, null, ex);
        }
    return true;
    }
    else
    {
    return false;
    }
        
        
    }
    @Override
    public HesapBilgileri gethesapbilgileri() {
        return HesapBilgileri.getInstance();
    }

    public int getCekilecekMiktar() {
        return cekilecekMiktar;
    }

    public void setCekilecekMiktar(int cekilecekMiktar) {
        this.cekilecekMiktar = cekilecekMiktar;
    }
    
    
}
