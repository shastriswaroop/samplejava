package shastri.swaroop.core.thread.customoddeven;

public class Printer {
	private volatile boolean isOdd;
	
	synchronized void printOdd(int number) {
		while(!isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName() + " : " + number);
		isOdd=false;
		notify();
	}
	
	synchronized void printEven(int number) {
		while(isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName() + " : " + number);
		isOdd=true;
		notify();
		
	}
	
}
