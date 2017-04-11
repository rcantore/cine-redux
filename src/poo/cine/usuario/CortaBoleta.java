/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.usuario;

import java.util.Date;
import poo.cine.Entrada;
import poo.cine.Funcion;
import poo.cine.Pelicula;

/**
 *
 * @author roberto
 */
public class CortaBoleta {
    private Pelicula peliculaAsignada;
    private Funcion funcionAsignada;
    private int cantidadEntradas;

    public CortaBoleta(Pelicula peliculaAsignada, Funcion funcionAsignada) {
        this.peliculaAsignada = peliculaAsignada;
        this.funcionAsignada = funcionAsignada;
    }
    
    
    public boolean verificarEntrada(Entrada entrada) {
        Funcion funcionEntrada = entrada.getFuncion();
        Date horaInicio = funcionEntrada.getHoraInicio();
        String nombrePelicula = funcionEntrada.getPelicula().getNombre();
        
        if ((nombrePelicula.equals(peliculaAsignada.getNombre())) &&
                horaInicio.compareTo(funcionAsignada.getHoraInicio()) == 0) {
            return true;
        }
                
        return false;
    }
}
