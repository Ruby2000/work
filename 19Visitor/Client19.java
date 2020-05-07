package Visitor;

public class Client19 { // 访问者模式

	public static void main(String args[]) {
		IProduct b1 = new Book();
		IProduct b2 = new Book();
		IProduct a1 = new Apple();
		AVisitor visitor;

		BuyBasket basket = new BuyBasket();
		basket.addProduct(b1);
		basket.addProduct(b2);
		basket.addProduct(a1);

		visitor = (AVisitor) XMLUtil.getBean();

		visitor.setName("张三");
		basket.accept(visitor);
	}
}
