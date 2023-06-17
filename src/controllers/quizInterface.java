/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controllers;

import java.util.List;
import models.Course;
import models.Question;
import models.Quiz;
import models.Student;

/**
 *
 * @author Jawad Saleem
 */
public interface quizInterface {
    public int getQuizIdDb();
    public void addQuiz(Quiz quiz);
    public void addQuizQuestions(Quiz quiz);
    public List<Question> displayQuizForStd(Quiz quiz);
    public int getQuizIdFromQuizTbl(Quiz quiz);
    public List<Quiz> diplayingAvailableQuizForStd(Student std);
    public void addAttemptedStdntQuiz(Quiz quiz,Student std);
    public List<Quiz> stdAttemptedQuizzesList(Student stdnt,Course course);
}
