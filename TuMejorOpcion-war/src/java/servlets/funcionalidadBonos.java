package servlets;

import beans.Login;
import beans.TiendaBean;
import com.tumejoropcion.bos.Bono;
import com.tumejoropcion.bos.Tienda;
import com.tumejoropcion.exception.OperacionInvalidaException;
import com.tumejoropcion.servicios.IServicioBonosMockLocal;
import com.tumejoropcion.servicios.ServicioBonosMock;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class funcionalidadBonos extends HttpServlet {
    private static final long serialVersionUID = -7453606094644144082L;
    
    private IServicioBonosMockLocal persist;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     request.setCharacterEncoding("UTF-8");
        persist = new ServicioBonosMock();
        
        int cod= 120;
        
        String message = request.getParameter("messagecomprar");
        Facebook facebook = (Facebook) request.getSession().getAttribute("facebook");
        GregorianCalendar c= new GregorianCalendar(2014,12,12);
            Date y =c.getTime();
            int valor = Integer.parseInt(message);
            
            Bono nuevo = new Bono(cod, valor, "Zara",y );
        try {
            
            persist.agregarBono(nuevo);
            
            System.out.println("agregó");
            //System.out.println(persist.getBono().get(7).darCodigo()+"");
           // System.out.println(persist.getBono().size());
             facebook.postStatusMessage("compre un bono de un valor"+ message);
        } catch (FacebookException e) {
         throw new ServletException(e);
        } catch (OperacionInvalidaException ex) {
            Logger.getLogger(funcionalidadBonos.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect(request.getContextPath()+ "/");
        
        
    }
}
