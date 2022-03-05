package zad1.devices;

import zad1.creatures.*;

public abstract class Car extends Device {

    protected Double price;
    protected Double fuelAmount;
    protected Double fuelCapacity;

    public Car(String producer, String model, int yearOfProduction, Double price) {
        super(producer, model, yearOfProduction);
        this.price = price;
    }

	public Car (String producer, String model, int yearOfProduction, Double price, Double fuelCapacity) {
		super(producer, model, yearOfProduction);
		this.price = price;
		this.fuelAmount = fuelCapacity;
		this.fuelCapacity = fuelCapacity;
	}

	public abstract void refuel ();

	@Override
	public void sell (Human seller, Human buyer, Double price) {
		if (seller.getCar() == this && buyer.getCash() >= price) {
			seller.setCash(seller.getCash() + price);
			buyer.setCash(buyer.getCash() - price);
      		buyer.setCar(this);
      		seller.setCar(null);
			System.out.println("Dokonano transakcji samochodu");
		} else {
			System.out.println("Błąd przy transakcji samochodu");
		}
	}

	public Car(String producer, String mode, int yearOfProduction) {
        super(producer, mode, yearOfProduction);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

	public Double getFuelAmount () {
		return fuelAmount;
	}

	public void setFuelAmount (Double fuelAmount) {
		if (fuelAmount >= 0.0 && fuelAmount <= fuelCapacity) {
      		this.fuelAmount = fuelAmount;
		} else if(fuelAmount > fuelCapacity) {
      		System.out.println("Więcej się nie zmieści");
		} else {
      		System.out.println("Więcej już tam nie będzie");
		}
	}

	@Override
    public void turnOn() {
        System.out.println("turnOn() Car");
    }

	@Override
	public String toString () {
		return super.toString() + ", price: " + price;
	}
}
