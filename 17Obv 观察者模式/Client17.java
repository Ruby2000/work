package Obv;

public class Client17 {
	public static void main(String args[]) {
		Subjects subject = new ConcreteSubjectB();
		Observer0 obs1 = new ConcreteObserver1();
		Observer0 obs2 = new ConcreteObserver2();
		subject.Add(obs1);
		subject.Add(obs2);
		subject.notifyObserver();
	}

}
