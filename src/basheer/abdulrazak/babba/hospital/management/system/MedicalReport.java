/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basheer.abdulrazak.babba.hospital.management.system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Basheer
 */
public class MedicalReport extends javax.swing.JFrame {

    private int theUserID;
    private int mr_id;

    /**
     * Creates new form MedicalReport
     */
    public MedicalReport() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        consultancy = new javax.swing.JComboBox<>();
        deathstatus = new javax.swing.JRadioButton();
        cancel = new javax.swing.JButton();
        save = new javax.swing.JButton();
        cmdPatientId = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cmdAddConsultancy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Medical Report");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("Patient ID:");

        jLabel4.setText("Type:");

        jLabel5.setText("Death Status:");

        consultancy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diagnosis", "Test", "Treatment" }));
        consultancy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultancyActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jLabel1.setText("Description:");

        cmdAddConsultancy.setText("Add Consultancy");
        cmdAddConsultancy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddConsultancyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deathstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultancy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdAddConsultancy)
                        .addGap(52, 52, 52))))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cmdPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(deathstatus)
                        .addComponent(jLabel5))
                    .addComponent(save))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(consultancy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(cmdAddConsultancy))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
System.out.println("Goodbye");
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        int theid=Integer.parseInt(String.valueOf(cmdPatientId.getSelectedItem()));
        String patientID=this.cmdPatientId.getSelectedItem().toString();
        String deathstatus="";
        if(this.deathstatus.isSelected())
            deathstatus="Dead";
        else
            deathstatus="Alive";
        String consultancy=(String)this.consultancy.getSelectedItem();
        String sql ="INSERT INTO medicalreport(`userID`,`id_patient`,`death_status`)"
                + " VALUES('"+theid+"','"+patientID+"','"+deathstatus+"')";
        try {
            Database.DB.statement.execute(sql);
            ResultSet result=Database.DB.statement.executeQuery("SELECT LAST_INSERT_ID() AS 'mr_id'");
            result.next();
            
            this.mr_id=result.getInt("mr_id");
            System.out.print(this.mr_id);
            JOptionPane.showMessageDialog(this, "patient medical record added sucessfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "There was a problem adding the medical  record", "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
        
              // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void consultancyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultancyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultancyActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            ResultSet result = Database.DB.statement.executeQuery("SELECT * FROM `patient` ORDER BY `id_patient` DESC");
            if(result != null){
                while(result.next()){
                    cmdPatientId.addItem(result.getString("id_patient"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicalReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
              ResultSet result = Database.DB.statement.executeQuery("SELECT * FROM `consultancy_type` ORDER BY `type_id` DESC");
            if(result != null){
                while(result.next()){
                    consultancy.addItem(result.getString("type_id")+" : "+result.getString("type_name"));      
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicalReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void cmdAddConsultancyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddConsultancyActionPerformed
        // TODO add your handling code here:
        String txtdescription=this.txtDescription.getText();
        String consultancy=(String) this.consultancy.getSelectedItem();
        consultancy=consultancy.substring(0,consultancy.indexOf(':'));
        String sql="INSERT INTO mr_consultancy(`consultancy_type_type_id`,`details`,`medicalreport_mr_id`)"+"VALUES("+consultancy+",'"+txtdescription+"',"+this.mr_id+")";
        try {
            JOptionPane.showMessageDialog(this, "patient medical record added sucessfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            Database.DB.statement.execute(sql);
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(this, "Error while adding patient medical record", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(MedicalReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_cmdAddConsultancyActionPerformed

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
            java.util.logging.Logger.getLogger(MedicalReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicalReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicalReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicalReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicalReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton cmdAddConsultancy;
    private javax.swing.JComboBox<String> cmdPatientId;
    private javax.swing.JComboBox<String> consultancy;
    private javax.swing.JRadioButton deathstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton save;
    private javax.swing.JTextArea txtDescription;
    // End of variables declaration//GEN-END:variables

    void setUserId(String string) {
        this.theUserID = Integer.parseInt(string);
    }
}
