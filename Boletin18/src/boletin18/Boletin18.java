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
public class Boletin18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConversorTemperaturas excepcion=new ConversorTemperaturas();
    
   try{
        excepcion.centigradosAFharenheit(0);
                
    }
    catch(TemperaturaExcepcion ex){
        System.out.println("Error: "+ ex.toString());
    }
        excepcion.centigradosAReamur();
    
    }
    
}
