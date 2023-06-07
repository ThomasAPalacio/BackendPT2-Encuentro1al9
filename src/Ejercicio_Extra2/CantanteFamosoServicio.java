package Ejercicio_Extra2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CantanteFamosoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearCantante(ArrayList<CantanteFamosoEntidad> cantantes) {

        System.out.println("Nombre del cantante: ");
        String nombre = leer.next();

        System.out.println("Nombre del disco del cantante: ");
        String disco = leer.next();

        cantantes.add(new CantanteFamosoEntidad(nombre, disco));
        mostrarCantantes(cantantes);
    }

    public void cantantesCreados(ArrayList<CantanteFamosoEntidad> cantantes) {
        
        cantantes.add(new CantanteFamosoEntidad("German", "Ella"));
        cantantes.add(new CantanteFamosoEntidad("Billie", "Tu"));
        cantantes.add(new CantanteFamosoEntidad("Sandra", "Fuiste tu"));
        cantantes.add(new CantanteFamosoEntidad("Amanda", "Estoy solo"));
        cantantes.add(new CantanteFamosoEntidad("Adrian", "Ya no te quiero"));
        
        mostrarCantantes(cantantes);
    }

    public void mostrarCantantes(ArrayList<CantanteFamosoEntidad> cantantes) {
        System.out.println("Los cantantes son: ");
        for (CantanteFamosoEntidad aux : cantantes) {
            System.out.println(aux);
        }
    }

    public void eliminarCantante(ArrayList<CantanteFamosoEntidad> cantantes) {
        CantanteFamosoEntidad e1 = new CantanteFamosoEntidad();
        System.out.println("Cual cantante quiere eliminar?");
        String eliminar = leer.next();

        if (eliminar.equalsIgnoreCase(e1.getNombreCantante())) {
            cantantes.remove(e1);
        } else {
            System.out.println("No existe ese cantante, ingrese otro");
            eliminar = leer.next();
        }
        System.out.println("LISTA ACTUALIZADA");
        mostrarCantantes(cantantes);
    }

}
