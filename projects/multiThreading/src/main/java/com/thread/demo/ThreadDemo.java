package com.thread.demo;
public class ThreadDemo extends Thread{
	private String name;
	
	public ThreadDemo(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Inside Thread" + name + " " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadDemo thread1 = new ThreadDemo("thread1");
		ThreadDemo thread2 = new ThreadDemo("thread2");
		ThreadDemo thread3 = new ThreadDemo("thread3");
		
		Thread thread4 = new Thread(new RunnableDemo("thread4")); 
		Thread thread5 = new Thread(new RunnableDemo("thread5"));
		
		System.out.println(thread1.name + " " + thread1.getPriority());
		System.out.println(thread2.name + " " + thread2.getPriority());
		System.out.println(thread3.name + " " + thread3.getPriority());
		System.out.println(thread4.getName() + " " + thread4.getPriority()); // check why name is not displayed as thread4
		System.out.println(thread5.getName() + " " + thread5.getPriority()); // check why name is not displayed as thread5
		System.out.println();
		
		thread1.setPriority(4);
		thread2.setPriority(MAX_PRIORITY);
		thread3.setPriority(9);
		
		System.out.println(thread1.name + " " + thread1.getPriority());
		System.out.println(thread2.name + " " + thread2.getPriority());
		System.out.println(thread3.name + " " + thread3.getPriority());
		System.out.println();
		
		System.out.println("current running thread " + Thread.currentThread().getName());
		System.out.println("main thread priority " + Thread.currentThread().getPriority());
		System.out.println();
		
		thread3.setDaemon(true);
		System.out.println(thread3.name + " " + thread3.getPriority());
		
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		thread2.start();
//		try {
//			thread2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		thread3.start();
		thread4.start();
	}
}
