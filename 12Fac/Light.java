package Fac;

public class Light {
	private String position;

	public Light(String position) {
		this.position = position;
		// TODO Auto-generated constructor stub
	}

	public void on() {
		// TODO Auto-generated method stub
		System.out.println(this.position + "灯打开");
	}

	public void off() {
		// TODO Auto-generated method stub
		System.out.println(this.position + "灯关掉");
	}

}
