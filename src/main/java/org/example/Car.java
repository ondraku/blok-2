package org.example;

public class Car {

	private String make;
	private String model;
	private int year;

	public Car(final String make, final String model, final int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(final String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(final String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(final int year) {
		this.year = year;
	}

}
