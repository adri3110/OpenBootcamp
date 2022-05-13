package Decorador;

public class TelefonoNextGen extends TelefonoDecorator{
    public TelefonoNextGen(Telefono telefono){
        super(telefono);
    }

    @Override
    public void crear(){
        super.crear();
        System.out.println("Caracteristicas de prox gen: ");

    }
    public void tengo5G(){
        System.out.println("    ->Tengo 5G");
    }
    public void pantallaPlegable(){
        System.out.println("    ->Pantalla plegable");
    }

}
