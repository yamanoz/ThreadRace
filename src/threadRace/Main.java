package threadRace;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ThreadYaris thy=new ThreadYaris();
		
		    Thread t1 = new Thread(thy);
	        Thread t2 = new Thread(thy);
	        Thread t3 = new Thread(thy);
	        Thread t4 = new Thread(thy);

	        t1.start();
	        t1.join();
	      //  Thread.sleep(2000);
	        t2.start();
	        t2.join();
	       // Thread.sleep(1000);
	        t3.start();
	        t3.join();
	      //  Thread.sleep(1000);
	        t4.start();
	        t4.join();
		
		
		System.out.println("TEKLER :"+ThreadYaris.odds.size());
		System.out.println("Çiftler :"+ThreadYaris.evens.size());
		t1.dumpStack();
		t2.dumpStack();
		t3.dumpStack();
		t4.dumpStack();
	}

}
