package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoEntidad {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private ArrayList<Integer> notas = new ArrayList<>(3);

    public AlumnoEntidad() {
    }

    public AlumnoEntidad(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno: " +
                "nombre='" + nombre + '\'' +
                ", notas=" + notas;
    }
}
