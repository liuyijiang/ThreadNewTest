package com.org.thread.testjoin;
/**
 * 测试wait 和join类似  那个实例调用wait就将正在执行的现在加入到那个实例的waitset中挂起
 * @author jim.liu
 *
 */
public class TestThreadWait {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//BaseThreadBeanTwo t = new BaseThreadBeanTwo();
		 try {
			 BaseThreadBean t = new BaseThreadBean();
             t.start();
             synchronized (t) {
            	 System.out.println("get num is :");
            	 t.wait();//让前期线程加入到t的wait set中等待
                 System.out.println(t.getNum());
			 }
	       } catch (Exception e) {
		     e.printStackTrace();
	     }

	}

}
