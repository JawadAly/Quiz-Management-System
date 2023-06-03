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
public interface courseInterface {
public List<Course> getAllCoursesList();    
public void registerStdCourses(Student std);
}
