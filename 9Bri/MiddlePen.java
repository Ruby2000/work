package Bri;

public class MiddlePen extends Pen {

	@Override
	public void draw(String name) {
		// TODO Auto-generated method stub
		String penType = "中号毛笔绘制";
		this.color.bepaint(penType, name);
	}

}
