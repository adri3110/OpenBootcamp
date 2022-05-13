package Ejercicios121314;

public class Ejercicios121314 {
    public static void main(String[] args) {
        int numero1 = 4;
        int numero2 = 8;
        sumarNumeros(numero1, numero2);
        multiplicarNumeros(numero1, numero2);
    }
    public static void sumarNumeros(int numero1, int numero2){
        int resultado = numero1 + numero2;
        System.out.println("SUMA: "+resultado);
    }
    public static void multiplicarNumeros(int numero1, int numero2){
        int resultado = numero1 * numero2;
        System.out.println("MULTIPLICACION: "+resultado);
    }
}
