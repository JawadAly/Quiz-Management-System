/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Jawad Saleem
 */
public class Question {
    private int questionId;
    private String questionMain;
    private String firstOpt;
    private String secondOpt;
    private String thirdOpt;
    private String fourthOpt;
    private String answer;
    public Question(){}
    public Question(String questionMain,String firstOpt,String secondOpt,String thirdOpt,String fourthOpt,String answer){
        this.questionMain = questionMain;
        this.firstOpt = firstOpt;
        this.secondOpt = secondOpt;
        this.thirdOpt = thirdOpt;
        this.fourthOpt = fourthOpt;
        this.answer = answer;
    }
    

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionMain() {
        return questionMain;
    }

    public void setQuestionMain(String questionMain) {
        this.questionMain = questionMain;
    }

    public String getFirstOpt() {
        return firstOpt;
    }

    public void setFirstOpt(String firstOpt) {
        this.firstOpt = firstOpt;
    }

    public String getSecondOpt() {
        return secondOpt;
    }

    public void setSecondOpt(String secondOpt) {
        this.secondOpt = secondOpt;
    }

    public String getThirdOpt() {
        return thirdOpt;
    }

    public void setThirdOpt(String thirdOpt) {
        this.thirdOpt = thirdOpt;
    }

    public String getFourthOpt() {
        return fourthOpt;
    }

    public void setFourthOpt(String fourthOpt) {
        this.fourthOpt = fourthOpt;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
}
