package Lab10;

public class AppExercise01 {

	public static void main(String [] args)
	{
		Employee e = new Employee(34, "João");
		e.increaseSalary(e, 1200);
		Employee.increaseSalary(e, 300);
		System.out.println(e.getSalary());
	}
}
