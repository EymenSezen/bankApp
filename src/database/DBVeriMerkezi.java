/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.*;

/**
 *
 * @author EYMEN SEZEN
 */
public class DBVeriMerkezi extends DBconnection {
    protected int kullanıcıid=0;
    protected String telno,tcno,müşterino,adsoyad;
    protected double bakiye;
    protected double elektrikfat,sufat,doğalgazfat,internetfat;
//diğer sınıflardan ulaşabilmek için
    public int getKullanıcıid() {
        return kullanıcıid;
    }

    public void setKullanıcıid(int kullanıcıid) {
        this.kullanıcıid = kullanıcıid;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getTcno() {
        return tcno;
    }

    public void setTcno(String tcno) {
        this.tcno = tcno;
    }

    public String getMüşterino() {
        return müşterino;
    }

    public void setMüşterino(String müşterino) {
        this.müşterino = müşterino;
    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public double getElektrikfat() {
        return elektrikfat;
    }

    public void setElektrikfat(double elektrikfat) {
        this.elektrikfat = elektrikfat;
    }

    public double getSufat() {
        return sufat;
    }

    public void setSufat(double sufat) {
        this.sufat = sufat;
    }

    public double getDoğalgazfat() {
        return doğalgazfat;
    }

    public void setDoğalgazfat(double doğalgazfat) {
        this.doğalgazfat = doğalgazfat;
    }

    public double getInternetfat() {
        return internetfat;
    }

    public void setInternetfat(double internetfat) {
        this.internetfat = internetfat;
    }
}
