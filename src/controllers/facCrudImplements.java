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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Faculty;
import models.PermFaculty;
import models.Quiz;
import models.Student;
import models.StudentsResult;
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
            String query = "SELECT facName ,facEmail FROM facTbl WHERE facName=? AND facEmail=?";
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1, vfac.getFacName());
            ps.setString(2, vfac.getFacEmail());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alrdyRegtd=true;
            }
            if (alrdyRegtd==false) {
                String insertquery = "INSERT INTO facTbl(facName,facEmail,facPhone,facGender,facType,facHoursWorked) VALUES (?,?,?,?,?,?)";
                PreparedStatement ps1 = conn.prepareStatement(insertquery);
                ps1.setString(1,vfac.getFacName());
                ps1.setString(2,vfac.getFacEmail());
                ps1.setString(3,vfac.getFacPhone());
                ps1.setString(4,vfac.getFacGender());
                ps1.setString(5,vfac.getFacStatus());
                ps1.setString(6,vfac.getHoursWorked());
                ps1.executeUpdate();
                JOptionPane.showMessageDialog(null,"The faculty "+vfac.getFacName().toUpperCase()+" successfully registered!");
            }
            else{
                JOptionPane.showMessageDialog(null,"The user "+vfac.getFacName().toUpperCase()+" already exists in our records!");
            }
        } 
        catch(HeadlessException | ClassNotFoundException | SQLException exp){
            exp.printStackTrace();
//            JOptionPane.showMessageDialog(null,"There was an error executing insert operation for Faculty.");
        }
        
}
    @Override
    public void permfacInsert(PermFaculty pfac){
        boolean alrdyRegtd = false;
        try {
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT facName ,facEmail FROM facTbl WHERE facName=? AND facEmail=?";
            PreparedStatement ps = conn.prepareCall(query);
            ps.setString(1, pfac.getFacName());
            ps.setString(2, pfac.getFacEmail());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alrdyRegtd=true;
            }
            if (alrdyRegtd==false) {
                String insertquery = "INSERT INTO facTbl(facName,facEmail,facPhone,facGender,facType,facYearsOfService) VALUES (?,?,?,?,?,?)";
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
            exp.printStackTrace();
//            JOptionPane.showMessageDialog(null,"There was an error executing insert operation for Faculty.");
        }
            
            
    }
    @Override
    public int getPermfacId(PermFaculty pfac){
        int permFacId = 0;
        try{
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT facId FROM facTbl WHERE facName=? AND facEmail=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,pfac.getFacName());
            ps.setString(2,pfac.getFacEmail());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                permFacId = rs.getInt("facId");
            }
        }
        catch(ClassNotFoundException | SQLException exp){
            JOptionPane.showMessageDialog(null,"Error getting original faculty id from faculty table");
        }
        return permFacId;
    }
    @Override
    public int getVisitFacId(VisitingFaculty vfac){
        int visitFacId = 0;
        try{
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT facId FROM facTbl WHERE facName=? AND facEmail=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,vfac.getFacName());
            ps.setString(2,vfac.getFacEmail());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                visitFacId = rs.getInt("facId");
            }
        }
        catch(ClassNotFoundException | SQLException exp){
            JOptionPane.showMessageDialog(null,"Error getting original faculty id from faculty table");
        }
        return visitFacId;
    }
    @Override
    public int getFacVerificationStatus(Faculty faculty){
        int facVerifStatus = 0;
        try{
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT facApprovalStatus FROM facTbl WHERE facId=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,faculty.getFacId());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                if(rs.getString("facApprovalStatus").equals("Approved")){
                    facVerifStatus = 1;
                }
            }
        }
        catch(Exception exp){
            JOptionPane.showMessageDialog(null,"Error checking faculty verification status!");
        }
        return facVerifStatus;
    }
    @Override
    public List<StudentsResult> getStdntsResultList(){
        List<StudentsResult> stdntsResultList = new ArrayList<>();
        try{
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT quizTbl.quiz_Title,stdntTbl.stdName,stdntTbl.stdPhone,quizAttemptTbl.quizMarks FROM stdntTbl INNER JOIN quizAttemptTbl ON quizAttemptTbl.stdntId = stdntTbl.std_id INNER JOIN quizTbl ON quizTbl.quizId = quizAttemptTbl.quizId";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Quiz quiz = new Quiz();
                quiz.setQuizTitle(rs.getString("quiz_Title"));
                quiz.setQuizObtMarks(rs.getInt("quizMarks"));
                Student std = new Student();
                std.setStdName(rs.getString("stdName"));
                std.setStdPhone(rs.getString("stdPhone"));
                StudentsResult stdResult = new StudentsResult(std,quiz);
                stdntsResultList.add(stdResult);
            }
        }
        catch(Exception exp){
            JOptionPane.showMessageDialog(null,"Error loading students result");
        }
        return stdntsResultList;
    }
}
