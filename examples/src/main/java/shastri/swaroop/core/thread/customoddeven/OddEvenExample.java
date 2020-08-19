package shastri.swaroop.core.thread.customoddeven;

public class OddEvenExample {
	public static void main(String arg[]) {
		Printer print = new Printer();
		
		Thread even = new Thread(new PrinterThread(print,0,false),"even");
		Thread odd = new Thread(new PrinterThread(print,1,true),"odd");
		even.start();			
		odd.start();
	}
}
