package Factory;

public class PrecioFactory {
    Precio precio;
    private PrecioFactory(){}

    public PrecioFactory(String pais){
        if(pais.equalsIgnoreCase("España")){
            System.out.println("España, precio en EUR");
            this.precio = new PrecioEUR();
        }else if(pais.equalsIgnoreCase("UK")){
            System.out.println("UK, precio en Libras");
            this.precio = new PrecioGBP();
        }
        else{
            System.out.println("Es otro pais, precio en USD");
            this.precio = new PrecioUSD();
        }
    }
    public double getPrecio(){
        return precio.getPrecio();
    }
}
