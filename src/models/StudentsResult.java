/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Jawad Saleem
 */
public class StudentsResult {
    private Student stdnt;
    private Quiz quiz;
    
    public StudentsResult(Student stdnt,Quiz quiz){
        this.stdnt = stdnt;
        this.quiz = quiz;
    }
    public void setStudent(Student stdnt){
        this.stdnt = stdnt;
    }
    public Student getStudent(){
        return stdnt;
    }
     public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
}
