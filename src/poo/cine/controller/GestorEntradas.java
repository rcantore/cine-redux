/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.controller;

import java.util.List;
import poo.cine.Entrada;
import poo.cine.dao.EntradasDao;
import poo.cine.dao.EntradasDaoImpl;

/**
 *
 * @author roberto
 */
public class GestorEntradas {
    private static EntradasDao entradasDao = new EntradasDaoImpl();

    public static void guardarEntrada(Entrada entrada) {
        entrada.getFuncion().getEntradas().add(entrada);
        entradasDao.guardar(entrada);
    }
    
    public static List<Entrada> obtenerTodas() {
        return entradasDao.obtenerTodos();
    }
    
}
