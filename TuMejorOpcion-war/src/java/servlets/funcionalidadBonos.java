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
public class funcionalidadBonos extends HttpServlet {
    private static final long serialVersionUID = -7453606094644144082L;
    Login beanLogin = new Login();
    TiendaBean  beanTienda=new TiendaBean();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       System.out.println("entró al servlet");
        Facebook facebook = (Facebook) request.getSession().getAttribute("facebook");
        String valueTienda = request.getParameter("Select");
        String confucion = request.getParameter("message");
        System.out.println(valueTienda);
        System.out.println(confucion);
        try {
            int valor =Integer.parseInt(confucion);
            int tiendaId =Integer.parseInt(valueTienda);
            System.out.println("Valor: " + valor);
            String nombreTienda="";
            if(tiendaId== 1)
            {
                 nombreTienda="Zara";
            } else if(tiendaId== 2){
                 nombreTienda="Arturo Calle";
            }else if(tiendaId== 3){
                 nombreTienda="Fuera De Serie";
            }
            else if(tiendaId== 4){
                 nombreTienda="Bkul";
            }
            else if(tiendaId== 5){
                 nombreTienda="Lec Lee";
            }
            else if(tiendaId== 6){
                 nombreTienda="Studio F";
            }
            else if(tiendaId== 7){
                 nombreTienda="Pronto";
            }else if(tiendaId== 8){
               nombreTienda="Armi";
            }else{
                nombreTienda="null";
            }
            
            Tienda actual= new Tienda(nombreTienda, tiendaId);
            
            beanTienda.agregarBonoATienda(valor,actual);
            facebook.postStatusMessage(confucion);
           
        } catch (FacebookException e) {
            System.out.println("perdidas");
            throw new ServletException(e);
            
        }
         response.sendRedirect(request.getContextPath()+ "/El bono fue creado exitosamente");
      }
}
