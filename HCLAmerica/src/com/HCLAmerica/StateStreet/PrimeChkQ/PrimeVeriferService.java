package com.HCLAmerica.StateStreet.PrimeChkQ;

import java.util.concurrent.SynchronousQueue;

public class PrimeVeriferService {

    public static void main(String[] args) {
    	SynchronousQueue<Message> isPrimeQ = new SynchronousQueue<Message>();
    	SynchronousQueue<Integer> randomNumQ = new SynchronousQueue<Integer>();

        Randomizer randomizer = new Randomizer(randomNumQ, isPrimeQ);
        PrimeVerifier primerVerifier = new PrimeVerifier(randomNumQ, isPrimeQ);

        for (int i = 0; i < 10 ; i++) {
        	new Thread(randomizer).start();
        	new Thread(primerVerifier).start();
        }
    }

}
