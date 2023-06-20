package org.example;

public class Main {

	public static void main(String[] args) {

		// Exercise 1: Car

		Car newCar = new Car("Toyota", "Camry", 2010);

		System.out.println("Make: " + newCar.getMake() + "\nModel: " + newCar.getModel() + "\nYear: " + newCar.getYear());

		newCar.setMake("Ford");
		newCar.setModel("Mustang");
		newCar.setYear(2022);

		System.out.println("\nMake: " + newCar.getMake() + "\nModel: " + newCar.getModel() + "\nYear: " + newCar.getYear());

		// Exercise 2: Rectangle
		System.out.println();

		Rectangle rectangle = new Rectangle(20, 30);

		final double rectangleArea = rectangle.getArea();

		System.out.println("Area of this rectangle is: " + rectangleArea);

		// Exercise 1: Abstract animal
		System.out.println();

		Dog dog = new Dog();
		dog.makeSound();
		dog.move();

		Bird bird = new Bird();
		bird.makeSound();
		bird.move();

		// Exercise 2: PaymentMethod Interface
		System.out.println();

		CreditCard creditCard = new CreditCard();
		creditCard.processPayment(100);

		PayPal payPal = new PayPal();
		payPal.processPayment(200);

		Cash cash = new Cash();
		cash.processPayment(50);

	}

}
