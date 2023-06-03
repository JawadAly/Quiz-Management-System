/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import javax.swing.JOptionPane;
import static views.stdntPanel.userOrigTblId;

/**
 *
 * @author Jawad Saleem
 */
public class stdntCourseSelectionForm extends javax.swing.JFrame {

    /**
     * Creates new form stdntCourseSelectionForm
     */
    public static int stdId;
    public stdntCourseSelectionForm() {
        initComponents();
        setStdId();
    }
    public static void setStdId(){
        stdntCourseSelectionForm.stdId = userOrigTblId;
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
        jLabel3 = new javax.swing.JLabel();
        stdntCourseRegPanelCloseBtn = new javax.swing.JLabel();
        testingBtn = new javax.swing.JButton();
        btnBackToStudentPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Course Registeration Form");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Student Course Registeration");

        stdntCourseRegPanelCloseBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        stdntCourseRegPanelCloseBtn.setForeground(new java.awt.Color(255, 255, 255));
        stdntCourseRegPanelCloseBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stdntCourseRegPanelCloseBtn.setText("X");
        stdntCourseRegPanelCloseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stdntCourseRegPanelCloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stdntCourseRegPanelCloseBtnMouseClicked(evt);
            }
        });

        testingBtn.setText("clickMe");
        testingBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        testingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testingBtnActionPerformed(evt);
            }
        });

        btnBackToStudentPanel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnBackToStudentPanel.setForeground(new java.awt.Color(242, 242, 242));
        btnBackToStudentPanel.setText("<-");
        btnBackToStudentPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackToStudentPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackToStudentPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnBackToStudentPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stdntCourseRegPanelCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(testingBtn)
                .addGap(292, 292, 292))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stdntCourseRegPanelCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBackToStudentPanel))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addComponent(testingBtn)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stdntCourseRegPanelCloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdntCourseRegPanelCloseBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_stdntCourseRegPanelCloseBtnMouseClicked

    private void testingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testingBtnActionPerformed
        JOptionPane.showMessageDialog(null,stdntCourseSelectionForm.stdId);
    }//GEN-LAST:event_testingBtnActionPerformed

    private void btnBackToStudentPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackToStudentPanelMouseClicked
        stdntPanel stdPnl = new stdntPanel();
        this.dispose();
        stdPnl.setVisible(true);
    }//GEN-LAST:event_btnBackToStudentPanelMouseClicked

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
            java.util.logging.Logger.getLogger(stdntCourseSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stdntCourseSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stdntCourseSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stdntCourseSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stdntCourseSelectionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBackToStudentPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel stdntCourseRegPanelCloseBtn;
    private javax.swing.JButton testingBtn;
    // End of variables declaration//GEN-END:variables
}