package EjercicioTemas789;
import java.util.*;
import java.lang.*;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Convertir ArrayList en LinkedList

        ArrayList<String> marcas = new ArrayList<String>();
        marcas.add("Lenovo");
        marcas.add("HP");
        marcas.add("Asus");
        marcas.add("Acer");

        //Recorremos con for para sacar datos del ArrayList
        for (int i = 0; i < marcas.size(); i++) {
            System.out.println("Valor en la posicion " + i + " de la lista: " + marcas.get(i));
        }
        //Imprimimos ArrayList
        System.out.println("ArrayList: "+marcas);

        //Copiamos ArrayList a LikedList
        LinkedList<String> listaEnl = new LinkedList<>(marcas);

        //Imprimimos ArrayList
        System.out.println("LinkedList: "+listaEnl);

        //Recorremos con for para sacar datos del LinkedList
        for(String elemento : listaEnl) {
            System.out.println("Elemento actual en la lista enlazada: " + elemento);
        }
    }
}
