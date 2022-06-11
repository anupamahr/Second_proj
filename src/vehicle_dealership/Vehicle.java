package vehicle_dealership;

public class Vehicle {
	
	private String make;
	private String color;
	private double price;
	
			
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void AssignCar() {
	if (price < 30000) {
		make = "Honda";
		color = "white";		
	}
	else if (price > 30000)
	{
		if (price < 50000)
		{
			make = "Toyota";
			color = "grey";
			
		}
		else {
			make = "BMW";
			color = "Any color of your choice";
		}
	}
	
}
}
