/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.DBconnection;
import database.IBilgicontroller;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciGiris;
import gui.ayarlar.Actionayarlari;
import gui.ayarlar.Butonayarlari;
import gui.ayarlar.Dialog;
import gui.ayarlar.IDuzenleyici;//importun sıkıntısı ne çözemedim hala override olmuyor bir türlü
import gui.ayarlar.Textayarlari;
import java.awt.Color;

/**
 *
 * @author EYMEN SEZEN
 */
public final class girisekrani extends javax.swing.JFrame implements IDuzenleyici,IBilgicontroller {

    private final String KIMLIK_TEXT_ORIGINAL ="TC NO:";//tc kısmı icin bg
    private final String SIFRE_TEXT_ORIGINAL ="********";//sifre kısmı icin bg
    private KullaniciGiris kullanicigirisobject=null;
    public girisekrani() {
        initComponents();
        getedits();//her ekran için tekrar kullanabilmek adına method oluşturduk
        
        new DBconnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisekranipanelii = new javax.swing.JPanel();
        hosgeldinizyazisi = new javax.swing.JLabel();
        kimliksatiri = new javax.swing.JTextField();
        şifresatiri = new javax.swing.JPasswordField();
        girisbutonu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        basvurbutonu = new javax.swing.JButton();
        şifreunutlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("eymenbankgirisekrani");

        girisekranipanelii.setBackground(new java.awt.Color(255, 51, 51));
        girisekranipanelii.setPreferredSize(new java.awt.Dimension(720, 420));

        hosgeldinizyazisi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hosgeldinizyazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinizyazisi.setText("EymenBank İyi Günler Diler.");

        kimliksatiri.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kimliksatiri.setForeground(new java.awt.Color(153, 153, 153));
        kimliksatiri.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimliksatiriFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimliksatiriFocusLost(evt);
            }
        });
        kimliksatiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kimliksatiriActionPerformed(evt);
            }
        });

        şifresatiri.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        şifresatiri.setForeground(new java.awt.Color(153, 153, 153));
        şifresatiri.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        şifresatiri.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                şifresatiriFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                şifresatiriFocusLost(evt);
            }
        });
        şifresatiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                şifresatiriActionPerformed(evt);
            }
        });

        girisbutonu.setBackground(new java.awt.Color(153, 255, 255));
        girisbutonu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        girisbutonu.setText("giris yap");
        girisbutonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisbutonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girisbutonuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girisbutonuMouseExited(evt);
            }
        });
        girisbutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisbutonuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Halen müşterimiz değil misiniz?");

        basvurbutonu.setBackground(new java.awt.Color(153, 255, 255));
        basvurbutonu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        basvurbutonu.setText("başvur");
        basvurbutonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvurbutonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurbutonuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurbutonuMouseExited(evt);
            }
        });
        basvurbutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurbutonuActionPerformed(evt);
            }
        });

        şifreunutlabel.setForeground(new java.awt.Color(255, 255, 255));
        şifreunutlabel.setText("Şifreni Mi Unuttun?");
        şifreunutlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        şifreunutlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                şifreunutlabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout girisekranipaneliiLayout = new javax.swing.GroupLayout(girisekranipanelii);
        girisekranipanelii.setLayout(girisekranipaneliiLayout);
        girisekranipaneliiLayout.setHorizontalGroup(
            girisekranipaneliiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisekranipaneliiLayout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(girisekranipaneliiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hosgeldinizyazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kimliksatiri, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(şifresatiri, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(girisbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(basvurbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(şifreunutlabel))
                .addGap(169, 169, 169))
        );

        girisekranipaneliiLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {kimliksatiri, şifresatiri});

        girisekranipaneliiLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {basvurbutonu, girisbutonu});

        girisekranipaneliiLayout.setVerticalGroup(
            girisekranipaneliiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisekranipaneliiLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(hosgeldinizyazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(kimliksatiri, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(şifresatiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(girisbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(şifreunutlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(basvurbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        girisekranipaneliiLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {kimliksatiri, şifresatiri});

        girisekranipaneliiLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {basvurbutonu, girisbutonu});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(girisekranipanelii, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisekranipanelii, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
@Override 
public void getedits(){
 this.setLocationRelativeTo(null);
        girisekranipanelii.setFocusable(true);//panele odaklan
        kimliksatiri.setText(KIMLIK_TEXT_ORIGINAL);//şifre ve kimlik satırına set ettim...
        şifresatiri.setText(SIFRE_TEXT_ORIGINAL);
        this.setResizable(false);//boyutlandırılabiilirlik kapandı
        Textayarlari.setonlynumber(kimliksatiri);//sadece rakam harf girmiyor ,bunların boyutunu da ayarlamalıyız.
        Textayarlari.setonlynumber(şifresatiri);//sadece rakaaaaaam olmaaaazzbu şifre 
       // Textayarlari.setlimitayarla(kimliksatiri, 11);//buradaki text icin de limit ayarı yaptık ama sorun var 
      //  Textayarlari.setlimitayarla(şifresatiri, 4);
        //ilerleyen bir zamanda bakacağım..
}
   @Override
    public boolean bilgilergecerlimi() {
     return !(this.kimliksatiri.getText().equals(this.KIMLIK_TEXT_ORIGINAL)
             ||this.şifresatiri.getText().equals(this.SIFRE_TEXT_ORIGINAL));
     
    }

    @Override
    public HesapBilgileri gethesapbilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public KullaniciGiris getKullanicigirisobject() {
        if(kullanicigirisobject==null)
        {
        
        kullanicigirisobject=new KullaniciGiris();
        }
        return kullanicigirisobject;
    }
    

    private void kimliksatiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kimliksatiriActionPerformed
       
    }//GEN-LAST:event_kimliksatiriActionPerformed

    private void şifresatiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_şifresatiriActionPerformed
       
    }//GEN-LAST:event_şifresatiriActionPerformed
   /*  
   Buton Renklendirmeleri 
   */
    private void girisbutonuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisbutonuMouseEntered
     Butonayarlari.setBgFg(girisbutonu, Color.green,Color.red);
    }//GEN-LAST:event_girisbutonuMouseEntered

    private void girisbutonuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisbutonuMouseExited
       Butonayarlari.OriginalSetBgFg(girisbutonu);
    }//GEN-LAST:event_girisbutonuMouseExited

    private void basvurbutonuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurbutonuMouseEntered
        Butonayarlari.setBgFg(basvurbutonu, Color.green,Color.red);
    }//GEN-LAST:event_basvurbutonuMouseEntered

    private void basvurbutonuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurbutonuMouseExited
       Butonayarlari.OriginalSetBgFg(basvurbutonu);
        
    }//GEN-LAST:event_basvurbutonuMouseExited
