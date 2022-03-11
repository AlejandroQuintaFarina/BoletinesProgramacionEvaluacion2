/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercioo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alex0
 */
public class Comercioo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
            ArrayList<Producto> lista = new ArrayList<Producto>();
        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción: \n1.Añadir producto \n2.Amosar producto \n3.Eliminar producto \n4.Buscar producto \n5.Comprobar Stock \n6.Rebaja \n7.Salir"));
            switch (menu) {
                case 1:
                    lista = Comercio.engadir(lista);
                    //lista = Comercio.repetidos(lista);
                    break;
                case 2:
                    Comercio.amosarIterator(lista);
                    break;
                case 3:
                    lista = Comercio.eliminar(lista);
                    break;
                case 4:
                    Comercio.buscar(lista);
                    break;
                case 5:
                    Comercio.stock(lista);
                    break;
                case 6:
                    Comercio.rebaja(lista);
                case 7:
            }
        } while (menu < 7);
    }
        
    }
    

