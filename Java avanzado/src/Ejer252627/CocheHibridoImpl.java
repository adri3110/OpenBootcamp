package Ejer252627;

public class CocheHibridoImpl implements CocheHibrido{
    public int cicloCarga;

    @Override
    public String DarMarcaModelo(String nombreCoche, String marca, String modelo){
        return marca + " " + modelo;
    }
    @Override
    public String TipoMotor(String motor){
        motor = "Electrico";
        return motor + " ";
    }
    @Override
    public int aumentarPuertas(int puertas){
        return puertas+2;
    }

    @Override
    public int recargarBateria(int cicloCarga){
        return 0;
    }


}
