/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;
import libreriaAlex.leerDatos;
/**
 *
 * @author alex0
 */
public class EquiposDivision {
    
     public static int [][] crear (int [][]taboa){    
    
        for(int fila=0; fila<taboa.length; fila++)
            for (int columna=0; columna<taboa[fila].length; columna++){
                taboa[fila][columna]=leerDatos.leerInt(" Dame valores enteros: ");
            }
        return taboa;
    }
     
     public static void amosar (int [][] taboa, String [] jornada, String [] equipos){
         
         for (int columna=0; columna<jornada.length; columna++)
            System.out.print( "   " + jornada[columna]);
         for(int fila=0; fila<taboa.length; fila++){    
        
            System.out.println("\n"+equipos[fila]+ "   ");
        for (int columna=0; columna<taboa[fila].length; columna++){
            System.out.print(taboa[fila][columna]+ "   ");
    }    
        System.out.println("    " +[fila]);
    }  
         
    }
     
     public static int sumarGoles (int[][]taboa){
        
        int suma=0;
        
        for(int fila=0; fila<taboa.length; fila++){
            suma=0;
            for (int columna=0; columna<taboa[fila].length; columna++)
            suma=suma+taboa[fila][columna];
        
    }
         return suma;
     }
     
     public static void mostrarEquipoGoles (int[][] taboa){
         
         int total= EquiposDivision.sumarGoles(taboa);
         int aux = 0;
         
         
         
         
         
     }
    
}
