package zad1.devices;

import zad1.*;
import zad1.creatures.*;

import java.util.*;
import java.util.stream.*;

public class Phone extends Device {

	static final String DEFAULT_APP_ADDRESS = "https://www.google.com/";
	static final String DEFAULT_APP_PROTOCOL = "test_protocol";
	static final String DEFAULT_APP_VERSION = "1.0";

	private List<Application> installedAppsList = new ArrayList<>();
	private Human owner;

    public Phone(String producer, String mode, int yearOfProduction) {
        super(producer, mode, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("turnOn() Phone");
    }

	@Override
	public void sell(Human seller, Human buyer, Double price) {
		if (seller.getPhone() == this && buyer.getCash() >= price) {
			seller.setCash(seller.getCash() + price);
			buyer.setCash(buyer.getCash() - price);
			buyer.setPhone(this);
			seller.setPhone(null);
      		System.out.println("Dokonano transakcji telefonu");
		} else {
			System.out.println("Błąd przy transakcji telefonu");
		}
	}

	@Override
	public String toString () {
		return super.toString();
	}

	public void installAnApp(String appName) {
    	System.out.println("Zainstalowano aplikację '" + appName + "' w wersji " + DEFAULT_APP_VERSION + " z adresu " + DEFAULT_APP_ADDRESS + ".");
	}

	public void installAnApp(String appName, String version) {
    	System.out.println("Zainstalowano aplikację '" + appName + "' w wersji " + version + " z adresu " + DEFAULT_APP_ADDRESS + ".");
	}
	public void installAnApp(String appName, String version, String address) {
		System.out.println("Zainstalowano aplikację '" + appName + "' w wersji " + version + " z adresu" + address + ".");
	}
	public void installAnApp(List<String> appNameList) {
    	appNameList.forEach(this::installAnApp);
	}
	public void installAnApp(URL url) {
    	this.installAnApp(url.getAppName(), url.getVersion(), url.getAppAddress());
	}

	public void installAnApp(Application app) {
        if(owner != null && owner.getCash() >= app.getPrice()){
	        System.out.println("Zainstalowano aplikację " + app.getName());
	        installedAppsList.add(app);
	        owner.setCash(owner.getCash() - app.getPrice());
        }
	}

	public boolean isAppInstalled(Application app) {
		return this.getInstalledAppsList().contains(app);
	}
	public boolean isAppInstalled(String appName) {
		return this.getInstalledAppsList().stream().map(Application::getName).collect(Collectors.toList()).contains(appName);
	}

	public void printFreeApps() {
		List<String> sortedAppNames = installedAppsList.stream().filter(x -> x.getPrice() == 0.0).map(Application::getName).sorted().collect(Collectors.toList());
		StringJoiner joiner = new StringJoiner(", ");
		for(String name : sortedAppNames) {
			joiner.add(name);
		}
		System.out.println("Zainstalowane bezpłatne aplikacje: " + joiner);
	}

	public Double getInstalledAppsTotalPrice() {
    	return this.installedAppsList.stream().map(Application::getPrice).reduce(0.0, Double::sum);
	}

	public void printInstalledAppsNamesAlphabetically() {
    	List<String> sortedAppNames = installedAppsList.stream().map(Application::getName).sorted().collect(Collectors.toList());
    	StringJoiner joiner = new StringJoiner(", ");
    	for(String name : sortedAppNames) {
    		joiner.add(name);
	    }
        System.out.println("Zainstalowane aplikacje alfabetycznie: " + joiner);
	}

	public void printInstalledAppsFromCheapest() {
    List<String> sortedAppNames =
        installedAppsList.stream()
            .sorted(Comparator.comparing(Application::getPrice))
            .map(Application::getName)
            .collect(Collectors.toList());
		StringJoiner joiner = new StringJoiner(", ");
		for(String name : sortedAppNames) {
			joiner.add(name);
		}
		System.out.println("Zainstalowane aplikacje od najtańszego: " + joiner);
	}
	public List<Application> getInstalledAppsList () {
		return installedAppsList;
	}

	public void setInstalledAppsList (List<Application> installedAppsList) {
		this.installedAppsList = installedAppsList;
	}

	public Human getOwner () {
		return owner;
	}

	public void setOwner (Human owner) {
		this.owner = owner;
	}
}
