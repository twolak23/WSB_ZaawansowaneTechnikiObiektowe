package zad1.human;

import zad1.*;
import zad1.animal.*;
import zad1.devices.*;

import java.util.*;

public class Human {
    private Double salary;
    private Animal pet;
    private Car car;
    private List<HumanSalaryHistory> salaryHistoryDisplayList = new ArrayList<>();

    public Human() { }

    public Human(Double salary) {
        this.salary = salary;
    }

    public Human(Double salary, Animal pet) {
        this.salary = salary;
        this.pet = pet;
    }

    public Double getSalary() {
        salaryHistoryDisplayList.add(new HumanSalaryHistory(new Date(), salary));
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

	@Override
	public String toString () {
		return "Human{" +
					   "Wypłata: " + salary +
					   ", Zwierzak: " + (pet == null ? "Brak" : pet) +
					   ", Samochód: " + (car == null ? "Brak" : car) +
					   '}';
	}

	// region getters & setters
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
        if(car != null) {
	        if(car.getPrice() < salary) {
        	    System.out.println("Udało sie kupic za gotówkę");
    	        this.car = car;
	        }
        	else if (car.getPrice() > (salary / 12)) {
    	        System.out.println("Udało się kupić, ale na kredyt");
	            this.car = car;
        	}
        	else {
            	System.out.println("Sorry, nie stać cię :)");
        	}
        }
    }

    public String getSalaryHistoryDisplayList() {
        StringBuilder builder = new StringBuilder();
        builder.append("Historia pobrania danych o wypłacie: \n");
        int i = 1;
        for (HumanSalaryHistory history : salaryHistoryDisplayList) {
            builder.append(i).append(". ");
            builder.append(history);
            i++;
        }
        return builder.toString();
    }

    //endregion
}
