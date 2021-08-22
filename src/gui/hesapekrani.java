/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.IBilgicontroller;
import database.transactions.HesapBilgileri;
import gui.ayarlar.Actionayarlari;
import gui.ayarlar.Butonayarlari;
import gui.ayarlar.Dialog;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.Iconayarlari;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;



/**
 *
 * @author EYMEN SEZEN
 */
public class hesapekrani extends javax.swing.JFrame implements IDuzenleyici,IBilgicontroller {

    /**
     * Creates new form hesapekrani
     */
    public hesapekrani() {
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

        hesapekranipanel = new javax.swing.JPanel();
        hosgeldinizlabel = new javax.swing.JLabel();
        adsoyadlabel = new javax.swing.JLabel();
        bakiyemiktarlabel = new javax.swing.JLabel();
        paracekbutton = new javax.swing.JButton();
        parayatirmabutton = new javax.swing.JButton();
        havalebutton = new javax.swing.JButton();
        ödemebutton = new javax.swing.JButton();
        moneyicon = new javax.swing.JLabel();
        havaleicon = new javax.swing.JLabel();
        ödemeicon = new javax.swing.JLabel();
        cıkısicon = new javax.swing.JLabel();
        ayarlaricon = new javax.swing.JLabel();
        paracekmeicon = new javax.swing.JLabel();
        parayatırmaicon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hesapekranipanel.setBackground(new java.awt.Color(255, 0, 51));

        hosgeldinizlabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hosgeldinizlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinizlabel.setText("Hoşgeldiniz Sayın");

        adsoyadlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adsoyadlabel.setText("[kullanıcı adı soyadı]");

        bakiyemiktarlabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bakiyemiktarlabel.setForeground(new java.awt.Color(51, 255, 0));
        bakiyemiktarlabel.setText("[bakiye]");

        paracekbutton.setBackground(new java.awt.Color(153, 255, 255));
        paracekbutton.setText("Para Çek");
        paracekbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paracekbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paracekbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paracekbuttonMouseExited(evt);
            }
        });
        paracekbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paracekbuttonActionPerformed(evt);
            }
        });

        parayatirmabutton.setBackground(new java.awt.Color(204, 204, 255));
        parayatirmabutton.setText("Para Yatır");
        parayatirmabutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        parayatirmabutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                parayatirmabuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                parayatirmabuttonMouseExited(evt);
            }
        });
        parayatirmabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parayatirmabuttonActionPerformed(evt);
            }
        });

        havalebutton.setBackground(new java.awt.Color(0, 102, 102));
        havalebutton.setText("Havale");
        havalebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        havalebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                havalebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                havalebuttonMouseExited(evt);
            }
        });
        havalebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                havalebuttonActionPerformed(evt);
            }
        });

        ödemebutton.setBackground(new java.awt.Color(153, 255, 153));
        ödemebutton.setText("Ödemeler");
        ödemebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ödemebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ödemebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ödemebuttonMouseExited(evt);
            }
        });
        ödemebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ödemebuttonActionPerformed(evt);
            }
        });

        havaleicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/havaleicon.png"))); // NOI18N

        ödemeicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/ödemeicon.png"))); // NOI18N

        cıkısicon.setBackground(new java.awt.Color(153, 255, 255));
        cıkısicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/cıkısicon.png"))); // NOI18N
        cıkısicon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cıkısicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cıkısiconMouseClicked(evt);
            }
        });

        ayarlaricon.setBackground(new java.awt.Color(153, 255, 255));
        ayarlaricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/settingsicon.png"))); // NOI18N
        ayarlaricon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ayarlaricon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayarlariconMouseClicked(evt);
            }
        });

        paracekmeicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/money.png"))); // NOI18N

        parayatırmaicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/withdrawmoney.png"))); // NOI18N

        javax.swing.GroupLayout hesapekranipanelLayout = new javax.swing.GroupLayout(hesapekranipanel);
        hesapekranipanel.setLayout(hesapekranipanelLayout);
        hesapekranipanelLayout.setHorizontalGroup(
            hesapekranipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hesapekranipanelLayout.createSequentialGroup()
                .addComponent(cıkısicon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(hesapekranipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hesapekranipanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(hosgeldinizlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(hesapekranipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hesapekranipanelLayout.createSequentialGroup()
                                .addGroup(hesapekranipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(hesapekranipanelLayout.createSequentialGroup()
                                        .addComponent(havalebutton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ödemebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(hesapekranipanelLayout.createSequentialGroup()
                                        .addComponent(havaleicon)
                                        .addGap(68, 68, 68)
                                        .addComponent(ödemeicon)))
                                .addContainerGap())
                            .addGroup(hesapekranipanelLayout.createSequentialGroup()
                                .addComponent(adsoyadlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(ayarlaricon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hesapekranipanelLayout.createSequentialGroup()
                        .addGroup(hesapekranipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(hesapekranipanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(moneyicon))
                            .addGroup(hesapekranipanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(hesapekranipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(paracekbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(paracekmeicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addGroup(hesapekranipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(parayatırmaicon)
                                    .addGroup(hesapekranipanelLayout.createSequentialGroup()
                                        .addComponent(parayatirmabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hesapekranipanelLayout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(bakiyemiktarlabel)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        hesapekranipanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {havalebutton, paracekbutton, parayatirmabutton, ödemebutton});

        hesapekranipanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {paracekmeicon, parayatırmaicon});

        hesapekranipanelLayout.setVerticalGroup(
            hesapekranipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hesapekranipanelLayout.createSequentialGroup()
                .addGroup(hesapekranipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hesapekranipanelLayout.createSequentialGroup()
                        .addGroup(hesapekranipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ayarlaricon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hesapekranipanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(hesapekranipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hosgeldinizlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adsoyadlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(bakiyemiktarlabel)
                        .addGap(18, 18, 18)
                        .addComponent(moneyicon))
                    .addComponent(cıkısicon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(hesapekranipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(hesapekranipanelLayout.createSequentialGroup()
                        .addComponent(paracekmeicon)
                        .addGap(52, 52, 52)
                        .addGroup(hesapekranipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paracekbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parayatirmabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(havalebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ödemebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hesapekranipanelLayout.createSequentialGroup()
                        .addGroup(hesapekranipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(havaleicon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ödemeicon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parayatırmaicon, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );

        hesapekranipanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {paracekmeicon, parayatırmaicon});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapekranipanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapekranipanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
Buton Renklendirmeleri ve icon değişmeleri
*/  private void SetBgFg (Component c)//zaten ayarlı cunku
    {
        Butonayarlari.setBgFg((JButton)c, Color.black, Color.white);
    }
    private void paracekbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paracekbuttonMouseEntered
        this.SetBgFg(evt.getComponent());
    }//GEN-LAST:event_paracekbuttonMouseEntered

    private void paracekbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paracekbuttonMouseExited
        Butonayarlari.OriginalSetBgFg((JButton)evt.getComponent());
    }//GEN-LAST:event_paracekbuttonMouseExited

    private void parayatirmabuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parayatirmabuttonMouseEntered
        this.SetBgFg(evt.getComponent());
      //  Iconayarlari.changeicon(parayatırmaicon, "parayatır2"); maalesf olmadi..
    }//GEN-LAST:event_parayatirmabuttonMouseEntered

    private void parayatirmabuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parayatirmabuttonMouseExited
        Butonayarlari.OriginalSetBgFg((JButton)evt.getComponent());
    }//GEN-LAST:event_parayatirmabuttonMouseExited

    private void havalebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havalebuttonMouseEntered
        this.SetBgFg(evt.getComponent());
    }//GEN-LAST:event_havalebuttonMouseEntered

    private void havalebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havalebuttonMouseExited
       Butonayarlari.OriginalSetBgFg((JButton)evt.getComponent()); 
    }//GEN-LAST:event_havalebuttonMouseExited

    private void ödemebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ödemebuttonMouseEntered
        this.SetBgFg(evt.getComponent());
    }//GEN-LAST:event_ödemebuttonMouseEntered

    private void ödemebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ödemebuttonMouseExited
        Butonayarlari.OriginalSetBgFg((JButton)evt.getComponent());
    }//GEN-LAST:event_ödemebuttonMouseExited
/*
actionlar    
*/
    private void paracekbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paracekbuttonActionPerformed
        Actionayarlari.setVisible(this, new paracekmeekrani());
    }//GEN-LAST:event_paracekbuttonActionPerformed

    private void parayatirmabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parayatirmabuttonActionPerformed
         Actionayarlari.setVisible(this, new parayatırmaekrani());
    }//GEN-LAST:event_parayatirmabuttonActionPerformed

    private void havalebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_havalebuttonActionPerformed
         Actionayarlari.setVisible(this, new havaleekrani());
    }//GEN-LAST:event_havalebuttonActionPerformed

    private void ödemebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ödemebuttonActionPerformed
         Actionayarlari.setVisible(this, new odemeekrani());
    }//GEN-LAST:event_ödemebuttonActionPerformed

    private void cıkısiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cıkısiconMouseClicked
        String question = "Hesabınızdan çıkış yapılacaktır\n"
                + "Onaylıyor musunuz?";
        if (Dialog.onayMesajiGoster(this, question) == 1) {
            this.cikisYap();
        }

    }//GEN-LAST:event_cıkısiconMouseClicked
    
    private void cikisYap()
    {
    gethesapbilgileri().cikisYap();
    Actionayarlari.setVisible(this, new girisekrani());
    }
    private void ayarlariconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayarlariconMouseClicked
         Actionayarlari.setVisible(this, new ayarlarekrani());
    }//GEN-LAST:event_ayarlariconMouseClicked
  
    @Override
    public void getedits() {
      this.setLocationRelativeTo(null);//ortaya gel
      this.setFocusable(true);//panele odaklan
       /**/
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
//OPSİYONELLER
      //setvisible açılıp kapanmadır
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      this.adsoyadlabel.setText(gethesapbilgileri().getAdsoyad());//aldığımız hesap bilgilerinden yazıyoruz...
      this.bakiyemiktarlabel.setText(String.valueOf(gethesapbilgileri().getBakiye()));
    
    }

   
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
            java.util.logging.Logger.getLogger(hesapekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hesapekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hesapekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hesapekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hesapekrani().setVisible(true);
            }
        });
    }

    @Override
    public boolean bilgilergecerlimi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HesapBilgileri gethesapbilgileri() {
    return HesapBilgileri.getInstance();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adsoyadlabel;
    private javax.swing.JLabel ayarlaricon;
    private javax.swing.JLabel bakiyemiktarlabel;
    private javax.swing.JLabel cıkısicon;
    private javax.swing.JButton havalebutton;
    private javax.swing.JLabel havaleicon;
    private javax.swing.JPanel hesapekranipanel;
    private javax.swing.JLabel hosgeldinizlabel;
    private javax.swing.JLabel moneyicon;
    private javax.swing.JButton paracekbutton;
    private javax.swing.JLabel paracekmeicon;
    private javax.swing.JButton parayatirmabutton;
    private javax.swing.JLabel parayatırmaicon;
    private javax.swing.JButton ödemebutton;
    private javax.swing.JLabel ödemeicon;
    // End of variables declaration//GEN-END:variables
}