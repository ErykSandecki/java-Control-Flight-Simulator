package Control_Flight_Simulator_Calculations;

import java.util.Random;

public class Random_Heading_To_Position_Start 
{
	private int random;
	
	private Random _Random = new Random();
	
	public Random_Heading_To_Position_Start()
	{
		random = 1 + _Random.nextInt(360);
	}
	
	public int Get_Random()
	{
		return random;
	}
	
	public int set_X()
	{
		if ((random > 44) && (random < 136))
		{
			return 0;
		}
		
		else if ((random > 135) && (random < 225))
		{
			return 10 + _Random.nextInt(991);
		}
		
		else if ((random > 224) && (random < 315))
		{
			return 1000;
		}
		
		else
		{
			return 10 + _Random.nextInt(991);
		}
	}
	
	public int set_Y()
	{
		if ((random > 44) && (random < 136))
		{
			return 10 + _Random.nextInt(991);
		}
		
		else if ((random > 135) && (random < 225))
		{
			return 0;
		}
		
		else if ((random > 224) && (random < 315))
		{
			return 10 + _Random.nextInt(991);
		}
		
		else
		{
			return 1000;
		}
	}
}
