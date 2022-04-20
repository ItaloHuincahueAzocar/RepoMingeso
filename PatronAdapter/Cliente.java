package PatronAdapter;

import java.util.Scanner;

public class Cliente {
    
    private static Scanner S = new Scanner(System.in);
    private static InterfaceMotor motor;
    
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        int opcion;
        do{
            opcion = preguntarOpcion();
            switch(opcion) {
                case 1:
                    motor = new MotorComun();
                    usarMotor();
                    break;
                case 2:
                    motor = new MotorEconomico();
                    usarMotor();
                    break;
                case 3:
                    motor = new MotorElectricoAdapter();
                    usarMotor();
                    break;
                case 4:
                    System.out.println("¡Cerrando programa!");
                    break;
                default:
                    System.out.println("La opción ingresada NO es válida.");
            }
            System.out.print("\n");
        }while(opcion!=4);
    }

    private static int preguntarOpcion() {
        System.out.print(
                "MENU DE OPCIONES\n"
               +"---- -- --------\n"
               +"1. Encender motor común.\n"
               +"2. Encender motor económico.\n"
               +"3. Encender motor eléctrico.\n"
               +"4. Salir.\n"
               +"Seleccione opción: "
        );
        return Integer.parseInt( S.nextLine() );
    }

    private static void usarMotor() {
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}
