package device;


public abstract class Device {
    private String producer;
    private String mode;
    private String yearOfProduction;

    @Override
    public String toString() {
        return producer + ", " + mode + ", year " + yearOfProduction;
    }

    abstract void turnOn();

}
