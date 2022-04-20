package PatronStrategy;

public class ContextMulti {
	
	private StrategyMulti strategy;
	
	public void setMultiMethod(StrategyMulti strategy) {
		this.strategy = strategy;
	}
	
	public StrategyMulti getStrategy() {
		return this.strategy;
	}
	
	public void multiNumber(int number, int multi){
		this.strategy.execute(number, multi);
	}
}

