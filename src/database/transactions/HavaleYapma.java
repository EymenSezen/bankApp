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
public class HavaleYapma extends DBconnection implements IBilgicontroller {

    private int gonderilecekMiktar = 0;
    private String havaleAlacakKisi = null;

    @Override
    public boolean bilgilergecerlimi() {
        return !(this.gonderilecekMiktar == 0
                || this.havaleAlacakKisi == null
                || this.gonderilecekMiktar > gethesapbilgileri().getBakiye()
                || this.havaleAlacakKisi.equals(gethesapbilgileri().getMüşterino()));//kullanıcı kendine havale yapamasın
    }

    @Override
    public HesapBilgileri gethesapbilgileri() {
        return HesapBilgileri.getInstance();
    }

    public int getGonderilecekMiktar() {
        return gonderilecekMiktar;
    }

    public void setGonderilecekMiktar(int gonderilecekMiktar) {
        this.gonderilecekMiktar = gonderilecekMiktar;
    }

    public String getHavaleAlacakKisi() {
        return havaleAlacakKisi;
    }

    public void setHavaleAlacakKisi(String havaleAlacakKisi) {
        this.havaleAlacakKisi = havaleAlacakKisi;
    }

    public boolean havaleYapıldıMı() {
        if (bilgilergecerlimi()) {
            //sorgular morgular gazlar mazlar
       String query = "UPDATE kullanıcı_bakiye "
                    + "SET bakiye = bakiye - '" + this.gonderilecekMiktar + "'"
                    + " WHERE kullanici_id = '" + gethesapbilgileri().getKullanıcıid()+ "'";
            String query2 = "UPDATE kullanıcı_bakiye "
                    + "SET bakiye = bakiye + '" + this.gonderilecekMiktar + "'"
                    + " WHERE musteri_no = '" + this.havaleAlacakKisi + "'";
            try {
                super.statement = super.connection.createStatement();
                if(statement.executeUpdate(query2) == 1) {
                    statement.executeUpdate(query);
                    gethesapbilgileri().setBakiye(gethesapbilgileri().getBakiye() - this.gonderilecekMiktar);
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(HavaleYapma.class.getName()).log(Level.SEVERE, null, ex);
                return false;
}

        } else {
            return false;
        }

    }

}
