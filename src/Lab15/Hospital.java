package Lab15;


public class Hospital {
	
	private HealthProfessional [] hospitalProfessionals;
	
	public Hospital (int numberOfProfessionals)
	{
		hospitalProfessionals = new HealthProfessional[numberOfProfessionals];
	}

	int i = 0;
	
	public boolean addProfessional(HealthProfessional professional) 
	{
		if (i < hospitalProfessionals.length)
		{
			hospitalProfessionals[i] = professional;
			i++;
			return true;
		}
		else
			return false;
	}

}
