package Lab11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeBonusTester {

	EmployeeBonus eB;

	@Before
	public void newEmployeeBonus()
	{
		eB = new EmployeeBonus();
	}

	@Test
	public void testGetBonusDoubleParamBelowThreshould()
	{
		double sales = 5000.0;
		Assert.assertTrue(0.0 == eB.getBonus(sales));
	}

	@Test
	public void testGetBonusDoubleParamAboveThreshould()
	{
		double sales = 5001.0;
		Assert.assertTrue(sales*0.05 == eB.getBonus(sales));
	}

	@Test
	public void testGetBonusIntParamBelowThreshould()
	{
		int numUnits = 25;
		Assert.assertTrue(100*numUnits == eB.getBonus(numUnits));
	}

	@Test
	public void testGetBonusIntParamAboveThreshould()
	{
		int numUnits = 26;
		Assert.assertTrue(150*numUnits == eB.getBonus(numUnits));
	}

	@Test
	public void testGetBonus2ParamsBelowThreshould()
	{
		int pieces = 700;
		Assert.assertTrue(0.0 == eB.getBonus(pieces, 700));
	}

	@Test
	public void testGetBonus2ParamAboveThreshould()
	{
		int pieces = 701;
		Assert.assertTrue(pieces*0.10 == eB.getBonus(pieces, 700));
	}
}

