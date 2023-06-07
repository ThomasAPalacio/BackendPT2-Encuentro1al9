package Ejercicio_3;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearAlumno(ArrayList<AlumnoEntidad> alumno) {
        String continuar = "";
        do {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();
            ArrayList<Integer> notas = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota  N" + (i + 1));
                notas.add(leer.nextInt());
//                while ( < 0 ||  > 10) {
//                    System.out.println("Esa nota no es valida... ingrese otra");
//                    notas.add(leer.nextInt());
//                }
            }
            AlumnoEntidad a1 = new AlumnoEntidad(nombre, notas);
            alumno.add(a1);
            System.out.println("¿Quiere ingresar otro nombre? (S/N)");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public void mostrarAlumnos(ArrayList<AlumnoEntidad> alumno) {
        for (AlumnoEntidad aux : alumno) {
            System.out.println(aux);
        }
    }

    public void notaFinal(ArrayList<AlumnoEntidad> alumno) {
        System.out.println("Ingrese el nombre del Alumno para ver su promedio: ");
        String nombre = leer.next();
        int prom = 0;
        boolean encontrado = false;
        for (AlumnoEntidad aux : alumno) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                for (int notas : aux.getNotas()) {
                    prom += notas;
                }
                System.out.println("El promedio del alumno " + aux.getNombre() + " es: " + (prom / 3));
            }
        }
        if (!encontrado) {
            System.out.println("El alumno no existe");
        }

    }

    public void eliminarAlumno(ArrayList<AlumnoEntidad> alumno) {
        System.out.println("Ingrese el nombre del alumno que quiera eliminar");
        String nombre = leer.next();
        boolean encontrado = false;
        for (int i = 0; i < alumno.size(); i++) {
            if (alumno.get(i).getNombre().equalsIgnoreCase(nombre)) {
                alumno.remove(i);
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Alumno eliminado");
            System.out.println();
            System.out.println("LISTA ACTUALIZADA...");
            for (AlumnoEntidad aux : alumno) {
                System.out.println(aux);
            }
        } else {
            System.out.println("No se encontro ese nombre...");
        }
    }

    public void modificarAlumno(ArrayList<AlumnoEntidad> alumno) {
        System.out.println("Ingrese el nombre del alumno a modificar");
        String nombre = leer.next();
        boolean encontrado = false;
        for (int i = 0; i < alumno.size(); i++) {
            if (alumno.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Nuevo nombre es:");
                String nuevoNombre = leer.next();
                alumno.get(i).setNombre(nuevoNombre);
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Se ha modificado con el nuevo nombre!");
            System.out.println();
            System.out.println("LISTA ACTUALIZADA...");
            for (AlumnoEntidad aux : alumno) {
                System.out.println(aux);
            }
        } else {
            System.out.println("El nombre ingresado no se encuentra...");
        }
    }
}
