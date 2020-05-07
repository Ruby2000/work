package Fac;

public class GeneralSwitchFacade {
	private Light lights[] = new Light[4];
	private Fan fan;
	private AirConditioner ac;
	private Television tv;

	public GeneralSwitchFacade() {
		lights[0] = new Light("左前");
		lights[1] = new Light("右前");
		lights[2] = new Light("左后");
		lights[3] = new Light("右后");
		fan = new Fan();
		ac = new AirConditioner();
		tv = new Television();

	}

	public void on() {
		// TODO Auto-generated method stub
		lights[0].on();
		lights[1].on();
		lights[2].on();
		lights[3].on(); // 4盏灯全部打开
		fan.on();
		ac.on();
		tv.on();
	}

	public void off() {
		// TODO Auto-generated method stub
		lights[0].off();
		lights[1].off();
		lights[2].off();
		lights[3].off();
		fan.off();
		ac.off();
		tv.off();
	}

}
