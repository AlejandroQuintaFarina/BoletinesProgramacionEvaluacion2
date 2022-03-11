/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercioo;
import java.util.Objects;
/**
 *
 * @author alex0
 */
public class Producto {
 
    
     int cod;
    String nome;
    String tipo;
    float precio;
    int stock;

    public Producto(int cod, String nome, String tipo, float precio, int stock) {
        this.cod = cod;
        this.nome = nome;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Producto: " +
                " Codigo= " + cod +
                " Nome= " + nome  +
                " Tipo= " + tipo  +
                " Precio= " + precio +
                " Stock= " + stock ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return cod == producto.cod && Float.compare(producto.precio, precio) == 0 && stock == producto.stock && Objects.equals(nome, producto.nome) && Objects.equals(tipo, producto.tipo);
    }
    
}
