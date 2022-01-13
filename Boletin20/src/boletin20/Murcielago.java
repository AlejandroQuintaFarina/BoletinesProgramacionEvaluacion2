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
public class Murcielago extends Mamifero implements IPodeVoar{

    @Override
    public void camiñar() {
        System.out.println("Murcielago caminado"); 
    }

    @Override
    public void voar() {
        System.out.println("Murcielago volando"); 
    }
    
}
