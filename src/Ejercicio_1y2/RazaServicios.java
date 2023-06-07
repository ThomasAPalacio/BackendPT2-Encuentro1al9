package Ejercicio_1y2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RazaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargaRazas(ArrayList<String> raza) {
        String tipoRaza;
        String continuar = "";
        do {
            System.out.println("Ingrese la raza de perro:");
            tipoRaza = leer.next();
            raza.add(tipoRaza);
            System.out.println("Desea agregar otra raza de perro? s/n");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("s"));
        mostrarRazas(raza);
    }

    public void mostrarRazas(ArrayList<String> raza) {
        System.out.println("Las razas guardadas son:");
        System.out.println(raza);
            
//        for (String tipoRaza : raza) {
//            System.out.print(tipoRaza + " ");
//        }
    }

    public void eliminarRaza(ArrayList<String> razas) {
        System.out.println();
        System.out.println("Que raza desea eliminar de la lista?");
        String raza = leer.next();
        boolean eliminado = false;
        Iterator<String> it = razas.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(raza)) {
                it.remove();
                eliminado = true;
            }
        }
        if (eliminado) {
            System.out.println("Raza eliminada");
        } else {
            System.out.println("Raza no encontrada");
        }
        //razas.sort(null);
        mostrarRazas(razas);
    }

}
