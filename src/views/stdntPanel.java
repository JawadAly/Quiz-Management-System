/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.courseImplements;
import controllers.courseInterface;
import controllers.stdCrudImplements;
import controllers.stdCrudInterface;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import models.Course;
import models.Login;
import models.Student;

/**
 *
 * @author Jawad Saleem
 */
public class stdntPanel extends javax.swing.JFrame {

    /**
     * Creates new form stdntPanel
     */
    public static int userOrigTblId;
    public stdntPanel() {
        initComponents();  
    }
    public void setUserOriginalTableId(int originalId){   
            stdntPanel.userOrigTblId = originalId;
    }
    public int getUserOriginalTableId(){
        return userOrigTblId;
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
        stdntPanelCloseBtn = new javax.swing.JLabel();
        btnStdntCourseRegFormOpen = new javax.swing.JButton();
        btnStdQuizPanelOpen = new javax.swing.JButton();
        btnLogOut = new javax.swing.JLabel();
        btnShowStudentRegCourses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Panel Form");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Student Panel");

        stdntPanelCloseBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stdntPanelCloseBtn.setForeground(new java.awt.Color(255, 255, 255));
        stdntPanelCloseBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stdntPanelCloseBtn.setText("X");
        stdntPanelCloseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stdntPanelCloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stdntPanelCloseBtnMouseClicked(evt);
            }
        });

        btnStdntCourseRegFormOpen.setText("Courses Selection Panel");
        btnStdntCourseRegFormOpen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStdntCourseRegFormOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStdntCourseRegFormOpenActionPerformed(evt);
            }
        });

        btnStdQuizPanelOpen.setText("My Quizz");
        btnStdQuizPanelOpen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStdQuizPanelOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStdQuizPanelOpenActionPerformed(evt);
            }
        });

        btnLogOut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(242, 242, 242));
        btnLogOut.setText("LogOut");
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });

        btnShowStudentRegCourses.setText("My Courses");
        btnShowStudentRegCourses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowStudentRegCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowStudentRegCoursesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(btnLogOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stdntPanelCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnStdntCourseRegFormOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(btnStdQuizPanelOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(btnShowStudentRegCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stdntPanelCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLogOut))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStdntCourseRegFormOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStdQuizPanelOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addComponent(btnShowStudentRegCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stdntPanelCloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdntPanelCloseBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_stdntPanelCloseBtnMouseClicked

    private void btnStdntCourseRegFormOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStdntCourseRegFormOpenActionPerformed
        stdntCourseSelectionForm courseSelectForm = new stdntCourseSelectionForm();
        this.setVisible(false);
        courseSelectForm.setVisible(true);
    }//GEN-LAST:event_btnStdntCourseRegFormOpenActionPerformed

    private void btnStdQuizPanelOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStdQuizPanelOpenActionPerformed
        String[] quizPanelOptions = {"Select Quiz Panel","Available Quizzes","Attempted Quizzes"};
          //initializing JComboBox by above densed array
          JComboBox quizPanelSelectCBox = new JComboBox(quizPanelOptions);
          //now getting input from JOptionPaneDialog
          int comboBoxRep = JOptionPane.showConfirmDialog(null, quizPanelSelectCBox,"Quiz Panel Selection",JOptionPane.DEFAULT_OPTION);
          if(comboBoxRep == JOptionPane.OK_OPTION){
              //now getting comboBoxInput as a String
              String cBoxValue = quizPanelSelectCBox.getSelectedItem().toString();
              if(cBoxValue.equals("Select Quiz Panel")){
                  JOptionPane.showMessageDialog(null,"Please select a quiz panel to open!","Quiz Panel Selection",JOptionPane.INFORMATION_MESSAGE);
              }
              else if(cBoxValue.equals("Available Quizzes")){
                  stdntAvailableQuizzes availQuiz = new stdntAvailableQuizzes();
                  this.setVisible(false);
                  availQuiz.setVisible(true);
              }
              else{
                  //course selection panel for attempted quizzes opens here
                  CourseSelectionPanel coursePanel = new CourseSelectionPanel();
                  this.setVisible(false);
                  coursePanel.setVisible(true);
              }
              
          }
    }//GEN-LAST:event_btnStdQuizPanelOpenActionPerformed

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        login lgn = new login();
        this.dispose();
        lgn.setVisible(true);
    }//GEN-LAST:event_btnLogOutMouseClicked

    private void btnShowStudentRegCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowStudentRegCoursesActionPerformed
        MyCoursesPanel coursesPnl = new MyCoursesPanel(); 
        this.setVisible(false);
        coursesPnl.setVisible(true);
    }//GEN-LAST:event_btnShowStudentRegCoursesActionPerformed

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
            java.util.logging.Logger.getLogger(stdntPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stdntPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stdntPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stdntPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stdntPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLogOut;
    private javax.swing.JButton btnShowStudentRegCourses;
    private javax.swing.JButton btnStdQuizPanelOpen;
    private javax.swing.JButton btnStdntCourseRegFormOpen;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel stdntPanelCloseBtn;
    // End of variables declaration//GEN-END:variables
}
