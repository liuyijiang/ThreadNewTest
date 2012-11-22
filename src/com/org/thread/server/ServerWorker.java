package com.org.thread.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ServerWorker extends Thread{
  
	private Socket s = null;
	private String clintName = null;
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	//private Map<String,Socket> map = null;
	private List<Socket> list = null;
	
	public ServerWorker(Socket s,String clintName,List<Socket> list) throws Exception{
		this.s = s;
		this.clintName = clintName;
		this.dis = new DataInputStream(s.getInputStream());
		this.dos = new DataOutputStream(s.getOutputStream());
		this.list = list;
	}
	
	public void run(){
		boolean quit = false;
		try{
			while(!quit){
			   String str = dis.readUTF();
			   if(str.equals("quit")){
				   quit = true;
			   }
			   speekToAll(str);
//			   System.out.println(clintName + " say :" + str);
//			   Set<String> set = map.keySet();
//			   SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			   dos.writeUTF(s.format(new Date())+ "-"+clintName +"say: "+ str );  //(str = dis.readUTF()).equals("quit")
			   dos.flush();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	private void speekToAll(String str) throws Exception{
		for(Socket s : list){
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			dos.writeUTF(sd.format(new Date())+ "-"+clintName +"say: "+ str );
			dos.flush();
		}
	}
	
}
