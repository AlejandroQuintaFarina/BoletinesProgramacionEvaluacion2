/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;
import com.programacion.ExemploArrayObxectos.LerDatos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author alex0
 */
public class Libreria {
 
     public static ArrayList<Libro> agregar(ArrayList<Libro> lista) {
        String isbn = LerDatos.lerString("Introducir ISBN");
        boolean repetido = true;
        Iterator<Libro> it = lista.iterator();
        while (it.hasNext()) {
            Libro l = it.next();
            if (l.getIsbn().equals(isbn)) {
                System.out.println("El ISBN introducido ya existe");
                l.setNumUnidad(l.getNumUnidad() +
                        LerDatos.lerInt("Introduce la cantidad de stock que deseas aumentar\n(Si no deseas aumentar el stock introduce 0)"));
                System.out.println("Actualizado Stock");
                repetido = false;
                break;
            }
        }
        if (repetido) {
            String titulo = LerDatos.lerString("Introducir titulo");
            String autor = LerDatos.lerString("Introducir autor");
            float prezo = LerDatos.lerFloat("Introducir prezo");
            int numUnidad = LerDatos.lerInt("Introducir stock disponible");
            lista.add(new Libro(titulo, autor, isbn, prezo, numUnidad));
        }
        return lista;
    }


    public static void visualizar(ArrayList<Libro> lista) {
        Iterator<Libro> itr = lista.iterator();
        while (itr.hasNext()) {
            System.out.println("*****");
            System.out.println(itr.next());
        }
        Collections.sort(lista, new Comparator<Libro>() {
            @Override
            public int compare(Libro l1, Libro l2) {
                return new String(l1.getTitulo()).compareTo(new String(l2.getTitulo()));
            }
        });
    }

    public static ArrayList<Libro> vender(ArrayList<Libro> lista, int cantidad, String isbn) {
        Iterator<Libro> it = lista.iterator();
        while (it.hasNext()) {
            Libro l = it.next();
            if (isbn.equals(l.getIsbn())) {
                if (l.getNumUnidad() < cantidad) {
                    System.out.println("No quedan tantas unidades");
                    break;
                } else {
                    l.setNumUnidad(l.getNumUnidad() - cantidad);
                    break;
                }
            }
        }
        return lista;
    }
    public static int consultarCodigo (ArrayList<Libro>lista, String codigo){
        int atopado =-1; //non atopado
        for(int i=0; i<lista.size();i++){
            if(codigo==lista.get(i).getIsbn()){
                lista.get(i).setNumUnidad(lista.get(i).getNumUnidad()+1);
                atopado=i;
            }
        }
        return atopado;
    }
    
    
}
