/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.controller;

import poo.cine.dao.TicketsDao;
import poo.cine.Ticket;

/**
 *
 * @author roberto
 */
public class GestorTickets {
    private static TicketsDao ticketsDao;
    
    public static void guardarTicket(Ticket ticket) {
        ticketsDao.guardar(ticket);
    }
    
}
