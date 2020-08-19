package shastri.swaroop.core.threadjoin;

public class ThreadJoin extends Thread{
	ThreadJoin(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			try {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName());
			} catch(InterruptedException ie) {
				ie.printStackTrace();
				System.out.println(ie.getMessage());
			}
			System.out.println(i);
		}
	}
}
