package Control_Flight_Simulator_Aircraft_Landing;

import java.util.Random;

public class Decision_Aircraft_Landing 
{
	private Random _Random = new Random();
	
	private int Random, Random_Y, Random_X;
	
	private int x,y;
	
	private int Position;
	
	public Decision_Aircraft_Landing()
	{
		Random = 1 + _Random.nextInt(2);
	}
	
	public int Position()
	{
		return Position;
	}
	
	public int Set_HDG()
	{
		if((Random == 1) && (x == 0))
		{
			if(Random_Y <= 500)
			{
				Position = 1;
				
				return 105 + _Random.nextInt(31);
			}
			
			else
			{
				Position = 3;
				
				return 45 + _Random.nextInt(31);
			}
		}
		
		else if ((Random == 1) && (x == 1000))
		{
			if(Random_Y <= 500)
			{
				Position = 2;
				
				return 225 + _Random.nextInt(31);
			}
			
			else
			{
				Position = 4;
				
				return 285 + _Random.nextInt(31);
			}
		}
		
		else if ((Random == 2) && (y == 0))
		{
			if(Random_X <= 500)
			{
				Position = 1;
				
				return 105 + _Random.nextInt(31);
			}
			
			else
			{
				Position = 2;
				
				return 225 + _Random.nextInt(31);
			}
		}
		
		else
		{
			if(Random_X <= 500)
			{
				Position = 3;
				
				return 45 + _Random.nextInt(31);
			}
			
			else
			{
				Position = 4;
				
				return 285 + _Random.nextInt(31);
			}
		}
	}
	
	public int Set_Y()
	{
		if(Random == 1)
		{
			return Random_Y = 1 + _Random.nextInt(1000);
		}
	
		else
		{
			Random_Y = 1 + _Random.nextInt(2);
			
			if(Random_Y == 1)
			{
				y = 0;
				
				return 0;
			}
			
			else
			{	
				y = 1000;
				
				return 1000;
			}
		}
	}
	
	public int Set_X()
	{
		if(Random == 2)
		{
			return Random_X = 1 + _Random.nextInt(1000);
		}
	
		else
		{
			Random_X = 1 + _Random.nextInt(2);
			
			if(Random_X == 1)
			{
				x = 0;
				
				return 0;
			}
			
			else
			{	
				x = 1000;
				
				return 1000;
			}
		}
	}
}
