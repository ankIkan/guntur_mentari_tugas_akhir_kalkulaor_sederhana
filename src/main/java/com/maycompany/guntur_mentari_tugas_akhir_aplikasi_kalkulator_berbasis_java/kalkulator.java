/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.maycompany.guntur_mentari_tugas_akhir_aplikasi_kalkulator_berbasis_java;

/**
 *
 * @author ACER
 */
public class kalkulator extends javax.swing.JFrame {

    String angka;
    double jumlah,bil1,bil2;
    int pilih;
    public kalkulator() {
        initComponents();
         angka="";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tampilan = new javax.swing.JTextField();
        Buttonplusmin = new javax.swing.JButton();
        Buttonbagi = new javax.swing.JButton();
        Buttonkali = new javax.swing.JButton();
        Buttonkurang = new javax.swing.JButton();
        Buttonkoma = new javax.swing.JButton();
        Buttontambah = new javax.swing.JButton();
        angka8 = new javax.swing.JButton();
        angka0 = new javax.swing.JButton();
        angka1 = new javax.swing.JButton();
        angka2 = new javax.swing.JButton();
        angka4 = new javax.swing.JButton();
        angka5 = new javax.swing.JButton();
        angka6 = new javax.swing.JButton();
        angka7 = new javax.swing.JButton();
        angka3 = new javax.swing.JButton();
        Buttonsamadengan = new javax.swing.JButton();
        angka9 = new javax.swing.JButton();
        Buttonpersen = new javax.swing.JButton();
        Buttonhapus = new javax.swing.JButton();
        tutup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        tampilan.setEditable(false);
        tampilan.setBackground(java.awt.SystemColor.control);
        tampilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilanActionPerformed(evt);
            }
        });

        Buttonplusmin.setBackground(new java.awt.Color(255, 51, 0));
        Buttonplusmin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Buttonplusmin.setText("+/-");
        Buttonplusmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonplusminActionPerformed(evt);
            }
        });

        Buttonbagi.setBackground(new java.awt.Color(255, 51, 0));
        Buttonbagi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Buttonbagi.setText("/");
        Buttonbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonbagiActionPerformed(evt);
            }
        });

        Buttonkali.setBackground(new java.awt.Color(255, 51, 0));
        Buttonkali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Buttonkali.setText("x");
        Buttonkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonkaliActionPerformed(evt);
            }
        });

        Buttonkurang.setBackground(new java.awt.Color(255, 51, 0));
        Buttonkurang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Buttonkurang.setText("-");
        Buttonkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonkurangActionPerformed(evt);
            }
        });

        Buttonkoma.setBackground(new java.awt.Color(255, 51, 0));
        Buttonkoma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Buttonkoma.setText(".");
        Buttonkoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonkomaActionPerformed(evt);
            }
        });

        Buttontambah.setBackground(new java.awt.Color(255, 51, 0));
        Buttontambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Buttontambah.setText("+");
        Buttontambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtontambahActionPerformed(evt);
            }
        });

        angka8.setBackground(new java.awt.Color(255, 51, 0));
        angka8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        angka8.setText("8");
        angka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka8ActionPerformed(evt);
            }
        });

        angka0.setBackground(new java.awt.Color(255, 51, 0));
        angka0.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        angka0.setText("0");
        angka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka0ActionPerformed(evt);
            }
        });

        angka1.setBackground(new java.awt.Color(255, 51, 0));
        angka1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        angka1.setText("1");
        angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka1ActionPerformed(evt);
            }
        });

        angka2.setBackground(new java.awt.Color(255, 51, 0));
        angka2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        angka2.setText("2");
        angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka2ActionPerformed(evt);
            }
        });

        angka4.setBackground(new java.awt.Color(255, 51, 0));
        angka4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        angka4.setText("4");
        angka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka4ActionPerformed(evt);
            }
        });

        angka5.setBackground(new java.awt.Color(255, 51, 0));
        angka5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        angka5.setText("5");
        angka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka5ActionPerformed(evt);
            }
        });

        angka6.setBackground(new java.awt.Color(255, 51, 0));
        angka6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        angka6.setText("6");
        angka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka6ActionPerformed(evt);
            }
        });

        angka7.setBackground(new java.awt.Color(255, 51, 0));
        angka7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        angka7.setText("7");
        angka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka7ActionPerformed(evt);
            }
        });

        angka3.setBackground(new java.awt.Color(255, 51, 0));
        angka3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        angka3.setText("3");
        angka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka3ActionPerformed(evt);
            }
        });

        Buttonsamadengan.setBackground(new java.awt.Color(255, 51, 0));
        Buttonsamadengan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Buttonsamadengan.setText("=");
        Buttonsamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonsamadenganActionPerformed(evt);
            }
        });

        angka9.setBackground(new java.awt.Color(255, 51, 0));
        angka9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        angka9.setText("9");
        angka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka9ActionPerformed(evt);
            }
        });

        Buttonpersen.setBackground(new java.awt.Color(255, 51, 0));
        Buttonpersen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Buttonpersen.setText("%");
        Buttonpersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonpersenActionPerformed(evt);
            }
        });

        Buttonhapus.setBackground(new java.awt.Color(255, 51, 0));
        Buttonhapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Buttonhapus.setText("C");
        Buttonhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonhapusActionPerformed(evt);
            }
        });

        tutup.setBackground(new java.awt.Color(204, 204, 204));
        tutup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tutup.setText("Tutup Kalkulator");
        tutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tampilan)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(angka0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Buttonkoma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Buttonhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Buttonplusmin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Buttonpersen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Buttonbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buttonkali, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buttonkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buttontambah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buttonsamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tutup, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tampilan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttonplusmin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buttonbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buttonpersen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buttonhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttonkali, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttonkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttontambah, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttonkoma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buttonsamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tutup)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonplusminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonplusminActionPerformed
        bil2 =Double.parseDouble(angka);
        jumlah=0-bil2;
        angka=Double.toString(jumlah);
        tampilan.setText(angka);
    }//GEN-LAST:event_ButtonplusminActionPerformed

    private void angka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka0ActionPerformed
        angka +="0";        
        tampilan.setText(angka);
    }//GEN-LAST:event_angka0ActionPerformed

    private void tampilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tampilanActionPerformed

    private void angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka1ActionPerformed
        angka +="1";        
        tampilan.setText(angka);
    }//GEN-LAST:event_angka1ActionPerformed

    private void angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka2ActionPerformed
        angka +="2";        
        tampilan.setText(angka);
    }//GEN-LAST:event_angka2ActionPerformed

    private void angka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka3ActionPerformed
        angka +="3";        
        tampilan.setText(angka);
    }//GEN-LAST:event_angka3ActionPerformed

    private void angka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka4ActionPerformed
        angka +="4";        
        tampilan.setText(angka);
    }//GEN-LAST:event_angka4ActionPerformed

    private void angka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka5ActionPerformed
        angka +="5";        
        tampilan.setText(angka);
    }//GEN-LAST:event_angka5ActionPerformed

    private void angka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka6ActionPerformed
        angka +="6";        
        tampilan.setText(angka);
    }//GEN-LAST:event_angka6ActionPerformed

    private void angka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka7ActionPerformed
        angka +="7";        
        tampilan.setText(angka);
    }//GEN-LAST:event_angka7ActionPerformed

    private void angka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka8ActionPerformed
        angka +="8";        
        tampilan.setText(angka);
    }//GEN-LAST:event_angka8ActionPerformed

    private void angka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka9ActionPerformed
        angka +="9";        
        tampilan.setText(angka);
    }//GEN-LAST:event_angka9ActionPerformed

    private void ButtonpersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonpersenActionPerformed
        bil2 =Double.parseDouble(angka);
        jumlah=bil2/100;
        angka=Double.toString(jumlah);
        tampilan.setText(angka);
    }//GEN-LAST:event_ButtonpersenActionPerformed

    private void ButtonhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonhapusActionPerformed
        tampilan.setText("");
        bil1=0.0;
        bil2=0.0;
        jumlah=0.0;
        angka="";
    }//GEN-LAST:event_ButtonhapusActionPerformed

    private void ButtonbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonbagiActionPerformed
        bil1 =Double.parseDouble(angka);
        tampilan.setText("/");
        angka="";
        pilih=4;
    }//GEN-LAST:event_ButtonbagiActionPerformed

    private void ButtonkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonkaliActionPerformed
    bil1 =Double.parseDouble(angka);
        tampilan.setText("*");
        angka="";
        pilih=3; 
    }//GEN-LAST:event_ButtonkaliActionPerformed

    private void ButtonkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonkurangActionPerformed
    bil1 =Double.parseDouble(angka);
        tampilan.setText("-");
        angka="";
        pilih=2; 
    }//GEN-LAST:event_ButtonkurangActionPerformed

    private void ButtontambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtontambahActionPerformed
    bil1 =Double.parseDouble(angka);
        tampilan.setText("+");
        angka="";
        pilih=1;
    }//GEN-LAST:event_ButtontambahActionPerformed

    private void ButtonsamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonsamadenganActionPerformed
       switch(pilih){
        case 1:
            bil2=Double.parseDouble(angka);
            jumlah=bil1+bil2;
            angka=Double.toString(jumlah);
            tampilan.setText(angka);
            break;
        case 2:
            bil2=Double.parseDouble(angka);
            jumlah=bil1-bil2;
            angka=Double.toString(jumlah);
            tampilan.setText(angka);
            break;
            
        case 3:
            bil2=Double.parseDouble(angka);
            jumlah=bil1*bil2;
            angka=Double.toString(jumlah);
            tampilan.setText(angka);
            break;
            
        case 4:
            bil2=Double.parseDouble(angka);
            jumlah=bil1/bil2;
            angka=Double.toString(jumlah);
            tampilan.setText(angka);
            break;
      }
    }//GEN-LAST:event_ButtonsamadenganActionPerformed

    private void ButtonkomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonkomaActionPerformed
     angka+=".";
        tampilan.setText(angka);

    }//GEN-LAST:event_ButtonkomaActionPerformed

    private void tutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutupActionPerformed
    dispose();
    
    }//GEN-LAST:event_tutupActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonbagi;
    private javax.swing.JButton Buttonhapus;
    private javax.swing.JButton Buttonkali;
    private javax.swing.JButton Buttonkoma;
    private javax.swing.JButton Buttonkurang;
    private javax.swing.JButton Buttonpersen;
    private javax.swing.JButton Buttonplusmin;
    private javax.swing.JButton Buttonsamadengan;
    private javax.swing.JButton Buttontambah;
    private javax.swing.JButton angka0;
    private javax.swing.JButton angka1;
    private javax.swing.JButton angka2;
    private javax.swing.JButton angka3;
    private javax.swing.JButton angka4;
    private javax.swing.JButton angka5;
    private javax.swing.JButton angka6;
    private javax.swing.JButton angka7;
    private javax.swing.JButton angka8;
    private javax.swing.JButton angka9;
    private javax.swing.JTextField tampilan;
    private javax.swing.JButton tutup;
    // End of variables declaration//GEN-END:variables
}