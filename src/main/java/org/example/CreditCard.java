package org.example;

public class CreditCard implements PaymentMethod {

	@Override
	public void processPayment(final double amount) {
		System.out.println("Credit card payment processed for " + amount);
	}

}
