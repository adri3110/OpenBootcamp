package EjercicioTemas789;

import java.lang.*;

public class Ejercicio7 {
    public static void main(String[] args) {

        //public function DividePorCero
        int numerador = 10;
        int denominador = 0;
        float division= 0;

        try {
            division = numerador / denominador;
        }catch (ArithmeticException ex){
            division = 0;
            System.out.println("Error: "+ex.getMessage());
        }finally{
            System.out.println("Resultado vivision: "+division);
        }
    }
}
