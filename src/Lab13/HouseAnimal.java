package Lab13;

public class HouseAnimal extends Animal {
	public HouseAnimal(String type, String name) 
	{
		super(type, name, true);
	}
	
	
	@Override
	public String print() 
	{
	return this.type.toUpperCase() + ": {HOUSE ANIMAL --> Name: " + this.name + "}";
	}
}
