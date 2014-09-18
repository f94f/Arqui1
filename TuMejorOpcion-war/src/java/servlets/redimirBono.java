package servlets;

import beans.Login;
import beans.TiendaBean;
import com.tumejoropcion.bos.Tienda;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facebook4j.Facebook;
import facebook4j.FacebookException;
public class redimirBono extends HttpServlet {
    private static final long serialVersionUID = -7453606094644144082L;
    Login beanLogin = new Login();
    TiendaBean  beanTienda=new TiendaBean();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       System.out.println("entró al servlet");
        Facebook facebook = (Facebook) request.getSession().getAttribute("facebook");
        String confucion = request.getParameter("message1");
       
        try {
            System.out.println("entró al try");
            int codigo =Integer.parseInt(confucion);
             boolean resp=beanTienda.redimirBono(codigo);              
            facebook.postStatusMessage("se pudo redimir el bono?"+resp+" con codigo:"+confucion);
           
        } catch (FacebookException e) {
            System.out.println("perdidas");
            throw new ServletException(e);
            
        }
         response.sendRedirect(request.getContextPath()+ "/El bono fue redimido exitosamente");
      }
}
