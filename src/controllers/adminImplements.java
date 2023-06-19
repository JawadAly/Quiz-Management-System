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
import models.Faculty;
import models.Student;

/**
 *
 * @author ALI
 */
public class adminImplements implements adminInterface{

    @Override
    public void deleteFaculty(Faculty fac) {
        try{
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT facId FROM facTbl WHERE facId=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,fac.getFacId());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String delQuery = "DELETE from facTbl WHERE facId=?";
                PreparedStatement ps1 = conn.prepareStatement(delQuery);
                ps1.setInt(1,fac.getFacId());
                ps1.executeUpdate();
                JOptionPane.showMessageDialog(null, "Faculty Deleted Successfully!");
            }    
        }
        catch(HeadlessException | ClassNotFoundException | SQLException exp){
            exp.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sorry for the inconvenience please try again later!");
        }
    }
    @Override
    public void deleteStudent(Student std) {
        try{
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT std_id FROM stdntTbl WHERE std_id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,std.getStdId());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String delQuery = "DELETE from stdntTbl WHERE std_id=?";
                PreparedStatement ps1 = conn.prepareStatement(delQuery);
                ps1.setInt(1,std.getStdId());
                ps1.executeUpdate();
                JOptionPane.showMessageDialog(null, "Student Deleted Successfully!");
            }    
        }
        catch(HeadlessException | ClassNotFoundException | SQLException exp){
            exp.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sorry for the inconvenience please try again later!");
        }
    }
    
    @Override
    public void approveStudent(Student std) {
        try{
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT std_id, stdntApprovalStatus FROM stdntTbl WHERE std_id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,std.getStdId());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String approvalStatus= rs.getString("stdntApprovalStatus");
                if (approvalStatus.equals("Approved")) {
                    JOptionPane.showMessageDialog(null, "This student is already approved!");
                }
                else{
                String updateQuery = "UPDATE stdntTbl SET stdntApprovalStatus=? WHERE std_id=?";
                PreparedStatement ps1 = conn.prepareStatement(updateQuery);
                ps1.setString(1,"Approved");
                ps1.setInt(2,std.getStdId());
                ps1.executeUpdate();
                JOptionPane.showMessageDialog(null, "Student Approved Successfully!");
                }
            }    
        }
        catch(HeadlessException | ClassNotFoundException | SQLException exp){
            exp.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sorry for the inconvenience please try again later!");
        }
    }
    
    @Override
    public void approveFaculty(Faculty fac) {
        try{
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT facId FROM facTbl WHERE facId=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,fac.getFacId());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String updateQuery = "UPDATE facTbl SET facApprovalStatus=? WHERE facId=?";
                PreparedStatement ps1 = conn.prepareStatement(updateQuery);
                ps1.setString(1,"Approved");
                ps1.setInt(2,fac.getFacId());
                ps1.executeUpdate();
                JOptionPane.showMessageDialog(null, "Faculty Successfully Approved");
            }    
        }
        catch(HeadlessException | ClassNotFoundException | SQLException exp){
            exp.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sorry for the inconvinence please try again later!");
        }
    }
    
}
