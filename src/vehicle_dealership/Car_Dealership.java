package vehicle_dealership;

public class Car_Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer("Micheal","NewYork", 50000);
		Customer cust2 = new Customer("Harish","Bangalore",35000);
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		//cust1.setName("Micheal");
		//cust1.setAddress("Newyork");
		//cust1.setCashOnHand(50000);
		//call employee to check for the car 
		emp1.Employee_Car_check(cust1);
		
		emp2.Employee_Car_check(cust2);
		
		
		

	}

}
