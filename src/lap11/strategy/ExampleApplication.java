package lap11.strategy;

import java.util.Random;

public class ExampleApplication {
	public static void main(String[] args) {
		Random random = new Random();

		Context context = new Context();

		int firstNumber = 12;
		int lastNumber = 22;

		int strategy = random.nextInt(1, 4);



		if(strategy == 1) {
			context.setStrategy(new ConcreteStrategyAdd());
		} else if (strategy == 2) {
			context.setStrategy(new ConcreteStrategySubtract());
		} else if (strategy == 3) {
			context.setStrategy(new ConcreteStrategyMultiply());
		}

		int result = context.executeStrategy(firstNumber, lastNumber);

		System.out.println(result);
	}
}
