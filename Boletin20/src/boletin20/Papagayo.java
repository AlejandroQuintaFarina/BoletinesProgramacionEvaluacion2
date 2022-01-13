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
public class Papagayo extends Ave implements IPodeVoar{

    @Override
    public void camiñar() {
        System.out.println("Papagayo caminando");
    }

    @Override
    public void voar() {
        System.out.println("Papagayo volando"); 
    }

    
}
