package Control_Flight_Simulator_Calculations;

public class Move_Degress 
{
	private double x, y;
	
	public double Solution_Degress_x(int Heading)
	{
		x = Math.sin(Math.toRadians(Heading));
		
		return x;
	}
	
	public double Solution_Degress_y(int Heading)
	{
		y = Math.cos(Math.toRadians(Heading));
		
		return y;
	}
}
