package shastri.swaroop.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	BlockingQueue<Message> sharedQueue; ;
	int i = 0;
	int max =1000;
	Producer(BlockingQueue<Message> que){
		this.sharedQueue = que;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		while(i<max) {
			Message msg = new Message();
			msg.setMsg("Msg : "+i);
			try {
				//queue.add(msg);
				sharedQueue.put(msg);
				System.out.println(msg.getMsg() + " added successfully..");
				Thread.sleep(49);
				i++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
