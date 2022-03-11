/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Objects;

/**
 *
 * @author alex0
 */
public class Libro {
    
     private String titulo;
    private String autor;
    private String isbn;
    private float prezo;
    private int numUnidad;

    public Libro() {
    }

    public Libro(String titulo, String autor, String isbn, float prezo, int numUnidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
        this.numUnidad = numUnidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getNumUnidad() {
        return numUnidad;
    }

    public void setNumUnidad(int numUnidad) {
        this.numUnidad = numUnidad;
    }

    @Override
    public String toString() {
        return "Libro{" +
                " titulo='" + titulo + '\'' +
                ", autor= " + autor + '\'' +
                ", isbn= " + isbn + '\'' +
                ", prezo= " + prezo +
                ", Stock= " + numUnidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Float.compare(libro.prezo, prezo) == 0 && numUnidad == libro.numUnidad && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(isbn, libro.isbn);
    }
    
}
