/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.IBilgicontroller;
import database.transactions.HavaleYapma;
import database.transactions.HesapBilgileri;
import gui.ayarlar.Actionayarlari;
import gui.ayarlar.Dialog;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.Textayarlari;
import javax.swing.JOptionPane;

/**
 *
 * @author EYMEN SEZEN
 */
public class havaleekrani extends javax.swing.JFrame implements IDuzenleyici, IBilgicontroller {
    
    private HavaleYapma havaleObject = null;
    private final String MUSTERI_NOTEXT_ORIGINAL = "MÜŞTERİ NO";
    private int gonderilecekmiktar = 0;
    
    public havaleekrani() {
        initComponents();
        getedits();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        havalepanel = new javax.swing.JPanel();
        kullanicilabel = new javax.swing.JLabel();
        uyarılabel = new javax.swing.JLabel();
        bakiyelabel = new javax.swing.JLabel();
        bakiyeyazılabel = new javax.swing.JLabel();
        miktarlabel = new javax.swing.JLabel();
        miktartext = new javax.swing.JTextField();
        havalebutton = new javax.swing.JButton();
        cıkıslabel = new javax.swing.JLabel();
        kisilabel = new javax.swing.JLabel();
        musterinotext = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        havalepanel.setBackground(new java.awt.Color(204, 204, 255));

        kullanicilabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kullanicilabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullanicilabel.setText("Sayın [KULLANICI ADI SOYADI]");

        uyarılabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uyarılabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uyarılabel.setText("Tek Seferde 20000 TL Ve Altı Gönderilebilir.");

        bakiyelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bakiyelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bakiyelabel.setText("Toplam Bakiyeniz:");

        bakiyeyazılabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bakiyeyazılabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bakiyeyazılabel.setText("[BAKİYE]");

        miktarlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        miktarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miktarlabel.setText("Gönderilecek Miktar:");

        miktartext.setForeground(new java.awt.Color(153, 153, 153));
        miktartext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                miktartextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                miktartextFocusLost(evt);
            }
        });
        miktartext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miktartextActionPerformed(evt);
            }
        });
        miktartext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                miktartextKeyReleased(evt);
            }
        });

        havalebutton.setText("GÖNDER");
        havalebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        havalebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                havalebuttonActionPerformed(evt);
            }
        });

        cıkıslabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/cıkısicon.png"))); // NOI18N
        cıkıslabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cıkıslabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cıkıslabelMouseClicked(evt);
            }
        });

        kisilabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kisilabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kisilabel.setText("Havale Alacak Kişi:");

        musterinotext.setForeground(new java.awt.Color(153, 153, 153));
        musterinotext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                musterinotextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                musterinotextFocusLost(evt);
            }
        });
        musterinotext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musterinotextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout havalepanelLayout = new javax.swing.GroupLayout(havalepanel);
        havalepanel.setLayout(havalepanelLayout);
        havalepanelLayout.setHorizontalGroup(
            havalepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, havalepanelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(havalepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(miktarlabel)
                    .addComponent(bakiyelabel)
                    .addComponent(kisilabel))
                .addGap(18, 18, 18)
                .addGroup(havalepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(havalepanelLayout.createSequentialGroup()
                        .addComponent(bakiyeyazılabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(151, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, havalepanelLayout.createSequentialGroup()
                        .addGroup(havalepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(miktartext, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(musterinotext))
                        .addGap(67, 67, 67))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, havalepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(havalepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, havalepanelLayout.createSequentialGroup()
                        .addComponent(uyarılabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, havalepanelLayout.createSequentialGroup()
                        .addComponent(havalebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
            .addGroup(havalepanelLayout.createSequentialGroup()
                .addComponent(cıkıslabel)
                .addGap(18, 18, 18)
                .addComponent(kullanicilabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        havalepanelLayout.setVerticalGroup(
            havalepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(havalepanelLayout.createSequentialGroup()
                .addGroup(havalepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kullanicilabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cıkıslabel))
                .addGap(51, 51, 51)
                .addComponent(uyarılabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(havalepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bakiyelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bakiyeyazılabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(havalepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(miktarlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miktartext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(havalepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kisilabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musterinotext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(havalebutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havalepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havalepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miktartextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_miktartextFocusGained
        //Textayarlari.checkthefocusgained(miktartext, MİKTAR_TEXT_ORIGINAL);
    }//GEN-LAST:event_miktartextFocusGained

    private void miktartextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_miktartextFocusLost
        Textayarlari.checkthefocuslost(miktartext);
    }//GEN-LAST:event_miktartextFocusLost

    private void miktartextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miktartextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miktartextActionPerformed
//ONEMLİ KEY RELEASEDDDD
    private void miktartextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_miktartextKeyReleased
        //5000 üstü için burada yapyoruz method oluşturduk
        this.gonderilecekmiktar = Textayarlari.checkthekeyreleased(miktartext, 20000);//CEKİLECEK MİKTARI ATTIM LİMİT DE OLUŞTU
        //BUYUK BİR KOLAYLIK SAĞLADI..

    }//GEN-LAST:event_miktartextKeyReleased

    private void havalebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_havalebuttonActionPerformed
        if (this.bilgilergecerlimi()) {
            this.havaleYap();
        } else {
            Dialog.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_havalebuttonActionPerformed

    private void cıkıslabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cıkıslabelMouseClicked
        Actionayarlari.setVisible(this, new hesapekrani());
    }//GEN-LAST:event_cıkıslabelMouseClicked

    private void musterinotextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_musterinotextFocusGained
        Textayarlari.checkthefocusgained(musterinotext, MUSTERI_NOTEXT_ORIGINAL);
    }//GEN-LAST:event_musterinotextFocusGained

    private void musterinotextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_musterinotextFocusLost
        Textayarlari.checkthefocuslost(musterinotext);
    }//GEN-LAST:event_musterinotextFocusLost

    private void musterinotextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musterinotextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musterinotextActionPerformed

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
            java.util.logging.Logger.getLogger(havaleekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(havaleekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(havaleekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(havaleekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new havaleekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyelabel;
    private javax.swing.JLabel bakiyeyazılabel;
    private javax.swing.JLabel cıkıslabel;
    private javax.swing.JButton havalebutton;
    private javax.swing.JPanel havalepanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kisilabel;
    private javax.swing.JLabel kullanicilabel;
    private javax.swing.JLabel miktarlabel;
    private javax.swing.JTextField miktartext;
    private javax.swing.JTextField musterinotext;
    private javax.swing.JLabel uyarılabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void getedits() {
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
         /**/
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
//OPSİYONELLER
        Textayarlari.setonlynumber(miktartext);//sadece rakkam
        Textayarlari.setlimitayarla(miktartext, 5);
        Textayarlari.setonlynumber(musterinotext);
        musterinotext.setText(MUSTERI_NOTEXT_ORIGINAL);
        this.kullanicilabel.setText("Sayın: "+gethesapbilgileri().getAdsoyad());
        this.bakiyeyazılabel.setText(String.valueOf(gethesapbilgileri().getBakiye()));
        
    }
    
    @Override
    public boolean bilgilergecerlimi() {
        return !(this.miktartext.getText().equals("")
                || this.musterinotext.getText().equals(this.MUSTERI_NOTEXT_ORIGINAL));
    }
    
    @Override
    public HesapBilgileri gethesapbilgileri() {
        return HesapBilgileri.getInstance();
    }
    
    private void havaleYap() {
        getHavaleObject().setGonderilecekMiktar(this.gonderilecekmiktar);
        getHavaleObject().setHavaleAlacakKisi(this.musterinotext.getText());
        if(getHavaleObject().havaleYapıldıMı())
        {
        Dialog.ozelMesajGoster(this, "HAVALE İŞLEMİ BAŞARIYLA GERÇEKLEŞTİ \n GÖNDERİLEN KİŞİ: "+this.musterinotext.getText()+""
                + "\nGÖNDERİLEN MİKTAR: "+this.gonderilecekmiktar+ " TL");
        Actionayarlari.setVisible(this, new hesapekrani());
        }
        else
        {
        Dialog.ozelMesajGoster(this, "HAVALE GERÇEKLEŞTİRİLEMEDİ.");
        }
    }
    
    public HavaleYapma getHavaleObject() {
        if (this.havaleObject == null) {
            havaleObject = new HavaleYapma();
        }
        return havaleObject;
    }
    
}
