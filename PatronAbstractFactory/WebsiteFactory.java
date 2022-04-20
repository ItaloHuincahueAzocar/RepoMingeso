package PatronAbstractFactory;

public class WebsiteFactory implements FactoryServicioFactory {

    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioWebsites();
    }

}
