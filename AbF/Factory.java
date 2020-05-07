package AbF;

public class Factory {

	public Fruit CreateFruit(String Kind) {
		// TODO Auto-generated method stub
		if (Kind.equals("A"))
			return new Apple();
		if (Kind.equals("B"))
			return new Banana();
		return null;
	}

}
