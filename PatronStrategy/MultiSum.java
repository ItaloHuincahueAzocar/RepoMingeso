package PatronStrategy;

public class MultiSum implements StrategyMulti {

	@Override
	public void execute(int number, int multi) {
		System.out.println("Multiplicacion calculado con sumas");

		int valor=0;

		for (int i = 1; i <= multi; i++) {
			valor += number;
		}
		System.out.println(valor);
	}
}