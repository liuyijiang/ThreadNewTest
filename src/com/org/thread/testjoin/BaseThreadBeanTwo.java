package com.org.thread.testjoin;

public class BaseThreadBeanTwo implements Runnable{
  
	private boolean stop = false;
	
	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while(!stop){
			try{
				System.out.println("->>>>>>>>>");
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("run finish");
	}

}
