package zad1.devices;

public class Car extends Device {

    private Double price;

    public Car(String producer, String model, int yearOfProduction, Double price) {
        super(producer, model, yearOfProduction);
        this.price = price;
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
