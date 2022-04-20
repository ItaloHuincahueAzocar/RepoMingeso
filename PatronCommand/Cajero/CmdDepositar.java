package PatronCommand.Cajero;

public class CmdDepositar implements InterfaceCommand {

	//-Receiver
	private ReceiverCuenta cuenta;
	//-Params
	private double monto;

	//+Command CmdDepositar(Receiver, Params)
	public CmdDepositar(ReceiverCuenta cuenta, double monto) {
		this.cuenta = cuenta;
		this.monto = monto;
	}

	//+Execute
	@Override
	public void execute() {
		this.cuenta.depositar(this.monto);
	}
}