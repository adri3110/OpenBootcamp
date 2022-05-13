package Ejer222324;

public class Main {
    public static void main(String[] args) {
        Coche coche = new CocheHibrido();
        coche.nombreCoche = "Coche1";
        coche.marca = "Mazda";
        coche.modelo = "R5";
        coche.motor = "120CV";
        coche.puertas = 5;
        System.out.println(coche);

    }
}
