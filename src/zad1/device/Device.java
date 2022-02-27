package zad1.device;


public abstract class Device {
    private String producer;
    private String mode;
    private int yearOfProduction;

    public Device(String producer, String mode, int yearOfProduction) {
        this.producer = producer;
        this.mode = mode;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return producer + ", " + mode + ", year " + yearOfProduction;
    }

    public abstract void turnOn();

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
