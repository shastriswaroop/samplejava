package shastri.swaroop.thread.oddeven;

public class OddEvenThread extends Thread{
    private int max;
    private Printer print;
    private boolean isEvenNumber;
 
    // standard constructors
    OddEvenThread(Printer print, int max, boolean evenOrOdd){
    	this.isEvenNumber = evenOrOdd;
    	this.max = max;
    	this.print = print;
    }
    
    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2;
        }
    }
}
