package PatronAbstractFactory;

public class DesignFactory implements FactoryServicioFactory {

    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioDesign();
    }

}
