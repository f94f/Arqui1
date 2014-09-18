
package com.tumejoropcion.servicios;

import com.tumejoropcion.bos.Bono;
import com.tumejoropcion.exception.OperacionInvalidaException;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateful;

/**
 * Implementación de los servicios de administración de un vendedor en el sistema
 * @author Juan Sebastián Urrego
 */
@Stateful
public class ServicioBonosMock implements IServicioBonosMockRemote, IServicioBonosMockLocal {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    
    /**
     * Interface con referencia al servicio de persistencia en el sistema
     */
    @EJB
    private IServicioPersistenciaMockLocal persistencia;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor de la clase sin argumentos
     */
    public ServicioBonosMock()
    {
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agrega un bono al sistema
     * @param a Elbono a agregar
     */
    @Override
    public void agregarBono(Bono a) throws OperacionInvalidaException
    {
        try
        {
            persistencia.create(a);
        }
        catch (OperacionInvalidaException ex)
        {
            throw new OperacionInvalidaException(ex.getMessage());
        } 
    }

    /**
     * Elimina un bono del sistema
     * @param codigo El codigo único del bono
     * @throws OperacionInvalidaException 
     */
    @Override
    public void eliminarBono(int codigo)throws OperacionInvalidaException
    {
        Bono b = (Bono) persistencia.findById(Bono.class, codigo);     
        try
        {
            persistencia.delete(b);
        } catch (OperacionInvalidaException ex)
        {
            throw new OperacionInvalidaException(ex.getMessage());
        }
    }

    @Override
    public List<Bono> getBono()
    {
        return persistencia.findAll(Bono.class);
    }

}
