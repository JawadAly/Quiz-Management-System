/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controllers;

import java.util.List;
import models.Course;
import models.Student;

/**
 *
 * @author Jawad Saleem
 */
public interface stdCrudInterface {
    public void stdInsert(Student std);
    public int getStdId(Student std);
    public int getStdVerifStatus(Student std);
    public List<Course> loadStdCourses(Student std);
    public List<Student> getAllStudents();
//    public void stdStruckOff(Student std);
//    public List<Student> getRegtdStdntsList();
}
