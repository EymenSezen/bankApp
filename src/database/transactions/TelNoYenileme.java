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

/**
 *
 * @author EYMEN
 */
public class TelNoYenileme extends DBconnection implements IBilgicontroller {

    String telNo = null;

    @Override
    public boolean bilgilergecerlimi() {

        return !(this.telNo == null
                || Textayarlari.uzunlukSundanKucukMu(11, telNo));
    }

    @Override
    public HesapBilgileri gethesapbilgileri() {
        return HesapBilgileri.getInstance();
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public boolean telNoYenilendiMi() {
        if (bilgilergecerlimi()) {
            String query = "UPDATE kullanıcılar "
                    + "SET tel_no = '" + this.telNo + "'"
                    + " WHERE kullanici_id = '" + gethesapbilgileri().getKullanıcıid() + "'";
         
            try {
                
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                gethesapbilgileri().setTelno(this.telNo);
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(TelNoYenileme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
                

            return true;
        } else {
            return false;
        }
    }

}
