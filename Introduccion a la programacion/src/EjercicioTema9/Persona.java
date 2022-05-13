package EjercicioTema9;

public class Persona {
    protected int edad;
    protected String nombre;
    protected int tel;

    //Gets
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getTel() {
        return tel;
    }
    //Sets
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }
    public Persona(int edad, String nombre, int tel){
        this.edad = edad;
        this.nombre = nombre;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", tel=" + tel +
                '}';
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona(20, "Adrian",666555444);
        System.out.println(persona1);
        persona1.setEdad(30);
        System.out.println(persona1);
        persona1.setNombre("Kevin");
        System.out.println(persona1);
        persona1.setTel(777666555);
        System.out.println(persona1.getTel());

    }
}
