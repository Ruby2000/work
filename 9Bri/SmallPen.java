package Bri;

public class SmallPen extends Pen {

	@Override
	public void draw(String name) {
		// TODO Auto-generated method stub
		String penType = "小号毛笔绘制";
		this.color.bepaint(penType, name);
	}

}