/*
Focuslanmalar    
*/
    private void kimliksatiriFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimliksatiriFocusGained
        //method çağırarak yaptık text ayarlarından 
        Textayarlari.checkthefocusgained(kimliksatiri, KIMLIK_TEXT_ORIGINAL);
        
    }//GEN-LAST:event_kimliksatiriFocusGained

    private void şifresatiriFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_şifresatiriFocusGained
        Textayarlari.checkthefocusgained(şifresatiri, SIFRE_TEXT_ORIGINAL);
    }//GEN-LAST:event_şifresatiriFocusGained

    private void kimliksatiriFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimliksatiriFocusLost
        Textayarlari.checkthefocuslost(kimliksatiri);
    }//GEN-LAST:event_kimliksatiriFocusLost

    private void şifresatiriFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_şifresatiriFocusLost
        Textayarlari.checkthefocuslost(şifresatiri);
    }//GEN-LAST:event_şifresatiriFocusLost
/*
Buton actionlari
*/
    private void girisbutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisbutonuActionPerformed
   if(this.bilgilergecerlimi())
   {
       String musteriKimlik=this.kimliksatiri.getText().trim();
       String sifre = String.valueOf(this.şifresatiri.getPassword());
       this.girisYap(musteriKimlik,sifre);
   }
   else
   {
   Dialog.bosOlamazMesajiGoster(this);
   }
        
    }//GEN-LAST:event_girisbutonuActionPerformed

    private void girisYap(String musteriKimlik,String sifre)//bu bilgilerin gideceği sınıfımızı yazalım(kullanıcıgiris)
    {
    this.getKullanicigirisobject().setMusteriKimlik(musteriKimlik);
    this.getKullanicigirisobject().setSifre(sifre);
    if(getKullanicigirisobject().girisBilgileriDogruMu())
    {
    Actionayarlari.setVisible(this, new hesapekrani());
    }
    else
    {
    Dialog.ozelMesajGoster(this, "GİRİŞ BİLGİLERİ YANLIŞTIR.\nLÜTFEN KONTROL EDİNİZ.");
    }
    }
    
    private void basvurbutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurbutonuActionPerformed
    // this.setVisible(false);//bu ekranı kapat demek
    //new basvuruekrani().setVisible(true);//ekranı true açtıkkk
    Actionayarlari.setVisible(this, new basvuruekrani());//daha kolay oldugu icin jframeleri baska bir clsstan yönlendiriyoruz
    }//GEN-LAST:event_basvurbutonuActionPerformed

    private void şifreunutlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_şifreunutlabelMouseClicked
     
       Actionayarlari.setVisible(this,new  şifreyenilemeekrani());
      
    }//GEN-LAST:event_şifreunutlabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(girisekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(girisekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(girisekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(girisekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new girisekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basvurbutonu;
    private javax.swing.JButton girisbutonu;
    private javax.swing.JPanel girisekranipanelii;
    private javax.swing.JLabel hosgeldinizyazisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField kimliksatiri;
    private javax.swing.JPasswordField şifresatiri;
    private javax.swing.JLabel şifreunutlabel;
    // End of variables declaration//GEN-END:variables

 
}
