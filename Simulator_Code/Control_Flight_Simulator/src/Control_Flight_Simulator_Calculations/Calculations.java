package Control_Flight_Simulator_Calculations;

public class Calculations 
{
	public double Solution_Time_Way(int Knots)
	{
		return 50 / (1.0 * 36000 / Knots);
	}
	
	public double Solution_Angle_Speed(int Knots)
	{
		return 50 / (1.0 * 3600 / Knots);
	}
}
