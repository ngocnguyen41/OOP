package lap12.observer.exercises;

import java.util.LinkedList;
import java.util.List;

public class Subject {
	private List<Observer> observers;
	private int state;

	public Subject() {
		observers = new LinkedList<>();
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		if (this.state == state) {
			return;
		}
		this.state = state;
		stateChange();
	}

	public void attach(Observer observer) {
		this.observers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public void stateChange() {
		notifyAllObservers();
	}
}
