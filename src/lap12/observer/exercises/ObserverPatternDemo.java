package lap12.observer.exercises;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject =new Subject();

		BinaryObserver binaryObserver = new BinaryObserver(subject);
		OctalObserver octalObserver = new OctalObserver(subject);
		HexaObserver hexaObserver = new HexaObserver(subject);

		int num1 = 1234567890;
		subject.setState(num1);
		System.out.println("Number 1: " + num1);
		System.out.println(binaryObserver);
		System.out.println(octalObserver);
		System.out.println(hexaObserver + "\n");

		int num2 = 987654321;
		subject.setState(num2);
		System.out.println("Number 2: " + num2);
		System.out.println(binaryObserver);
		System.out.println(octalObserver);
		System.out.println(hexaObserver);
	}
}
