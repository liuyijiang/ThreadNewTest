package com.org.thread.volatiles;

public class TestBaseVolatie implements Runnable {
   
	private Money money;
	private boolean add;
	private boolean runMethod = true;
	
	public TestBaseVolatie(Money money, boolean add) {
		this.money = money;
		this.add = add;
	}

	@Override
	public void run() {
			if(add){
				System.out.println("收入开始############################");
				for(int i=1;i<10;i++){
				   addMoney();
				}
			}else{
				System.out.println("支出开始############################");
				for(int i=1;i<10;i++){
				   runMethod = sellMoney();
				}
			}
		
	}
	
    private void addMoney(){
    	try{
    	money.setNum(money.getNum() + 50);
    	System.out.println("账户收入50元总金为："+money.getNum());
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
	
    private boolean sellMoney(){
    	if(money.getNum() >= 0){
    		money.setNum(money.getNum() - 100);
    		System.out.println("账户支出100元总金为："+money.getNum());
    		return true;
    	}else{
    		return true;
    	}
    }
}
