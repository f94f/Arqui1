/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import com.tumejoropcion.bos.Usuario;
import com.tumejoropcion.servicios.ServicioLoginMock;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.Like;
import facebook4j.User;
import facebook4j.Friend;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author estudiante
 */
@Stateful
public class Login {

    private ServicioLoginMock servicio;
    private Usuario user;

    /**
     * Creates a new instance of Login
     */
    public Login() {
        servicio = new ServicioLoginMock();
        user = new Usuario();
    }

    public Facebook conectar() {
        Facebook fb = servicio.logIn();
        return fb;
    }
    
    public void inicializarUsuario(Facebook fb){
        try {
            User us = fb.getMe();
            user.setEmail(us.getEmail());
            user.setFriends(fb.getFriends()); 
            List listaf = fb.getFriends();
            System.out.println(fb.getFriends().size());
            for (int i = 0; i < listaf.size(); i++) {
             Friend amiwis = (Friend)listaf.get(i);
                System.out.println(amiwis.getName());
                System.out.println(amiwis.getEmail());
               
            }
            System.out.println(fb.getName());
            System.out.println(us.getEmail());
            List lista = fb.getUserLikes();
            for (int i = 0; i < lista.size(); i++) {
               Like laik = (Like)lista.get(i);
               if (laik.getCategory().equals("Clothing")){
                System.out.println(lista.get(i));
               }
            }
            user.setLikes(fb.getUserLikes());

        } catch (FacebookException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Usuario getUser(){
        return user;
    }

}
