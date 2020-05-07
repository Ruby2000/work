package ObvStock;

public class StockCommon extends AStockPrice {

	public StockCommon(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

	protected void notifyHolder() {
		System.out.println("普通股票更新了-" + code + ":" + price);
		for (IStockHolder ish : stockHolderlist) {
			ish.updata(this);
		}
		price2 = price;
	}

}
