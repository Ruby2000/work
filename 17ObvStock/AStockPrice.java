package ObvStock;

import java.awt.List;
import java.util.ArrayList;

public abstract class AStockPrice {
	protected float price, price2;
	protected String code;
	protected List<IStockHolder> stockHolderlist;

	public void Add(IStockHolder Ish) {
		stockHolderlist.add(Ish);
	}

	public void remove(IStockHolder Ish) {
		stockHolderlist.remove(Ish);
	}

	public AStockPrice(String code) {
		this.code = code;
		price = price2 = 0;
		stockHolderlist = new ArrayList<IStockHolder>();
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
		notifyHolder();
	}

	abstract protected void notifyHolder();

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null));
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AStockPrice other = (AStockPrice) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

	public float getPrice2() {

	}
}
