package PatronCommand.Cajero;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

	//-Command
	private List<InterfaceCommand> operaciones = new ArrayList<>();

	//+SetCommand (Command)
	public void recibirOperacion(InterfaceCommand operacion) {
		this.operaciones.add(operacion);
	}

	//+ExecuteCommand()
	public void realizarOperaciones() {
		this.operaciones.forEach(x -> x.execute());
		this.operaciones.clear();
	}
}