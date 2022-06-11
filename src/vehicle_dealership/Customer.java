package vehicle_dealership;

public class Customer {
	
	private String name;
	private String Address;
	private double CashOnHand;
	
	
	public Customer(String name, String address, double cashOnHand) {
		super();
		this.name = name;
		Address = address;
		CashOnHand = cashOnHand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getCashOnHand() {
		return CashOnHand;
	}
	public void setCashOnHand(double cashOnHand) {
		CashOnHand = cashOnHand ;
	}
	
	public void PurchaseCar(Vehicle vehicle) {
		
		
		if (vehicle.getMake() == "Honda") {
			System.out.println("i will buy it!");
			System.out.println("i am :" + name);
			System.out.println("buying the car : "+ vehicle.getMake());
			System.out.println("for the price :"+ vehicle.getPrice());
			
		} else if (vehicle.getMake() == "Toyota") {
			System.out.println("Not interested!");
			System.out.println("i am :" + name);
			System.out.println("buying the car : "+ vehicle.getMake());
			System.out.println("for the price :"+ vehicle.getPrice());
			
		}
		else if (vehicle.getMake() == "BMW") {
			System.out.println("Lets go for a long drive...");
			System.out.println("i am :" + name);
			System.out.println("buying the car : "+ vehicle.getMake());
			System.out.println("for the price :"+ vehicle.getPrice());
		}
		
	}

}
