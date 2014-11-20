package Lab15;

public class Doctor implements HealthProfessional, Person {

	private String name;
	
	public Doctor (String name)
	{
		this.name = name;
	}
	
	@Override
	public String care() 
	{
		return "Dr. " + name + " is treating the patient.";
	}

	@Override
	public String getName() 
	{
		return name;
	}

}
