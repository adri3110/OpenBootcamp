package EjercicioTemas789;
import java.lang.*;

public class FuncionReverse {
    public static void main(String[] args) {

        String texto = "hola mundo";
        reverse(texto);

    }

    public static String reverse(String texto) {

        StringBuffer textoBuffer = new StringBuffer(texto);
        System.out.println("Texto sin aplicar funcion reverse: "+textoBuffer);

        String prueba = textoBuffer.reverse().toString();
        System.out.println("Texto despues de aplicar funcion reverse: "+prueba);

        return prueba;

    }

}
