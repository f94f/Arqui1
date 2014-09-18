/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ IServicioCatalogo.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * Autor: Juan Sebastián Urrego
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.tumejoropcion.servicios;

import com.tumejoropcion.bos.Bono;
import java.util.List;


/**
 * Contrato funcional de los servicios que se le prestan al catálogo
 * @author Juan Sebastián Urrego
 */
public interface IServicioBonosOP
{

    /**
     * Agrega un mueble al sistema
     * @param mueble Nuevo mueble
     */
    public void agregarBono(Bono bono);

    public void eliminarBono(Bono bono);
    
    /**
     * Actualiza un mueble de cierta referencia al sistema 
     * @param mueble mueble
     */
    public void actualizarBono(Bono bono);
    
    /**
     * Consultar los mueble con referencia del sistema 
     * @param mueble mueble
     */
    public List<Bono> consultar(Bono bono);
    
    /**
     * Devuelve todos los muebles del sistema
     * @return muebles Lista de muebles
     */
    public List<Bono> darBonos();
    
}
