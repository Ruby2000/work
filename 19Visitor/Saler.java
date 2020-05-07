package Visitor;

public abstract class Saler extends AVisitor {

	public void visit(Apple apple) {
		// TODO Auto-generated method stub
		System.out.println("收营员" + name + "给苹果，然后计算价格");
	}

	@Override
	public void visit(Book book) {
		// TODO Auto-generated method stub
		System.out.println("收营员" + name + "给书，然后计算价格");
	}

}
