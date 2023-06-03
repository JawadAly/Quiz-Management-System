/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.LoginImplements;
import controllers.LoginInterface;
import controllers.facCrudImplements;
import controllers.facCrudInterface;
import controllers.stdCrudImplements;
import controllers.stdCrudInterface;
import javax.swing.JOptionPane;
import models.Faculty;
import models.Login;
import models.PermFaculty;
import models.Student;
import models.VisitingFaculty;

/**
 *
 * @author ALI
 */
public class facRegisterationForm extends javax.swing.JFrame {

    /**
     * Creates new form facRegisterationForm
     */
    public facRegisterationForm() {
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

        facGenderBtnGroup = new javax.swing.ButtonGroup();
        facTypeBtnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtYearsOfService = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFacEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFacPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        txtFacUsername = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtFacPass = new javax.swing.JPasswordField();
        jLabel28 = new javax.swing.JLabel();
        txtFacConfirmPass = new javax.swing.JPasswordField();
        btnFacRegister = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnPermanent = new javax.swing.JRadioButton();
        btnVisiting = new javax.swing.JRadioButton();
        yearsOfService = new javax.swing.JLabel();
        txtFacName = new javax.swing.JTextField();
        hoursWorked = new javax.swing.JLabel();
        txtHoursWorked = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Faculty Registeration");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Phone");

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Gender");

        facGenderBtnGroup.add(btnMale);
        btnMale.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnMale.setText("Male");

        facGenderBtnGroup.add(btnFemale);
        btnFemale.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnFemale.setText("Female");

        jLabel26.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("UserName");

        jLabel27.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Password");

        jLabel28.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Confirm Pass");

        btnFacRegister.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnFacRegister.setText("Register");
        btnFacRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacRegisterActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel10.setText("Faculty Type");

