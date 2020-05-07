package Obv;

public class ConcreteSubjectA extends Subjects {
	public ConcreteSubjectA() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println("A目标发生改变了");
		for (Observer0 obs : observers) {
			obs.response();

		}
	}

}
