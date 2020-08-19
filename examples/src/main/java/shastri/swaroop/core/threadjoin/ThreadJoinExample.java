package shastri.swaroop.core.threadjoin;

public class ThreadJoinExample {
	public static void main(String args[]) throws InterruptedException {
		
		Thread th1 = new ThreadJoin("A");
		Thread th2 = new ThreadJoin("B");
		Thread th3 = new ThreadJoin("C");
		
		th1.start();
		th1.join();

		th2.start();
		th2.join();
		
		th3.start();
		th3.join();
	}
}
