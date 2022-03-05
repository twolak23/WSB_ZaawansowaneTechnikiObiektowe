package zad1.devices.cars;

import zad1.devices.*;

public class Electric extends Car {
	public Electric (String producer, String model, int yearOfProduction, Double price) {
		super(producer, model, yearOfProduction, price);
	}

	public Electric (String producer, String mode, int yearOfProduction) {
		super(producer, mode, yearOfProduction);
	}

	public Electric (String producer, String model, int yearOfProduction, Double price, Double fuelCapacity) {
		super(producer, model, yearOfProduction, price, fuelCapacity);
	}

	@Override
	public void refuel () {
		this.fuelAmount = this.fuelCapacity;
	}
}
