package Prototype;

public class Main {
    public static void main(String[] args) {
        try {
            Coche coche = new Coche();

            coche.marca = "BMW";
            coche.modelo = "X3";
            coche.puertas = 5;

            System.out.println(coche.marca + " " + coche.modelo + " " + coche.puertas);

            Coche clonado = coche.clonar();
            clonado.marca = ("Mercedes");
            System.out.println(clonado.marca + " " + clonado.modelo + " " + clonado.puertas);
        }catch (CloneNotSupportedException e){
            System.out.println("No se puede clonar: "+e.getMessage());
        }
    }
}
