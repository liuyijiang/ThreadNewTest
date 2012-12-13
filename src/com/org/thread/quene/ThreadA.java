package com.org.thread.quene;

public class ThreadA extends Thread{
    
	private Message mss;
	
	public ThreadA(Message mss){
		this.mss = mss;
	}
	
	public void run(){
		synchronized (mss) {
			while(true){
				try{
					System.out.println(mss.str);
					mss.str = "充值成功";
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
