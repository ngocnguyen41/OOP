package lap07.ex1_6;

public class TestAnimal {
	public static void main(String[] args) {
		Cat cat1 = new Cat("Meo");
		cat1.greets();

		Dog dog1 = new Dog("Toto");
		Dog dog2 = new Dog("Titi");

		dog1.greets();
		dog1.greets(dog2);

		BigDog bigDog1 = new BigDog("Tata");
		BigDog bigDog2 = new BigDog("Tete");

		bigDog1.greets();
		bigDog1.greets(dog1);
		bigDog1.greets(bigDog2);
	}
}
