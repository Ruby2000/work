package Visitor;

public class Apple implements IProduct {

	@Override
	public void accept(AVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
