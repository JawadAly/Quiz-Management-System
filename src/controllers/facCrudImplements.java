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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.PermFaculty;
import models.VisitingFaculty;

/**
 *
 * @author ALI
 */
public class facCrudImplements implements facCrudInterface{
    @Override
    public void visitfacInsert(VisitingFaculty vfac) {
        boolean alrdyRegtd = false;
            try {
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT facName and facEmail from facTbl where facName=? and facEmail=?";
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1, vfac.getFacName());
            ps.setString(2, vfac.getFacEmail());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alrdyRegtd=true;
            }
            if (alrdyRegtd==false) {
                String insertquery = "INSERT into facTbl(facName,facEmail,facPhone,facGender,facStatus,facHoursWorked) VALUES(?,?,?,?,?)";
                PreparedStatement ps1 = conn.prepareStatement(insertquery);
                ps1.setString(1,vfac.getFacName());
                ps1.setString(2,vfac.getFacEmail());
                ps1.setString(3,vfac.getFacPhone());
                ps1.setString(4,vfac.getFacStatus());
                ps1.setString(5,vfac.getFacGender());
                ps1.setString(6,vfac.getHoursWorked());
                ps1.executeUpdate();
                JOptionPane.showMessageDialog(null,"The faculty "+vfac.getFacName().toUpperCase()+" successfully registered!");
            }
            else{
                JOptionPane.showMessageDialog(null,"The user "+vfac.getFacName().toUpperCase()+" already exists in our records!");
            }
        } 
        catch(HeadlessException | ClassNotFoundException | SQLException exp){
            JOptionPane.showMessageDialog(null,"There was an error executing insert operation for Faculty.");
        }
        
}
    @Override
    public void permfacInsert(PermFaculty pfac){
        boolean alrdyRegtd = false;
        try {
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT facName and facEmail from facTbl where facName=? and facEmail=?";
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1, pfac.getFacName());
            ps.setString(2, pfac.getFacEmail());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alrdyRegtd=true;
            }
            if (alrdyRegtd==false) {
                String insertquery = "INSERT into facTbl(facName,facEmail,facPhone,facGender,facStatus,facYearsOfService) VALUES(?,?,?,?,?)";
                PreparedStatement ps1 = conn.prepareStatement(insertquery);
                ps1.setString(1,pfac.getFacName());
                ps1.setString(2,pfac.getFacEmail());
                ps1.setString(3,pfac.getFacPhone());
                ps1.setString(4,pfac.getFacGender());
                ps1.setString(5,pfac.getFacStatus());
                ps1.setString(6,pfac.getyearsOfService());
                ps1.executeUpdate();
                JOptionPane.showMessageDialog(null,"The faculty "+pfac.getFacName().toUpperCase()+" successfully registered!");
                }
            else{
                JOptionPane.showMessageDialog(null,"The user "+pfac.getFacName().toUpperCase()+" already exists in our records !");
            }
        }
        catch(HeadlessException | ClassNotFoundException | SQLException exp){
            JOptionPane.showMessageDialog(null,"There was an error executing insert operation for Faculty.");
        }
            
            
    }
}