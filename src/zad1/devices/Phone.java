package zad1.devices;

import zad1.creatures.*;

public class Phone extends Device {


    public Phone(String producer, String mode, int yearOfProduction) {
        super(producer, mode, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("turnOn() Phone");
    }

	@Override
	public void sell(Human seller, Human buyer, Double price) {
		if (seller.getPhone() == this && buyer.getCash() >= price) {
			seller.setCash(seller.getCash() + price);
			buyer.setCash(buyer.getCash() - price);
			buyer.setPhone(this);
			seller.setPhone(null);
      		System.out.println("Dokonano transakcji telefonu");
		} else {
			System.out.println("Błąd przy transakcji telefonu");
		}
	}

	@Override
	public String toString () {
		return super.toString();
	}
}
