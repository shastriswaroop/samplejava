package shastri.swaroop.thread.customoddeven;

public class PrinterThread implements Runnable{
	private volatile Printer printer;
	private int cnt ;
	//private boolean isodd;
	
	PrinterThread(Printer printer, int startCnt, boolean isodd){
		this.printer = printer;
		this.cnt = startCnt;
		//this.isodd = isodd;
	}
	
	public void run() {
	//	isodd = startCnt%2==0?false:true;
		while(cnt<10) {
			if(cnt==0||cnt%2==0)
				printer.printOdd(cnt);
			else 
				printer.printEven(cnt);
			cnt=cnt+2;
		}
	}
}
