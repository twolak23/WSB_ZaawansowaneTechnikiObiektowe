package zad1.animal;

public class Animal {
	private final String species;

	private Double weight;
	private int feedCount;
	private int walkCount;

	public Animal(String species) {
		this.species = species;
		switch(species) {
			case "ssak":
				this.weight = 70.00;
				break;
			case "ptak":
				this.weight = 30.00;
				break;
			case "ryba":
				this.weight = 20.00;
				break;
			default:
				this.weight = 0.00;
				break;
		}
		this.feedCount = 0;
		this.walkCount = 0;
	}
	public void feed(Double mass) {
		this.weight = this.weight + (mass / 5);
		if (this.feedCount == 0) {
			System.out.println("Dobre jedzenie");
		} else {
			System.out.println("Nie chce...");
		}
		this.feedCount++;

	}
	public void takeForAWalk(Double meters) {
		this.weight -= (meters / 10);

		if (this.weight < 0) {
            System.out.println("Zwierzę nie żyje :O");
		} else {
            if (this.walkCount == 0) {
                System.out.println("Fajny spacer");
            } else {
                System.out.println("Nie chce...");
            }
		}
		this.walkCount++;
	}
}
