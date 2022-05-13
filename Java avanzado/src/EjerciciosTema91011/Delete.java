package EjerciciosTema91011;

public class Delete implements CocheCRUD{

    private Mediator mediator;

    public Delete() {
        System.out.println("Borrando");
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    @Override
    public String getName() {
        return "Delete method";
    }
}
