class Employee
{
	int empId;
	String empName;
	int salary;
	
	void setEmpDetails(int empId,String empName,int salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		
		System.out.println(this.empId+" "+this.empName+" "+this.salary);
	}
}

class P55
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.setEmpDetails(101,"Riya",20000);
		
		
	}
}