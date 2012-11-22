package com.org.thread.sczxfz;

public class Creater extends Thread{
   
	private Storage st;
	
	public Creater(Storage st){
		this.st = st;
	}
	
	public void run(){
			while(true){
				try{
					st.add();
					//Thread.sleep(1000);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
	}
	
}
