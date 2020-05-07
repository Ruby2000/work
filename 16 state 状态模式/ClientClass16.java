package state;

public class ClientClass16 {
	public static void main(String args[]) {
		ThreadContext tc = new ThreadContext();
		tc.start();
		tc.getCpu();
		tc.suspend();
	}

}
