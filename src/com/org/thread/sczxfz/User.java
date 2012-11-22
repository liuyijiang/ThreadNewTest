package com.org.thread.sczxfz;

public class User extends Thread {

   private Storage st;
	
	public User(Storage st){
		this.st = st;
	}
	
	public void run(){
		while(true){
			try{
				st.get();
				//Thread.sleep(200);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}
	
}
