/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.transactions;

import database.DBconnection;
import database.IBilgicontroller;
import gui.ayarlar.Textayarlari;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author EYMEN SEZEN
 */
public class Kullanıcıbasvuru extends DBconnection implements IBilgicontroller {//basvuru ekranına alınacak bilgiler
    //basvuru bilgileri
   
    private String adSoyad = null, tcNo = null, telNo = null;
    private String guvenlikSorusu = null, guvenlikCevap = null;
    //bizim vereceğimiz bilgiler
    private String musteriNo = null;
    private String sifre = null;

    public boolean basvuruOnaylandiMi() {
        if (this.bilgilergecerlimi()) {//bilgiler null ve sayılar 11den kü.ükse false döndürecek
            if (this.tcNoTablodaVarMi()) {//tcno tabloda varsa false dönecek
                return false;
            } else {
                 this.basvuruyuOnayla();//tcno tabloda yoksa basvuru onaylanacak
                 return true;
            }

        } else {
       return false;
        }
       
        

    }
   
    private boolean tcNoTablodaVarMi() {
    String query = "SELECT tc_no FROM kullanıcılar WHERE tc_no = '" + this.tcNo + "'";
        try {  
            super.statement=super.connection.createStatement();
          ResultSet rs = statement.executeQuery(query);
          while(rs.next())//sorguyu dolaşmaya yarıyor...
          {
              
          return true;//eğer tabloda veri bulunmuşsa true dönecek 
              
          }
        } catch (SQLException ex) {
            Logger.getLogger(Kullanıcıbasvuru.class.getName()).log(Level.SEVERE, null, ex);
            
        }
     return false;
    
    }
    public boolean musteriNoTablodaVarMi() {
    String query="SELECT musteri_no FROM kullanıcılar WHERE musteri_no = '" + this.musteriNo + "'";
    try {  
            super.statement=super.connection.createStatement();
          ResultSet rs = statement.executeQuery(query);
          while(rs.next())//sorguyu dolaşmaya yarıyor...
          {
              
          return true;//eğer tabloda veri bulunmuşsa true dönecek 
              
          }
        } catch (SQLException ex) {
            Logger.getLogger(Kullanıcıbasvuru.class.getName()).log(Level.SEVERE, null, ex);
            
        }
     return false;
    
    }
     private void basvuruyuOnayla()
    {   /*sorgumuzu yazalım*/
         String query = "INSERT INTO kullanıcılar(musteri_no,sifre,"
                + "ad_soyad,tc_no,tel_no,guvenlik_sorusu,guvenlik_cevap)"
                + " VALUES("
                + "'" + this.musteriNo + "',"
                + "'" + this.sifre + "',"
                + "'" + this.adSoyad + "',"
                + "'" + this.tcNo + "',"
                + "'" + this.telNo + "',"
                + "'" + this.guvenlikSorusu + "',"
                + "'" + this.guvenlikCevap + "'"
                + ")";
//VERİ EKLEME KOMUTU
        try {
            super.statement=super.connection.createStatement();
            statement.executeUpdate(query);
                    } catch (SQLException ex) {
            Logger.getLogger(Kullanıcıbasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean bilgilergecerlimi() {
        return !(this.adSoyad == null
                || this.tcNo == null
                || this.guvenlikCevap == null
                || this.guvenlikSorusu == null
                || this.telNo == null
                || this.musteriNo == null
                || this.sifre == null
                || Textayarlari.uzunlukSundanKucukMu(11, this.tcNo)//11 değerini yapmak için
                || Textayarlari.uzunlukSundanKucukMu(11, this.telNo));
    }

    @Override
    public HesapBilgileri gethesapbilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
    
    getters and setters
     */
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getGuvenlikSorusu() {
        return guvenlikSorusu;
    }

    public void setGuvenlikSorusu(String guvenlikSorusu) {
        this.guvenlikSorusu = guvenlikSorusu;
    }

    public String getGuvenlikCevap() {
        return guvenlikCevap;
    }

    public void setGuvenlikCevap(String guvenlikCevap) {
        this.guvenlikCevap = guvenlikCevap;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

   

}
