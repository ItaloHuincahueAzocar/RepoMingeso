package PatronAdapter;

public class MotorElectricoAdapter extends InterfaceMotor{
    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter(){
        super();
        System.out.println("Creando motor eléctrico adapter...");
        this.motorElectrico = new MotorElectrico();        
    }
    @Override
    public void encender() {
        System.out.println("Encendiendo motor eléctrico adapter.");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor eléctrico adapter.");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor eléctrico adapter.");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}


