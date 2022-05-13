import java.util.*;

public class Main {

    public static void main(String[] args) {
        sumNum(2,5,3);

        Coche miCoche = new Coche();
        miCoche.incPuertas();
        miCoche.incPuertas();
        miCoche.incPuertas();
        miCoche.incPuertas();

        System.out.println("El coche tiene "+miCoche.puertas+" puertas");
    }
    public static int sumNum(int num1, int num2, int num3){
        int res = num1 + num2 + num3;
        System.out.println(res);
        return res;
    }
    static class Coche{
            public int puertas = 0;
            public void incPuertas(){
               this.puertas++;
            }
    }
}
