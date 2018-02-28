package Control_Flight_Simulator_Colision_Terrain_Aircraft;

import Control_Flight_Simulator_Tile.Simulator;

public class Transform_x_y 
{
	private int Transform_x , Transform_y;
	
	private int Transform_x_time, Transform_y_time;
	
	private Simulator _Simulator;
	
	public Transform_x_y(Simulator _Simulator)
	{
		this._Simulator = _Simulator;
	}
	
	public void Transform_x_y_time(int i , int tab)
	{
		for(int j = 0; j < 1000; j++)
		{
			if(_Simulator.Get_Aircraft(i).x_time[tab]<j)
			{
				Transform_x_time = j-1;
					
				break;
			}
		}
		
		for(int j = 0; j < 1000; j++)
		{
			if(_Simulator.Get_Aircraft(i).y_time[tab]<j)
			{
				Transform_y_time = j-1;
					
				break;
			}
		}
	}
	
	public void Transform(int i)
	{	
		for(int j = 0; j < 1000; j++)
		{
			if(_Simulator.Get_Aircraft(i).x<j)
			{
				Transform_x = j-1;
					
				break;
			}
		}
		
		for(int j = 0; j < 1000; j++)
		{
			if(_Simulator.Get_Aircraft(i).y<j)
			{
				Transform_y = j-1;
					
				break;
			}
		}
		
	}
	
	@SuppressWarnings("null")
	
	public int Get_Transform_x_y(int choose)
	{
		if(choose == 1)
		{
			return Transform_x + 9;
		}
		
		else if (choose == 2)
		{
			return Transform_y + 9;
		}
		
		else if (choose == 3)
		{
			return Transform_x_time + 9;
		}
		
		else if(choose == 4)
		{
			return Transform_y_time + 9;
		}
		
		else
		{
			return (Integer) null;
		}
	}
}
