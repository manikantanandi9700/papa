package org.emp;

public class Employee extends Company{
private void empName() {
	// TODO Auto-generated method stub
System.out.println("Employee name is Ram");
}
private void empId() {
	// TODO Auto-generated method stub
System.out.println("Employee id is 37");
}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empName();
	e.empId();
	//Company c= new Company();
	e.comName();
	e.comId();
			
}
}
