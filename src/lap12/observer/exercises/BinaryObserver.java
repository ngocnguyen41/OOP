package lap12.observer.exercises;

public class BinaryObserver extends Observer {
	private String binary;

	public BinaryObserver(Subject subject) {
		super(subject);
		this.subject.attach(this);
	}

	@Override
	public void update() {
		this.binary = convertBinary(subject.getState());
	}

	public String convertBinary(int value) {
		return Integer.toBinaryString(subject.getState());
	}

	public String toString() {
		return "Binari string: " + binary;
	}
}
