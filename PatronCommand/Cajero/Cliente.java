package PatronCommand.Cajero;

public class Cliente {

	public static void main(String[] args) {
		
		ReceiverCuenta cuenta = new ReceiverCuenta(1, 200);

		CmdDepositar opDepositar = new CmdDepositar(cuenta, 100);
		CmdRetirar opRetirar = new CmdRetirar(cuenta, 50);

		Invoker inv = new Invoker();
		inv.recibirOperacion(opDepositar);
		inv.recibirOperacion(opRetirar);
		inv.recibirOperacion(opRetirar);
		inv.recibirOperacion(opRetirar);
		inv.recibirOperacion(opRetirar);
		
		inv.realizarOperaciones();
	}

}
