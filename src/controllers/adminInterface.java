/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controllers;

import models.Faculty;
import models.Student;

/**
 *
 * @author ALI
 */
public interface adminInterface {
    public void approveFaculty(Faculty fac);
    public void approveStudent(Student std);
    public void deleteStudent(Student std);
    public void deleteFaculty(Faculty fac);
    
}
