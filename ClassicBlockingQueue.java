package shastri.swaroop.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

//https://javarevisited.blogspot.com/2012/02/producer-consumer-design-pattern-with.html
public class ClassicBlockingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Message> sharedQueue = new LinkedBlockingQueue<Message>();
		
		Producer prod = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);
		
		Thread prodThread = new Thread(prod);
		Thread consumerThread = new Thread(consumer);
		
		prodThread.start();
		consumerThread.start();

	}

}
