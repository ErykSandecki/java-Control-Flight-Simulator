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
				this.Random =  3500+ _Random.nextInt(1000);
			}
			
			else
			{
				this.Random =  3500+ _Random.nextInt(2000);
			}
		}
		
		else if (Random == 2)
		{
			if(x<500)
			{
				this.Random =  3500+ _Random.nextInt(1000);
			}
			
			else
			{
				this.Random =  3500+ _Random.nextInt(2000);
			}
		}
		
		else
		{
			if(x<500)
			{
				this.Random =  3500+ _Random.nextInt(1000);
			}
			
			else
			{
				this.Random =  3500+ _Random.nextInt(2000);
			}
		}
	}
	
	public int Get_Altitude()
	{
		return Random;
	}
}
