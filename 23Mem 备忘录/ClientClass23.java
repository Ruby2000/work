package Mem;

public class ClientClass23 {
	public static void main(String[] args) {
		Caretaker taker = new Caretaker();

		Emp emp = new Emp("bobo烤鸭", 18, 880);
		System.out.println("第一次打印对象：" + emp.getEname() + "---" + emp.getAge() + "---" + emp.getSalary());

		taker.setMemento(emp.memento()); // 备忘一次

		emp.setAge(28);
		emp.setEname("dpb");
		emp.setSalary(19000);
		System.out.println("第二次打印对象：" + emp.getEname() + "---" + emp.getAge() + "---" + emp.getSalary());
		emp.recovery(taker.getMemento()); // 恢复到备忘录对象保存的状态
		System.out.println("第三次打印对象：" + emp.getEname() + "---" + emp.getAge() + "---" + emp.getSalary());
	}

}
