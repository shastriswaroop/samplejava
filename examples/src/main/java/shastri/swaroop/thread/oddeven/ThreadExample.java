package shastri.swaroop.thread.oddeven;

public class ThreadExample {
	public static void main(String args[]) {
	    Printer print = new Printer();
	    Thread t1 = new Thread(new OddEvenThread(print, 10, false),"Odd");
	    Thread t2 = new Thread(new OddEvenThread(print, 10, true),"Even");
	    t1.start();
	    t2.start();
	}
}
