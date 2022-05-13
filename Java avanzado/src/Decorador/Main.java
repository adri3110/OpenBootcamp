package Decorador;

public class Main {
    public static void main(String[] args) {
        TelefonoBasico telefonoBasico = new TelefonoBasico();
        telefonoBasico.crear();
        //System.out.println(telefonoBasico);

        TelefonoInteligente telefonoInteligente = new TelefonoInteligente(new TelefonoBasico());
        telefonoInteligente.crear();
        //System.out.println(telefonoInteligente);

        TelefonoNextGen telNG = new TelefonoNextGen(new TelefonoInteligente(new TelefonoBasico()));
        telNG.crear();

    }
}
