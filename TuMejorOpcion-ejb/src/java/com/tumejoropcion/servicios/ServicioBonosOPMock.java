
package com.tumejoropcion.servicios;

import com.tumejoropcion.bos.Bono;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;


/**
 * Implementacion de los servicios del catalogo de muebles que se le prestan al sistema. [Mock Object]
 * @author Juan Sebastián Urrego
 */

public class ServicioBonosOPMock implements IServicioBonosOP
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Arreglo con los muebles del sistema
     */
    private ArrayList<Bono> bonos;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor sin argumentos de la clase
     */
    public ServicioBonosOPMock()
    {

        //Inicializa el arreglo de los muebles
        bonos = new ArrayList<Bono>();

        //Agrega los muebles del sistema
        GregorianCalendar c = new GregorianCalendar(2,12,2014);
            Date y = c.getTime();
            
            bonos.add(new Bono(1, 12000, "Sara", y));
            bonos.add(new Bono(2, 12000, "Lec Lee", y));
            bonos.add(new Bono(3, 12000, "Sara", y));
            bonos.add(new Bono(4, 12000, "Studio F", y));
            bonos.add(new Bono(5, 12000, "Fuera de Serie", y));
            bonos.add(new Bono(6, 12000, "Arturo Calle", y));
            bonos.add(new Bono(7, 12000, "Arturo Calle", y));

    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agrega un mueble al sistema
     * @param mueble Nuevo mueble
     */
    @Override
    public void agregarBono(Bono bono)
    {
        bonos.add(bono);
    }
    
    @Override
    public void eliminarBono(Bono bono)
    {
        boolean encontro = false;
        for(int i =0; i < bonos.size() && !encontro; i++) {
            Bono x = bonos.get(i);
            if(x.darCodigo() == bono.darCodigo()) {
                bonos.remove(i);
                encontro = true;
            }
        }
    }
    
    /**
     * Actualiza un mueble al sistema
     * @param mueble mueble
     */
    @Override
    public void actualizarBono(Bono bono)
    {
        boolean encontro = false;
        for(int i =0; i < bonos.size() && !encontro; i++) {
            Bono x = bonos.get(i);
            if(x.darCodigo() == bono.darCodigo()) {
                x.cambiarFechaVencimiento(bono.darFechaVencimiento());
                x.cambiarReferencia(bono.darReferencia());
                x.cambiarValor(bono.darValor());
                encontro = true;
            }
        }
    }
    
    /**
     * Consultar los mueble con referencia del sistema
     * @param mueble mueble
     */
    @Override
    public List<Bono> consultar(Bono bono) {
        ArrayList y = new ArrayList<Bono>();
        for(int i =0; i < bonos.size(); i++) {
            Bono x = bonos.get(i);
            if(x.darCodigo() == bono.darCodigo()) {
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
    public List<Bono> darBonos()
    {
        return bonos;
    }

}
