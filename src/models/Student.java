/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.List;

/**
 *
 * @author Jawad Saleem
 */
public class Student {
    private int stdId;
    private String stdName;
    private String stdEmail;
    private String stdPhone;
    private String stdGender;
    private String stdApprovStatus;
    private List<Course> stdCourses;
    
    public Student(){}
    public Student(String stdName,String stdEmail,String stdPhone,String stdGender){
            this.stdName = stdName;
            this.stdEmail = stdEmail;
            this.stdPhone = stdPhone;
            this.stdGender = stdGender;
        }
    public Student(String stdName,String stdEmail,String stdPhone,String stdGender, String StdApprovStatus){
            this.stdName = stdName;
            this.stdEmail = stdEmail;
            this.stdPhone = stdPhone;
            this.stdGender = stdGender;
            this.stdApprovStatus = StdApprovStatus;
        }

    public String getStdApprovStatus() {
        return stdApprovStatus;
    }

    public void setStdApprovStatus(String stdApprovStatus) {
        this.stdApprovStatus = stdApprovStatus;
    }
    
    public String getStdName() {
        return stdName;
    }

    public String getStdEmail() {
        return stdEmail;
    }
    
    public void setStdId(int stdId) {
        this.stdId = stdId;
    }
     public int getStdId() {
        return stdId;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public void setStdEmail(String stdEmail) {
        this.stdEmail = stdEmail;
    }

    public void setStdPhone(String stdPhone) {
        this.stdPhone = stdPhone;
    }
    public String getStdPhone() {
        return stdPhone;
    }
    public void setStdGender (String stdGender) {
        this.stdGender = stdGender;
    }
    public String getStdGender() {
        return stdGender;
    }
    public void assignStdCourse(List<Course> stdCourses){
        this.stdCourses = stdCourses;
    } 
    public List<Course> getStdntCourses(){
        return this.stdCourses;
    }
    public int getStdCoursesCount(){
        int stdCoursesCounter = 0;
        for(Course singleCourse:this.stdCourses){
            stdCoursesCounter++;
        }
        return stdCoursesCounter;
    }
}
