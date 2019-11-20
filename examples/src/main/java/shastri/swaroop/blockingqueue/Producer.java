package shastri.swaroop.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	BlockingQueue<Message> queue ;
	int i = 0;
	int max =10;
	Producer(BlockingQueue<Message> que){
		this.queue = que;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		while(i<10) {
			Message msg = new Message();
			msg.setMsg("Msg : "+i);
			queue.add(new Message());
			System.out.println();
			i++;
		}
	}

}
