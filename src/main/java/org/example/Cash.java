package org.example;

public class Cash implements PaymentMethod {

	@Override
	public void processPayment(final double amount) {
		System.out.println("Cash payment processed for " + amount);
	}

}
