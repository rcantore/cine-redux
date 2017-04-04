/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine;

import poo.cine.Pelicula;
import poo.cine.Programacion;

/**
 *
 * @author roberto
 */
public class Ticket {
    
    private Pelicula pelicula;
    
    private Programacion programacion;
    
    public Pelicula getPelicula() {
        return pelicula;
    }
    
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    public Programacion getProgramacion() {
        return programacion;
    }
    
    public void setProgramacion(Programacion programacion) {
        this.programacion = programacion;
    }
    
}
