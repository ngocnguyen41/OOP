package lap12.observer.exercises;

public abstract class Observer {
	protected Subject subject;

	public Observer(Subject subject) {
		this.subject = subject;
	}

	public abstract void update();
}
