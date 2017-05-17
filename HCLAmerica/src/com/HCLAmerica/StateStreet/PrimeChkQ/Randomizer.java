package com.HCLAmerica.StateStreet.PrimeChkQ;

import java.util.Random;
import java.util.concurrent.SynchronousQueue;

public class Randomizer implements Runnable{

	Random rand = new Random();

	SynchronousQueue<Message> isPrimeQ = new SynchronousQueue<Message>();
	SynchronousQueue<Integer> randomNumQ = new SynchronousQueue<Integer>();

	public Randomizer(SynchronousQueue<Integer> randomIntQ,
			SynchronousQueue<Message> isPrimeQ) {
		this.isPrimeQ = isPrimeQ;
		this.randomNumQ = randomIntQ;
	}

	@Override
	public void run() {
		int  n = rand.nextInt(5000) + 1;
		try{
			randomNumQ.put(n);

			Message msg = isPrimeQ.take();
			System.out.println(msg.getMsg());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
