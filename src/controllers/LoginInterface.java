/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controllers;

import models.Login;

/**
 *
 * @author Jawad Saleem
 */
public interface LoginInterface {
    public void registerUserLogin(Login usr);
    public int loginUser(Login user);
    public void uppdateUserPass(Login usr);
    public int getLoginUserId(Login usr);
}
