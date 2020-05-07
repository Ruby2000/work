package pro;

public class ClientClass {
	public static void main(String[] args) {
		MyFruit fru1 = new Apple();
		MyFruit fru2 = new Banana();
		MyFruitStore mfs = MyFruitStore.GetfruitStore();
		mfs.Add(1, fru1);
		mfs.Add(2, fru1);
		mfs.Add(3, new Apple());
		mfs.Add(4, new Banana());
		MyFruit fru = (MyFruit) mfs.Get(3);
		fru.Display();
		System.out.println("mfs1:" + mfs.toString());

	}

}
