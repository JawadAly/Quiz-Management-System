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
public class Quiz {
    private int quizId;
    private int quizCourseId;
    private String quizTitle;
    private List<Question> questionsList;

    public Quiz(){}
    
    public Quiz(int quizCourseId,String quizTitle){
        this.quizCourseId = quizCourseId;
        this.quizTitle = quizTitle;
    }
    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public int getQuizCourseId() {
        return quizCourseId;
    }

    public void setQuizCourseId(int quizCourseId) {
        this.quizCourseId = quizCourseId;
    }

    public String getQuizTitle() {
        return quizTitle;
    }

    public void setQuizTitle(String quizTitle) {
        this.quizTitle = quizTitle;
    }
    public void addQuestionsListToQuiz(List<Question> questionList){
        this.questionsList = questionList;
    }
    public List<Question> getQuizQuestionList(){
        return questionsList;
    }
}
