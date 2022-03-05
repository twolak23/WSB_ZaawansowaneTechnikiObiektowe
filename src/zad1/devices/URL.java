package zad1.devices;

public class URL {
	private String appName;
	private String version;
	private String appAddress;

	public URL (String appName, String version, String appAddress) {
		this.appName = appName;
		this.version = version;
		this.appAddress = appAddress;
	}

	public String getAppName () {
		return appName;
	}

	public void setAppName (String appName) {
		this.appName = appName;
	}

	public String getVersion () {
		return version;
	}

	public void setVersion (String version) {
		this.version = version;
	}

	public String getAppAddress () {
		return appAddress;
	}

	public void setAppAddress (String appAddress) {
		this.appAddress = appAddress;
	}
}
