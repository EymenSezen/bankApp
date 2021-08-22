/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ayarlar;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author EYMEN SEZEN
 */

/*
Text Odaklanma ayarları
 */
public class Textayarlari {

    private static String OriginalText;
    private static Color OriginalFgColor;//color import

    public static void checkthefocusgained(JTextField textfield, String org) {
        OriginalText = org;
        if (textfield.getText().trim().equals(org)) {
            OriginalFgColor = textfield.getForeground();
            textfield.setText("");
            textfield.setForeground(Color.blue);
        }
    }

    public static void checkthefocuslost(JTextField textfield) {
        if (textfield.getText().trim().equals("")) {
            textfield.setText(OriginalText);
            textfield.setForeground(OriginalFgColor);//tekrar gönderdik boş olunca
        } else {
            textfield.setForeground(Color.black);
        }

    }

    //KEY AYARI
    /*
    Key Ayarları
     */
    public static void setonlynumber(JTextField textfield) {
        textfield.addKeyListener(new KeyAdapter() {
            @Override

            public void keyTyped(KeyEvent e) {
                // super.keyTyped(e);
                char c = e.getKeyChar();
                if (!Character.isDigit(c))//isdigit rakam kotrolcusu
                {
                    e.consume();//devre dısı bırak harf icin
                }
            }
        }
        );

    }

    /*SADECE HARF AYARI*/
    public static void setonlyAlphabetic(JTextField textfield) {
        textfield.addKeyListener(new KeyAdapter() {
            @Override

            public void keyTyped(KeyEvent e) {
                // super.keyTyped(e);
                char c = e.getKeyChar();
                if (!Character.isAlphabetic(c) && c != KeyEvent.VK_SPACE)//isalphabetic HARF kotrolcusu
                {
                    e.consume();//devre dısı bırak sayı icin
                }
            }
        }
        );

    }
    /*
    limit ayarları
     */
    private static int limit;

    public static void setlimitayarla(JTextField textfield, int lim) {
        limit = lim;
        textfield.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) {
                    return;
                }
                if ((getLength() + str.length()) <= limit) {
                    super.insertString(offs, str, a); //To change body of generated methods, choose Tools | Templates.
                }
            }

        });

    }
    public static boolean uzunlukSundanKucukMu(int length,String st)
    {
    return (st.length()<length);
    }

    /*
    PARA MİKTARI AYARLARI
     */
    public static int checkthekeyreleased(JTextField textfield, int paralimit) {
        String text = textfield.getText();
        if (!text.equals("")) {
            int miktar = Integer.valueOf(text);
            if (miktar > paralimit) {
                miktar = paralimit;
                textfield.setText(String.valueOf(miktar));//textfieldimiza string olarak gönderdik
            }
            return miktar;
        }

        return 0;

    }

    /**
     * Text alanları kontrolü
     *
     */
    public static boolean textalanlarıDoluMu(JPanel panel) {//boş veri olmasın
        Component[] components = panel.getComponents();//paneli gönderip textfieldlara erişmesini sağlayacağız
        for (Component c : components) {
            if (c instanceof JTextField)//textfieldsa gir diyoruz //örneği ise intanceof
            {
                JTextField textfield = (JTextField) c;
                if (textfield.getText().trim().equals("")&&textfield.isEnabled()) {//aktifse ve dolu değilse
                    return false;
                }

            }
        }
        return true;
    }
}
