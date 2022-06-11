package vehicle_dealership;

public class Employee {
	
	private String empName;
	private String empDesignation;
	
	Vehicle veh1 = new Vehicle();
	
	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getEmpDesignation() {
		return empDesignation;
	}



	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}



	public void Employee_Car_check(Customer cust) {
		double price = cust.getCashOnHand();
		veh1.setPrice(price);
		veh1.AssignCar();
		cust.PurchaseCar(veh1);
			
		}
		
		
		
	}


