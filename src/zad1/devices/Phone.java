package zad1.devices;

public class Phone extends zad1.devices.Device {


    public Phone(String producer, String mode, int yearOfProduction) {
        super(producer, mode, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("turnOn() Phone");
    }

	@Override
	public String toString () {
		return super.toString();
	}
}
