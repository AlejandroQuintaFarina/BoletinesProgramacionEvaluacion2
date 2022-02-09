/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21_3;

import java.util.Arrays;

/**
 *
 * @author alex0
 */
public class nomesAlumnos {
    
     public static void crearArray(){
        
        int [] notas= new int [10];
        int aprobados=0;
        int suspensos=0;
        double media=0.0;
        int notaalta = notas[0];
        String [] alumnos= new String [10];
         
        for(int i= 0; i<notas.length; i++){
            notas[i] = (int) (Math.random()*10)+1;
            media = media + notas[i];
            if(notas[i]>notaalta){
                notaalta=notas[i];
            }
            if(notas[i]>=5){
                aprobados ++;
            }
            else if(notas[i]<5){
               suspensos ++;
        }
          
        }
        
        alumnos[0]="A1";
        alumnos[1]="A2";
        alumnos[2]="A3";
        alumnos[3]="A4";
        alumnos[4]="A5";
        alumnos[5]="A6";
        alumnos[6]="A7";
        alumnos[7]="A8";
        alumnos[8]="A9";
        alumnos[9]="A10";
        
        media = media / notas.length;
        System.out.println(Arrays.toString(notas)+alumnos[0]);
        System.out.println(" Aprobados: " +aprobados+ " suspensos: "+suspensos);
        System.out.println(" La nota media es: "+media);
        System.out.println(" La nota más alta es: " +notaalta);
        
    }
    
    
}
