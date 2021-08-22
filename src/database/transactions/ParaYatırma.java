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

public class ParaYatırma extends DBconnection implements IBilgicontroller {

    public boolean paraYatırıldıMı() {
        if (bilgilergecerlimi()) {
            String query = "UPDATE kullanıcı_bakiye "
                    + "SET bakiye = bakiye + '" + this.yatırılacakMiktar + "'"    //SORGU İLE PARA YATIRMA
                    + " WHERE kullanici_id = '" + gethesapbilgileri().getKullanıcıid() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                gethesapbilgileri().setBakiye(gethesapbilgileri().getBakiye()+this.yatırılacakMiktar);
            } catch (SQLException ex) {
                Logger.getLogger(ParaYatırma.class.getName()).log(Level.SEVERE, null, ex);
            }

            return true;
        } else {
            return false;
        }

    }

    private int yatırılacakMiktar = 0;

    @Override
    public boolean bilgilergecerlimi() {
        return !(yatırılacakMiktar == 0);

    }

    @Override
    public HesapBilgileri gethesapbilgileri() {
        return HesapBilgileri.getInstance();
    }

    public int getYatırılacakMiktar() {
        return yatırılacakMiktar;
    }

    public void setYatırılacakMiktar(int yatırılacakMiktar) {
        this.yatırılacakMiktar = yatırılacakMiktar;
    }

}
