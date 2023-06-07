package Ejercicio_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisesServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPaises(HashSet<String> paises) {
        String continuar = "";

        do {
            System.out.println("Ingrese un pais: ");
            String pais = leer.next();
            paises.add(pais);

            System.out.println("Desea agregar otro pais? (S/N)");
            continuar = leer.next();

        } while (continuar.equalsIgnoreCase("s"));
    }

    public void mostrarPaises(HashSet<String> paises) {
        System.out.println("Todos los paises: ");
        for (String aux : paises) {
            System.out.println(aux);
        }
    }

    public void ordenarPaises(HashSet<String> paises) {
        System.out.println("Los paises ordenados alfabeticamente: ");
        ArrayList<String> paisOrdenado = new ArrayList<>(paises);
        Collections.sort(paisOrdenado);
        //paisordenado.sort(Comparator.naturalOrder());
        for (String aux : paisOrdenado) {
            System.out.println(aux);
        }
    }
    
    public void eliminarPais(HashSet<String> paises) {
        System.out.println("Ingrese un pais para eliminarlo");
        String paisEliminar = leer.next();
        boolean verificar = false;
        Iterator<String> it = paises.iterator();
        while(it.hasNext()) {
            String aux = it.next();
            
            if (aux.equalsIgnoreCase(paisEliminar)) {
                it.remove();
                verificar = true;
            }
        }
        if (verificar) {
            System.out.println("Pais eliminado");
            System.out.println("Lista actualizada: ");
            for (String aux : paises) {
                System.out.println(aux);
            }
        } else {
            System.out.println("No se ha encontrado ese pais");
        }
    }
    
}
