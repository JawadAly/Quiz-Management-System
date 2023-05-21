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
                String query1 = "INSERT INTO loginTbl (userName,userPass) VALUES (?,?)";
                PreparedStatement ps1 = conn.prepareStatement(query1);
                ps1.setString(1,usr.getUserName());
                ps1.setString(2,usr.getUserPass());
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
    public void loginUser(Login user){
        int userIdentityId;
     try{
         Connection conn = databaseConnection.getConnection();
         String query = "SELECT userSpecId ,userName ,userPass FROM loginTbl WHERE userName=? AND userPass=?";
         PreparedStatement ps = conn.prepareStatement(query);
         ps.setString(1,user.getUserName());
         ps.setString(2,user.getUserPass());
         ResultSet rs = ps.executeQuery();
         if(rs.next()){
             userIdentityId = rs.getInt("userSpecId");
             if(userIdentityId == 0){
                 //moving to student course registeration form
                JOptionPane.showMessageDialog(null,"Congratulations you are successfully logged in as a student!!" );
             }
             else if(userIdentityId == 1){
                 //moving to faculty panel 
                JOptionPane.showMessageDialog(null,"Congratulations you are successfully logged in as a faculty!!" );
             }
             else{
                 //moving to admin panel
                JOptionPane.showMessageDialog(null,"Congratulations you are successfully logged in as an Admin !!" );
             }
             
         }
         else{
            JOptionPane.showMessageDialog(null, "Invalid credentials!");
         }
         
     }   
     catch(ClassNotFoundException | SQLException exp){
          JOptionPane.showMessageDialog(null,"Sorry for the inconvenience please try again later!");
     }
    }
}
