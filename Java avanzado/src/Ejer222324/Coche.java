package Ejer222324;

abstract class Coche {
    String nombreCoche;
    String marca;
    String modelo;
    String motor;
    int puertas;

    abstract String DarMarcaModelo(String nombreCoche, String marca, String modelo);
    abstract String TipoMotor(String motor);
    abstract int aumentarPuertas(int puertas);
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
