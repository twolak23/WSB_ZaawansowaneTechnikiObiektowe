package zad1;

import zad1.device.Device;

public class Car extends Device {

    private Double price;

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
}
