package Lab15;

public class Nurse implements HealthProfessional, Person {
	
	private String name;

	public Nurse (String name)
	{
		this.name = name;
	}
	
	@Override
	public String care() 
	{
		return "Nurse " + name + " is caring for a patient.";
	}

	@Override
	public String getName()
	{
		return name;
	}

}
