//Crear una clase llamada CantanteFamosoServicio. Esta clase guardará cantantes famosos y
//tendrá como atributos el nombre y discoConMasVentas.
//Se debe, además, en el main, crear una lista de tipo CantanteFamosoServicio y agregar 5
//objetos de tipo CantanteFamosoServicio a la lista. Luego, se debe mostrar los nombres de
//cada cantante y su disco con más ventas por pantalla.
//Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
//agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
//usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
//cambios.
package Ejercicio_Extra2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_Extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CantanteFamosoServicio p1 = new CantanteFamosoServicio();
        ArrayList<CantanteFamosoEntidad> cantantes = new ArrayList<>();
        
        String opc = "";
        do {
            System.out.println("1 - Ver Cantantes");
            System.out.println("2 - Agregar Cantantes");
            System.out.println("3 - Eliminar Cantantes");
            System.out.println("4 - Salir");
            opc = leer.next();
            switch (opc) {
                case "1":
                    p1.cantantesCreados(cantantes);
                    break;
                case "2":
                    p1.crearCantante(cantantes);
                    break;
                case "3":
                    p1.eliminarCantante(cantantes);
                    break;
                case "4":
                    System.out.println("Ha salido del menu...");
                    break;
                default:
                    System.out.println("No existe esa opcion, ingrese otra");
            }
        } while (!opc.equalsIgnoreCase("4"));
        
    }
}
