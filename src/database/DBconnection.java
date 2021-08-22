/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EYMEN SEZEN
 */
public class DBconnection {//super class //d,ğer sınıflarda da kullanacağımız için
    private final String HOST="localhost";
    private final String PORT="3340";//MYSQLİN PORT NUMBERI
    private final String VERITABANI_ISMI="eymenbank";
    private final String USER="root";
    private final String PASSWORD="";
    protected Connection connection=null;
    public Statement statement = null;//sorgu çalıştırma için    

    public DBconnection() {
        String url="jdbc:mysql://"+this.HOST+":"+this.PORT+"/"+this.VERITABANI_ISMI;//bu şekilde bağlanacak.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.connection=DriverManager.getConnection(url, this.USER, this.PASSWORD);
            System.out.println("bağlantı başarılı");
        } catch (SQLException ex) {
            System.out.println("bağlantı başarısız");
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    public Connection getConnection() {
        return connection;

    }
}
