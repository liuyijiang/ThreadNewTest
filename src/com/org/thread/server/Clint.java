package com.org.thread.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Clint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//        while(true){
//        	System.out.println("your name?");
//        	String s = scan.next();
//        	System.out.println("my name is " + s);
//        }
        try{
        Socket s = new Socket("localhost",3430);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        ClintLinster c = new ClintLinster(dis);
        c.start();
        while(true){
        	dos.writeUTF(scan.next());
        	dos.flush();
        }
        }catch(Exception e){
        	e.printStackTrace();
        }
        
	}

}
