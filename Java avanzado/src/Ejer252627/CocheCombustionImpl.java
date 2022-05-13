package Ejer252627;

public class CocheCombustionImpl implements CocheCombustion{
    public String etiquetaContaminacion;

    @Override
    public String DarMarcaModelo(String nombreCoche, String marca, String modelo){
        return marca + " " + modelo;
    }
    @Override
    public String TipoMotor(String motor){
        motor = "Combustion";
        return motor + " ";
    }
    @Override
    public int aumentarPuertas(int puertas){
        return puertas-2;
    }

    @Override
    public String cuantoContamina(String etiquetaContaminacion){
        return "La etiqueta es: "+2+", NO PUEDES ACCEDER CON ESE COCHE!";
    }

}
