package EjercicioTemas789;

public class Ejercicio2 {
    public static void main(String[] args) {

        int[][] numeros= {{2,4},{1,0},{3,6},{8,5}};

        for (int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length; j++){
                System.out.println("Posicion["+i+"] ["+j+"] : "+numeros[i][j]);
            }
            System.out.println(""); //Salto de linea para separar el array bidimensional
        }
    }
}
