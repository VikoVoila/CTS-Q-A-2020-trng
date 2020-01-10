package toStringOverriding;

public class Employee {
	
	int empId;
	String empName;
	String compName;
	
	public Employee(int id, String name, String cname) {
		// TODO Auto-generated constructor stub
		this.empId=id;
		this.empName=name;
		this.compName=cname;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", compName=" + compName + "]";
	}
	

}
