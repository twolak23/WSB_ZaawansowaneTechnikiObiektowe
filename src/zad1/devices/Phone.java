package zad1.devices;

import zad1.creatures.*;

import java.util.*;

public class Phone extends Device {

	static final String DEFAULT_APP_ADDRESS = "https://www.google.com/";
	static final String DEFAULT_APP_PROTOCOL = "test_protocol";
	static final String DEFAULT_APP_VERSION = "1.0";

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
}
