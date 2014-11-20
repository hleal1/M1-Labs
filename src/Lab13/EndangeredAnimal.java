package Lab13;

public class EndangeredAnimal extends Animal{

	private int totalOfAnimals;
	
	public EndangeredAnimal(String type, String name, boolean pet, int totalOfAnimals)
	{
		super(type, name, pet);
		this.totalOfAnimals = totalOfAnimals;
	}
	@Override
	public String print()
	{
	return this.type.toUpperCase() + ": {ENDANGERED ANIMAL --> Name: " + this.name + ""
			+ "; Total of Animals: " + this.totalOfAnimals + "}";

	}
}


