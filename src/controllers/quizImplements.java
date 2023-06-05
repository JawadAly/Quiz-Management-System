/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.*;
import dbConnection.databaseConnection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Course;
import models.Quiz;

/**
 *
 * @author Jawad Saleem
 */
public class quizImplements implements quizInterface{
    @Override
    public int getQuizIdDb(){
        int quizIdDb = 0;
        try{
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT Max(quizId) AS quizId FROM quizTbl";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                quizIdDb = rs.getInt("quizId");
            }
        }
        catch(ClassNotFoundException | SQLException exp){
            
        }
        return quizIdDb+1;
    }
    @Override
    public void addQuiz(Quiz quiz){
        try{
            
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT quizCourseId ,quiz_Title FROM quizTbl WHERE quizCourseId=? AND quiz_Title=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,quiz.getQuizCourseId());
            ps.setString(2,quiz.getQuizTitle());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"The quiz titled "+quiz.getQuizTitle()+" is already added!");
                    }
            else{
                String query1 = "INSERT INTO quizTbl (quizCourseId,quiz_Title) VALUES (?,?)";
                PreparedStatement ps1 = conn.prepareStatement(query1);
                ps1.setInt(1,quiz.getQuizCourseId());
                ps1.setString(2,quiz.getQuizTitle());
                ps1.executeUpdate();
                JOptionPane.showMessageDialog(null,"Quiz titled "+quiz.getQuizTitle()+" successfully added!" );
            }
            
        }
        catch(Exception exp){
            exp.printStackTrace();
//            JOptionPane.showMessageDialog(null,"Error adding quiz!");
        }
    }
}
