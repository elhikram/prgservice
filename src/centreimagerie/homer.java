/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centreimagerie;


import java.awt.Image;
import static java.lang.System.out;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


/**
 *
 * @author TAHAR
 */
public class homer extends javax.swing.JFrame {

    /**
     * Creates new form homer
     */
    public homer() {
        initComponents();
        setExtendedState(homer.MAXIMIZED_BOTH);
        dt();
        
    }
    
    public void dt()
    {
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String dd=sdf.format(d);
    dater.setText(dd);
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        cnaspic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dater = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1377, 710));
        setMinimumSize(new java.awt.Dimension(1377, 710));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 48, 73));
        jPanel3.setMaximumSize(new java.awt.Dimension(1370, 720));
        jPanel3.setLayout(null);

        cnaspic.setIcon(new javax.swing.ImageIcon("D:\\01 Disque C\\L3 INFO\\tpihm22\\aaa.png")); // NOI18N
        jPanel3.add(cnaspic);
        cnaspic.setBounds(0, 20, 130, 80);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 248, 240));
        jLabel1.setText("Reception");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(640, 20, 110, 40);

        dater.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dater.setForeground(new java.awt.Color(255, 248, 240));
        jPanel3.add(dater);
        dater.setBounds(1260, 20, 90, 40);

        jButton4.setBackground(new java.awt.Color(255, 248, 240));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 48, 73));
        jButton4.setIcon(new javax.swing.ImageIcon("D:\\01 Disque C\\L3 INFO\\tpihm22\\add.png")); // NOI18N
        jButton4.setText("Registration");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240)));
        jButton4.setMaximumSize(new java.awt.Dimension(173, 53));
        jButton4.setMinimumSize(new java.awt.Dimension(173, 53));
        jButton4.setPreferredSize(new java.awt.Dimension(173, 53));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(30, 160, 210, 100);

        jButton5.setBackground(new java.awt.Color(255, 248, 240));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 48, 73));
        jButton5.setIcon(new javax.swing.ImageIcon("D:\\01 Disque C\\L3 INFO\\tpihm22\\list.png")); // NOI18N
        jButton5.setText("Patients list");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(400, 160, 210, 100);

        jButton9.setBackground(new java.awt.Color(255, 248, 240));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 48, 73));
        jButton9.setIcon(new javax.swing.ImageIcon("D:\\01 Disque C\\L3 INFO\\tpihm22\\add.png")); // NOI18N
        jButton9.setText("Appointment");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(1130, 350, 210, 100);

        jButton7.setBackground(new java.awt.Color(255, 248, 240));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 48, 73));
        jButton7.setIcon(new javax.swing.ImageIcon("D:\\01 Disque C\\L3 INFO\\tpihm22\\list.png")); // NOI18N
        jButton7.setText("Doctors list");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(1130, 160, 210, 100);

        jButton8.setBackground(new java.awt.Color(255, 248, 240));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 48, 73));
        jButton8.setIcon(new javax.swing.ImageIcon("D:\\01 Disque C\\L3 INFO\\tpihm22\\list.png")); // NOI18N
        jButton8.setText("Radios ");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(790, 350, 210, 100);

        jButton10.setBackground(new java.awt.Color(255, 248, 240));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 48, 73));
        jButton10.setIcon(new javax.swing.ImageIcon("D:\\01 Disque C\\L3 INFO\\tpihm22\\add.png")); // NOI18N
        jButton10.setText("Add technician");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);
        jButton10.setBounds(30, 350, 210, 100);

        jButton6.setBackground(new java.awt.Color(255, 248, 240));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 48, 73));
        jButton6.setIcon(new javax.swing.ImageIcon("D:\\01 Disque C\\L3 INFO\\tpihm22\\list.png")); // NOI18N
        jButton6.setText("Technicians list");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(400, 350, 210, 100);

        jButton1.setBackground(new java.awt.Color(255, 248, 240));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 48, 73));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\01 Disque C\\L3 INFO\\tpihm22\\list.png")); // NOI18N
        jButton1.setText("Appointments list");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(600, 530, 210, 100);

        jButton2.setBackground(new java.awt.Color(255, 248, 240));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 48, 73));
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\01 Disque C\\L3 INFO\\tpihm22\\logout.png")); // NOI18N
        jButton2.setText("Log out");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(30, 570, 140, 70);

        jButton11.setBackground(new java.awt.Color(255, 248, 240));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 48, 73));
        jButton11.setIcon(new javax.swing.ImageIcon("D:\\01 Disque C\\L3 INFO\\tpihm22\\add.png")); // NOI18N
        jButton11.setText("Add doctor");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240), new java.awt.Color(255, 248, 240)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11);
        jButton11.setBounds(790, 160, 210, 100);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1370, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        homer out = new homer();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        TechlistR out = new TechlistR();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        DoctorlistR out = new DoctorlistR();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        RadiolistR out = new RadiolistR();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login out = new Login();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         RegistrationR go = new RegistrationR();
        go.setLocationRelativeTo(null);
        go.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         PatientlistR list = new PatientlistR();
        list.setLocationRelativeTo(null);
        list.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        AppointmentR out = new AppointmentR();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        AddtechnicianR out = new AddtechnicianR();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         AdddoctorR out = new AdddoctorR();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

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
        java.util.logging.Logger.getLogger(homer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(homer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(homer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(homer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                homer fenetre = new homer();
               //set titel
        fenetre.setTitle("Reception Home");
        //nous demandons mtn a notre objet de se positionner au centre
        fenetre.setLocationRelativeTo(null);
        //termine le processus lorsqu'on clique sur la croix rouge
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cnaspic;
    private javax.swing.JLabel dater;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
