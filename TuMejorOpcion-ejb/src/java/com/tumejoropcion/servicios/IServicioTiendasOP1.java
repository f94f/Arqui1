
package com.tumejoropcion.servicios;

import com.tumejoropcion.bos.Tienda;
import java.util.List;


/**
 * Contrato funcional de los servicios que se le prestan al catálogo
 * @author Juan Sebastián Urrego
 */
public interface IServicioTiendasOP1
{

    /**
     * Agrega un mueble al sistema
     * @param mueble Nuevo mueble
     */
    public void agregarTienda(Tienda tienda);

    public void eliminarTienda(Tienda tienda);
    
    /**
     * Actualiza un mueble de cierta referencia al sistema 
     * @param mueble mueble
     */
    public void actualizarTienda(Tienda tienda);
    
    /**
     * Consultar los mueble con referencia del sistema 
     * @param mueble mueble
     */
    public List<Tienda> consultar(Tienda tienda);
    
    /**
     * Devuelve todos los muebles del sistema
     * @return muebles Lista de muebles
     */
    public List<Tienda> darTiendas();
    
}
