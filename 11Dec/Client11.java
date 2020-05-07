package Dec;

import chain.fruitBox;

public class Client11 {
	IBirthdayCake birthdayCake=new Cake();
	birthdayCake.Show();
	Cream cream=new Cream(birthdayCake);
	Cream.PutCream();
	
	Fruit fruit=new Fruit(cream);
	fruit.PutFruit();
	Fruit.Show();

}
