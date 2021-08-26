package sampleInheritance;

public class Asset {
	double area;
	double latitude;
	double longitude;
	public String type = "default";
	
	public Asset(double area, double latitude, double longitude) {
		super();
		this.area = area;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Asset(String type) {
		super();
		this.type = type;
	}
	public void display()
	{
		System.out.println("Asset class");
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
