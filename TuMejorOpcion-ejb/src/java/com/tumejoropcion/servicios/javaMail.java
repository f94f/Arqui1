/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tumejoropcion.servicios;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author estudiante
 */
public class javaMail {
    
    public javaMail(){
        
    }
    /**
     * metodo que envia un mensaje 
     */
    public void enviarMensaje(String email, int codiggo)
    {System.out.println("entró al metodo");
        try
        {   System.out.println("entro al try de enviar");
            // Propiedades de la conexión
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            
            props.setProperty("mail.smtp.port", "465");
            props.setProperty("mail.smtp.user", "gapicamargo@gmail.com");
            props.setProperty("mail.smtp.auth", "true");
            System.out.println("ahi va bien1");
            // Preparamos la sesion
            Authenticator auth = new MyAuthenticator();
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("gapicamargo@gmail.com"));
            System.out.println(email);
            message.addRecipient(
                Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("TuMejorOpcion");
            message.setText("Un amigo te ha enviado un bono de regalo"+codiggo);
            
            // Lo enviamos.
            Transport t = session.getTransport("smtp");
            System.out.println("ahi va bien2");  
            System.out.println(message.getAllRecipients());
            
            t.send(message);
            System.out.println("ahi va bien3"); 
            t.sendMessage(message, message.getAllRecipients());
            System.out.println("ahi va bien4");  
            // Cierre.
            t.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
 
}
