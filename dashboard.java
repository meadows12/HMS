/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmp;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author pranj
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
         MongoClient mongoClient=new MongoClient("localhost",27017);
          DB db=mongoClient.getDB("HMS");
          DBCollection coll=db.getCollection("doctors");
            MongoDatabase database = mongoClient.getDatabase("HMS");
            MongoCollection <Document> collection = database.getCollection("doctors");
         DBCursor cursor=coll.find();
            while(cursor.hasNext()){
               DBObject basicDBObject1;
            basicDBObject1=cursor.next();
            AddRowToJTable(new Object[]{
           basicDBObject1.get("_id"),basicDBObject1.get("dname"),basicDBObject1.get("dage"),basicDBObject1.get("dgender"),basicDBObject1.get("dphoneno"),basicDBObject1.get("dexperience"),basicDBObject1.get("dspecialization") 
        });
              
            }
            
         /*     DefaultTableModel model;
        model = (DefaultTableModel)jTable2.getModel();
           model.getDataVector().removeAllElements();*/
        
    }
    public static void AddRowToJTable(Object[] dataRow){
        DefaultTableModel model;
        model = (DefaultTableModel)jTable2.getModel();
        model.addRow(dataRow);
      
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor-Id", "Name", "Age", "Gender", "Phone-No", "Experience", "Specialization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 600, 370));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("CRITERIA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("VALUE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 120, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADD");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 80, 54));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 80, 54));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("PATIENT");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 72, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("SEARCH");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 50, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("PATIENT");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 80, 49));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("BILLS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 70, 50));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("ADD DOCTOR TO DATABASE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 230, 37));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setText("ADD NURSES TO DATABASE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 230, 40));

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hmp/s.JPG"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 30, 30));

        jComboBox2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(default)", "_id", "dname", "dspecialization", "dage", "dphoneno", "dgender", "dexperience" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 120, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("NURSES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, -1, 50));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setText("CHECK ROOM DATABASE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 230, 40));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("LOGOUT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 491, 100, 40));

        jButton11.setText("DISCHARGE");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 90, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hmp/don5H1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    
                addDoctor m=new addDoctor();
                m.setVisible(true);
                setVisible(false);        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed
    public void delallrows(){
         DefaultTableModel model1;
           model1 = (DefaultTableModel)jTable2.getModel();
           model1.getDataVector().removeAllElements(); 
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           delallrows();
   
        MongoClient mongoClient=new MongoClient("localhost",27017);
          DB db=mongoClient.getDB("HMS");
          DBCollection coll=db.getCollection("doctors");
            MongoDatabase database = mongoClient.getDatabase("HMS");
            MongoCollection <Document> collection = database.getCollection("doctors");
            DBCursor cursor;
            if(jComboBox2.getSelectedItem().toString().equals("(default)")){
           cursor=coll.find();
              }
            else{
                DBObject b=new BasicDBObject(jComboBox2.getSelectedItem().toString(),jTextField4.getText().toString());
          cursor=coll.find(b);}
             
            while(cursor.hasNext()){
               
               DBObject basicDBObject1;
            basicDBObject1=cursor.next();
            AddRowToJTable(new Object[]{
           basicDBObject1.get("_id"),basicDBObject1.get("dname"),basicDBObject1.get("dage"),basicDBObject1.get("dgender"),basicDBObject1.get("dphoneno"),basicDBObject1.get("dexperience"),basicDBObject1.get("dspecialization") 
        });
              
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
             updatepatient m=new updatepatient();
                m.setVisible(true);
                setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     *
     * @param evt
     */
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 addNurse m=new addNurse();
                m.setVisible(true);
                setVisible(false);  
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 searchNurse m=new searchNurse();
                m.setVisible(true);
                setVisible(false);  
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        roomdatabase m=new roomdatabase();
                m.setVisible(true);
                setVisible(false);  
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
loginpage m=new loginpage();
                m.setVisible(true);
                setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
             discharge m=new discharge();
                m.setVisible(true);
                setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
