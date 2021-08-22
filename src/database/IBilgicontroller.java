/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.transactions.HesapBilgileri;

/**
 *
 * @author EYMEN SEZEN
 */
public interface IBilgicontroller {
    public boolean bilgilergecerlimi();
    public HesapBilgileri gethesapbilgileri();
}
