package com.org.thread.wait;
/**
 * 测试线程wait
 * @author jim.liu
 *
 */
public class ThreadA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		//线程A拥有b对象上的锁，线程为了调用wait 或notify方法 该线程必须是那个对象锁的拥有者
		//System.out.println(b.total);
		synchronized (b) {
			try{
			System.out.println("wait b finish ");
			b.wait();
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println(b.total);
		}

	}

}
