/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dbConnection.databaseConnection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Login;

/**
 *
 * @author Jawad Saleem
 */
public class LoginImplements implements LoginInterface{
    @Override
    public void registerUserLogin(Login usr){
        Boolean alreadyRegtd = false;
        try{
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT userName ,userPass FROM loginTbl WHERE userName=? AND userPass=? ";
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1,usr.getUserName());
            ps.setString(2,usr.getUserPass());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                alreadyRegtd = true;
            }
            if(alreadyRegtd == false){
                String query1 = "INSERT INTO loginTbl (userOrigTblId,userName,userPass) VALUES (?,?,?)";
                PreparedStatement ps1 = conn.prepareStatement(query1);
                ps1.setInt(1,usr.getUser_Orig_Tbl_Id());
                ps1.setString(2,usr.getUserName());
                ps1.setString(3,usr.getUserPass());
                ps1.executeUpdate();
            }
            else{
                JOptionPane.showMessageDialog(null,"User is already registered");
            }
            
        }
        catch(HeadlessException | ClassNotFoundException | SQLException exp){
            JOptionPane.showMessageDialog(null,"Error occured while registering a login user");
        }
    }
    
    @Override
    public int loginUser(Login user){
        int userIdentityId = 5;
     try{
         Connection conn = databaseConnection.getConnection();
         String query = "SELECT userSpecId ,userName ,userPass FROM loginTbl WHERE userName=? AND userPass=?";
         PreparedStatement ps = conn.prepareStatement(query);
         ps.setString(1,user.getUserName());
         ps.setString(2,user.getUserPass());
         ResultSet rs = ps.executeQuery();
         if(rs.next()){
             userIdentityId = rs.getInt("userSpecId");
//             if(userIdentityId == 0){
//                 //moving to student course registeration form
//                JOptionPane.showMessageDialog(null,"Congratulations you are successfully logged in as a student!!" );
//             }
//             else if(userIdentityId == 1){
//                 //moving to faculty panel 
//                JOptionPane.showMessageDialog(null,"Congratulations you are successfully logged in as a faculty!!" );
//             }
//             else{
//                 //moving to admin panel
//                JOptionPane.showMessageDialog(null,"Congratulations you are successfully logged in as an Admin !!" );
//             }
             
         }
         else{
            JOptionPane.showMessageDialog(null, "Invalid credentials!");
         }
         
         
     }   
     catch(ClassNotFoundException | SQLException exp){
          JOptionPane.showMessageDialog(null,"Sorry for the inconvenience please try again later!");
     }
     return userIdentityId;
    }
    @Override
    public void uppdateUserPass(Login usr){
        try{
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT userName , userPass FROM loginTbl WHERE userName=? AND userPass=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,usr.getUserName());
            ps.setString(2,usr.getUserPass());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String updatePassQuery = "UPDATE loginTbl SET userPass=? WHERE  userName=? AND userPass=?";
                PreparedStatement ps1 = conn.prepareStatement(updatePassQuery);
                ps1.setString(1,usr.getNewPass());
                ps1.setString(2,usr.getUserName());
                ps1.setString(3,usr.getUserPass());
                ps1.executeUpdate();
                JOptionPane.showMessageDialog(null,"The user "+usr.getUserName()+" password has been successfully updated.");

            }
            else{
                JOptionPane.showMessageDialog(null, "No such user exists in our records!");
            }
        }
        catch(HeadlessException | ClassNotFoundException | SQLException exp){
            exp.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sorry for the inconvinence please try again later!");
        }
    }
    @Override
    public int getLoginUserId(Login usr){
        int loginUsrId = 0;
        try{
            Connection conn = databaseConnection.getConnection();  
            String query = "SELECT userOrigTblId FROM loginTbl WHERE userName=? AND userPass=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,usr.getUserName());
            ps.setString(2,usr.getUserPass());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                loginUsrId = rs.getInt("userOrigTblId");
            }
        }
        catch(ClassNotFoundException | SQLException exp){
//            JOptionPane.showMessageDialog(null, "User Original Table not found!");
              exp.printStackTrace();
        }
        return loginUsrId;
    }
}
