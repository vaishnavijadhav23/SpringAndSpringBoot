package org.tnsif.springioc;

public class HDFCCard implements DebitCard{

	public void deposit() {
		System.out.println("HDFC-depositing an amount of 1 lakh Rupees");
		
	}

	public void withdraw() {
		System.out.println("HDFC-withdrawing an amount of 20 thousand Rupees");
		
	}

}

