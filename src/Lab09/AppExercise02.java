package Lab09;

public class AppExercise02 {
	
	public static void main(String[] args) 
	{
		StringUtils su = new StringUtils();
		System.out.println(su.countLetters("Challenge", 'l'));
		System.out.println(su.exists("Formação Randstad", "stad"));
		System.out.println(su.sort("exhjevsa"));
		System.out.println(su.cutFrom("Java Programming", 5, 12));
	}
}
