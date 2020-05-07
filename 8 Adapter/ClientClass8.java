package Adapter;

import pro.Apple;
import pro.Banana;
import pro.MyFruit;
import pro.MyFruitStore;

public class ClientClass8 {
	public static void main(String[] args) {
		MyFruit fru1 = new Apple();
		MyFruit fru2 = new Banana();
		MyFruitStore mfs1 = MyFruitStore.GetfruitStore();
		mfs1.Add(1, fru1);
		mfs1.Add(2, fru2);
		mfs1.Add(3, new Apple());
		mfs1.Add(4, new Banana());
		MyFruitStore mfs2 = MyFruitStore.GetfruitStore();
		InewJuicer newJuicer = new Adapter();
		System.out.println(newJuicer.newPort(mfs1.Get(3), mfs1.Get(4)));
//		MyFruit fru = (MyFruit) mfs1.Get(3);
//		fru.Display();
//		System.out.println("mfs1:" + mfs1.toString());

	}

}
