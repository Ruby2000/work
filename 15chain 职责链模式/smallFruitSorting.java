package chain;

public class smallFruitSorting extends AbstractFruitSort {

	public smallFruitSorting(int weight) {
		super(weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void pushBox(String fruit) {
		// TODO Auto-generated method stub
		fruitBox.add("果汁:" + fruit);
	}

}
