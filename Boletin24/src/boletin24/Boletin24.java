/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin24;

import com.programacion.Boletin24.Libreria.Libreria;
import com.programacion.Boletin24.Libreria.Libro;
import com.programacion.ExemploArrayObxectos.LerDatos;

import javax.swing.*;
import java.util.ArrayList;
/*
 *
 * @author alex0
 */
public class Boletin24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       ArrayList<Libro> lista = new ArrayList<Libro>();
        int menu;
        do {
             menu = Integer.parseInt(JOptionPane.showInputDialog("1.AgregarLibro \n2.Visualizar \n3.EliminarLibro"));
            switch (menu) {
                case 1:
                    lista = Libreria.agregar(lista);
                    break;
                case 2:
                    Libreria.visualizar(lista);
                    break;
                case 3:
                    Libreria.vender(lista, LerDatos.lerInt("Introduce numero de libros"),LerDatos.lerString("Introduce ISBN del libro que desea comprar"));
                    break;

            }
        } while (menu < 6);



    }
    }
    
}
