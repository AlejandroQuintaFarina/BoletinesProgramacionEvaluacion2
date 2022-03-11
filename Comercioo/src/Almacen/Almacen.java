/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;

import com.programacion.ArrayListComercio.Comercio.Comercio;
import com.programacion.ArrayListComercio.Comercio.Producto;
import com.programacion.ExemploArrayObxectos.LerDatos;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author alex0
 */
public class Almacen {
    
     public static void stockEliminar(ArrayList<Producto>lista){
        Iterator<Producto> it = lista.iterator();
        while (it.hasNext()) {
            Producto find = it.next();
            if (find.getStock() == 0) {
                System.out.println("Stock= " + find.getStock());
                it.remove();
                System.out.println("Producto eliminado");
            }
        }
    }
    
}
