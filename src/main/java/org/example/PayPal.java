package org.example;

public class PayPal implements PaymentMethod {

	@Override
	public void processPayment(final double amount) {
		System.out.println("PayPal payment processed for " + amount);
	}

}
