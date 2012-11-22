package com.org.thread.server;

import java.io.DataInputStream;

public class ClintLinster extends Thread{
  
	private  DataInputStream dis = null;
	
	public ClintLinster(DataInputStream dis){
		this.dis = dis;
	}
	
	public void run(){
		while(true){
			try{
			System.out.println(dis.readUTF()); 
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
}
