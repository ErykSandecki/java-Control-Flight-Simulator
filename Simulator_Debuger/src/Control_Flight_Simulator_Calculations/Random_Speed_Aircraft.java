package Control_Flight_Simulator_Calculations;

import java.util.Random;

public class Random_Speed_Aircraft
{
	private int random;
	
	private Random _Random = new Random();
	
	public Random_Speed_Aircraft(int Random)
	{
		if(Random == 1)
		{
			random = 160 + _Random.nextInt(80);
		}
		
		else if (Random == 2)
		{
			random = 160 + _Random.nextInt(51);
		}
		
		else
		{
			random = 120 + _Random.nextInt(51);
		}
	}
	
	public int Speed()
	{
		return random;
	}
}
