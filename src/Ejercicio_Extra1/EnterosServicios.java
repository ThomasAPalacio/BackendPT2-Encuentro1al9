package Ejercicio_Extra1;

import java.util.ArrayList;
import java.util.Scanner;

public class EnterosServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void introducirNumeros(ArrayList<Integer> nums) {
        int num = 0;
        do {
            System.out.println("Introduzca numeros...");
            System.out.println("El ciclo terminara cuando usted ponga el numero -99");
            num = leer.nextInt();
            if (num != -99) {
                nums.add(num);
            } 
        } while (num != -99);
    }
    public void mostrarNumeros(ArrayList<Integer> nums) {
        System.out.println("Los numeros que introdujo son: ");
        for (Integer aux : nums) {
            System.out.println(aux);
        }
    }
    
    public void sumaYpromedio(ArrayList<Integer> nums) {
        int acum = 0;
        int cont = 0;
        for (Integer aux : nums) {
            acum+=aux;
            cont++;
        }
        System.out.println("La suma de todos los numeros es: " + acum);
        System.out.println("El promedio es: " + (acum/cont));
    }
}
