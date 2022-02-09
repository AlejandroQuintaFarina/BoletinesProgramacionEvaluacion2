/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21_1;

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author alex0
 */
public class arrayNumeros {
      
        public static void crearArray(){
        
        int[] numeros = new int[6];    
        
        for (int i=0; i<numeros.length; i++){
        numeros[i] = (int) (Math.random()*50)+1;
        } 
        
        for (int i= 0;i <numeros.length/2; i++){
            
        }
        
        System.out.println(Arrays.toString(numeros));
            
        }
}
