package Ejercicio_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPelicula(ArrayList<PeliculaEntidad> peliculas) {
        String continuar = "";

        do {
            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = leer.next();
            System.out.println("Ingrese el nombre del director de la pelicula");
            String director = leer.next();
            System.out.println("Ingrese la duracion de la pelicula (en horas)");
            Double duracion = leer.nextDouble();
            peliculas.add(new PeliculaEntidad(titulo, director, duracion));
            System.out.println("Quiere ingresar otra pelicula? (S/N)");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public void mostrarPelicula(ArrayList<PeliculaEntidad> peliculas) {
        System.out.println("Todas las peliculas: ");
        for (PeliculaEntidad aux : peliculas) {
            System.out.println(aux);
        }
    }

    public void mostrarMasDeUnaHora(ArrayList<PeliculaEntidad> peliculas) {
        boolean op = false;
        for (PeliculaEntidad aux : peliculas) {
            if (aux.getDuracion() > 1) {
                System.out.println("Peliculas mayor de una hora: ");
                System.out.println(aux);
            } else {
                op = true;
            }
        }
        if (op) {
           System.out.println("No hay peliculas que sean mayor a una hora o una de las peliculas no es mayor a una hora");
        }
    }

    public void mayorMenor(ArrayList<PeliculaEntidad> peliculas) {
        Comparator<PeliculaEntidad> comparador = new Comparator<PeliculaEntidad>() {
            @Override
            public int compare(PeliculaEntidad o1, PeliculaEntidad o2) {
                if (o1.getDuracion() > o2.getDuracion()) {
                    return -1;
                } else if (o2.getDuracion() > o1.getDuracion()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        peliculas.sort(comparador);
        System.out.println("Ordenadas de mayor a menor: ");
        for (PeliculaEntidad aux : peliculas) {
            System.out.println(aux);
        }
    }

    public void menorMayor(ArrayList<PeliculaEntidad> peliculas) {
        Comparator<PeliculaEntidad> comparador = new Comparator<PeliculaEntidad>() {
            @Override
            public int compare(PeliculaEntidad o1, PeliculaEntidad o2) {
                if (o1.getDuracion() < o2.getDuracion()) {
                    return -1;
                } else if (o2.getDuracion() < o1.getDuracion()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        peliculas.sort(comparador);
        System.out.println("Ordenadas de menor a mayor: ");
        for (PeliculaEntidad aux : peliculas) {
            System.out.println(aux);
        }
    }

    public void ordenarTitulo(ArrayList<PeliculaEntidad> peliculas) {
        Comparator<PeliculaEntidad> comparador = new Comparator<PeliculaEntidad>() {
            @Override
            public int compare(PeliculaEntidad o1, PeliculaEntidad o2) {
                return o1.getTitulo().toLowerCase().compareTo(o2.getTitulo().toLowerCase());
            }
        } ;
        System.out.println("Ordenado por titulo: ");
        peliculas.sort(comparador);
        for (PeliculaEntidad aux : peliculas) {
            System.out.println(aux);
        }
    }
    
    public void ordenarDirector(ArrayList<PeliculaEntidad> peliculas) {
        Comparator<PeliculaEntidad> comparador = new Comparator<PeliculaEntidad>() {
            @Override
            public int compare(PeliculaEntidad o1, PeliculaEntidad o2) {
                return o1.getTitulo().toLowerCase().compareTo(o2.getTitulo().toLowerCase());
            }
        } ;
        System.out.println("Ordenado por director: ");
        peliculas.sort(comparador);
        for (PeliculaEntidad aux : peliculas) {
            System.out.println(aux);
        }
    }
}
