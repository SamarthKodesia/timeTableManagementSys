/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author blotcanvas
 */
public class class_timetable extends javax.swing.JFrame {

    /**
     * Creates new form class_timetable
     */
    public class_timetable() {
        initComponents();
        for(int i=0;i<9;i++)
         jTable1.getColumnModel().getColumn(i).setPreferredWidth(100);

        addData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Student's Timetable");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "9:00-9:50", "9:50-10:40", "10:55-11:45", "11:45-12:35", "1:30-2:20", "2:20-3:10", "3:25-4:15", "4:15-5:05"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setRowHeight(60);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setShowGrid(true);
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 970, 261));

        jButton1.setText("Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 100, -1));

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 100, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/blotcanvas/Downloads/simple-animated-geometric-background-with-squares-4k-ultra-high-definition-video-loop_hzhlwak8x_thumbnail-full01.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainMenu obj=new mainMenu();
        obj.setVisible(true);
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(class_timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(class_timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(class_timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(class_timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new class_timetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void addData() {
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        try{
                Login obj=new Login();
                String user=obj.sendUser().toUpperCase();
                System.out.println(user);
                String tu1,tu2,tu3,tu4,tu5,tu6,tu7,tu8,we1,we2,we3,we4,we5,we6,we7,we8,sa1,sa2,sa3,sa4;
                String th1,th2,th3,th4,th5,th6,th7,th8,fr1,fr2,fr3,fr4,fr5,fr6,fr7,fr8,sa5,sa6,sa7,sa8;
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                java.sql.Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Login_Credentials","admin_main","admin");
                java.sql.Statement stmt=con.createStatement();
                String DBQ="Select * from ADMIN_MAIN.credentials where USERNAME='"+user+"'";
                ResultSet rs=stmt.executeQuery(DBQ);
                while(rs.next()){
                    tu1 = rs.getString("TU1");
                    tu2 = rs.getString("TU2");
                    tu3 = rs.getString("TU3");
                    tu4 = rs.getString("TU4");
                    tu5 = rs.getString("TU5");
                    tu6 = rs.getString("TU6");
                    tu7 = rs.getString("TU7");
                    tu8 = rs.getString("TU8");
                    we1 = rs.getString("WE1");
                    we2 = rs.getString("WE2");
                    we3 = rs.getString("WE3");
                    we4 = rs.getString("WE4");
                    we5 = rs.getString("WE5");
                    we6 = rs.getString("WE6");
                    we7 = rs.getString("WE7");
                    we8 = rs.getString("WE8");
                    th1 = rs.getString("TH1");
                    th2 = rs.getString("TH2");
                    th3 = rs.getString("TH3");
                    th4 = rs.getString("TH4");
                    th5 = rs.getString("TH5");
                    th6 = rs.getString("TH6");
                    th7 = rs.getString("TH7");
                    th8 = rs.getString("TH8");
                    fr1 = rs.getString("FR1");
                    fr2 = rs.getString("FR2");
                    fr3 = rs.getString("FR3");
                    fr4 = rs.getString("FR4");
                    fr5 = rs.getString("FR5");
                    fr6 = rs.getString("FR6");
                    fr7 = rs.getString("FR7");
                    fr8 = rs.getString("FR8");
                    sa1 = rs.getString("SA1");
                    sa2 = rs.getString("SA2");
                    sa3 = rs.getString("SA3");
                    sa4 = rs.getString("SA4");
                    sa5 = rs.getString("SA5");
                    sa6 = rs.getString("SA6");
                    sa7 = rs.getString("SA7");
                    sa8 = rs.getString("SA8");
                    System.out.println(tu7);
                    model.addRow(new Object[]{"Tuesday",tu1,tu2,tu3,tu4,tu5,tu6,tu7,tu8});
                    model.addRow(new Object[]{"Wednesday",we1,we2,we3,we4,we5,we6,we7,we8});
                    model.addRow(new Object[]{"Thursday",th1,th2,th3,th4,th5,th6,th7,th8});
                    model.addRow(new Object[]{"Friday",fr1,fr2,fr3,fr4,fr5,fr6,fr7,fr8});
                    model.addRow(new Object[]{"Saturday",sa1,sa2,sa3,sa4,sa5,sa6,sa7,sa8});
                }
            }    
        catch(HeadlessException | ClassNotFoundException | SQLException e){
           System.err.println(e);
        }
    }
}
