package Ejercicios15161718;

public class Ejer2 {
    public static void main(String[] args) {
        int[] arrayNumeros = {1,2,3,4,5,6};

        try{
            arrayNumeros[9] = 8;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("Superaste el limite del tamaño del array! " + e);
        }
    }
}
