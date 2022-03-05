import zad1.creatures.*;
import zad1.devices.*;

public class Main {

    public static void main(String[] args) {
        //zad 0
        Car car = new Car("Mercedes-Benz", "S-Class", 2011);
        car.turnOn();

        Phone phone = new Phone("Motorola", "ZX-23183", 2015);
        phone.turnOn();

        Human human1 = new Human(3000.00);

        // zad1
		System.out.println("\nZad 1");

		Pet animal = new Pet("ptak");
        human1.setPet(animal);
        animal.feed(12.6);
        animal.feed(12.0);
        animal.takeForAWalk(150.0);
        animal.takeForAWalk(13.0);
        animal.takeForAWalk(10000.0);
        System.out.println();

        // zad2
		System.out.println("\nZad2");

		car.setPrice(10000.0);
        human1.setCar(car);
        System.out.println(human1.getCar());
        System.out.println();
        // zad3&4
		System.out.println("\nZad 3&4");

		human1.setSalary(2000.00);
        System.out.println(human1.getSalary());
        human1.setSalary(2500.0);
        System.out.println(human1.getSalary());
		System.out.println();

        System.out.println(human1.getSalaryHistoryDisplayList());
		System.out.println();

		// zad 5
		System.out.println("\nZad 5");

        Car car1 = new Car("BMW", "Z4", 2016, 5000.0);

        Human human = new Human();
        human.setSalary(4000.0);
        human.setCar(car1);

        car1.setPrice(2000.0);
        human.setCar(car1);

        car1.setPrice(1200000.0);
        human.setCar(car1);

        //zad 6
		System.out.println("\nZad 6");

		Car car2 = new Car("BMW", "Z4", 2016, 5000.0);
        System.out.println("car1 == car2 (equals): " + car1.equals(car2));
        System.out.println("car1 == car2 (hashCode)" + (car1.hashCode() == car2.hashCode()));
        System.out.println(car1);
        System.out.println(car2);
    	// zad 7 - w sumie zostało tez zrobione :)

    	// zad8
    	System.out.println("\nZad 8 ");
		human.setCash(100000.0);
    	// telefon
		human1.setCash(160000.0);
		human1.setPhone(phone);
		human1.getPhone().sell(human1, human, 50.0);
    	System.out.println(human1.getPhone() == null ? "human 1 sprzedał telefon" : "human1 tanio fona nie sprzeda :)");
		// samochód
		car1.setPrice(8000.0);
		human.setCar(car1);
    	car1.sell(human, human1, car1.getPrice());
    	car2.sell(human, human1, 3000.0); // powinien wyjść błąd
		System.out.println(human.getCar() == null ? "human sprzedał samochód" : "human tanio auta nie sprzeda :)");
		// zwierzęta
		Animal pet = new Pet("ryba");
		human.setPet(pet);
		pet.sell(human, human1, 30.0);
		System.out.println(human.getPet() == null ? "human sprzedał rybę" : "human tanio ryby nie sprzeda :)");

    	// zad 9
		System.out.println(pet.getDefaultFoodWeight());
		System.out.println(pet.getWeight());
		pet.feed();
		System.out.println(pet.getWeight());


    }
}
