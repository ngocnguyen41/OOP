package lap12.observer.exercises;

public class HexaObserver extends Observer {
	private String hexa;

	public HexaObserver(Subject subject) {
		super(subject);
		this.subject.attach(this);
	}

	public void update() {
		this.hexa = convertHexa(subject.getState());
	}

	public String convertHexa(int value) {
		return Integer.toHexString(subject.getState()).toUpperCase();
	}

	public String toString() {
		return "Hexa string: " + hexa;
	}

}
