package PatronAbstractFactory;

public class SoftwareFactory implements FactoryServicioFactory {

    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioSoftware();
    }

}
