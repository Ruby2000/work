package AbF;

//工厂模式
public class ClientClass2 {
	public static void main(String args[]) {
		Factory factor = new Factory();
		Fruit fruit = factor.CreateFruit("A");
		fruit.eat();
	}

	public String factory(String fruitname) {
		if (fruitname.equals("Apple"))
			return "Apple";
		if (fruitname.equals("Banana"))
			return "Banana";
		return null;
	}

}
