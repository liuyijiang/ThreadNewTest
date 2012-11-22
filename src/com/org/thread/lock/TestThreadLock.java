package com.org.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * java 线程锁机制
 * @author jim.liu
 *
 */
public class TestThreadLock {

	private Lock lock = new ReentrantLock();
	
	//使用lock对象
	public void testLock(){
		lock.lock();
		//java code
		lock.unlock();
	}
	
	public void testPart(){
		synchronized (this) {
			
		}
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
