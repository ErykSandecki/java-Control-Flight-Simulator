package Control_Flight_Simulator_Calculations;

import java.util.Random;

public class Random_Altitude 
{
	private int Random;
	
	private Random _Random = new Random();
	
	public Random_Altitude(int Random, double x , double y)
	{
		if(Random == 1)
		{
			if(x<500)
			{
				this.Random =  1400+ _Random.nextInt(3500);
			}
			
			else
			{
				this.Random =  3300+ _Random.nextInt(3500);
			}
		}
		
		else if (Random == 2)
		{
			if(x<500)
			{
				this.Random =  1400+ _Random.nextInt(2900);
			}
			
			else
			{
				this.Random =  3300+ _Random.nextInt(2900);
			}
		}
		
		else
		{
			if(x<500)
			{
				this.Random =  1400+ _Random.nextInt(1600);
			}
			
			else
			{
				this.Random =  3300+ _Random.nextInt(1600);
			}
		}
	}
	
	public int Get_Altitude()
	{
		return Random;
	}
}
