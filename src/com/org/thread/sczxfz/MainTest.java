package com.org.thread.sczxfz;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Storage s = new Storage(10);
		Creater c = new Creater(s);
        User u = new User(s);
        c.start();
        u.start();
	}

}
