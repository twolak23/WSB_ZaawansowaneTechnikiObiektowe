package zad1.devices.cars;

import zad1.devices.*;

public class Diesel extends Car {
	public Diesel (String producer, String model, int yearOfProduction, Double price) {
		super(producer, model, yearOfProduction, price);
	}

	public Diesel (String producer, String mode, int yearOfProduction) {
		super(producer, mode, yearOfProduction);
	}

	public Diesel (String producer, String model, int yearOfProduction, Double price, Double fuelCapacity) {
		super(producer, model, yearOfProduction, price, fuelCapacity);
	}

	@Override
	public void refuel () {
		this.fuelAmount = this.fuelCapacity;
	}

}
