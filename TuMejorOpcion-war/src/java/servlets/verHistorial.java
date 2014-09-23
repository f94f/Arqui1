package servlets;

import com.tumejoropcion.bos.Bono;
import com.tumejoropcion.servicios.IServicioBonosMockLocal;
import com.tumejoropcion.servicios.ServicioBonosMock;
import com.tumejoropcion.servicios.ServicioPersistenciaMock;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class verHistorial extends HttpServlet {

    private static final long serialVersionUID = -7453606094644144082L;

    private IServicioBonosMockLocal persist;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        persist = new ServicioBonosMock();
        System.out.println("entró al servlet");
        Facebook facebook = (Facebook) request.getSession().getAttribute("facebook");
        String id= "defaultUser";
        try{
            id = facebook.getId();
        }catch (Exception e)
        {
           System.out.println("no cogio el id del usuario, id userDefault");
        }
        List<Bono> resp = ServicioPersistenciaMock.darInstancia().darBonosDeUsuario(id);
        try {
            String impr = "";
            for (int i = 0; i < resp.size(); i++) {
                Bono b = resp.get(i);
                impr += "Un Bono de la tienda " + b.darReferencia() + " , cuyo código es: " + b.darCodigo() + "\n";
            }
            if(impr != ""){
            facebook.postStatusMessage(impr);
            }else{
              facebook.postStatusMessage(" el usuario no ha comprado bonos aun");  
            }
            System.out.println("siguio");
        } catch (FacebookException e) {
            System.out.println("perdidas");
            throw new ServletException(e);

        }
        response.sendRedirect(request.getContextPath() + "/");
        PrintWriter out = response.getWriter();
        out.println("Lista de bonos:");
        for (int i = 0; i < resp.size(); i++) {
            Bono actual = resp.get(i);
            out.println(actual.darCodigo() + " | " + actual.darTienda());
        }
    }
}
