package chain;

public class BigFruitSorting extends AbstractFruitSort {

	public BigFruitSorting(int weight) {
		super(weight);
		// TODO Auto-generated constructor stub
	}

	protected void pushBox(String fruit) {
		// TODO Auto-generated method stub
		fruitBox.add("超市:" + fruit);
	}

}
