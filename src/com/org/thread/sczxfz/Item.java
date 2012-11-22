package com.org.thread.sczxfz;
/**
 * 生产者与消费者模型 ------ 产品
 * @author jim.liu
 *
 */
public class Item {
   
	private int name;
    public Item(){}
	
	public Item(int name){
		this.name = name;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}
	
	
	
	
}
