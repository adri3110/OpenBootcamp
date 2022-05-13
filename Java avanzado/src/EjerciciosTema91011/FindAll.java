package EjerciciosTema91011;

public class FindAll implements CocheCRUD{

    private Mediator mediator;

    public FindAll() {
        System.out.println("Buscando");
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    @Override
    public String getName() {
        return "FindAll method";
    }
}
