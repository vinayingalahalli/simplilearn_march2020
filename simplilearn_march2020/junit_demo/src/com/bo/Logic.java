package com.bo;

public class Logic {

	public boolean isPrime(int val) {
		boolean b=false;
		int count=0;
		for (int i = 1; i <=val; i++) {
			if(val%i==0) {
				count++;
			}
		}
		if(count==2) {
			b=true;
		}
		return b;
	}
	
	public boolean isValidPan(String pan) {
		boolean b=false;
		if(pan!=null && pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			b=true;
		}
		return b;
	}
}
