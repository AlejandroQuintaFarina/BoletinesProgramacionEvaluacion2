/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.escrituralibros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex0
 */
public class Escritura {
    
    FileWriter fich;
    PrintWriter escritura;
    
    public void engadirLibros(String nomeLibros){
        
        try {
            fich = new FileWriter(nomeLibros);
            escritura = new PrintWriter (fich);
            escritura.println(" El Codigo da Vinci");
        }    
        catch (IOException ex) {
            System.out.println(" FICHERO CREADO CON EXITO " + ex.getMessage());
        }
        finally{
            escritura.close();
        }
        
    }
    
    public void borrarLibros(String nomeLibros){
       
        try{
        
        File inFile = new File("libros.txt");
        
        if(!inFile.isFile()){
            System.out.println("no hay file");
            return;
            
        }
        }
        }
        
    }
    
}
