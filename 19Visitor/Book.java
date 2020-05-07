package Visitor;

public class Book implements IProduct {

	@Override
	public void accept(AVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
