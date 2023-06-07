package Ejercicio_4;

import java.util.Scanner;

public class PeliculaEntidad {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String titulo;
    private String director;
    private Double duracion;

    public PeliculaEntidad() {
    }

    public PeliculaEntidad(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "PeliculaEntidad{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

 
    
    
}
