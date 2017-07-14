package com.fanniemae.payroll;

public class EmailProcess  implements Runnable {

	public void sendEmail(){
		System.out.println("email process started");
		try {
			Thread.sleep(10_000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		System.out.println("email process ended");
	}

	@Override
	public void run() {
		sendEmail();
		
	}
}
