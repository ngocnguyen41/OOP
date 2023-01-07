package lap12.factorymethod.exercises;

public class CallingClass {
	public static void main(String[] args) {
		FruitFactory fruitFactory = new FruitFactory();
		Fruit fruit;

		fruit = fruitFactory.produceJuice("Apple");
		fruit.produceJuice();

		fruit = fruitFactory.produceJuice("Banana");
		fruit.produceJuice();

		fruit = fruitFactory.produceJuice("Orange");
		fruit.produceJuice();

	}
}
