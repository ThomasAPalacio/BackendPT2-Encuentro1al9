//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
package Ejercicio_6;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int menu = 0;
        TiendaServicios servicios = new TiendaServicios();
        HashMap<String, Double> producto = new HashMap<>();
        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    servicios.crearProducto(producto);
                    break;
                case 2:
                    servicios.modificarProducto(producto);
                    break;
                case 3:
                    servicios.eliminarProducto(producto);
                    break;
                case 4:
                    servicios.mostrarProductos(producto);
                    break;
                case 5:
                    System.out.println("Has salido del menu");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (menu != 5);
    }
}