        facTypeBtnGroup.add(btnPermanent);
        btnPermanent.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnPermanent.setText("Permanent");
        btnPermanent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPermanentActionPerformed(evt);
            }
        });

        facTypeBtnGroup.add(btnVisiting);
        btnVisiting.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnVisiting.setText("Visiting");
        btnVisiting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitingActionPerformed(evt);
            }
        });

        yearsOfService.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        yearsOfService.setText("Years of Service");

        hoursWorked.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        hoursWorked.setText("Hours Worked");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(hoursWorked)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtHoursWorked))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFacEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnMale)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnFemale))
                                            .addComponent(txtFacPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPermanent)
                                        .addGap(14, 14, 14)
                                        .addComponent(btnVisiting))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFacName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(yearsOfService)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtYearsOfService)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFacUsername)
                            .addComponent(txtFacPass, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFacConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFacRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFacEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFacPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFacUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFacName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFacPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFacConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMale)
                    .addComponent(btnFemale))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btnPermanent)
                    .addComponent(btnVisiting))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearsOfService)
                    .addComponent(txtYearsOfService, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnFacRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hoursWorked)
                            .addComponent(txtHoursWorked, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(138, 138, 138))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacRegisterActionPerformed
        String facName = txtFacName.getText();
        String facEmail = txtFacEmail.getText();
        String facPhone = txtFacPhone.getText();
        String facUsername = txtFacUsername.getText();
        String facYearsOfService = txtYearsOfService.getText();
        String facHoursWorked = txtHoursWorked.getText();
        String facGender;
        String facType;
        if (btnMale.isSelected()) {
            facGender="Male";
        }
        else {
            facGender="Female";
        }
        String facPass = String.valueOf(txtFacPass.getPassword());
        String facConfirmPass = String.valueOf(txtFacConfirmPass.getPassword());
        if(facName.isEmpty() || facEmail.isEmpty() || facPhone.isEmpty() || (!btnMale.isSelected() && !btnFemale.isSelected()) || (!btnPermanent.isSelected() && !btnVisiting.isSelected()) || facUsername.isEmpty() || facPass.isEmpty() || facConfirmPass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill out the required credentials!");
        }
        else{
            //FOR PERMANENT FACULTY
            if (btnPermanent.isSelected()) {
                facType="Permanent";
            
                if(facYearsOfService.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill out the years of service field!");
                }
                else
                {
                    if(!(facPass.equals(facConfirmPass))){
                        JOptionPane.showMessageDialog(null, "Error: Passwords do not match!", "Password Mismatch", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        PermFaculty pfac = new PermFaculty(facYearsOfService, facName, facEmail, facPhone, facGender, facType);
                        facCrudInterface pfacImp = new facCrudImplements();
                        pfacImp.permfacInsert(pfac);
                        //inserting record in login table as well to implement multiauth
                        //first getting user original table id to insert into login table
                        int originalTblId = pfacImp.getPermfacId(pfac);
                        Login usr = new Login(facUsername,facPass);
                        usr.setUser_Orig_Tbl_Id(originalTblId);
                        usr.setUserSpecId(1);//fixed specId for faculty as 1
                        //now inserting using login interface and the class that implements it
                        LoginInterface lgnInter = new LoginImplements();
                        lgnInter.registerUserLogin(usr);
                    }
                } 
            }
        //FOR VISITING FACULTY
        else{
            facType="Visiting";
            if(facHoursWorked.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill out the hours worked field!");
            }
            else
            {
                if(!(facPass.equals(facConfirmPass))){
                    JOptionPane.showMessageDialog(null, "Error: Passwords do not match!", "Password Mismatch", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    VisitingFaculty vfac = new VisitingFaculty(facHoursWorked, facName, facEmail, facPhone, facGender, facType);
                    facCrudInterface vfacImp = new facCrudImplements();
                    vfacImp.visitfacInsert(vfac);
                    //inserting record in login table as well to implement multiauth
                    //first getting user original table id to insert into login table
                    int originalTblId = vfacImp.getVisitFacId(vfac);
                    Login usr = new Login(facUsername,facPass);
                    usr.setUser_Orig_Tbl_Id(originalTblId);
                    usr.setUserSpecId(1);//fixed specId for faculty as 1
                    //now inserting using login interface and the class that implements it
                    LoginInterface lgnInter = new LoginImplements();
                    lgnInter.registerUserLogin(usr);
                }
            } 
        }
            
        }
            
        
    }//GEN-LAST:event_btnFacRegisterActionPerformed

    private void btnPermanentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPermanentActionPerformed
            txtHoursWorked.setEnabled(false);
            hoursWorked.setEnabled(false);
            txtYearsOfService.setEnabled(true);
            yearsOfService.setEnabled(true);
    }//GEN-LAST:event_btnPermanentActionPerformed

    private void btnVisitingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitingActionPerformed
            txtYearsOfService.setEnabled(false);
            yearsOfService.setEnabled(false);
            txtHoursWorked.setEnabled(true);
            hoursWorked.setEnabled(true);
    }//GEN-LAST:event_btnVisitingActionPerformed

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
            java.util.logging.Logger.getLogger(facRegisterationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facRegisterationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facRegisterationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facRegisterationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facRegisterationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFacRegister;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JRadioButton btnPermanent;
    private javax.swing.JRadioButton btnVisiting;
    private javax.swing.ButtonGroup facGenderBtnGroup;
    private javax.swing.ButtonGroup facTypeBtnGroup;
    private javax.swing.JLabel hoursWorked;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtFacConfirmPass;
    private javax.swing.JTextField txtFacEmail;
    private javax.swing.JTextField txtFacName;
    private javax.swing.JPasswordField txtFacPass;
    private javax.swing.JTextField txtFacPhone;
    private javax.swing.JTextField txtFacUsername;
    private javax.swing.JTextField txtHoursWorked;
    private javax.swing.JTextField txtYearsOfService;
    private javax.swing.JLabel yearsOfService;
    // End of variables declaration//GEN-END:variables
}
