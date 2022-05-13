package EjercicioTema4;

public class SmartDeviceMain {
    public static void main(String[] args) {
        //Primer Objeto creado SmartPhone
        SmartPhone samsung = new SmartPhone("Samsung","S22",5);

        System.out.println(samsung);

        //Segundo Objeto creado SmartWatch
        SmartWatch reloj = new SmartWatch("Xiaomi","Watch",10,false);

        System.out.println(reloj);


        samsung.aumentarMemoria(10);
        System.out.println(samsung);
    }
}
