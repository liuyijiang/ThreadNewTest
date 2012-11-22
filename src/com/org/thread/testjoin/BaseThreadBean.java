package com.org.thread.testjoin;

public class BaseThreadBean extends Thread{
  
    private int num;
	
	public BaseThreadBean(){
		this.num = 0;
	}
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<5;i++){
				try{
					num = i;
					Thread.sleep(2000);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			this.notifyAll();
		}
	}
	
}
