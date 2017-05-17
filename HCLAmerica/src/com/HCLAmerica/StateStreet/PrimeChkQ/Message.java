package com.HCLAmerica.StateStreet.PrimeChkQ;

public class Message {
    private int num;
    private boolean isPrime;
    
    public Message(int number, boolean isPrime){
        this.num = number;
        this.isPrime = isPrime;
    }

    public String toString() {
    	return "number:" + num + " isPrime:" + isPrime;
    }
    public Message getMsg() {
        return this;
    }
}