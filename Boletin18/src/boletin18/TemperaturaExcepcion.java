/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

/**
 *
 * @author alex0
 */
public class TemperaturaExcepcion extends Exception{
    
     public TemperaturaExcepcion(){
        super();
    }
    public TemperaturaExcepcion (String mensaje){
        super(mensaje);
    }
    
}
