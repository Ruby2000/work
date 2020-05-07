package Mem;

public class Caretaker {
	private EmpMemento memento;
	// 备忘点较多时,将备忘录压栈,将多个备忘录对象，序列化和持久化 实现撤回多步的操作
	// private Stack<Memento> stack = new Stack<Memento>();
	// private List<EmpMemento> list = new ArrayList<EmpMemento>();

	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}
}
