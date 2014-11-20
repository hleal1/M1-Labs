package Lab16;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TransformTests
{

	@Test
	public void testTransformations() 
	{
	// Arrange
	SerieTransform u = new SerieTransform("My Transformation", 3);
	u.addTransformation(new AscendingSort());
	u.addTransformation(new Unique());
	u.addTransformation(new Invert());
	int []a = {1,5,6,7,6,8,4,1,5};
	
	// Act & Assert
	Assert.assertEquals("My Transformation: [1, 5, 6, 7, 6, 8, 4, 1, 5] -> [8, 7, 6, 5, 4, 1]", u.executePrint(a));
	}

}
