/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Jawad Saleem
 */
public class Login {
    private int user_id;
    private int user_Orig_Tbl_Id;
    private int userSpecId;
    private String userName;
    private String userPass;
    private String userNewPass;
    public Login(){} 
    
    public Login(String userName,String userPass){
        this.userName = userName;
        this.userPass = userPass;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public int getUserSpecId() {
        return userSpecId;
    }

    public void setUserSpecId(int userSpecId) {
        this.userSpecId = userSpecId;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
    public String getNewPass() {
        return userNewPass;
    }

    public void setNewPass(String userNewPass) {
        this.userNewPass = userNewPass;
    }
    public int getUser_Orig_Tbl_Id() {
        return user_Orig_Tbl_Id;
    }

    public void setUser_Orig_Tbl_Id(int user_Orig_Tbl_Id) {
        this.user_Orig_Tbl_Id = user_Orig_Tbl_Id;
    }
    
    
}
