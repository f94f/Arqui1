/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.tumejoropcion.bos;

import java.util.Date;

/**
 *
 * @author estudiante
 */
public class Bono {
     /**
      * El codigo del bono.
      */
    private int codigo;
    
    /**
     * Indica el valor por el cual esta el bono.
     */
    private int valor;
    
    /**
     * Indica la tienda a la cual pertenece.
     */
    private String referencia;
    
    /**
     * Indica la fecha hasta cuando el bono es valido.
     */
    private Date fechaVencimiento;
    
    /**
     * Indica si el vono esta activo.
     */
    private boolean activo;
    
    /**
     * Inicializa el bono
     * @param codigo El codigo del bono.
     * @param valor El valor del bono.
     * @param referencia La tienda a la cual pertenece el bono.
     * @param fv La fecha límite de cange.
     */
    public Bono(int codigo, int valor, String referencia, Date fv) {
        this.codigo = codigo;
        this.valor = valor;
        this.referencia = referencia;
        fechaVencimiento = fv;
        activo = true;
    }
    
    /**
     * Muestra el codigo del bono.
     * @return El codigo del bono.
     */
    public int darCodigo() {
        return codigo;
    }
    
    /**
     * Muestra el valor del bono.
     * @return El valor del bono.
     */
    public int darValor() {
        return valor;
    }
    
    /**
     * Muestra la tienda a la cual pertenece el bono.
     * @return La referencia del bono.
     */
    public String darReferencia() {
        return referencia;
    }
    
    /**
     * Muestra la fehca límite del bono para cangear.
     * @return La fehca donde deja de ser vigente.
     */
    public Date darFechaVencimiento() {
        return fechaVencimiento;
    }
    
    /**
     * Muestra si el bono esta vigente.
     * @return Si esta activo o no.
     */
    public boolean estaVigente() {
        return activo;
    }
    
    /**
     * Asigna un nuevo codigo al bono, por un numero que entra por parámetro.
     * @param codigo El nuevo codigo a agregar.
     */
    public void cambiarCodigo(int codigo) {
        this.codigo = codigo;        
    }
    
    /**
     * Asigna un nuevo valor al bono por uno que es dado por parámetro
     * @param valor El nuevo valor del bono.
     */
    public void cambiarValor(int valor) {
        this.valor = valor; 
    }
    
    /**
     * Cambia la referencia del pono por una nueva, dada por parámetro.
     * @param referencia La nueva referncia.
     */
    public void cambiarReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    /**
     * Asigna una nueva fecha límite al bono.
     * @param fv La nueva fecha límite.
     */
    public void cambiarFechaVencimiento(Date fv) {
        fechaVencimiento = fv;
    }
    
    /**
     * Cambia el estado del bono a caducado.
     */
    public void caduco() {
        activo = false;
    }
    
    /**
     * Cambia el estado del bono a redimido.
     */
    public void redimido() {
        activo = false;
    }
    
}
