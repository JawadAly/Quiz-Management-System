/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controllers;

import models.PermFaculty;
import models.VisitingFaculty;

public interface facCrudInterface {
    public void visitfacInsert(VisitingFaculty vfac);
    public void permfacInsert(PermFaculty pfac);
}
