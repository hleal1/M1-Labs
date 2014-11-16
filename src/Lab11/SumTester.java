package Lab11;

import static org.junit.Assert.*;

public class SumTester {
	/**
	 * Verifies positive numbers additions.
	 */
	public void testPositiveNumbers() 
	{
		Sum s = new Sum(0);
		s.add(103);
		s.add(201);
		s.add(123);
		assertEquals(427, s.getTotal());
	}
	/**
	 * Verifies negative numbers additions
	 */
	public void testNegativeNumbers() 
	{
		Sum s = new Sum(0);
		s.add(-10);
		s.add(-20);
		s.add((int)Math.pow(-10,2));
		assertEquals(70, s.getTotal());
	}
	/**
	 * Verifies if the total is zero
	 */
	public void testZeros() {
		Sum s = new Sum(0);
		s.add(40/2);
		s.add(-20);
		assertEquals(0, s.getTotal());
	}
}

