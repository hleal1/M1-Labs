package Lab14;

public class Employee implements Worker, Displayable {
	
	private String empName;
	private String empCompany;
	private boolean employeeWorking = false;

	public Employee (String empName, String empCompany)
	{
		this.empName = empName;
		this.empCompany = empCompany;
	}

	
	@Override
	public boolean startWork() {
		if (employeeWorking)
			return false;
		else
			employeeWorking = true;
			return true;
	}

	@Override
	public boolean stopWork()
	{
		if (employeeWorking)
		{
			employeeWorking = false;
			return true;
		}
		else
			return false;
	}

	public Object getName() 
	{
		return empName;
	}

	public Object getCompany() 
	{
		return empCompany;
	}


	@Override
	public String display() {
		return "[" + empName + "," + empCompany + "]";
	}

}
