package com.org.thread.safety;

public class Main {
  
	public static void main(String[] args){
		Gate g = new Gate();
		new UserThread(g, "Alice", "Alaska").start();
		new UserThread(g, "Bob", "Brazil").start();
		new UserThread(g, "Chis", "Canada").start();
	}
	
	
}
