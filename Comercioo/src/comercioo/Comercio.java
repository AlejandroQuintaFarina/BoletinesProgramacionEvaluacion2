/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercioo;

import com.programacion.ArrayListComercio.Almacen.Almacen;
import com.programacion.ExemploArrayObxectos.LerDatos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 *
 * @author alex0
 */
public class Comercio {
    
    
    public static int consultarCodigo(ArrayList<Producto> lista, int codigo) {
        int atopado = -1; //non atopado
        for (int i = 0; i < lista.size(); i++) {
            if (codigo == lista.get(i).getCod()) {
                atopado = i;
            }
        }
        return atopado;
    }

    public static ArrayList<Producto> engadir(ArrayList<Producto> lista) {
        int codigo = LerDatos.lerInt("Teclea código");
        int atopado = consultarCodigo(lista, codigo);
        if (atopado == -1 || lista.isEmpty()) {
            String nome = LerDatos.lerString("Teclea nome");
            String tipo = LerDatos.lerString("Teclea tipo");
            float precio = LerDatos.lerFloat("Teclea precio");
            int stock = LerDatos.lerInt("Teclea stock");
            Producto producto = new Producto(codigo, nome, tipo, precio, stock);
        } else {
            lista.get(atopado).setStock(lista.get(atopado).getStock() +
                    LerDatos.lerInt("Introduce la cantidad de stock que deseas aumentar\n(Si no deseas aumentar el stock introduce 0)"));
            System.out.println("Actualizado Stock");
        }
        return lista;
    }

   /* public static ArrayList<Producto> repetidos(ArrayList<Producto> lista) {
        Set<Producto> hashSet = new HashSet<Producto>(lista);
        hashSet.addAll(lista);
        lista.clear();
        lista.addAll(hashSet);
        return lista;
    }*/

    public static void amosarIterator(ArrayList<Producto> lista) {
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.println("       *********");
            System.out.println("***" + it.next());
        }
    }

    public static ArrayList<Producto> eliminar(ArrayList<Producto> lista) {
        int eliminar = LerDatos.lerInt("Introduce el código del producto a eliminar");
       /* for (int j = 0; j < lista.size(); j++) {
            Producto obj = lista.get(j);
            if (obj.getCod()==(eliminar)) {
                lista.remove(j);
                break;
            }
        }*/
        Iterator<Producto> itr = lista.iterator();
        while (itr.hasNext()) {
            Producto number = itr.next();
            if (number.getCod() == eliminar) {
                itr.remove();
            }
        }
        return lista;
    }

    public static ArrayList<Producto> vender(ArrayList<Producto> lista, int cantidad, int codigo) {
        Iterator<Producto> it = lista.iterator();
        while (it.hasNext()) {
            Producto producto = it.next();
            if (producto.getCod() == codigo) {
                if (producto.getStock() < cantidad) {
                    System.out.println("No queda suficiente stock. solo quedan: " + producto.getStock() + " unidades.");
                } else if (producto.getStock() == cantidad) {
                    Almacen.stockEliminar(lista);
                }else{
                    producto.setStock(producto.getStock() +
                            LerDatos.lerInt("Introduce la cantidad de productos que deseas comprar"));
                }
            }
        }
        return lista;
    }

    public static void buscar(ArrayList<Producto> lista) {
        int buscar = LerDatos.lerInt("Introduce codigo del producto a buscar");
        Iterator<Producto> it = lista.iterator();
        while (it.hasNext()) {
            Producto find = it.next();
            if (find.getCod() == buscar) {
                System.out.println(find);
            } else {
                System.out.println("El producto no esta en la lista");
            }
        }
    }

    public static void stock(ArrayList<Producto> lista) {
        int buscar = LerDatos.lerInt("Introduce codigo del producto a buscar");
        Iterator<Producto> it = lista.iterator();
        while (it.hasNext()) {
            Producto find = it.next();
            if (find.getCod() == buscar) {
                System.out.println("Stock" + find.getStock());
            }
        }
    }

    public static ArrayList<Producto> rebaja(ArrayList<Producto> lista) {
        String buscar = LerDatos.lerString("Introduce tipo del producto a buscar");
        int porcentaje = LerDatos.lerInt("Introduce el descuento aplicable");
        Iterator<Producto> it = lista.iterator();
        while (it.hasNext()) {
            Producto sales = it.next();
            if (sales.getTipo().equals(buscar)) {
                System.out.println("Precio inicial: " + sales.getPrecio());
                float descuento = sales.getPrecio() - sales.getPrecio() * porcentaje / 100;
                sales.setPrecio(descuento);
                System.out.println("Precio rebaja: " + sales.getPrecio());
            }
        }
        return lista;
    }
    
}
