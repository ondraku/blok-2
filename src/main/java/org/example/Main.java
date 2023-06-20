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
	}

}
