package EjercicioTema4;

public class SmartDevice {
    String marca;
    String modelo;
    int memoria;

    public SmartDevice(){
    }

    public SmartDevice(String marca, String modelo, int memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
    }

    public void aumentarMemoria(int cantidad){
        this.memoria += cantidad;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", memoria=" + memoria +
                '}';
    }
}
