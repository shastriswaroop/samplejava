package shastri.swaroop.thread.deadlock;

public class DeadLockDemo {
	private Object str1 = new String();
	private Object str2 = new String();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread myThread = new DeadLockDemo().new MyThread();
		Thread yourThread = new DeadLockDemo().new YourThread();
		
		myThread.start();
		yourThread.start();
	}
	
	class MyThread extends Thread{
		public void run() {
			synchronized (str1) {
				System.out.println("str1 is locked by MyThread");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (str2) {
					System.out.println("str2 is locked by MyThread");
				}
			}
		}
	}
	class YourThread extends Thread{
		public void run() {
			synchronized (str2) {
				System.out.println("str2 is locked by YourThread");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (str1) {
					System.out.println("str1 is locked by YourThread");
				}	
			}
		}
	}
	

}
