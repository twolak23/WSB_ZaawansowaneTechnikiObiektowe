import zad1.*;
import zad1.animal.*;
import zad1.human.*;

public class Main {

    public static void main(String[] args) {
        //zad 0
        Car car = new Car("Mercedes-Benz", "S-Class", 2011);
        car.turnOn();

        Phone phone = new Phone("Motorola", "ZX-23183", 2015);
        phone.turnOn();

        Human human1 = new Human(3000.00);

        // zad1
        Animal animal = new Animal("ptak");
        human1.setPet(animal);
        animal.feed(12.6);
        animal.feed(12.0);
        animal.takeForAWalk(150.0);
        animal.takeForAWalk(13.0);
        animal.takeForAWalk(10000.0);
        System.out.println();

        // zad2
        human1.setCar(car);
        System.out.println(human1.getCar());
        System.out.println();
        // zad3
        human1.setSalary(2000.00);
        System.out.println(human1.getSalary());
        human1.setSalary(2500.0);
        System.out.println(human1.getSalary());
        System.out.println(human1.getSalaryHistoryDisplayList());
    }
}
