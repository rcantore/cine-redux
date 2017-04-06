/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import java.util.ArrayList;
import java.util.List;
import poo.cine.Entrada;

/**
 *
 * @author roberto
 */
public class EntradasDaoImpl implements EntradasDao {
    List<Entrada> entradas = new ArrayList<>();

    @Override
    public List<Entrada> obtenerTodos() {
        return entradas;
    }

    @Override
    public void guardar(Entrada entrada) {
        entradas.add(entrada);
    }
    
}
