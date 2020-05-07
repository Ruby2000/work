package ObvStock;

import java.awt.List;
import java.util.ArrayList;

public class SellHolder implements IStockHolder {
	private List<AStockPrice> attentionlist;
	private String name;

	public SellHolder(String name) {
		// TODO Auto-generated constructor stub
		attentionlist = new ArrayList<AStockPrice>();
		this.name = name;
	}

	@Override
	public void updata(AStockPrice asp) {
		// TODO Auto-generated method stub
		if (attentionlist.contains(asp)) {
			System.out.println(name);
			if (asp.getPrice() - asp.getPrice2() > 0) {
				System.out.println(asp.code + ":");
				System.out.println("原价:" + asp.price2 + "-现价:" + asp.price);
				System.out.println("涨了，哭");
			} else {
				System.out.println(asp.code + ":");
				System.out.println("原价:" + asp.price2 + "-现价:" + asp.price);
				System.out.println("跌了，爽");
			}

		}
	}

	public void AddHolder(AStockPrice asp) {
		// TODO Auto-generated method stub
		attentionlist.add(asp);
		asp.Add(this);
	}
}
