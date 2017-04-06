/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import poo.cine.Funcion;
import poo.cine.Pelicula;

/**
 *
 * @author joaquinleonelrobles
 */
public class PeliculasDaoImpl implements PeliculasDao {
    
    private final List<Pelicula> peliculas;

    public PeliculasDaoImpl() {
        
        this.peliculas = new ArrayList<Pelicula>();
        this.peliculas.add(crearPeliculaConFuncionesAzar("El hijo de la novia", "El hijo de la novia", 2001, 95));
        this.peliculas.add(crearPeliculaConFuncionesAzar("Matrix", "Matrix", 1999, 122));
        this.peliculas.add(crearPeliculaConFuncionesAzar("Volver al futuro", "Back to the future", 1985, 100));
    }
    
    private Pelicula crearPeliculaConFuncionesAzar(String titulo, String tituloOriginal, int anio, int duracion) {
        Pelicula pelicula = new Pelicula(anio, duracion, titulo, tituloOriginal);
        pelicula.setFunciones(crearFuncionesAzar(3));
        return pelicula;
    }

    private List<Funcion> crearFuncionesAzar(int cantidad) {
        List<Funcion> funciones = new ArrayList<Funcion>();
        for (int i = 0; i < cantidad; i++) {
            funciones.add(crearFuncionAzar());
        }
        
        return funciones;
    }
    
    private Funcion crearFuncionAzar() {
        Funcion funcion = new Funcion();
        
        Random r =new Random();
        long unixtime=(long) (1293861599+r.nextDouble()*60*60*24*365);
        Date d = new Date(unixtime);
        
        funcion.setHoraInicio(d);
                
        return funcion;
    }
    @Override
    public Pelicula buscarPorNombre(String nombre) {
        System.out.println("Buscando película por nombre: " + nombre);

        Iterator<Pelicula> iter = peliculas.iterator();
        Pelicula encontrada = null;
        
        while (iter.hasNext()) {
            Pelicula actual = iter.next();
            
            if (actual.getNombre().equalsIgnoreCase(nombre)) {
                encontrada = actual;
                break;
            }
        }
        
        return encontrada;
    }

    @Override
    public void guardar(Pelicula pelicula) {
        this.peliculas.add(pelicula);
        
        System.out.println("Película agregada: " + pelicula);
    }
    
    @Override
    public List<Pelicula> obtenerTodos() {
        return peliculas;
    }
    
}
