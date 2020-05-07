package Obv;

import java.awt.List;
import java.util.ArrayList;

public abstract class Subjects {
	protected List<Observer0> observers;

	public Subjects() {
		observers = new ArrayList<Observer0>();
	}

	public void Add(Observer0 observer) {
		observers.add(observer);
	}

	public void Remove(Observer0 observer) {
		observers.remove(observer);
	}

	public abstract void notifyObserver();

}
