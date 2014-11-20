package Lab15;

public class Helper implements HealthProfessional, Person {

	private String name;

	public Helper (String name)
	{
		this.name = name;
	}

	@Override
	public String care()
	{
		return "Helper " + name + " is preparing the patient's lunch.";
	}

	@Override
	public String getName() 
	{
		return name;
	}
}
