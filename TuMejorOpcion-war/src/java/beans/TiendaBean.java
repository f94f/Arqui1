/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ tiendaBean.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Tiendas de los Alpes
 * Autor: Juan Sebastián Urrego
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package beans;

import com.tumejoropcion.bos.Bono;
import com.tumejoropcion.bos.Tienda;
import com.tumejoropcion.exception.OperacionInvalidaException;
import com.tumejoropcion.servicios.IServicioTiendaMockLocal;
import com.tumejoropcion.servicios.ServicioTiendaMock;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;


/**
 * Managed bean encargado de la lista de tiendas en el sistema
 * @author Juan Sebastián Urrego
 */
public class TiendaBean implements Serializable
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Representa una nueva tienda a ingresar
     */
    private Tienda tienda;

    /**
     * Relación con la interfaz que provee los servicios necesarios del catálogo.
     */
    private IServicioTiendaMockLocal servicio;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor de la clase principal
     */
    public TiendaBean()
    {
        tienda=new Tienda();
        servicio=new ServicioTiendaMock();
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------

    /**
     * Devuelve el objeto tienda
     * @return tienda Objeto tienda
     */
    public Tienda getTienda()
    {
        return tienda;
    }

    /**
     * Modifica el objeto tienda
     * @param tienda Nuevo tienda
     */
    public void setTienda(Tienda tienda)
    {
        this.tienda = tienda;
    }

    /**
     * Devuelve una lista con todos los tiendas del sistema
     * @return tiendas Tiendas del sistema
     */
    public List<Tienda> getTiendas()
    {

        return servicio.getTiendas();
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agrega un nuevo tienda al sistema
     */
    public void agregarTienda() throws OperacionInvalidaException
    {
        servicio.agregarTienda(tienda);
        tienda=new Tienda();
    }

    /**
     * Elimina un tienda del sistema
     * @param evento Evento que tiene como parámetro el ID del tienda
     */
    public void eliminarTienda(ActionEvent evento) throws OperacionInvalidaException
    {
        FacesContext context = FacesContext.getCurrentInstance();
        Map map = context.getExternalContext().getRequestParameterMap();

        servicio.eliminarTienda(tienda.darIdentificador());
    }
    
    /**
     * Metodo que permite a una tienda redimir un bono con un codigo dado
     * @param codigo codigo del bono a redimir
     */
        public boolean redimirBono(int codigo)
       { if(verficarSiBonoEstaActivo(codigo)){
           tienda.redimirBono(codigo);
           return true;
        }else 
           return false;
           
           
       }
              
      /**
       * verifica si el bono está activo y/o vigente
       * @param codBono
       * @return true si está activo, false si ya se venció el bono
       */
        public boolean verficarSiBonoEstaActivo(int codBono){
         Date hoy=new Date(System.currentTimeMillis());
         for(int i =0; i< tienda.darBonos().size();i++){
         Bono actual= tienda.darBonos().get(i);
         if(actual.darCodigo()==(codBono)){
             if(actual.darFechaVencimiento().after(hoy)){
                    actual.caduco();
                 return false;   
             }else
                 return actual.estaVigente();
            }
           }
           return false;
        }
        /**
         * Eliminar un bono desde una tienda
         * @param codigo 
         */
        public void eliminarBono(int codigo){
           for(int i =0; i< tienda.darBonos().size();i++){
               Bono actual= tienda.darBonos().get(i);
                if(actual.darCodigo()==(codigo)){
                    tienda.darBonos().remove(actual);
                }
           }
        }
        
        /**
         * agregar bono a una tienda con un monto de dinero dado.
         * @param valor 
         */
        public void agregarBono(int valor){
            Date hoy = new Date();
            DateFormat df1=DateFormat.getDateInstance(DateFormat.SHORT);
            String s1 = df1.format(hoy);
            String dateInString = "7-Jun-2015";
               try {

                        Date date =df1.parse(dateInString);
                        System.out.println(date);
                        System.out.println(df1.format(date));
                for(int i =0; i< tienda.darBonos().size();i++){
                int codigo=(int) Math.random();
                Bono actual= tienda.darBonos().get(i);
                if(actual.darCodigo()!=(codigo)){
                                  
                    Bono nuevo= new Bono(codigo, valor, tienda.darNombre(), date );
                     tienda.agregarBono(nuevo);
                }
                              
                }
                } catch (ParseException e) {
                        e.printStackTrace();
                }
                
            
                       
        }
        
        /**
         * agrega el bono a una tienda especifica
         * @param valor del bono
         * @param nombreTienda tienda valida para nuestra aplicacion pertenecienta a la lista de tiendas dada.
         */
         public void agregarBonoATienda(int valor,Tienda tiendaNue){
            
             //Date hoy = new Date();
            DateFormat df1=DateFormat.getDateInstance(DateFormat.SHORT);
            //String s1 = df1.format(hoy);
            String dateInString = "7-Jun-2015";
               try {
                   Date date =df1.parse(dateInString);
                for(int i =0; i< tienda.darBonos().size();i++){
                     int codigo=(int) Math.random();
                     Bono actual= tienda.darBonos().get(i);
                    if(actual.darCodigo()!=(codigo)){
                    tiendaNue.agregarBono(new Bono(codigo, valor, tiendaNue.darNombre(), date));    
                 }
                              
                }
                } catch (ParseException e) {
                        e.printStackTrace();
                }
    }
}
