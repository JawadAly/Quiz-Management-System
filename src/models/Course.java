/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jawad Saleem
 */
public class Course {
    private int courseId;
    private String courseTitle;
    private int courseMarks;
    private int courseCreditHrs;
    private List<Quiz> courseQuizzes;
    
    public Course(){}
    
    public Course(String courseTitle,int courseMarks,int courseCreditHrs){
        this.courseTitle = courseTitle;
        this.courseMarks = courseMarks;
        this.courseCreditHrs = courseCreditHrs;
        //initializing courseQuizzes list at the time of object creation of course class
        courseQuizzes = new ArrayList<>();
    }
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
     public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCourseMarks() {
        return courseMarks;
    }

    public void setCourseMarks(int courseMarks) {
        this.courseMarks = courseMarks;
    }

    public int getCourseCreditHrs() {
        return courseCreditHrs;
    }

    public void setCourseCreditHrs(int courseCreditHrs) {
        this.courseCreditHrs = courseCreditHrs;
    }       
    public void addQuizztoCourseList(Quiz quiz){
        this.courseQuizzes.add(quiz);
    }
}
