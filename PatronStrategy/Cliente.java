package PatronStrategy;

public class Cliente {

	public static void main(String[] args) {
		
		int number = 100;
		int multi = 8;
		
		System.out.println("----------------------------------------");
		System.out.println("Ejemplo de Patron Strategy");
		System.out.println("----------------------------------------");

		ContextMulti context = new ContextMulti();
		
		MultiNormal metodo = new MultiNormal();
		context.setMultiMethod(metodo);
		context.multiNumber(number, multi);

		MultiSum metodo2 = new MultiSum();
		context.setMultiMethod(metodo2);
		context.multiNumber(number, multi);
				
	}
}