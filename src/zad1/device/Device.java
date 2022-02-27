package zad1.device;


public abstract class Device {
    private final String producer;
    private final String model;
    private int yearOfProduction;

    public Device(String producer, String model, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return producer + ", " + model + ", year " + yearOfProduction;
    }

    public abstract void turnOn();

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
