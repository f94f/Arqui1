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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
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
        if (vendedores == null)
        {
            bonos = new ArrayList<Bono>();
            
            bonos.add(new Bono(0000001, 12000, "Sara", experiencia, true));
            
            
            tiendas = new ArrayList<Tienda>();

            //Agrega los muebles del sistema
            tiendas.add(new Tienda("Sara", 1));
            tiendas.add(new Tienda("Arturo Calle",2));
            tiendas.add(new Tienda("Fuera de Serie",3));
            tiendas.add(new Tienda("Bkul", 4));
            tiendas.add(new Tienda("Lec Lee", 5));
            tiendas.add(new Tienda("Studio F",6));
            tiendas.add(new Tienda("Pronto", 7));
            tiendas.add(new Tienda("Armi", 8));

            //Inicializa el arreglo que contiene los usuarios
            usuarios = new ArrayList<Usuario>();

            //Agrega usuarios al sistema
            usuarios.add(new Usuario("admin", "adminadmin", TipoUsuario.Administrador));
            usuarios.add(new Usuario("client", "clientclient", TipoUsuario.Cliente));

            registrosVentas = new ArrayList<RegistroVenta>();
            Random r = new Random();
            for (int e = 0; e < 8; e++) {
                RegistroVenta venta = new RegistroVenta();
                venta.setCantidad(e);
                venta.setProducto(muebles.get(e));
                venta.setFechaVenta(new Date(r.nextInt()));
                venta.setCiudad("Bogotá");
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
        if (obj instanceof Vendedor)
        {
            Vendedor v = (Vendedor) obj;
            v.setIdentificacion(vendedores.size() + 1);
            vendedores.add(v);
        }
        else if (obj instanceof Mueble)
        {

            Mueble m = (Mueble) obj;
            m.setReferencia(muebles.size() + 1);
            muebles.add(m);
        } 
        else if (obj instanceof Usuario)
        {
            Usuario m = (Usuario) obj;
            for (Usuario us : usuarios)
            {
                if (us.getLogin().equals(m.getLogin()))
                {
                    throw new OperacionInvalidaException("El usuario '" + m.getLogin() + "' ya ha sido registrado en el sistema");
                }
                if (us.getDocumento() == m.getDocumento() && us.getTipoDocumento().equals(m.getTipoDocumento()))
                {
                    throw new OperacionInvalidaException("El usuario con documento '" + m.getDocumento() + "' ya ha sido registrado en el sistema");
                }
            }
            usuarios.add(m);
        } 
        else if (obj instanceof RegistroVenta)
        {
            registrosVentas.add((RegistroVenta) obj);
        }
    }

    /**
     * Permite modificar un objeto dentro de la persistencia del sistema.
     * @param obj Objeto que representa la instancia de la entidad que se quiere modificar.
     */
    @Override
    public void update(Object obj)
    {
        if (obj instanceof Vendedor)
        {
            Vendedor editar = (Vendedor) obj;
            Vendedor vendedor;
            for (int i = 0; i < vendedores.size(); i++)
            {
                vendedor = vendedores.get(i);
                if (vendedor.getIdentificacion() == editar.getIdentificacion())
                {
                    vendedores.set(i, editar);
                    break;
                }

            }

        }
        else if (obj instanceof Mueble)
        {
            Mueble editar = (Mueble) obj;
            Mueble mueble;
            for (int i = 0; i < muebles.size(); i++)
            {
                mueble = muebles.get(i);
                if (mueble.getReferencia() == editar.getReferencia())
                {
                    muebles.set(i, editar);
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
     */
    @Override
    public void delete(Object obj) throws OperacionInvalidaException
    {
        if (obj instanceof Vendedor)
        {
            Vendedor vendedorABorrar = (Vendedor) obj;

            for (int e = 0; e < vendedores.size(); e++)
            {
                Vendedor ven = (Vendedor) vendedores.get(e);
                if (ven.getIdentificacion() == vendedorABorrar.getIdentificacion())
                {
                    vendedores.remove(e);
                    break;
                }
            }

        } 
        else if (obj instanceof Mueble)
        {
            Mueble mueble;
            Mueble eliminar = (Mueble) obj;
            for (int i = 0; i < muebles.size(); i++)
            {
                mueble = muebles.get(i);
                if (eliminar.getReferencia() == mueble.getReferencia())
                {
                    muebles.remove(i);
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
        if (c.equals(Mueble.class))
        {
            return muebles;
        } 
        else if (c.equals(Vendedor.class))
        {
            return vendedores;
        } 
        else if (c.equals(Usuario.class))
        {
            return usuarios;
        } 
        else if (c.equals(RegistroVenta.class))
        {
            return registrosVentas;
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
        if (c.equals(Vendedor.class))
        {
            for (Object v : findAll(c))
            {
                Vendedor ven = (Vendedor) v;
                if (ven.getIdentificacion() == (Long)id)
                {
                    return ven;
                }
            }
        } 
        else if (c.equals(Mueble.class))
        {
            for (Object v : findAll(c))
            {
                Mueble mue = (Mueble) v;
                if (id.equals(mue.getReferencia()))
                {
                    return mue;
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