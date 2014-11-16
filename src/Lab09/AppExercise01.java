package Lab09;
/**
 * 1 - Creation of two objects of type Shirt s and s1
 * 2 - set size XL in shirt s1
 * 3 - s1 = s ("blue" , "M") s1 and s are the same object
 * 4 - s = s1 = ("red" , "XL")
 * 5 - s1 = s = ("red", "S")
 * @author Hugo
 *
 */
public class AppExercise01 {
	public static void main(String[] args)
	{
		Shirt s = new Shirt("blue", "M");
		Shirt s1 = new Shirt("yellow", "L");
		s1.setSize("XL");
		s1 = s;
		s.setColor("red");
		s1.setSize("S");
		System.out.println(s.print());
		System.out.println(s1.print());
	}
}
