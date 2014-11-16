package Lab08;

import java.util.Scanner;
/**
 * Calculates the properties of a cylinder
 * @author Hugo
 *
 */
public class CylinderProperties {
	/**
	 * Receives from an input in the console the value of radius
	 * @return value of radius 
	 */
	public static double specifyRadius() 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Radius: ");
		double rad = input.nextInt();
		return rad;
	}

	/**
	 * Receives from an input in the console the value of height
	 * @return value of height
	 */
	public static double specifyHeight()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Height: ");
		double hgt = input.nextInt();
		return hgt;
	}

	/**
	 * Calculates the base area of a cylinder
	 * @param rad value of radius
	 * @return value of base area
	 */
	public static double calculateBaseArea(double rad) 
	{
		return Math.PI * Math.pow(rad, 2);
	}
	
	/**
	 * Calculates the lateral area of a cylinder
	 * @param rad value of radius
	 * @param hgt value of height
	 * @return value of lateral area
	 */
	public static double calculateLateralArea(double rad, double hgt) 
	{
		return 2 * Math.PI * rad * hgt;
	}

	/**
	 * Calculates the total area of a cylinder (2* base area + lateral area)
	 * @param rad value of radius
	 * @param hgt value of height
	 * @return value of total area
	 */
	public static double calculateTotalArea(double rad, double hgt)
	{
		return 2 * calculateBaseArea(rad) + calculateLateralArea(rad, hgt);
	}

	/**
	 * Calculates the volume of a cylinder
	 * @param rad value of radius
	 * @param hgt value of height
	 * @return value of volume
	 */
	public static double calculateVolume(double rad, double hgt)
	{
		return calculateBaseArea(rad) * hgt;
	}

	public static void main(String[] args) 
	{
		double radius;
		double height;
		double baseArea;
		double lateralArea;
		double totalArea;
		double volume;
		System.out.println("Enter the dimensions of the cylinder");
		radius = specifyRadius();
		height = specifyHeight();
		baseArea = calculateBaseArea(radius);
		lateralArea = calculateLateralArea(radius, height);
		totalArea = calculateTotalArea(radius, height);
		volume = calculateVolume(radius, height);
		System.out.println("\nCylinder Characteristics");
		System.out.println("Radius: " + radius);
		System.out.println("Height: " + height);
		System.out.println("Base Area: " + baseArea);
		System.out.println("Lateral Area: " + lateralArea);
		System.out.println("Total Area: " + totalArea);
		System.out.println("Volume: " + volume);
	}
}

