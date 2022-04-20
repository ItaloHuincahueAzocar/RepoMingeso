package PatronStrategy;

public class MultiNormal implements StrategyMulti {

	@Override
	public void execute(int number, int multi) {
		System.out.println("Multiplicacion normal");
		int valor=0;
		valor = number*multi;
		System.out.println(valor);
	}
}
