package day_8;

public class Service {
	public static void main(String[] args) {
		
	
	Employee emp = new Employee();
	EmployeeService s = new EmployeeServiceImpl();
	
	s.getEmployeeDetails(emp);
	s.findInsuranceScheme(emp);
	s.displayEmployee(emp);
	}

}
