/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centreimagerie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author TAHAR
 */
public class TechlistT extends javax.swing.JFrame {
Connection con = null;
    /**
     * Creates new form TechlistT
     */
    public TechlistT() {
        initComponents();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/centredb", "root", "");
            String sql = "SELECT * FROM technician";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            DefaultTableModel tableModel = (DefaultTableModel) tabletech2.getModel();
            while (resultSet.next()) {
                Object[] row = new Object[8];
                row[0] = resultSet.getString("ID");
                row[1] = resultSet.getString("F_name");
                row[2] = resultSet.getString("B_date");
                row[3] = resultSet.getString("Genre");
                row[4] = resultSet.getString("Add_date");
                row[5] = resultSet.getString("Specialty");
                row[6] = resultSet.getString("Phone");
                row[7] = resultSet.getString("Address");
                
                tableModel.addRow(row);
            }
            resultSet.close();
            statement.close();
            connection.close();
          }
           
            catch (SQLException ex) {
            ex.printStackTrace();}
        dt();
    }
 public void dt()
    {
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String dd=sdf.format(d);
    datet.setText(dd);
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
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cnaspic = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        datet = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabletech2 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1373, 710));
        setMinimumSize(new java.awt.Dimension(1373, 710));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 48, 73));
        jPanel1.setMaximumSize(new java.awt.Dimension(185, 710));
        jPanel1.setMinimumSize(new java.awt.Dimension(185, 710));
        jPanel1.setLayout(null);

        jButton5.setBackground(new java.awt.Color(0, 48, 73));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 248, 240));
        jButton5.setText("Technicians list");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(30, 180, 130, 40);

        jButton4.setBackground(new java.awt.Color(0, 48, 73));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 248, 240));
        jButton4.setText("Add technician");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(30, 130, 130, 40);

        jButton6.setBackground(new java.awt.Color(0, 48, 73));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 248, 240));
        jButton6.setText("Add machine");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(30, 230, 130, 40);

        jButton7.setBackground(new java.awt.Color(0, 48, 73));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 248, 240));
        jButton7.setText("Machines list");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(30, 280, 130, 40);

        jButton8.setBackground(new java.awt.Color(0, 48, 73));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 248, 240));
        jButton8.setText("Add breakdown");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(30, 330, 130, 40);

        jButton1.setBackground(new java.awt.Color(0, 48, 73));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 248, 240));
        jButton1.setText("breakdowns list");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 380, 130, 40);

        jButton3.setBackground(new java.awt.Color(0, 48, 73));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 248, 240));
        jButton3.setText("Home page");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 430, 130, 40);

        jButton2.setBackground(new java.awt.Color(0, 48, 73));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 248, 240));
        jButton2.setText("Log out");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 480, 130, 40);

        cnaspic.setIcon(new javax.swing.ImageIcon("D:\\01 Disque C\\L3 INFO\\tpihm22\\aaa.png")); // NOI18N
        jPanel1.add(cnaspic);
        cnaspic.setBounds(20, 20, 130, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 185, 710);

        jPanel2.setBackground(new java.awt.Color(0, 48, 73));
        jPanel2.setMaximumSize(new java.awt.Dimension(1380, 40));
        jPanel2.setMinimumSize(new java.awt.Dimension(1380, 40));
        jPanel2.setLayout(null);

        datet.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        datet.setForeground(new java.awt.Color(255, 248, 240));
        jPanel2.add(datet);
        datet.setBounds(1280, 0, 90, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 248, 240));
        jLabel1.setText("Technicians list");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(720, 0, 180, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1380, 40);

        jPanel3.setBackground(new java.awt.Color(255, 248, 240));
        jPanel3.setLayout(null);

        tabletech2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "F-name", "B-date", "Genre", "Specialty", "Add-D", "Phone", "Address"
            }
        ));
        jScrollPane1.setViewportView(tabletech2);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(202, 122, 1150, 580);

        jButton11.setBackground(new java.awt.Color(0, 48, 73));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 248, 240));
        jButton11.setIcon(new javax.swing.ImageIcon("D:\\01 Disque C\\L3 INFO\\tpihm22\\icons8-impression-40.png")); // NOI18N
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73), new java.awt.Color(0, 48, 73)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11);
        jButton11.setBounds(1230, 50, 130, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1370, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        TechlistT out = new TechlistT();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        AddtechnicianT out = new AddtechnicianT();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        AddmachineT out = new AddmachineT();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        MachinelistT out = new MachinelistT();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        AddpaneT out = new AddpaneT();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PanelistT out = new PanelistT();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login out = new Login();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        homet out = new homet();
        out.setLocationRelativeTo(null);
        out.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         try {
            Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/centredb","root","");
          String report = "C:\\Users\\TAHAR\\JaspersoftWorkspace\\techlist\\techlist.jrxml";  
   JasperReport jr = JasperCompileManager.compileReport(report);  
   

   System.out.print("connexion bien reussé");
   
            JasperPrint jp= JasperFillManager.fillReport(jr, null,con);
            System.out.print("connexion bien reussé");
            JasperViewer jv = new JasperViewer(jp, true);
            System.out.print("connexion bien reussé");
            jv.viewReport(jp, false);
            System.out.print("connexion bien reussé");
        } catch (ClassNotFoundException ex) { 
        Logger.getLogger(TechlistT.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(TechlistT.class.getName()).log(Level.SEVERE, null, ex);
    } catch (JRException ex) {
        Logger.getLogger(TechlistT.class.getName()).log(Level.SEVERE, null, ex);
    } 
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
            java.util.logging.Logger.getLogger(TechlistT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TechlistT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TechlistT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TechlistT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 TechlistT fenetre = new TechlistT();
               //set titel
        fenetre.setTitle("Technicians list");
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
    private javax.swing.JLabel datet;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabletech2;
    // End of variables declaration//GEN-END:variables
}
