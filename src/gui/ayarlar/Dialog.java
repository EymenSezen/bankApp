/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author EYMEN
 */
public class Dialog {
    public static void bosOlamazMesajiGoster(JFrame frame )
    {
    JOptionPane.showMessageDialog(frame, "Tüm Alanlar dolu olmalıdır.");
    }
    public static void ozelMesajGoster(JFrame frame,String message)
    {
    JOptionPane.showMessageDialog(frame, message);
    }
    public static int onayMesajiGoster(JFrame frame,String message)
    {
     int optionType = JOptionPane.YES_NO_OPTION;
        int selected = JOptionPane.showConfirmDialog(frame, message, "UYARI", optionType);
        //System.out.println(selected);
        if(optionType == selected) {//optiontype ile selected aynı olursa eşit 1 olur ve çıkış yapar
            return 1;
        }
        return 0;

    }
}
