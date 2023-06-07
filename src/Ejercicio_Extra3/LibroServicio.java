package Ejercicio_Extra3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LibroServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Set<Libro> libreria = new HashSet<>();

    public void agregarUnLibro() {
        Libro l1 = new Libro();
        System.out.println("Ingrese el titulo del libro: ");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del autor de dicho libro: ");
        l1.setAutor(leer.next());
        System.out.println("Ingrese la cantidad de ejemplares: ");
        l1.setEjemplares(leer.nextInt());
        System.out.println("Ingrese la cantidad de ejemplares prestados: ");
        l1.setEjemplaresPrestados(leer.nextInt());
        libreria.add(l1);
    }

    public void creacionLibros() {
        System.out.println("LISTA DE LIBROS");
        String opcion = "";
        do {
            agregarUnLibro();
            do {
                System.out.println("Quiere agregar otro libro? (S/N)");
                opcion = leer.next();
                if (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")) {
                    System.out.println("Ingreso una opcion no valida, pongala de nuevo...");
                    opcion = leer.next();
                }
            } while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N"));
            
        } while (!opcion.equalsIgnoreCase("N"));
    }

    public boolean prestamo() {
        System.out.println("Ingrese el titulo del libro que quiere a prestamo");
        String libroPrestamo = leer.next();

        Iterator<Libro> it = libreria.iterator();
        boolean verifacionLibroPrestado = false;
        while (it.hasNext()) {
            Libro aux = it.next();
            if (aux.getTitulo().equalsIgnoreCase(libroPrestamo) && aux.getEjemplares() > 0) {
                verifacionLibroPrestado = true;
                int ejemPres = aux.getEjemplaresPrestados() + 1;
                int ejem = aux.getEjemplares() - 1;
                aux.setEjemplaresPrestados(ejemPres);
                aux.setEjemplares(ejem);
                return verifacionLibroPrestado;
            } else if (aux.getTitulo().equalsIgnoreCase(libroPrestamo) && aux.getEjemplares() == 0) {
                System.out.println("No hay mas ejemplares disponibles");
                return verifacionLibroPrestado;
            }
        }
        System.out.println("El libro ingresado no pertenece a esta lista");
        return verifacionLibroPrestado;
    }

    public boolean devolucion() {
        System.out.println("Ingrese el libro que quiere devolver");
        String libroRegresado = leer.next();

        Iterator<Libro> it = libreria.iterator();
        boolean verifacionLibroDevuelto = false;

        while (it.hasNext()) {
            Libro aux = it.next();
            if (aux.getTitulo().equalsIgnoreCase(libroRegresado) && aux.getEjemplares() > 0) {
                verifacionLibroDevuelto = true;
                int ejemPres = aux.getEjemplaresPrestados() - 1;
                int ejem = aux.getEjemplares() + 1;
                aux.setEjemplaresPrestados(ejemPres);
                aux.setEjemplares(ejem);
                return verifacionLibroDevuelto;
            }
        }
        System.out.println("El libro que ingreso no pertenece a la lista");
        return verifacionLibroDevuelto;
    }

    public void mostrarLibros() {
        System.out.println("LISTA DE LIBROS");
        for (Libro aux : libreria) {
            System.out.println(aux);
        }
    }

    public void mostrarMenu() {
        creacionLibros();
        int opc;
        do {
            System.out.println("\nMENU\n"
                    + "1. Agregar libro.\n"
                    + "2. Mostrar libros.\n"
                    + "3. Prestar libro.\n"
                    + "4. Devolver libro.\n"
                    + "5. Salir.\n"
                    + "> ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    agregarUnLibro();
                    break;
                case 2:
                    mostrarLibros();
                    break;
                case 3:
                    prestamo();
                    break;
                case 4:
                    devolucion();
                    break;
                case 5:
                    System.out.println("¡Hasta pronto!");
                    break;
            }
        } while (opc != 5);
    }

}
