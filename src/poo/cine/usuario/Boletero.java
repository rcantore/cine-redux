/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.usuario;

import poo.cine.Entrada;
import poo.cine.Funcion;
import poo.cine.controller.GestorEntradas;
/**
 *
 * @author roberto
 */
public class Boletero extends Usuario {
    
    public void venderEntrada(Funcion funcion) {

        Entrada entrada = new Entrada();
        entrada.setFuncion(funcion);
        
        GestorEntradas.guardarEntrada(entrada);
    }
    
}
