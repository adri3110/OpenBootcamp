package EjercicioTema2;

public class EjercicioTema2 {
    public static void main(String[] args) {
        double pvp = 5;
        precioIva(pvp);
    }

    public static void precioIva(double pvp){
        pvp = pvp * 1.21;
        System.out.println("El precio con IVA es: "+pvp);
    }
}
