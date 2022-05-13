package EjerciciosTema91011.SegundaParte;

public class SmartDevice {

    public String marca;
    public String modelo;
    public int memoria;

    public SmartDevice(){}

    public SmartDevice(String marca, String modelo, int memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
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
