/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tumejoropcion.servicios;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import facebook4j.auth.AccessToken;

/**
 *
 * @author estudiante
 */
public class ServicioLoginMock implements IServicioLogin {

    Facebook facebook;
    
    public ServicioLoginMock() {
        facebook = new FacebookFactory().getInstance();

        facebook.setOAuthAppId("353716641461552", "6e7f7f532e9be78d691837bbeb20f31e");
        facebook.setOAuthPermissions("email, user_likes, user_friends, publish_actions");
    }

    /**
     *
     * @return facebook instancia de facebook
     */
    @Override
    public Facebook logIn() {
        
        Facebook facebook = new FacebookFactory().getInstance();
        facebook.setOAuthAppId("353716641461552", "27d29a87019e05f94161bb6d80619176");
        facebook.setOAuthPermissions("email,user_friends,user_likes,publish_actions");
        
        return facebook;
    }

}