package com.org.thread.volatiles;

public class Test {

	private volatile Money m = new Money();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.tt();
	}

	public void tt(){
		m.setNum(1000);
		Thread add = new Thread(new TestBaseVolatie(m,true));
		Thread sell = new Thread(new TestBaseVolatie(m,false));
		add.start();
		sell.start();
	}
	
}
