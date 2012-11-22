package com.org.thread.testjoin;

/**
 * 测试线程join  join 是让当前执行这个线程的方法阻塞    执行t.join()这段代码的线程立即阻塞，开始执行t线程。等t线程执行完毕之后，该block住线程才开始执行。
 * @author jim.liu
 *
 */
public class TestThreadJoin {

	public void testjoin(TestThreadJoin tt){
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 try {
			 BaseThreadBean t = new BaseThreadBean();
			 Thread t2 = new Thread(new BaseThreadBeanTwo());
             t.start();
             t2.start();
             t.join();//等当线程t完成后才执行下面的操作
             System.out.println("get num is :");
             System.out.println(t.getNum());
	       } catch (Exception e) {
		     e.printStackTrace();
	     }

	}

}
