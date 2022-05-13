package Ejercicios15161718;

public class Ejer1 {
    public static void main (String args[]) {
        int numero1 = 15, numero2 = 0, result = 0;
        try{
            result = numero1/numero2;
            System.out.println("Resultado: " +result);
        }
        catch (ArithmeticException e) {
            System.out.println ("No puedes dividir entre 0. " + e);
        }
    }
}
