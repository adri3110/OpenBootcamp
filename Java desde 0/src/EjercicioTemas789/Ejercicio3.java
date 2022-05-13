package EjercicioTemas789;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Crear vector y no imprimir la 2ª y 3ª posicion
        int[] vector= {0,1,2,3,4,5};

        for (int i=0; i<vector.length; i++){
            if(i==1 || i==2){
                //System.out.println("-");
            }else{
                System.out.println(vector[i]);
            }

        }

    }
}
