package Dec;

public class Fruit extends Decorating {

	public void PutFruit() {
		System.out.println("Add Fruit....");
	}

	public Fruit(IBirthdayCake brBirthdayCake) {
		super(birthdayCake);
	}

}
