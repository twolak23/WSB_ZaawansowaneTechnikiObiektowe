package zad1;

public class Phone extends zad1.device.Device {


    public Phone(String producer, String mode, int yearOfProduction) {
        super(producer, mode, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("turnOn() Phone");
    }
}
