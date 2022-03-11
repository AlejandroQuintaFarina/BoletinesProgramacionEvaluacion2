/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 *
 * @author alex0
 */
public class MetodosString {
    
    public static void tamaño() {
        System.out.println("\n 1.");
     String frase="Isto é Java";
     int caracteres=frase.length();
        System.out.println("A frase ten "+caracteres+" caracteres.");
     
    }
    
    public static void StringAChar(){
        System.out.println("\n 2.");
        String cadena="Java";
        char[]separado=cadena.toCharArray();
        for(int i=0;i<cadena.length();i++)
        System.out.println(separado[i]);
    }
    
    public static void invertir(){
        System.out.println("\n 3.");
        String cadena="Java desde 0";
        System.out.println(cadena);
        StringBuilder cadenaInv=new StringBuilder(cadena);
        cadena=cadenaInv.reverse().toString();
        System.out.println(cadena);
        
    }
    
    public static void eliminarEspacios(){
        System.out.println("\n 4.");
        String cadena="James Gosling Created Java";
        String eliminado=cadena.replaceAll("\\s+","");
        System.out.println(eliminado);
    }
    
    public static void contarLetras(){
        System.out.println("\n 5.");
        String cadena="java java java";
        String eliminado=cadena.replaceAll("\\s+","");
        int letras=eliminado.length();
        System.out.println("A frase ten "+letras+" letras.");
    }
    
    public static void dividirYUnir(){
        System.out.println("\n 6.");
        String cadena="www. java-desde0. com";
        String eliminado=cadena.replaceAll("\\s+","");
        String[] division=eliminado.split("-", 2);
        String div1= division[0];
        String div2=division[1];
        System.out.println(div1+"\n"+div2);
        System.out.println("\n"+div1+div2);
        
    }
    public static void cambioLetra(){
        System.out.println("\n 7.");
        String cadena="javeros";
        cadena=cadena.toUpperCase();
        System.out.println(cadena);
        cadena=cadena.toLowerCase();
        System.out.println(cadena);
    }
    
    public static void comparar(){
        System.out.println("\n 8");
        String cadena1=" Java ";
        String cadena2=" JavaScript ";
        int igual=cadena1.compareToIgnoreCase(cadena2);
        if (igual==0){
            System.out.println(cadena1+" y " +cadena2+ " : Son iguales ");
        }
        else{
            System.out.println(cadena1+" y " +cadena2+ " : Son distintos ");
        }   
    }
   
    public static void cambiarLetra(){
        System.out.println("\n 9.");
        String cadena="jeve jeve jeve";
        char[]separado=cadena.toCharArray();
        for(int i=0;i<cadena.length();i++)
        if (separado[i]=='e'){
            separado[i]='a';
        }
        System.out.println(separado);
    }
    
    public static void ascii() throws UnsupportedEncodingException{
        System.out.println("\n 10.");
            String letras="ABCD";
            byte[] ascii=letras.getBytes("US-ASCII");
            System.out.print(Arrays.toString(ascii));
            
        }
    
}
