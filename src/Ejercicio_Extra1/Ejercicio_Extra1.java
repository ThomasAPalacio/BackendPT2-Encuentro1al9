//Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
//y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
//introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
//programa mostrará por pantalla el número de valores que se han leído, su suma y su
//media (promedio).
package Ejercicio_Extra1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_Extra1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> nums = new ArrayList<>();
        EnterosServicios servicio = new EnterosServicios();
        
        servicio.introducirNumeros(nums);
        servicio.mostrarNumeros(nums);
        servicio.sumaYpromedio(nums);
    }
}
