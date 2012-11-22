package com.org.thread.wait;

public class ThreadB extends Thread {
  
	int total;
	
	public void run(){
		synchronized (this) {
			for(int i=0;i<101;i++){
				total += i;
			}
			notify();
		}	
	}
	
}
