package zad1.creatures;

public abstract class Animal implements Sellable, Feedable {
	private final String species;

	private Double weight;
	private int feedCount;
	private int walkCount;
	private Double defaultFoodWeight;

	public Animal(String species) {
		this.species = species;
		switch(species) {
			case "ssak":
				this.weight = 70.00;
				this.defaultFoodWeight = 10.0;
				break;
			case "ptak":
				this.weight = 30.00;
				this.defaultFoodWeight = 5.0;
				break;
			case "ryba":
				this.weight = 20.00;
				this.defaultFoodWeight = 2.0;
				break;
			default:
				this.weight = 5.00;
				this.defaultFoodWeight = 1.0;
				break;
		}
		this.feedCount = 0;
		this.walkCount = 0;
	}
	@Override
	public void feed(Double foodWeight) {
		this.weight = this.weight + (foodWeight / 5);
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

	@Override
	public void sell(Human seller, Human buyer, Double price) {
		if (seller.getPet() == this && buyer.getCash() >= price) {
			seller.setCash(seller.getCash() + price);
			buyer.setCash(buyer.getCash() - price);
			buyer.setPet(this);
			seller.setPet(null);
			System.out.println("Dokonano transakcji zwierzaka");
		} else {
			System.out.println("Błąd przy transakcji zwierzaka");
		}
	}

	@Override
	public String toString() {
		return "Species: " + species + '\'' +
					   ", Weight: " + weight +
					   ", Times feeded: " + feedCount +
					   ", Times on a walk: " + walkCount;
	}

	@Override
	public void feed() {
		this.feed(defaultFoodWeight);
	}

	public String getSpecies () {
		return species;
	}

	public Double getWeight () {
		return weight;
	}

	public void setWeight (Double weight) {
		this.weight = weight;
	}

	public int getFeedCount () {
		return feedCount;
	}

	public void setFeedCount (int feedCount) {
		this.feedCount = feedCount;
	}

	public int getWalkCount () {
		return walkCount;
	}

	public void setWalkCount (int walkCount) {
		this.walkCount = walkCount;
	}

	public Double getDefaultFoodWeight () {
		return defaultFoodWeight;
	}

	public void setDefaultFoodWeight (Double defaultFoodWeight) {
		this.defaultFoodWeight = defaultFoodWeight;
	}
}
