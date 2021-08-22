/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ayarlar;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author EYMEN SEZEN
 */
/*
Arkaplan ve yazı renk ayarları
*/
public class Butonayarlari {
    private static  Color originalBgColor,originalFgColor;
    public static void setBgFg (JButton button ,Color Bgcolor ,Color Fgcolor)//arka ön renkler icin
    {
    originalBgColor = button.getBackground();
    originalFgColor=button.getForeground();
    button.setBackground(Bgcolor);
    button.setForeground(Fgcolor);
    }
    public static void OriginalSetBgFg (JButton button)
    {
    button.setBackground(originalBgColor);
    button.setForeground(originalFgColor);
    
    }
            
            }
