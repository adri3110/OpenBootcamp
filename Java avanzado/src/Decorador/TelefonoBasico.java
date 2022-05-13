package Decorador;

public class TelefonoBasico implements Telefono{
    @Override
    public void crear() {
        System.out.println("Soy un telefono basico. Tengo las siguientes caracteristas: ");
        tengoGSM();
        tengoSMS();
    }
    private void tengoGSM(){
        System.out.println("    ->Tengo GSM");
    }
    private void tengoSMS(){
        System.out.println("    ->Tengo SMS");
    }
}
