/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.transactions;

import database.DBconnection;
import database.IBilgicontroller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author EYMEN
 */
public class KullaniciGiris extends DBconnection implements IBilgicontroller {

    private String musteriKimlik = null;
    private String sifre = null;

    @Override
    public boolean bilgilergecerlimi() {
        return !(this.musteriKimlik == null
                || this.sifre == null);

    }

    private boolean girisBasariliMi() {
    String query = "SELECT tc_no,musteri_no,sifre FROM kullanıcılar"
                + " WHERE "
                + "(tc_no = '" + this.musteriKimlik + "'"
                + " OR "//musteri numarası veya musteri tcsi ile giris
                + "musteri_no = '" + this.musteriKimlik + "')"
                + " AND "
                + "sifre = '" + this.sifre + "'";
        try {
            super.statement=super.connection.createStatement();
            ResultSet rs=statement.executeQuery(query);
            while (rs.next())
            {
            return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
               return false;
               
    }


    public boolean girisBilgileriDogruMu() {
        if (bilgilergecerlimi()) {
            if (girisBasariliMi()) {
                this.gethesapbilgileri().girisYap(musteriKimlik);
                return true;

            } else {
                return false;
            }

        } else {

            return false;
        }
    }

    @Override
    public HesapBilgileri gethesapbilgileri() {
          return HesapBilgileri.getInstance();
    }

    public String getMusteriKimlik() {
        return musteriKimlik;
    }

    public void setMusteriKimlik(String musteriKimlik) {
        this.musteriKimlik = musteriKimlik;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

}
