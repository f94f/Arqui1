
package com.tumejoropcion.servicios;

import com.tumejoropcion.bos.Tienda;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;


/**
 * Implementacion de los servicios del catalogo de muebles que se le prestan al sistema. [Mock Object]
 * @author Juan Sebastián Urrego
 */

public class ServicioTiendasOPMock1 implements IServicioTiendasOP1
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Arreglo con los muebles del sistema
     */
    private ArrayList<Tienda> tiendas;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor sin argumentos de la clase
     */
    public ServicioTiendasOPMock1()
    {

        //Inicializa el arreglo de los muebles
        tiendas = new ArrayList<Tienda>();

        //Agrega los muebles del sistema
        GregorianCalendar c = new GregorianCalendar(2,12,2014);
            Date y = c.getTime();
            
            tiendas.add(new Tienda("Zara", 1));
            tiendas.add(new Tienda("Arturo Calle",2));
            tiendas.add(new Tienda("Fuera de Serie",3));
            tiendas.add(new Tienda("Bkul", 4));
            tiendas.add(new Tienda("Lec Lee", 5));
            tiendas.add(new Tienda("Studio F",6));
            tiendas.add(new Tienda("Pronto", 7));
            tiendas.add(new Tienda("Armi", 8));

    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agrega un mueble al sistema
     * @param mueble Nuevo mueble
     */
    @Override
    public void agregarTienda(Tienda tienda)
    {
        tiendas.add(tienda);
    }
    
    @Override
    public void eliminarTienda(Tienda tienda)
    {
        boolean encontro = false;
        for(int i =0; i < tiendas.size() && !encontro; i++) {
            Tienda x = tiendas.get(i);
            if(x.darIdentificador()== tienda.darIdentificador()) {
                tiendas.remove(i);
                encontro = true;
            }
        }
    }
    
    /**
     * Actualiza un mueble al sistema
     * @param mueble mueble
     */
    @Override
    public void actualizarTienda(Tienda tienda)
    {
        boolean encontro = false;
        for(int i =0; i < tiendas.size() && !encontro; i++) {
            Tienda x = tiendas.get(i);
            if(x.darIdentificador() == tienda.darIdentificador()) {
                x.cambiarNombre(tienda.darNombre());
                x.cambiarBonos(tienda.darBonos());
                encontro = true;
            }
        }
    }
    
    /**
     * Consultar los mueble con referencia del sistema
     * @param mueble mueble
     */
    @Override
    public List<Tienda> consultar(Tienda tienda) {
        ArrayList y = new ArrayList<Tienda>();
        for(int i =0; i < tiendas.size(); i++) {
            Tienda x = tiendas.get(i);
            if(x.darIdentificador() == tienda.darIdentificador()) {
                y.add(x);
            }
        }
        return y;
    }

    /**
     * Devuelve los muebles del sistema
     * @return muebles Arreglo con todos los muebles del sistema
     */
    @Override
    public List<Tienda> darTiendas()
    {
        return tiendas;
    }

}
