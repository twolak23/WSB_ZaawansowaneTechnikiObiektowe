package zad1.devices;

import zad1.creatures.*;

import java.util.*;

public abstract class Car extends Device {

    protected Double price;
    protected Double fuelAmount;
    protected Double fuelCapacity;
    protected List<Human> ownerList = new ArrayList<>();


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
	public void sell(Human seller, Human buyer, Double price) {
		int sellerGaragePosition = -1;
		int buyerGaragePosition = -1;
		for (int i = 0; i < seller.getGarage().length; i++){
			if (this.equals(seller.getGarage()[i])) {
				sellerGaragePosition = i+1;
				i = seller.getGarage().length;
			}
		}
		for (int i = 0; i < buyer.getGarage().length; i++){
			if (buyer.getGarage()[i] == null) {
				buyerGaragePosition = i+1;
				i = buyer.getGarage().length;
			}
		}
		try {
		if(sellerGaragePosition == -1) {
			throw new Exception("Brak samochodu u sprzedającego");
		}
		if(buyerGaragePosition == -1) {
			throw new Exception("Brak miejsca w garazu dla kupującego");
		}

		if (buyer.getCash() >= price) {
			if(!seller.equals(this.getOwnerList().get(this.getOwnerList().size()-1))) {
				throw new Exception("Sprzedawca sprzedaje kradziony samochód!");
			}
			seller.setCash(seller.getCash() + price);
			buyer.setCash(buyer.getCash() - price);
      		buyer.setCar(this, buyerGaragePosition);
      		seller.setCar(null, sellerGaragePosition);
      		this.ownerList.add(buyer);
			System.out.println("Dokonano transakcji samochodu");
		} else {
			throw new Exception("Brak gotówki u kupującego");
		}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public boolean hasAnyOwner() {
		return !this.ownerList.isEmpty();
	}

	public boolean isCarSold(Human seller, Human buyer) {
		return (ownerList.indexOf(seller) == ownerList.indexOf(buyer) - 1) && (ownerList.indexOf(buyer) > 0);
	}

	public int transactionsCount() {
		return ownerList.size() - 1;
	}

	public Human getCurrentOwner() {
		return ownerList.get(ownerList.size() - 1);
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

	public List<Human> getOwnerList () {
		return ownerList;
	}

	public void setOwnerList (List<Human> ownerList) {
		this.ownerList = ownerList;
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
