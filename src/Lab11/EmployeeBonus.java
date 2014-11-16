package Lab11;

import java.util.Scanner;

public class EmployeeBonus 
{
	public double getBonus(double sales) 
	{
		if (sales > 5000)
			return sales * 0.05;
		else
			return 0;
	}

	public double getBonus(int numUnits) 
	{
		if (numUnits > 25)
			return 150 * numUnits;
		else
			return 100 * numUnits;
	}

	public double getBonus(int pieces, double bonus) 
	{
		if (pieces > bonus)
			return pieces * 0.10;
		else
			return 0.0;
	}

	final static int UNITS_PT = 250;
	final static int UNITS_FT = 700;

	public static void main(String[] args) 
	{
		Scanner kbd = new Scanner(System.in);
		EmployeeBonus b = new EmployeeBonus();
		System.out.println("Enter department: ");
		int dept = kbd.nextInt();
		double bonus = 0;
		switch (dept) {
		case 1:
			System.out.print("Enter sales: ");

			double sales = kbd.nextDouble();

			bonus = b.getBonus(sales);

			break;

		case 2:
			System.out.print("Enter number of units produced: ");

			int numUnits = kbd.nextInt();

			bonus = b.getBonus(numUnits);

			break;

		case 3:
			System.out.print("Enter # of pieces completed: ");

			int pieces = kbd.nextInt();

			System.out.print("Full-time (1) or Part-Time (2)? ");

			int empType = kbd.nextInt();

			int bonusLimit = (empType == 1) ? UNITS_FT : UNITS_PT;

			bonus = b.getBonus(pieces, bonusLimit);

			break;

		default:
			System.out.print("Error! ");
		}
		System.out.println("Bonus Amount: " + bonus);
	}

}
