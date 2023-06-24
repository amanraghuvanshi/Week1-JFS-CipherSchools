package Test;
class Employee{
	int EmployeeId;
	int salary;
	String dept;
	
	Employee(int emp,int sal, String d){
		EmployeeId = emp;
		salary = sal;
		dept = d;
		
	}
}

public class Constructor {
	public static void main(String[] args) {
		Employee harsha = new Employee(101,3000,"Testing");
		Employee varsha = new Employee(102,5000,"Engineering");
		
		System.out.println(harsha.EmployeeId +" Salary "+ harsha.salary +" Dept "+ harsha.dept);
		System.out.println(varsha.EmployeeId +" Salary "+ varsha.salary +" Dept "+ varsha.dept);
		
	}
	
	

}
