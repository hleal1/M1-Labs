package Lab11;

public class Sum {
	
	int _total;
	
	public Sum(int initialValue)
	{
		_total = initialValue;
	}
	/**
	 * Adds an integer to this object's sum
	 * @param number
	 */
	public void add(int number)
	{
		_total += number;
	}
	/**
	 * Returns the sum of all the integers added so far
	 */
	public int getTotal()
	{
		return _total;
	}

}
