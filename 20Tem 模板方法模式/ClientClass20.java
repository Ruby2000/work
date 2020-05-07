package Tem;

public class ClientClass20 {
	public static void main(String args[]) {
		ADefiniteIntegral[] x = new ADefiniteIntegral[2];
		x[0] = new DefinitegralXX(0, 20, 100);
		x[1] = new DefinitegralLn(2.71, 20, 100);
		for (int i = 0; i < 2; i++) {
			System.out.println(x[i].CalDefiniteIntegral());
		}

	}

}
