package zad1.devices;

import zad1.creatures.*;

public class Car extends Device {

    private Double price;

    public Car(String producer, String model, int yearOfProduction, Double price) {
        super(producer, model, yearOfProduction);
        this.price = price;
    }

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

    @Override
    public void turnOn() {
        System.out.println("turnOn() Car");
    }

	@Override
	public String toString () {
		return super.toString() + ", price: " + price;
	}
}
