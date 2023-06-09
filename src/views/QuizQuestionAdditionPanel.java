/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;
import controllers.quizImplements;
import controllers.quizInterface;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Question;
import models.Quiz;
import static views.QuizAdditionPanel.quizId;

/**
 *
 * @author Jawad Saleem
 */
public class QuizQuestionAdditionPanel extends javax.swing.JFrame {

    /**
     * Creates new form QuizQuestionAdditionPanel
     */
    public static int currentQuizId;
    static int questionId = 1;
    //private questionList
    private static List<Question> qsList;
    public QuizQuestionAdditionPanel() {
        initComponents();
        setQuizId();
        setQuestionId();
        //initializing questionList
        qsList = new ArrayList<>();
    }
    private void setQuizId(){
        QuizQuestionAdditionPanel.currentQuizId = quizId;
        //setting this id at frontend also
        lblQuizId.setText(String.valueOf(QuizQuestionAdditionPanel.currentQuizId));
    }
    private void setQuestionId(){
        //setting question id at frontend
        lblQuestionId.setText(String.valueOf(QuizQuestionAdditionPanel.questionId));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel21 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        facQuizAdditionPnlCloseBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblQuizId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtQuestion = new javax.swing.JTextField();
        txtOpt1 = new javax.swing.JTextField();
        txtOpt2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtOpt3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtOpt4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        btnAddQuestion = new javax.swing.JButton();
        btnSubmitQuiz = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblQuestionId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz Question Addition Panel");
        setUndecorated(true);

        jPanel21.setBackground(new java.awt.Color(25, 118, 211));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Question Addition Panel");

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

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setText("Quiz Id :");

        lblQuizId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lblQuizId.setForeground(new java.awt.Color(255, 0, 0));
        lblQuizId.setText("00");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Question:");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Option 1:");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Option 2:");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Option 3:");

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Option 4:");

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Answer:");

        btnAddQuestion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddQuestion.setText("Add Question");
        btnAddQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddQuestionActionPerformed(evt);
            }
        });

        btnSubmitQuiz.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSubmitQuiz.setText("Submit Quiz");
        btnSubmitQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitQuizActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel7.setText("Question Id :");

        lblQuestionId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lblQuestionId.setForeground(new java.awt.Color(255, 0, 0));
        lblQuestionId.setText("00");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtOpt2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtOpt1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtOpt3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtOpt4, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addComponent(btnAddQuestion)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSubmitQuiz))
                                    .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 102, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblQuestionId))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblQuizId)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(facQuizAdditionPnlCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(facQuizAdditionPnlCloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblQuizId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblQuestionId))))
                .addGap(25, 25, 25)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtOpt1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOpt2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOpt3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOpt4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddQuestion)
                    .addComponent(btnSubmitQuiz))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void facQuizAdditionPnlCloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facQuizAdditionPnlCloseBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_facQuizAdditionPnlCloseBtnMouseClicked

    private void btnAddQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddQuestionActionPerformed
        String questionMain,opt1,opt2,opt3,opt4,answer;
        //incrementing question id
        if(QuizQuestionAdditionPanel.questionId <= 5){
            QuizQuestionAdditionPanel.questionId++;
            //updating question id
            setQuestionId();
            //working for question addition
            questionMain = txtQuestion.getText().toUpperCase();
            opt1 = txtOpt1.getText().toUpperCase();
            opt2 = txtOpt2.getText().toUpperCase();
            opt3 = txtOpt3.getText().toUpperCase();
            opt4 = txtOpt4.getText().toUpperCase();
            answer = txtAnswer.getText().toUpperCase();
            if(questionMain.isEmpty() || opt1.isEmpty() || opt2.isEmpty() || opt3.isEmpty() || opt4.isEmpty() || answer.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill out the required fields");
            }
            else{
                //creating question object
                Question qs = new Question(questionMain,opt1,opt2,opt3,opt4,answer);
                //adding this question object to questionList
                qsList.add(qs);
                JOptionPane.showMessageDialog(null,"Question "+(QuizQuestionAdditionPanel.questionId-1)+" successfully added ! now add other question until question count reaches 10.");
                //emptying textfields for next question
                txtQuestion.setText("");
                txtOpt1.setText("");
                txtOpt2.setText("");
                txtOpt3.setText("");
                txtOpt4.setText("");
                txtAnswer.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"You can only add 5 questions for a single quiz!");
        }
    }//GEN-LAST:event_btnAddQuestionActionPerformed

    private void btnSubmitQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitQuizActionPerformed
        //checking for 10 complete questions or else cant finalize quiz
        if(QuizQuestionAdditionPanel.questionId == 6){
            Quiz quiz = new Quiz();
            quiz.setQuizId(QuizQuestionAdditionPanel.currentQuizId);
            quiz.addQuestionsListToQuiz(QuizQuestionAdditionPanel.qsList);
            //sending this quiz to database through quizInterface and the class that implements it
            quizInterface interfc = new quizImplements();
            interfc.addQuizQuestions(quiz);
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Please add complete 5 questions to finalize you quiz !");
        }
    }//GEN-LAST:event_btnSubmitQuizActionPerformed

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
            java.util.logging.Logger.getLogger(QuizQuestionAdditionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizQuestionAdditionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizQuestionAdditionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizQuestionAdditionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizQuestionAdditionPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddQuestion;
    private javax.swing.JButton btnSubmitQuiz;
    private javax.swing.JLabel facQuizAdditionPnlCloseBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JLabel lblQuestionId;
    private javax.swing.JLabel lblQuizId;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtOpt1;
    private javax.swing.JTextField txtOpt2;
    private javax.swing.JTextField txtOpt3;
    private javax.swing.JTextField txtOpt4;
    private javax.swing.JTextField txtQuestion;
    // End of variables declaration//GEN-END:variables
}
