package sampleInheritance;

public class Agriculture extends Asset {

	public Agriculture(double area, double latitude, double longitude, String type) {
		super(area, latitude, longitude);
		// TODO Auto-generated constructor stub
		this.type= type;
	}
	public void display()
	{

		System.out.println("This is " +type);
	
	}
	

}

