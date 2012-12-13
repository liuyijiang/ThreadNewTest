package com.org.thread.quene;

public class ThreadB extends Thread{
    
	private Message mss;
	
	public ThreadB(Message mss){
		this.mss = mss;
	}
	
	public void run(){
		synchronized (mss) {
			while(true){
				try{
					System.out.println(mss.str);
					mss.str = "手机充值";
				    Thread.sleep(1000);
				    mss.notifyAll();
				    mss.wait();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	
}
