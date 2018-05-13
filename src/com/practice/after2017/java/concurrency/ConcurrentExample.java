package com.practice.after2017.java.concurrency;

public class ConcurrentExample implements Runnable {

	private String name = "";

	public ConcurrentExample(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println(this.name + ": " + i++);
		}
	}

	public static void main(String[] args) {
		ConcurrentExample example = new ConcurrentExample("Testing");
		ConcurrentExample example2 = new ConcurrentExample("Testing2");
		Thread t1 = new Thread(example, "t1");
		Thread t2 = new Thread(example2, "t2");
		t1.start();
		t2.start();

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Anonymous class def");
			}

		};

		Thread t3 = new Thread(runnable);
		t3.start();
	}

}
