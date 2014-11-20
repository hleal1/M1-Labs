package Lab13;

public class App {

	public static void main(String [] args)
	{
		//Animal cat = new Animal("Cat", "Fusca", true);
		//Animal bear = new Animal("Bear", "Teddy", false);
		WildlifeAnimal lion = new WildlifeAnimal("Lion", "Simba", 4);
		Tiger tiger = new Tiger("Raja");
		Chinchilla chin = new Chinchilla("Spooky");
		Animal panda = new EndangeredAnimal("Panda", "Su Lin",false, 268 );
		//System.out.println(cat.print());
		//System.out.println(bear.print());
		System.out.println(lion.print());
		System.out.println(tiger.print());
		System.out.println(chin.print());
		System.out.println(panda.print());
	}
}

