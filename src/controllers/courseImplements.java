/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dbConnection.databaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Course;
import models.Student;

/**
 *
 * @author Jawad Saleem
 */
public class courseImplements implements courseInterface{
    @Override
    public List<Course> getAllCoursesList(){    
        List<Course> coursesList = new ArrayList<>();
        try{
            Connection conn = databaseConnection.getConnection();
            String query = "SELECT * from courseTbl";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Course crse = new Course();
                crse.setCourseId(rs.getInt("courseId"));
                crse.setCourseTitle(rs.getString("courseTitle"));
                crse.setCourseMarks(rs.getInt("courseMarks"));
                crse.setCourseCreditHrs(rs.getInt("courseCrdtHrs"));
                coursesList.add(crse);
            }
        }
        catch(ClassNotFoundException | SQLException exp){
            exp.printStackTrace();
        }
        return coursesList;
    }
@Override
public void registerStdCourses(Student std){
        try{
                for(Course singleCourse:std.getStdntCourses()){
                    Connection conn = databaseConnection.getConnection();
                    String query = "SELECT stdntCourseId FROM stdCoursesTbl WHERE stdntId=? AND stdntCourseId=?";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setInt(1,std.getStdId());
                    ps.setInt(2,singleCourse.getCourseId());
                    ResultSet rs = ps.executeQuery();
                    if(rs.next()){
                        JOptionPane.showMessageDialog(null,"You,ve been already registered int the course "+ singleCourse.getCourseTitle() +" you've selected");
                    }
                    else{
                        String query1 = "INSERT INTO stdCoursesTbl (stdntId,stdntCourseId) VALUES (?,?)";
                        PreparedStatement ps1 = conn.prepareStatement(query1);
                        ps1.setInt(1, std.getStdId());
                        ps1.setInt(2,singleCourse.getCourseId());
                        ps1.executeUpdate();                    
                            JOptionPane.showMessageDialog(null, "Congratilations! you've successfully enrolled in "+singleCourse.getCourseTitle());
                    }
                }
        }
        catch(Exception exp){
            exp.printStackTrace();
        }
    }
}
