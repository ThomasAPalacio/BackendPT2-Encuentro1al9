package Ejercicio_Extra4;

import java.util.HashMap;
import java.util.Scanner;

public class CiudadesServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final HashMap<Integer, String> ciudades = new HashMap<>();

    public void agregarCiudad() {
        System.out.println("Ingrese el nombre de la ciudad");
        String ciudad = leer.next();
        System.out.println("Ingrese el codigo postal");
        int codigo = leer.nextInt();
        ciudades.put(codigo, ciudad);
    }

    public void mostrarCiudades() {
        ciudades.forEach((cp, c) -> System.out.println("Codigo Postal: " + cp + " Ciudad: " + c));
    }

    public void buscarCiudad() {
        System.out.println("Ingrese el codigo postal");
        int codigo = leer.nextInt();
        System.out.println(ciudades.get(codigo));
    }

    public void eliminarCiudad() {
        System.out.println("Ingrese el codigo postal");
        int codigo = leer.nextInt();
        ciudades.remove(codigo);
        System.out.println("La ciudad que ingreso fue eliminada");
    }

    public void menu() {
        int opcion = 0;

        do {
            System.out.println("Bienvenido al menu");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Agregar Ciudad");
            System.out.println("2. Mostrar Ciudades");
            System.out.println("3. Buscar Ciudad");
            System.out.println("4. Eliminar Ciudad");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    agregarCiudad();
                    break;
                case 2:
                    mostrarCiudades();
                    break;
                case 3:
                    buscarCiudad();
                    break;
                case 4:
                    eliminarCiudad();
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:

            }
        } while (opcion != 5);
    }

}
