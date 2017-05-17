package com.HCLAmerica.StateStreet.PrimeChkQ;

import java.util.concurrent.SynchronousQueue;

public class PrimeVerifier implements Runnable{
	SynchronousQueue<Message> isPrimeQ = new SynchronousQueue<Message>();
	SynchronousQueue<Integer> randomNumQ = new SynchronousQueue<Integer>();

	public PrimeVerifier(SynchronousQueue<Integer> randomIntQ,
			SynchronousQueue<Message> isPrimeQ) {
		this.isPrimeQ = isPrimeQ;
		this.randomNumQ = randomIntQ;		
	}

	//checks whether an int is prime or not.
	boolean isPrime(int n) {
		//check if n is a multiple of 2
		if (n%2==0) return false;
		//if not, then just check the odds
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	@Override
	public void run() {
		try {
			Integer rInteger = randomNumQ.take();
			isPrimeQ.put(new Message(rInteger, isPrime(rInteger)));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}