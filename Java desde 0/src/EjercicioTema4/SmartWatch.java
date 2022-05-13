package EjercicioTema4;

public class SmartWatch extends SmartDevice{

    boolean formato;
    public SmartWatch(){
    }

    public SmartWatch(String marca, String modelo, int memoria, boolean formato){
        super(marca, modelo, memoria);
        this.formato = formato;
        if(formato){
            System.out.println("Es Redondo");
        }else{
            System.out.println("Es Cuadrado");
        }

    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", memoria=" + memoria +
                ", formato=" + formato +
                '}';
    }
}
