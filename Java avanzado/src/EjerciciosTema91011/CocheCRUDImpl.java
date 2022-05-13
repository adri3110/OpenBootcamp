package EjerciciosTema91011;

public class CocheCRUDImpl implements CocheCRUD{

    public void save(){
        System.out.println("Guardado  ");
    }
    public void findAll(){
        System.out.println("Buscando  ");

    }
    public void delete(){
        System.out.println("Borrando ");

    }

    @Override
    public void setMediator(Mediator mediator) {

    }

    @Override
    public String getName() {
        return null;
    }
}
