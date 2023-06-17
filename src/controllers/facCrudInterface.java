/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controllers;

import java.util.List;
import models.Faculty;
import models.PermFaculty;
import models.StudentsResult;
import models.VisitingFaculty;

public interface facCrudInterface {
    public void visitfacInsert(VisitingFaculty vfac);
    public void permfacInsert(PermFaculty pfac);
    public int getPermfacId(PermFaculty pfac);
    public int getVisitFacId(VisitingFaculty vfac);
    public int getFacVerificationStatus(Faculty faculty);
    public List<StudentsResult> getStdntsResultList();
}
