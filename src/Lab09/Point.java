package Lab09;

public class Point {
	private double xcoord;
	private double ycoord;
	
	public Point(double xc, double yc)
	{
		this.xcoord = xc;
		this.ycoord = yc;
	}
	
	public void addAPointToThePoint(Point p)
	{
	this.xcoord += p.xcoord;
	this.ycoord += p.ycoord;
	}

	public boolean isTheSamePoint(Point p)
	{
		if ( xcoord == p.xcoord || ycoord == p.ycoord )
				return true;
			else
				return false;
	}
	
	public boolean haveTheSameAbscissa(Point p)
	{
		if (xcoord == p.xcoord)
			return true;
		else
			return false;
	}
	
	public boolean haveTheSameOrdinate(Point p)
	{
		if (ycoord == p.ycoord)
			return true;
		else
			return false;
	}
	
	public Point getBetweenPoint(Point p)
	{
		double xcoord = (this.xcoord + p.xcoord) / 2;
		double ycoord = (this.ycoord + p.ycoord) / 2;
		
		return new Point(xcoord, ycoord);
	}
}


