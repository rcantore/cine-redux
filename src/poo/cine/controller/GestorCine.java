/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.controller;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import poo.cine.Cine;
import poo.cine.Genero;
import poo.cine.Pelicula;
import poo.cine.dao.GenerosDao;
import poo.cine.dao.GenerosDaoImpl;
import poo.cine.dao.PeliculasDao;
import poo.cine.dao.PeliculasDaoImpl;
import poo.cine.ui.PantallaBienvenida;
import poo.cine.ui.PantallaVentaEntradas;
import poo.cine.usuario.Boletero;

/**
 *
 * @author joaquinleonelrobles
 */
public class GestorCine {
    
    private final Cine cine;
    
    private final GenerosDao generosDao;
    private final PeliculasDao peliculasDao;

    public GestorCine() {
        Calendar ahora = Calendar.getInstance();
        
        // creamos el cine
        cine = new Cine("Marcelo T. de Alvear 820", ahora.getTime(), "Gran Cine", new BigDecimal(57));
        
        // creamos las instancias de los objetos de acceso a datos
        this.generosDao = new GenerosDaoImpl();
        this.peliculasDao = new PeliculasDaoImpl();
    }
    
    public void run () {
        // obtenemos los objetos para completar las listas de seleccion
        List<Genero> generos = generosDao.obtenerTodos();
        
        // creamos una instancia del formulario y lo mostramos
        //PantallaAdministracionPelicula panel = new PantallaAdministracionPelicula(generos, calificaciones, paises, this);
//        Boletero boletero = new Boletero();
//        PantallaVentaEntradas panel = new PantallaVentaEntradas(boletero);
        PantallaBienvenida panel = new PantallaBienvenida();
        panel.setVisible(true);
    }


    public Pelicula buscarPeliculaPorNombre(String nombre) {
        return peliculasDao.buscarPorNombre(nombre);
    }
    
    public void guardarPelicula (Pelicula pelicula) {
        peliculasDao.guardar(pelicula);
    }
}
