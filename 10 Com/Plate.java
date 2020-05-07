package Com;

import java.util.ArrayList;

public class Plate extends MyElement {
	private ArrayList list = new ArrayList();

	public void add(MyElement element) {
		list.add(element);
	}

	public void delete(MyElement element) {
		list.remove(element);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		for (Object object : list) {
			((MyElement) object).eat();
		}
	}

}
