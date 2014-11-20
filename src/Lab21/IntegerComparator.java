package Lab21;

import java.util.Comparator;

/**
 * Class that compares two Integers, if i1 is lower than i2, returns -1, else if i1 equals i2 returns 0 else returns 1
 * @author Hugo
 *
 */
public class IntegerComparator implements Comparator<Integer>{
	
	@Override
	public int compare(Integer i1, Integer i2)
	{
		return (i1 < i2) ? -1 : (i1==i2) ? 0 : 1;
	}
}


