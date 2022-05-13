package Ejer252627;

public class Coche {
    String nombreCoche;
    String marca;
    String modelo;
    String motor;
    int puertas;


    public String DarMarcaModelo(String nombreCoche, String marca, String modelo){
        return marca + " " + modelo;
    }

    public String TipoMotor(String motor){
        motor = "Combustion";
        return motor + " ";
    }

    public int aumentarPuertas(int puertas){
        return puertas-2;
    }

    public String cuantoContamina(String etiquetaContaminacion){
        return "La etiqueta es: "+2+", NO PUEDES ACCEDER CON ESE COCHE!";
    }
    @Override
    public String toString() {
        return "Coche{" +
                "nombreCoche='" + nombreCoche + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor='" + motor + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
