package EjerciciosTema91011.SegundaParte;

public class SmartDeviceBuilder {
    SmartDevice smartDevice;

    private SmartDeviceBuilder(){}
    public SmartDeviceBuilder(String samsung, String s22, int i){}

    public SmartDeviceBuilder(String marca){
        smartDevice = new SmartDevice();
        smartDevice.marca = marca;
    }
    public SmartDeviceBuilder setModelo(String modelo){
        smartDevice.modelo = modelo;
        return this;
    }
    public SmartDeviceBuilder setMemoria(int memoria){
        smartDevice.memoria = memoria;
        return this;
    }

    public SmartDevice build(){
        return this.smartDevice;
    }

}

