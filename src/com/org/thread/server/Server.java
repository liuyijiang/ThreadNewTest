package com.org.thread.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
  
	private ServerSocket ss = null;
	private Socket s = null;
	
	public void start(){
		try{
//		   Map<String,Socket> map = new HashMap<String,Socket>();
		   List<Socket> slist = new ArrayList<Socket>();
		   ss = new ServerSocket(3430);
		   System.out.println("服务器start");
		   int i = 0;
		   while(true){
			   s = ss.accept();
			   i= i+1;
			   String name = "第："+i+"Clint";
			   System.out.println("客户端"+ name +"连上");
			   slist.add(s);
			   ServerWorker sw = new ServerWorker(s,name,slist);
			   sw.start();
		   }
		  
		   
		  
		   
		   
		   
//		   String str = "";
//		   boolean quit = false;
//		   while(!quit){
//			   System.out.println(dis.readUTF());
//			   dos.writeUTF("服务器已收到" + str );  //(str = dis.readUTF()).equals("quit")
//		   }
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
	
	public static void main(String args[]){
		Server server = new Server();
		server.start();
	}
	
	
}
