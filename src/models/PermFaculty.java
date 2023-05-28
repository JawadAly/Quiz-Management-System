/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class PermFaculty extends Faculty{
    private String yearsOfService;
    

    public PermFaculty(String yearsOfService, String facName, String facEmail, String facPhone, String facGender, String facStatus) {
        super(facName, facEmail, facPhone, facGender, facStatus);
        this.yearsOfService = yearsOfService;
    }

    public String getyearsOfService() {
        return yearsOfService;
    }

    public void setyearsOfService(String yearsOfService) {
        this.yearsOfService = yearsOfService;
    }
    
}
