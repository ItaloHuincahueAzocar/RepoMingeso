package PatronCommand.Cajero;

public class CmdRetirar implements InterfaceCommand {

	//-Receiver
	private ReceiverCuenta cuenta;
	//-Params
	private double monto;

	//+Command CmdDepositar(Receiver, Params)
	public CmdRetirar(ReceiverCuenta cuenta, double monto) {
		this.cuenta = cuenta;
		this.monto = monto;
	}

	//+Execute
	@Override
	public void execute() {
		this.cuenta.retirar(this.monto);
	}
}