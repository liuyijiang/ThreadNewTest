package com.org.thread.sczxfz;

import java.util.LinkedList;

/**
 * 生产者与消费者模型    --------  仓库
 * @author jim.liu
 *
 */
public class Storage {

	private LinkedList<Item> items = null;
	private int max;
	
	
	public Storage(int max){
		this.max = max;
		items = new LinkedList<Item>();
	}
	
	public void add(){
		synchronized (this) {
			try{
			   this.notifyAll();
			   if(isFull()){
				  System.out.println("******仓库已满****");
				  this.wait(); 
			   }
			   Item em = new Item();
			   items.add(em);
				System.out.println("生产者已经生产第："+items.size()+"货物");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
	
	public void get(){
		synchronized (this) {
			try{
				this.notifyAll();
				if(isEmpty()){
					System.out.println("******仓库已经空****");
					this.wait();
				}
				items.removeFirst();
				System.out.println("消费者以消费第："+items.size()+"货物");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public boolean isEmpty(){
		return items.isEmpty();
	}
	
	public boolean isFull(){
		return items.size() == max;
	}
	
	
}
