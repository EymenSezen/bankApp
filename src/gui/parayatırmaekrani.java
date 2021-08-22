/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.IBilgicontroller;
import database.transactions.HesapBilgileri;
import database.transactions.ParaYatırma;
import gui.ayarlar.Actionayarlari;
import gui.ayarlar.Dialog;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.Textayarlari;
import javax.swing.JOptionPane;

/**
 *
 * @author EYMEN SEZEN
 */
public class parayatırmaekrani extends javax.swing.JFrame implements IDuzenleyici, IBilgicontroller {

    /**
     * Creates new form parayatırmaekrani
     */
    private ParaYatırma paraYatırmaObject = null;
    private int yatırılacakMiktar = 0;

    public parayatırmaekrani() {
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

        yatırmapanel = new javax.swing.JPanel();
        kullanicilabel = new javax.swing.JLabel();
        uyarılabel = new javax.swing.JLabel();
        bakiyelabel = new javax.swing.JLabel();
        bakiyeyazılabel = new javax.swing.JLabel();
        miktarlabel = new javax.swing.JLabel();
        miktartext = new javax.swing.JTextField();
        Parayatırbutton = new javax.swing.JButton();
        cıkıslabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        yatırmapanel.setBackground(new java.awt.Color(204, 204, 255));

        kullanicilabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kullanicilabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullanicilabel.setText("Sayın [KULLANICI ADI SOYADI]");

        uyarılabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uyarılabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uyarılabel.setText("Tek Seferde 5000 TL Ve Altı Yatırılabilir.");

        bakiyelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bakiyelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bakiyelabel.setText("Toplam Bakiyeniz:");

        bakiyeyazılabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bakiyeyazılabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bakiyeyazılabel.setText("[BAKİYE]");

        miktarlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        miktarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miktarlabel.setText("Yatırılmak İstenen Miktar:");

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

        Parayatırbutton.setText("PARA YATIR");
        Parayatırbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Parayatırbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParayatırbuttonActionPerformed(evt);
            }
        });

        cıkıslabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/cıkısicon.png"))); // NOI18N
        cıkıslabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cıkıslabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cıkıslabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout yatırmapanelLayout = new javax.swing.GroupLayout(yatırmapanel);
        yatırmapanel.setLayout(yatırmapanelLayout);
        yatırmapanelLayout.setHorizontalGroup(
            yatırmapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yatırmapanelLayout.createSequentialGroup()
                .addComponent(cıkıslabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kullanicilabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yatırmapanelLayout.createSequentialGroup()
                .addGap(0, 88, Short.MAX_VALUE)
                .addGroup(yatırmapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uyarılabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(yatırmapanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(yatırmapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(miktarlabel)
                            .addComponent(bakiyelabel))
                        .addGap(18, 18, 18)
                        .addGroup(yatırmapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bakiyeyazılabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Parayatırbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(miktartext, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(82, 82, 82))
        );
        yatırmapanelLayout.setVerticalGroup(
            yatırmapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yatırmapanelLayout.createSequentialGroup()
                .addGroup(yatırmapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cıkıslabel)
                    .addComponent(kullanicilabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(uyarılabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(yatırmapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bakiyelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bakiyeyazılabel))
                .addGroup(yatırmapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(yatırmapanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(miktarlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(yatırmapanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(miktartext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Parayatırbutton)))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(yatırmapanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(yatırmapanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miktartextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_miktartextFocusGained
        //Textayarlari.checkthefocusgained(miktartext, MİKTAR_TEXT_ORIGINAL);
    }//GEN-LAST:event_miktartextFocusGained

    private void miktartextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_miktartextFocusLost
        Textayarlari.checkthefocuslost(miktartext);
    }//GEN-LAST:event_miktartextFocusLost

    private void miktartextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_miktartextKeyReleased
        //5000 üstü için burada yapyoruz method oluşturduk
        this.yatırılacakMiktar = Textayarlari.checkthekeyreleased(miktartext, 40000);//CEKİLECEK MİKTARI ATTIM LİMİT DE OLUŞTU
        //BUYUK BİR KOLAYLIK SAĞLADI..

    }//GEN-LAST:event_miktartextKeyReleased

    private void ParayatırbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParayatırbuttonActionPerformed
        if (this.bilgilergecerlimi()) {//bilgiler gecerliyse
            this.paraYatir();//methodu gerçekleştir
        } else {
            Dialog.bosOlamazMesajiGoster(this);
        }

    }//GEN-LAST:event_ParayatırbuttonActionPerformed
    private void paraYatir() {
        this.getParaYatırmaObject().setYatırılacakMiktar(this.yatırılacakMiktar);
        if (getParaYatırmaObject().paraYatırıldıMı()) {//para yatırıldıysa
            Dialog.ozelMesajGoster(this, "PARA BAŞARIYLA HESABINIZA TANIMLANMIŞTIR.\n"
                    + "Yatırılan Miktar:" + this.yatırılacakMiktar + " TL");
            Actionayarlari.setVisible(this, new hesapekrani());
        } else {

            Dialog.ozelMesajGoster(this, "BİLGİLERİNİZİ KONTROL EDİNİZ.");
        }

    }

    private void cıkıslabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cıkıslabelMouseClicked
        Actionayarlari.setVisible(this, new hesapekrani());
    }//GEN-LAST:event_cıkıslabelMouseClicked

    private void miktartextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miktartextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miktartextActionPerformed

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
            java.util.logging.Logger.getLogger(parayatırmaekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(parayatırmaekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(parayatırmaekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(parayatırmaekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parayatırmaekrani().setVisible(true);
            }
        });
    }

    @Override
    public void getedits() {
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
         /**/
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
//OPSİYONELLER
        Textayarlari.setonlynumber(miktartext);//sadece rakkam
        Textayarlari.setlimitayarla(miktartext, 5);//5HANE   
        this.kullanicilabel.setText("Sayın: " + gethesapbilgileri().getAdsoyad());
        this.bakiyeyazılabel.setText(String.valueOf(gethesapbilgileri().getBakiye()));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Parayatırbutton;
    private javax.swing.JLabel bakiyelabel;
    private javax.swing.JLabel bakiyeyazılabel;
    private javax.swing.JLabel cıkıslabel;
    private javax.swing.JLabel kullanicilabel;
    private javax.swing.JLabel miktarlabel;
    private javax.swing.JTextField miktartext;
    private javax.swing.JLabel uyarılabel;
    private javax.swing.JPanel yatırmapanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public boolean bilgilergecerlimi() {
        return !(this.miktartext.getText().equals(""));
    }

    @Override
    public HesapBilgileri gethesapbilgileri() {
        return HesapBilgileri.getInstance();
    }

    public ParaYatırma getParaYatırmaObject() {
        if (this.paraYatırmaObject == null) {
            paraYatırmaObject = new ParaYatırma();

        }
        return paraYatırmaObject;
    }

}
