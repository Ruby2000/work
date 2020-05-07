package Bri;

public class Client9 {
	public static void main(String a[]) {
		Color color;
		Pen pen;

		color = (Color) XMLUtilPen.getBean("color");
		pen = (Pen) XMLUtilPen.getBean("pen");

		pen.setColor(color);
		pen.draw("鲜花");
	}
}