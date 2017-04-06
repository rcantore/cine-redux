/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.controller;

import poo.cine.Entrada;
import poo.cine.dao.EntradasDao;

/**
 *
 * @author roberto
 */
public class GestorEntradas {
    private static EntradasDao entradasDao;

    public static void guardarEntrada(Entrada entrada) {
        entrada.getFuncion().getEntradas().add(entrada);
        entradasDao.guardar(entrada);
    }
    
}
