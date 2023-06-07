package Ejercicio_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearProducto(HashMap<String, Double> producto) {
        String continuar = "";
        do {
            System.out.println("Ingrese el nombre del producto: ");
            String nombreProducto = leer.next();
            System.out.println("Ingrese el precio del producto: ");
            Double precio = leer.nextDouble();
            producto.put(nombreProducto, precio);

            System.out.println("Desea agregar otro producto?");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("s"));

    }

    public void modificarProducto(HashMap<String, Double> producto) {
        String continuar = "";
        do {
            System.out.println("Ingrese el nombre del producto a modificar: ");
            String nombreCambiado = leer.next();

            if (producto.containsKey(nombreCambiado)) {
                System.out.println("Ingrese el nuevo precio: ");
                Double precioCambiado = leer.nextDouble();
                producto.put(nombreCambiado, precioCambiado);
                System.out.println("Producto modificado");
            } else {
                System.out.println("No se encontro el producto...");
            }
            System.out.println("Desea modificar otro producto?");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public void eliminarProducto(HashMap<String, Double> producto) {
        String continuar = "";
        do {
            System.out.println("Ingrese el nombre del producto a eliminar: ");
            String nombreEliminado = leer.next();

            if (producto.containsKey(nombreEliminado)) {
                producto.remove(nombreEliminado);
                System.out.println("El producto se elimino correctamente");
            } else {
                System.out.println("El producto no se encontro en la lista");
            }
            System.out.println("Desea eliminar otro producto?");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public void mostrarProductos(HashMap<String, Double> producto) {
        for (Map.Entry<String, Double> aux : producto.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
