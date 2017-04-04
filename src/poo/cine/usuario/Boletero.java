/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.usuario;

import poo.cine.Pelicula;
import poo.cine.Programacion;
import poo.cine.Ticket;
import poo.cine.controller.GestorTickets;
/**
 *
 * @author roberto
 */
public class Boletero extends Usuario {
    
    public void venderTicket(Pelicula pelicula, Programacion programacion) {
        Ticket ticket = new Ticket();
        ticket.setPelicula(pelicula);
        ticket.setProgramacion(programacion);
        
        GestorTickets.guardarTicket(ticket);
    }
    
}
