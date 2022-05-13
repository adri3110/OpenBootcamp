package EjerciciosTema91011.SegundaParte;

public class Main {
    public static void main(String[] args) {
        //Primer Objeto creado SmartPhone
        SmartDevice telefono = new SmartDeviceBuilder("Samsung")
                .setModelo("Galaxy S22")
                        .setMemoria(128)
                                .build();

        System.out.println(telefono);

        telefono.aumentarMemoria(128);
        System.out.println(telefono);
    }
}
