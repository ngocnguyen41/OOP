package lap12.observer.exercises;

public class OctalObserver extends Observer {
	private String octal;

	public OctalObserver(Subject subject) {
		super(subject);
		this.subject.attach(this);
	}

	@Override
	public void update() {
		this.octal = convertOctal(subject.getState());
	}

	public String convertOctal(int value) {
		return Integer.toOctalString(subject.getState());
	}

	public String toString() {
		return "Octal string: " + octal;
	}
}
