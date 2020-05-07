package Fly;

public abstract class APiece {
	protected String inKind;

	public APiece(String inkind) {
		this.inKind = inkind;
	}

	// 下棋时落子的位置
	public abstract void Play(int x, int y);

}
