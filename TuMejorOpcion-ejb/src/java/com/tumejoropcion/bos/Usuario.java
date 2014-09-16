/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tumejoropcion.bos;

/**
 *
 * @author estudiante
 */
public class Usuario {
    
    private String email;
    
    public Usuario(){
        
    }
    
    public Usuario(String nEmail){
        email = nEmail;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String nEmail){
        email = nEmail;
    }
}
