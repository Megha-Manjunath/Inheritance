package sampleInheritance;

public class Home extends Asset {
	
public Home(double area, double latitude, double longitude, String type) {
		super(area, latitude, longitude);
		// TODO Auto-generated constructor stub
		this.type= type;
}
public void display()
{

	System.out.println("This is " +type);

}

}
