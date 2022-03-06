package zad1.creatures;

import zad1.*;
import zad1.devices.*;

import java.util.*;

public class Human {
    private Double salary;
    private Animal pet;
    private Car[] garage = new Car[0];
    private List<HumanSalaryHistory> salaryHistoryDisplayList = new ArrayList<>();
    private Double cash;
    private Phone phone;

    public Human() { }

	public Human(Double salary) {
		this.salary = salary;
	}
	public Human(int garageSize) {
		this.garage = new Car[garageSize];
	}

	public Human(Double salary, Animal pet) {
		this.salary = salary;
		this.pet = pet;
	}
	public Human(Double salary, int garageSize) {
		this.salary = salary;
		this.garage = new Car[garageSize];
	}

	public Human(Double salary, Animal pet, int garageSize) {
		this.salary = salary;
		this.pet = pet;
		this.garage = new Car[garageSize];
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
					   '}';
	}

	// region getters & setters
    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Car getCar(int garagePosition) {
        return garage[garagePosition - 1];
    }

    public void setCar(Car car, int garagePosition) {
        if(car != null) {
	        if(car.getPrice() < salary) {
        	    System.out.println("Udało sie kupic za gotówkę");
		        addCarToGarage(car, garagePosition);
	        }
        	else if (car.getPrice() > (salary / 12)) {
    	        System.out.println("Udało się kupić, ale na kredyt");
		        addCarToGarage(car, garagePosition);
        	}
        	else {
            	System.out.println("Sorry, nie stać cię :)");
        	}
        } else {
	        addCarToGarage(car, garagePosition);
        }
    }

    public void addCarToGarage(Car car, int garagePosition) {
	    if(garagePosition > garage.length) {
		    System.out.println("Nie ma takiego miejsca w garażu");
	    } else {
		    this.garage[garagePosition - 1] = car;
		    if (car != null) {
                car.getOwnerList().add(this);
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

	public Double getCash () {
    	this.salaryHistoryDisplayList.add(new HumanSalaryHistory(new Date(), cash));
		return cash;
	}

	public void setCash (Double cash) {
		this.cash = cash;
	}

	public Phone getPhone () {
		return phone;
	}

	public void setPhone (Phone phone) {
		this.phone = phone;
	}

	public Car[] getGarage () {
		return garage;
	}

	public void setGarage (Car[] garage) {
		this.garage = garage;
	}
	//endregion
}
