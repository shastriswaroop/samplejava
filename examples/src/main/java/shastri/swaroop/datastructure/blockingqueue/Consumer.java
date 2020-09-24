package shastri.swaroop.datastructure.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	int max = 1000;
	int count = 0;
	BlockingQueue<Message> sharedQueue;

	Consumer(BlockingQueue<Message> que) {
		this.sharedQueue = que;
	}

	public void run() {
		while (count <= max) {
			try {
				Message msg = sharedQueue.take();
				System.out.println(msg.getMsg() + "retrived succesfully...");
				count++;
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}