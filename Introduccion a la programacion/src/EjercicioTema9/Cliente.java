package EjercicioTema9;

public class Cliente extends Persona{
    private static int credito = 500;

    public Cliente(int edad, String nombre, int tel, int credito) {
        super(edad, nombre, tel);
        this.credito = credito;
    }

    public static int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }


    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(21,"Kevin",666554332,1500);
        System.out.println("El cliente tiene "+cliente1.credito+"€ de credito.");
        cliente1.setCredito(1000);
        System.out.println("El cliente ahora tiene "+cliente1.credito+"€ de credito.");
        System.out.println(cliente1);
    }
}
