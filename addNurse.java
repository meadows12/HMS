/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmp;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author pranj
 */
public class addNurse extends javax.swing.JFrame {

    /**
     * Creates new form addReceptionist
     */
    public addNurse() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("FILL IN THE NURSE'S DETAIL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 11, 319, 40));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("UserName");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 119, 107, 33));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 117, 195, 37));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 198, 196, 38));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 368, 196, 35));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 277, 196, 38));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 200, 134, 32));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Phone No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 278, 115, 35));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Age");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 368, 134, 34));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 120, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("GO BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hmp/don5H1.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -100, 1090, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             try{
                 
          MongoClient mongoClient=new MongoClient("localhost",27017);
          DB db=mongoClient.getDB("HMS");
          DBCollection coll=db.getCollection("nurses");         
            MongoDatabase database = mongoClient.getDatabase("HMS");
            MongoCollection <Document> collection = database.getCollection("nurses");
          Scanner myObj1 = new Scanner(System.in);
                        BasicDBObject basicDBObject1 = new BasicDBObject();
                              
           basicDBObject1.put("_id", jTextField1.getText().toString());  
           basicDBObject1.put("password",jTextField2.getText().toString());
           basicDBObject1.put("nphoneno", jTextField4.getText().toString());
            basicDBObject1.put("nage", jTextField3.getText().toString());
         
           coll.insert(basicDBObject1); 
            JOptionPane.showMessageDialog(null, "Nurse's details have been added");
            dashboard m=new dashboard();
                m.setVisible(true);
                setVisible(false);
            }catch(Exception e){
           JOptionPane.showMessageDialog(null, "UserName is already beign used");
      }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dashboard m=new dashboard();
                m.setVisible(true);
                setVisible(false); 
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
            java.util.logging.Logger.getLogger(addNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNurse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
