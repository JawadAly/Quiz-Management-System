/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.courseImplements;
import controllers.courseInterface;
import controllers.quizImplements;
import controllers.quizInterface;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import models.Course;
import models.Quiz;


/**
 *
 * @author Jawad Saleem
 */
public class QuizAdditionPanel extends javax.swing.JFrame {

    /**
     * Creates new form QuizAdditionPanel
     */
    public static int quizId;
    private static List<Course> allCoursesList;
    public QuizAdditionPanel() {
        initComponents();
        allCoursesList = new ArrayList<>();
        loadAllCoursesComboBox();
        getQuizIdDb();
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
        facQuizAdditionPnlCloseBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblQuizId = new javax.swing.JLabel();
        quizCourseSelectionCmbobox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtQuizTitle = new javax.swing.JTextField();
        btnProceedtoQuestionAdditionPnl = new javax.swing.JButton();
        btnBackToFacPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quiz Addition Panel");

        facQuizAdditionPnlCloseBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        facQuizAdditionPnlCloseBtn.setForeground(new java.awt.Color(255, 255, 255));
        facQuizAdditionPnlCloseBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        facQuizAdditionPnlCloseBtn.setText("X");
        facQuizAdditionPnlCloseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facQuizAdditionPnlCloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facQuizAdditionPnlCloseBtnMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setText("Quiz Id :");

        lblQuizId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lblQuizId.setForeground(new java.awt.Color(255, 0, 0));
        lblQuizId.setText("00");

        quizCourseSelectionCmbobox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quizCourseSelectionCmbobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Quiz Course", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel5.setText("Quiz Title :");

        btnProceedtoQuestionAdditionPnl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProceedtoQuestionAdditionPnl.setText("Proceed to Question Addition");
        btnProceedtoQuestionAdditionPnl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedtoQuestionAdditionPnlActionPerformed(evt);
            }
        });

        btnBackToFacPanel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnBackToFacPanel.setForeground(new java.awt.Color(242, 242, 242));
        btnBackToFacPanel.setText("<-");
        btnBackToFacPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackToFacPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackToFacPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnBackToFacPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(facQuizAdditionPnlCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQuizId))
                    .addComponent(jLabel5))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuizTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProceedtoQuestionAdditionPnl))
                        .addContainerGap(108, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(quizCourseSelectionCmbobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facQuizAdditionPnlCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackToFacPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(lblQuizId))
                            .addComponent(quizCourseSelectionCmbobox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(txtQuizTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(btnProceedtoQuestionAdditionPnl)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void facQuizAdditionPnlCloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facQuizAdditionPnlCloseBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_facQuizAdditionPnlCloseBtnMouseClicked

    private void getQuizIdDb(){
        quizInterface interfc = new quizImplements();
        QuizAdditionPanel.quizId = interfc.getQuizIdDb();
        //setting this quiz id at frontend of form
        lblQuizId.setText(String.valueOf(QuizAdditionPanel.quizId));
    }
    private void btnProceedtoQuestionAdditionPnlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedtoQuestionAdditionPnlActionPerformed
        String selectedCBoxValue = quizCourseSelectionCmbobox.getSelectedItem().toString();
        //getting quiz title and converting it into upperCase
        String quizTitle = txtQuizTitle.getText().toUpperCase();
        if(selectedCBoxValue.isEmpty() || quizTitle.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill out the required fields.");
        }
        else{
            char firstChar = selectedCBoxValue.charAt(0);
            int selectedCourseId = Character.getNumericValue(firstChar);
            //creating quiz object
            Quiz quiz = new Quiz(selectedCourseId,quizTitle);
            //inserting using quiz interface and class that implements it
            quizInterface interfce = new quizImplements();
            interfce.addQuiz(quiz);
            QuizQuestionAdditionPanel pnl = new QuizQuestionAdditionPanel();
            this.setVisible(false);
            pnl.setVisible(true);
    //        JOptionPane.showMessageDialog(null,selectedCourseId);
        }
        
    }//GEN-LAST:event_btnProceedtoQuestionAdditionPnlActionPerformed

    private void btnBackToFacPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackToFacPanelMouseClicked
        FacultyPanel facPnl = new FacultyPanel();
        this.dispose();
        facPnl.setVisible(true);
    }//GEN-LAST:event_btnBackToFacPanelMouseClicked
    
    private void loadAllCoursesComboBox(){
        courseInterface interfc = new courseImplements();
        QuizAdditionPanel.allCoursesList = interfc.getAllCoursesList();
        //using comboBoxModel for adding elements to combobox
        DefaultComboBoxModel cBoxModel = new DefaultComboBoxModel();
        for(Course singleCourse:QuizAdditionPanel.allCoursesList){
            cBoxModel.addElement(singleCourse.getCourseId()+" "+singleCourse.getCourseTitle());
        }
        
        quizCourseSelectionCmbobox.setModel(cBoxModel);
    }
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
            java.util.logging.Logger.getLogger(QuizAdditionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizAdditionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizAdditionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizAdditionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizAdditionPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBackToFacPanel;
    private javax.swing.JButton btnProceedtoQuestionAdditionPnl;
    private javax.swing.JLabel facQuizAdditionPnlCloseBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblQuizId;
    private javax.swing.JComboBox<String> quizCourseSelectionCmbobox;
    private javax.swing.JTextField txtQuizTitle;
    // End of variables declaration//GEN-END:variables
}
