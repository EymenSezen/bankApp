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

/**
 *
 * @author EYMEN
 */
public class FaturaOdemeleri extends DBconnection implements IBilgicontroller {

    private String faturaIsmi = null;
    private double faturaTutarı = 0;

    public boolean faturaOdendiMi() {
        if (bilgilergecerlimi()) {
            String query ="UPDATE kullanıcı_faturalar "
                    + "SET "+this.faturaIsmi+" =0 "
                    + "WHERE kullanici_id = '"+gethesapbilgileri().getKullanıcıid() + "'";
            try {
                
                super.statement=super.connection.createStatement();
                statement.executeUpdate(query);//guncelleme için bu şekilde
                this.bakiyeAzalt();
                this.faturayiSifirla();
            } catch (SQLException ex) {
                Logger.getLogger(FaturaOdemeleri.class.getName()).log(Level.SEVERE, null, ex);
            }
          return true;  
        }
        else
        {
        return false;
        }
    }

    @Override
    public boolean bilgilergecerlimi() {
        return !(this.faturaIsmi == null
                || this.faturaTutarı == 0
                || gethesapbilgileri().getBakiye()<this.faturaTutarı);

    }

    @Override
    public HesapBilgileri gethesapbilgileri() {
        return HesapBilgileri.getInstance();
    }
    private void bakiyeAzalt()
    {
    String query = "UPDATE kullanıcı_bakiye "
                + "SET bakiye = bakiye - '" + this.faturaTutarı + "'"
                + " WHERE kullanici_id = '" + gethesapbilgileri().getKullanıcıid() + "'";
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
            gethesapbilgileri().setBakiye(gethesapbilgileri().getBakiye() - this.faturaTutarı);
        } catch (SQLException ex) {
            Logger.getLogger(FaturaOdemeleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void faturayiSifirla() {
        if(bilgilergecerlimi()) {
            switch(this.faturaIsmi) {
                case "elektrik":
                    gethesapbilgileri().setElektrikfat(0);
                    break;
                case "su":
                    gethesapbilgileri().setSufat(0);
                    break;
                case "doğalgaz":
                    gethesapbilgileri().setDoğalgazfat(0);
                    break;
                case "internet":
                    gethesapbilgileri().setInternetfat(0);
                    break;
            } 
        }
    }

    public String getFaturaIsmi() {
        return faturaIsmi;
    }

    public void setFaturaIsmi(String faturaIsmi) {
        this.faturaIsmi = faturaIsmi;
    }

    public double getFaturaTutarı() {
        return faturaTutarı;
    }

    public void setFaturaTutarı(double faturaTutarı) {
        this.faturaTutarı = faturaTutarı;
    }

}
