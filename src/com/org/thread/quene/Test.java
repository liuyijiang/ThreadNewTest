package com.org.thread.quene;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Message mss = new Message();
        mss.str = "手机充值";
        ThreadA a = new ThreadA(mss);
        ThreadB b = new ThreadB(mss);
        a.start();
        b.start();
	}

}
