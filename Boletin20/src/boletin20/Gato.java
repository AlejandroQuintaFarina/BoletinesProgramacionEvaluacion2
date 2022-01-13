/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

/**
 *
 * @author alex0
 */
public class Gato extends Felino implements IPodeNadar{

    @Override
    public void camiñar() {
        System.out.println("Gato caminado "); 
    }

    @Override
    public void nadar() {
        System.out.println("Gato nadando"); 
    }
    
}
