package servlets;


import com.tumejoropcion.servicios.IServicioBonosMockLocal;
import com.tumejoropcion.servicios.ServicioBonosMock;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facebook4j.Facebook;
import facebook4j.FacebookException;
public class redimirBono extends HttpServlet {
    private static final long serialVersionUID = -7453606094644144082L;
   private IServicioBonosMockLocal persist;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        persist = new ServicioBonosMock();
        System.out.println("entró al servlet");
        Facebook facebook = (Facebook) request.getSession().getAttribute("facebook");
        String confucion = request.getParameter("message1");
       
        try {
             int a=Integer.parseInt(confucion);
             boolean resp =persist.redimirBono(a);
                      
            facebook.postStatusMessage("se pudo redimir el bono?"+resp+" con codigo:"+confucion);
           
        } catch (FacebookException e) {
            System.out.println("perdidas");
            throw new ServletException(e);
            
        }
         response.sendRedirect(request.getContextPath()+ "/");
      }
}
