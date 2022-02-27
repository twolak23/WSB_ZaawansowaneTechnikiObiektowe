package zad1.human;
import zad1.*;
import zad1.animal.Animal;

public class Human {
    private Double salary;
    private Animal pet;
    private Car car;

    public Human(Double salary) {
        this.salary = salary;
    }

    public Human(Double salary, Animal pet) {
        this.salary = salary;
        this.pet = pet;
    }

    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        if(salary < 0) {
            System.out.println("Nowa kwota wynagrodzenia jest ujemna");
        } else {
            System.out.println("Ustawiono nową kwotę wynagrodzenia");
            System.out.println("Proszę o odebranie aneksu do umowy od pani Hani z kadr");
            System.out.println("ZUS i US zostali poinformowani zmianie kwoty");
            this.salary = salary;
        }
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
