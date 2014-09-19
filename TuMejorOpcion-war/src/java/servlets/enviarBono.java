package servlets;


import com.tumejoropcion.servicios.IServicioBonosMockLocal;
import com.tumejoropcion.servicios.ServicioBonosMock;
import com.tumejoropcion.servicios.javaMail;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class enviarBono extends HttpServlet {
    private static final long serialVersionUID = -7453606094644144082L;
    private javaMail javamail;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        javamail= new javaMail();
        System.out.println("entró al servlet");
        Facebook facebook = (Facebook) request.getSession().getAttribute("facebook");
        String precioIn = request.getParameter("messageEnviar");
        String email = request.getParameter("email");
        int a=Integer.parseInt(precioIn);
        System.out.println("va a entrar");
       
        javamail.enviarMensaje(email, a);
    
    }
}
