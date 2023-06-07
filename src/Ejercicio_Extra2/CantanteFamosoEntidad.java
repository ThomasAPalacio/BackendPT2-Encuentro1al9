package Ejercicio_Extra2;

import java.util.ArrayList;
import java.util.Scanner;

public class CantanteFamosoEntidad {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String nombreCantante;
    private String discoConMasVentas;
    private ArrayList<String> cantantes;

    public CantanteFamosoEntidad() {
        cantantes = new ArrayList<>();
    }    

    public CantanteFamosoEntidad(String nombreCantante, String discoConMasVentas) {
        this.nombreCantante = nombreCantante;
        this.discoConMasVentas = discoConMasVentas;
    }

    public String getNombreCantante() {
        return nombreCantante;
    }

    public void setNombreCantante(String nombreCantante) {
        this.nombreCantante = nombreCantante;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    public ArrayList<String> getCantantes() {
        return cantantes;
    }

    public void setCantantes(ArrayList<String> cantantes) {
        this.cantantes = cantantes;
    }
}
