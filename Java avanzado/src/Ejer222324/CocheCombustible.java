package Ejer222324;


public class CocheCombustible extends Coche {
    public String nombreCoche;
    public String marca;
    public String modelo;
    public String motor;
    public int puertas;

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
}
