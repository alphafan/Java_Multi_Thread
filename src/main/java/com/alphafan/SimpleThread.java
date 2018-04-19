package com.alphafan;

public class SimpleThread extends Thread{
	
	public SimpleThread(String name){
		super(name);
	}
	
	public void run(){
		for(int i = 0; i< 10; i++){
			System.out.println("Thread name is " + this.getName());	
		}
	}
}
