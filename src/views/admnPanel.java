/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author ALI
 */
public class admnPanel extends javax.swing.JFrame {

    /**
     * Creates new form admnPanel
     */
    public admnPanel() {
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
        courseRegtPnlBtn = new javax.swing.JButton();
        stdntVerifPanelBtn = new javax.swing.JButton();
        facultyVerifPanelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));

        courseRegtPnlBtn.setText("Course Registration Panel");
        courseRegtPnlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseRegtPnlBtnActionPerformed(evt);
            }
        });

        stdntVerifPanelBtn.setText("Student Verification Panel");
        stdntVerifPanelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdntVerifPanelBtnActionPerformed(evt);
            }
        });

        facultyVerifPanelBtn.setText("Faculty Verification Panel");
        facultyVerifPanelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyVerifPanelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(courseRegtPnlBtn)
                .addGap(74, 74, 74)
                .addComponent(stdntVerifPanelBtn)
                .addGap(74, 74, 74)
                .addComponent(facultyVerifPanelBtn)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseRegtPnlBtn)
                    .addComponent(stdntVerifPanelBtn)
                    .addComponent(facultyVerifPanelBtn))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void courseRegtPnlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseRegtPnlBtnActionPerformed
        admnCourseRegtPanel obj = new admnCourseRegtPanel();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_courseRegtPnlBtnActionPerformed

    private void facultyVerifPanelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyVerifPanelBtnActionPerformed
        adminFacVerifPanel obj = new adminFacVerifPanel();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_facultyVerifPanelBtnActionPerformed

    private void stdntVerifPanelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdntVerifPanelBtnActionPerformed
        adminStdVerifPanel obj = new adminStdVerifPanel();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_stdntVerifPanelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(admnPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admnPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admnPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admnPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admnPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton courseRegtPnlBtn;
    private javax.swing.JButton facultyVerifPanelBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton stdntVerifPanelBtn;
    // End of variables declaration//GEN-END:variables
}
