package Lab10;

public class Employee {
	
		private int id;
		private String name;
		private double salary;

		public Employee(int id, String name)
		{
			this.id = id;
			this.name = name;
			this.salary = 0;
		}

		public String getName()
		{
			return this.name;
		}

		public int getId()
		{
			return this.id;
		}

		public double getSalary()
		{
			return this.salary;
		}

		public static void increaseSalary(Employee e, double value)
		{
			e.salary += value;
		}
}