package ObvStock;

public class StockFutures extends AStockPrice {

	public StockFutures(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

	protected void notifyHolder() {
		System.out.println("期货更新了-" + code + ":" + price);
		for (IStockHolder ish : stockHolderlist) {
			ish.updata(this);
		}
		price2 = price;
	}

}
