import zad1.animal.*;
import zad1.devices.*;
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
		System.out.println();
		System.out.println("Zad 1");

		Animal animal = new Animal("ptak");
        human1.setPet(animal);
        animal.feed(12.6);
        animal.feed(12.0);
        animal.takeForAWalk(150.0);
        animal.takeForAWalk(13.0);
        animal.takeForAWalk(10000.0);
        System.out.println();

        // zad2
		System.out.println();
		System.out.println("Zad2");

		car.setPrice(10000.0);
        human1.setCar(car);
        System.out.println(human1.getCar());
        System.out.println();
        // zad3&4
		System.out.println();
		System.out.println("Zad 3&4");

		human1.setSalary(2000.00);
        System.out.println(human1.getSalary());
        human1.setSalary(2500.0);
        System.out.println(human1.getSalary());
		System.out.println();

        System.out.println(human1.getSalaryHistoryDisplayList());
		System.out.println();

		// zad 5
		System.out.println();
		System.out.println("Zad 5");

        Car car1 = new Car("BMW", "Z4", 2016, 5000.0);

        Human human = new Human();
        human.setSalary(4000.0);
        human.setCar(car1);

        car1.setPrice(2000.0);
        human.setCar(car1);

        car1.setPrice(1200000.0);
        human.setCar(car1);

        //zad 6
		System.out.println();
		System.out.println("Zad 6");

		Car car2 = new Car("BMW", "Z4", 2016, 5000.0);
        System.out.println("car1 == car2 (equals): " + car1.equals(car2));
        System.out.println("car1 == car2 (hashCode)" + (car1.hashCode() == car2.hashCode()));
        System.out.println(car1);
        System.out.println(car2);
        // zad 7 - w sumie zostało tez zrobione :)

    }
}
