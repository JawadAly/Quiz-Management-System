/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import com.microsoft.sqlserver.jdbc.ISQLServerCallableStatement;
import java.sql.*;
import dbConnection.databaseConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Course;
import models.Question;
import models.Quiz;
import models.Student;

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
    @Override
    public void addQuizQuestions(Quiz quiz){
        try{
            for(Question singleQuestion:quiz.getQuizQuestionList()){
                Connection conn = databaseConnection.getConnection();
                String query = "INSERT INTO questionTbl (quizId,questionMain,option1,option2,option3,option4,answer) VALUES (?,?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1,quiz.getQuizId());
                ps.setString(2,singleQuestion.getQuestionMain());
                ps.setString(3,singleQuestion.getFirstOpt());
                ps.setString(4,singleQuestion.getSecondOpt());
                ps.setString(5,singleQuestion.getThirdOpt());
                ps.setString(6,singleQuestion.getFourthOpt());
                ps.setString(7,singleQuestion.getAnswer());
                ps.executeUpdate();
            }
            JOptionPane.showMessageDialog(null,"Your quiz was successfully submitted with all the questions you added.");
        }
        catch(Exception exp){
            JOptionPane.showMessageDialog(null, "Error adding quiz questions!");
        }
        
    }

    @Override
    public List<Question> displayQuizForStd(Quiz quiz) {
        List<Question> questionList = new ArrayList<>();
        try{
                Connection conn = databaseConnection.getConnection();
                String query = "SELECT questionMain, option1, option2, option3, option4, answer FROM questionTbl where quizId=?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1,quiz.getQuizId());
                ResultSet rs = ps.executeQuery(); 
                while(rs.next()){
                    Question ques = new Question();
                    ques.setQuestionMain(rs.getString("questionMain"));
                    ques.setFirstOpt(rs.getString("option1"));
                    ques.setSecondOpt(rs.getString("option2"));
                    ques.setThirdOpt(rs.getString("option3"));
                    ques.setFourthOpt(rs.getString("option4"));
                    ques.setAnswer(rs.getString("answer"));
                    questionList.add(ques);
                }
        } catch (SQLException ex) { 
            Logger.getLogger(quizImplements.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(quizImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
        return questionList;
    }    

    @Override
    public int getQuizIdFromQuizTbl(Quiz quiz) {
        //getting quiz id from quiz table            if(rs.next()){

        int quiz_Id=0;
        try{
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT quizId FROM quizTbl WHERE quiz_Title=?";
            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setInt(1,quiz.getQuizCourseId());
            ps.setString(1,quiz.getQuizTitle());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                quiz_Id = rs.getInt("quizId");    
            }
        }
        catch(Exception exp){
         exp.printStackTrace();
     }
        return quiz_Id;    
    }
   
        

    @Override
    public List<Quiz> diplayingAvailableQuizForStd(Student std) {
        List<Quiz> quizList = new ArrayList<>();
        try{
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT * FROM quizTbl WHERE quizId NOT IN (SELECT quizId FROM quizAttemptTbl WHERE stdntId = ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,std.getStdId());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Quiz quiz = new Quiz();
                quiz.setQuizId(rs.getInt("quizId"));
                quiz.setQuizCourseId(rs.getInt("quizCourseId"));
                quiz.setQuizTitle(rs.getString("quiz_Title"));
                quizList.add(quiz);
            }
        } catch (SQLException ex) {
            Logger.getLogger(quizImplements.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(quizImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
        return quizList;
    }
}


  
