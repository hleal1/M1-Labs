package Lab09;

public class Shirt {
	
	private String color;
	private String size;

	public Shirt(String color, String size) 
	{
		this.color = color;
		this.size = size;
	}
	
	/**
	 * Returns shirt color
	 * @return shirt color
	 */
	public String getColor()
	{
		return color;
	}
	/**
	 * Returns shirt size
	 * @return shirt size
	 */
	public String getSize() 
	{
		return size;
	}
	/**
	 * Defines a new shirt color
	 * @param color new color
	 */
	public void setColor(String color) 
	{
		this.color = color;
	}
	/**
	 * Defines a new shirt size
	 * @param size new size
	 */
	public void setSize(String size)
	{
		this.size = size;
	}
	
	/**
	 * Returns the shirt color and size
	 * @return
	 */
	public String print() 
	{
		return this.color + " " + this.size;
	}
}
