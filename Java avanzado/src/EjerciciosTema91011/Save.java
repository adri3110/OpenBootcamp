package EjerciciosTema91011;

public class Save implements CocheCRUD{
    private Mediator mediator;

    public Save() {
        System.out.println("Guardando");
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    @Override
    public String getName() {
        return "Save method";
    }

}
