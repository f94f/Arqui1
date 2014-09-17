/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tumejoropcion.bos;

import facebook4j.Friend;
import facebook4j.Like;
import facebook4j.ResponseList;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class Usuario {
    
    private String email;
    private List likes;
    private List friends;
    
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
    
    public void setFriends(ResponseList<Friend> amigos){
        friends = amigos;
    }
    
    public List getFriends(){
        return friends;
    }
    
    public void setLikes(ResponseList<Like> nLikes){
        likes = nLikes;
    }
    
    public List getLikes(){
        return likes;
    }
}
