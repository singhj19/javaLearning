package com.thread.demo;

public class RunnableDemo implements Runnable{
	
public String name;
	
	public RunnableDemo(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Inside Thread " + name + " " + Thread.currentThread().getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
