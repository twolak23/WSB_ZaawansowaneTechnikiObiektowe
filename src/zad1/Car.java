package zad1;

import zad1.device.Device;

public class Car extends Device {

    public Car(String producer, String mode, int yearOfProduction) {
        super(producer, mode, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("turnOn() Car");
    }
}
