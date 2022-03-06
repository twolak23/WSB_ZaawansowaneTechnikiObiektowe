package zad1.devices;


import zad1.creatures.*;

public abstract class Device implements Sellable {
    protected final String producer;
	protected final String model;
	protected int yearOfProduction;

    public Device(String producer, String model, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return producer + " " + model + ", year " + yearOfProduction;
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
