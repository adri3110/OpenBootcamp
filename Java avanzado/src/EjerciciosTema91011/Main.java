package EjerciciosTema91011;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        ((CocheCRUDImpl) cocheCrud).save();
        ((CocheCRUDImpl) cocheCrud).findAll();
        ((CocheCRUDImpl) cocheCrud).delete();
    }
}
