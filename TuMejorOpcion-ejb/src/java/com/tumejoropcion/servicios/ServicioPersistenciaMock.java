/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ ServicioPersistenciaMock.java
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
import com.tumejoropcion.bos.Tienda;
import com.tumejoropcion.exception.OperacionInvalidaException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.GregorianCalendar;
import javax.ejb.Stateless;

/**
 * Implementación de los servicios de persistencia
 * @author Juan Sebastián Urrego
 */
@Stateless
public class ServicioPersistenciaMock implements IServicioPersistenciaMockRemote, IServicioPersistenciaMockLocal {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Lista con los vendedores del sistema
     */
    private static ArrayList<Bono> bonos;

    /**
     * Lista con los muebles del sistema
     */
    private static ArrayList<Tienda> tiendas;

    /**
     * Lista con los usuarios del sistema
     */
    private static ArrayList<Usuario> usuarios;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor de la clase. Inicializa los atributos.
     */
    public ServicioPersistenciaMock()
    {
        if (tiendas == null)
        {
            bonos = new ArrayList<Bono>();
            
            GregorianCalendar c = new GregorianCalendar(2,12,2014);
            Date y = c.getTime();
            
            bonos.add(new Bono(1, 12000, "Sara", y));
            bonos.add(new Bono(2, 12000, "Lec Lee", y));
            bonos.add(new Bono(3, 12000, "Sara", y));
            bonos.add(new Bono(4, 12000, "Studio F", y));
            bonos.add(new Bono(5, 12000, "Fuera de Serie", y));
            bonos.add(new Bono(6, 12000, "Arturo Calle", y));
            bonos.add(new Bono(7, 12000, "Arturo Calle", y));
            
            
            tiendas = new ArrayList<Tienda>();

            tiendas.add(new Tienda("Sara", 1));
            tiendas.add(new Tienda("Arturo Calle",2));
            tiendas.add(new Tienda("Fuera de Serie",3));
            tiendas.add(new Tienda("Bkul", 4));
            tiendas.add(new Tienda("Lec Lee", 5));
            tiendas.add(new Tienda("Studio F",6));
            tiendas.add(new Tienda("Pronto", 7));
            tiendas.add(new Tienda("Armi", 8));

            usuarios = new ArrayList<Usuario>();

            usuarios.add(new Usuario("admin", "adminadmin", TipoUsuario.Administrador));
            usuarios.add(new Usuario("client", "clientclient", TipoUsuario.Cliente));
            
            for(int i = 0; i < tiendas.size(); i++) {
                Tienda t = tiendas.get(i);
                t.agregarBonosConReferenciaYo(bonos);
            }
            
        }
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------
    
    /**
     * Permite crear un objeto dentro de la persistencia del sistema.
     * @param obj Objeto que representa la instancia de la entidad que se quiere crear.
     */
    @Override
    public void create(Object obj) throws OperacionInvalidaException
    {
        if (obj instanceof Tienda)
        {
            Tienda t = (Tienda) obj;
            t.cambiarIdentificador(tiendas.size() + 1);
            tiendas.add(t);
        }
        else if (obj instanceof Bono)
        {

            Bono b = (Bono) obj;
            b.cambiarCodigo(bonos.size() + 1);
            bonos.add(b);
        } 
        else if (obj instanceof Usuario)
        {
            Usuario u = (Usuario) obj;
            for (Usuario us : usuarios)
            {
                if (us.getLogin().equals(u.getLogin()))
                {
                    throw new OperacionInvalidaException("El usuario '" + u.getLogin() + "' ya ha sido registrado en el sistema");
                }
                if (us.getDocumento() == u.getDocumento() && us.getTipoDocumento().equals(u.getTipoDocumento()))
                {
                    throw new OperacionInvalidaException("El usuario con documento '" + u.getDocumento() + "' ya ha sido registrado en el sistema");
                }
            }
            usuarios.add(m);
        }
    }

    /**
     * Permite modificar un objeto dentro de la persistencia del sistema.
     * @param obj Objeto que representa la instancia de la entidad que se quiere modificar.
     */
    @Override
    public void update(Object obj)
    {
        if (obj instanceof Tienda)
        {
            Tienda editar = (Tienda) obj;
            Tienda tienda;
            for (int i = 0; i < tiendas.size(); i++)
            {
                tienda = tiendas.get(i);
                if (tienda.darIdentificador() == editar.darIdentificador())
                {
                    tiendas.set(i, editar);
                    break;
                }

            }

        }
        else if (obj instanceof Bono)
        {
            Bono editar = (Bono) obj;
            Bono bono;
            for (int i = 0; i < bonos.size(); i++)
            {
                bono = bonos.get(i);
                if (bono.darCodigo() == editar.darCodigo())
                {
                    bonos.set(i, editar);
                    break;
                }
            }
        } 
        else if (obj instanceof Usuario)
        {

            Usuario editar = (Usuario) obj;
            Usuario usuario;
            for (int i = 0; i < usuarios.size(); i++)
            {
                usuario = usuarios.get(i);
                if (usuario.getLogin().equals(editar.getLogin()))
                {
                    usuarios.set(i, editar);
                    break;
                }
            }
        }
    }

    /**
     * Permite borrar un objeto dentro de la persistencia del sistema.
     * @param obj Objeto que representa la instancia de la entidad que se quiere borrar.
     * @throws com.tumejoropcion.exception.OperacionInvalidaException
     */
    @Override
    public void delete(Object obj) throws OperacionInvalidaException
    {
        if (obj instanceof Tienda)
        {
            Tienda tiendaABorrar = (Tienda) obj;

            for (int e = 0; e < tiendas.size(); e++)
            {
                Tienda ven = (Tienda) tiendas.get(e);
                if (ven.darIdentificador()== tiendaABorrar.darIdentificador())
                {
                    tiendas.remove(e);
                    break;
                }
            }

        } 
        else if (obj instanceof Bono)
        {
            Bono bono;
            Bono eliminar = (Bono) obj;
            for (int i = 0; i < bonos.size(); i++)
            {
                bono = bonos.get(i);
                if (eliminar.darCodigo() == bono.darCodigo())
                {
                    bonos.remove(i);
                    break;
                }

            }

        } 
        else if (obj instanceof Usuario)
        {
            Usuario usuarioABorrar = (Usuario) obj;
            for (RegistroVenta rv : registrosVentas)
            {
                if (rv.getComprador().getLogin().equals(usuarioABorrar.getLogin()))
                {
                    System.out.print("no borrado");
                    throw new OperacionInvalidaException("El usuario ha realizado comprar y por lo tanto no puede ser eliminado del sistema.");
                }
            }
            if (usuarioABorrar != null && usuarioABorrar.getLogin() != null)
            {
                for (int e = 0; e < usuarios.size(); e++)
                {
                    Usuario ven = (Usuario) usuarios.get(e);
                    if (ven.getLogin().equals(usuarioABorrar.getLogin()))
                    {
                        usuarios.remove(e);
                        System.out.print("borrado");
                        break;
                    }
                }
            }
        }
    }

    /**
     * Retorna la lista de todos los elementos de una clase dada que se encuentran en el sistema.
     * @param c Clase cuyos objetos quieren encontrarse en el sistema.
     * @return list Listado de todos los objetos de una clase dada que se encuentran en el sistema.
     */
    @Override
    public List findAll(Class c)
    {
        if (c.equals(Bono.class))
        {
            return bonos;
        } 
        else if (c.equals(Tienda.class))
        {
            return tiendas;
        } 
        else if (c.equals(Usuario.class))
        {
            return usuarios;
        } 
        else
        {
            return null;
        }
    }

    /**
     * Retorna la instancia de una entidad dado un identificador y la clase de la entidadi.
     * @param c Clase de la instancia que se quiere buscar.
     * @param id Identificador unico del objeto.
     * @return obj Resultado de la consulta.
     */
    @Override
    public Object findById(Class c, Object id)
    {
        if (c.equals(Tienda.class))
        {
            for (Object t : findAll(c))
            {
                Tienda tien = (Tienda) t;
                if (tien.darIdentificador() == (Long)id)
                {
                    return tien;
                }
            }
        } 
        else if (c.equals(Bono.class))
        {
            for (Object b : findAll(c))
            {
                Bono bon = (Bono) b;
                if (id.equals(bon.darCodigo()))
                {
                    return bon;
                }
            }
        } 
        else if (c.equals(Usuario.class))
        {
            for (Object v : findAll(c))
            {
                Usuario mue = (Usuario) v;
                if (mue.getLogin().equals(id))
                {
                    return mue;
                }
            }
        }
        return null;
    }
}
