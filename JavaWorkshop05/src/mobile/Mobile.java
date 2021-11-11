package mobile;

public abstract class Mobile {
	
	private String name;
	private int batterySize;
	private String osType;
	
	
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String name, int batterySize, String osType) {
		super();
		this.name = name;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	// 추상 메소드
	public abstract int operate(int time); 
	public abstract int charge(int time); 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}

}
