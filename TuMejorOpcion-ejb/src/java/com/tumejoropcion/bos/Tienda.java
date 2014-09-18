/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tumejoropcion.bos;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Tienda {
    
     /**
      * Nombre de la tienda.
      */
    private String nombre;
    
    /**
     * Lista de onos que tiene la tienda.
     */
    private ArrayList<Bono> bonos;
    
    /**
     * Identificador único de la tienda
     */
    public int identificador;
    
    /**
     * Inicializa la tienda.
     */
    public Tienda() {
        
    }
    
    public Tienda(String nombre, int identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
        bonos = new ArrayList<Bono>();
    }
    
    /**
     * Da el nombre de la tienda.
     * @return el nombre de la tienda.
     */
    public String darNombre() {
        return nombre;
    }
    
    /**
     * Retorna la lista de bonos que tiene la tienda.
     * @return lista de los bonos.
     */
    public ArrayList<Bono> darBonos() {
        return bonos;
    }
    
    /**
     * Muestra el indentificador de la tienda
     * @return El identificador de la tienda
     */
    public int darIdentificador() {
        return identificador;
    }
    
    /**
     * Asigna un nuevo nombre a la tienda por uno que entra por parámetro.
     * @param nombre El nuevo nombre de la tienda. nombre != null & nombre != ""
     */
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Asigna el nuevo identificador de la tienda por uno nuevo que entra por parámetro
     * @param id El nuevo identificador de la tienda.
     */
    public void cambiarIdentificador(int id) {
        identificador = id;
    }
    
    /**
     * Indica si el bono es valido y se valido.
     * @param codBon El cofigo del bono a validar.
     * @return true si se pudo validar, false si no.
     */
    public boolean redimirBono(int codBon) {
        boolean termino = false;
        for(int i = 0; i < bonos.size() && !termino; i++) {
            Bono x = bonos.get(i);
            if(x.darCodigo() == codBon) {
                termino = true;
                if(x.estaVigente() == true) {
                    x.redimido();
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        return false;
    }
    
    /**
     * Agrega un nuevo bono a la lista de bonos.
     * @param bono El nuevo bono a agregar.
     * @return true si se pudo agregar, falso si no.
     */
    public boolean agregarBono(Bono bono) {
        for(int i = 0; i < bonos.size(); i++) {
            Bono x = bonos.get(i);
            if(x.darCodigo() == bono.darCodigo()) {
                return false;
            }
            else {
                bonos.add(x);
                return true;
               
            }
        }
        return false;
    }

    
    
    public void agregarBonosConReferenciaYo(ArrayList<Bono> ArregloBonos) {
        for(int i = 0; i < ArregloBonos.size(); i++) {
            Bono x = ArregloBonos.get(i);
            if(x.darReferencia().equals(nombre)) {
                bonos.add(x);
            }
        }
    }
    
}
