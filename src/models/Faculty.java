/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ALI
 */
public class Faculty {
    private int facId;
    private String facName;
    private String facEmail;
    private String facPhone;
    private String facGender;
    private String facStatus;

    public Faculty(String facName, String facEmail, String facPhone, String facGender, String facStatus) {
        this.facName = facName;
        this.facEmail = facEmail;
        this.facPhone = facPhone;
        this.facGender = facGender;
        this.facStatus = facStatus;
    }

    public int getFacId() {
        return facId;
    }

    public void setFacId(int facId) {
        this.facId = facId;
    }
    
    public String getFacName() {
        return facName;
    }

    public void setFacName(String facName) {
        this.facName = facName;
    }

    public String getFacEmail() {
        return facEmail;
    }

    public void setFacEmail(String facEmail) {
        this.facEmail = facEmail;
    }

    public String getFacPhone() {
        return facPhone;
    }

    public void setFacPhone(String facPhone) {
        this.facPhone = facPhone;
    }

    public String getFacGender() {
        return facGender;
    }

    public void setFacGender(String facGender) {
        this.facGender = facGender;
    }

    public String getFacStatus() {
        return facStatus;
    }

    public void setFacStatus(String facStatus) {
        this.facStatus = facStatus;
    }
}
