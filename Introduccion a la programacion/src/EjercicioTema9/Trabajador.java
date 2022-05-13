package EjercicioTema9;

public class Trabajador extends Persona{
    private int salario = 1050;

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Trabajador(int edad, String nombre, int tel, int salario) {
        super(edad, nombre, tel);
        this.salario = salario;
    }

    public static void main(String[] args) {
        Trabajador t1 = new Trabajador(40,"Alberto",123456789,1500);
        System.out.println(t1);
        t1.setSalario(1900);
        System.out.println(t1.getSalario());
        t1.setEdad(50);
        System.out.println(t1.getEdad());

    }
}
