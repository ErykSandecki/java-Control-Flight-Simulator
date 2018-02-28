package Control_Flight_Simulator_Colision_Terrain_Aircraft;

import Control_Flight_Simulator_Aircraft.Aircraft;

import Control_Flight_Simulator_Tile.Simulator;

public class Check_Collision_Terrain 
{	
	private Simulator _Simulator;
	
	private Loading_Position_Terrain_Coliision _Loading_Position_Terrain_Coliision;
	
	public Check_Collision_Terrain(Loading_Position_Terrain_Coliision _Loading_Position_Terrain_Coliision, Simulator _Simulator)
	{
		this._Loading_Position_Terrain_Coliision = _Loading_Position_Terrain_Coliision;
		
		this._Simulator = _Simulator;
	}
	
	public void Check_Collision_Aircraft_With_Terrain(Aircraft _Aircraft, Transform_x_y _Transform_x_y, int i)
	{
		if(_Loading_Position_Terrain_Coliision.Return_Value_Of_Check_Position(_Transform_x_y.Get_Transform_x_y(2),_Transform_x_y.Get_Transform_x_y(1)) == 1)
		{
			if(_Aircraft.Get_Altitude() < 1253)
			{
				_Simulator.Accepted_Draw_Collision_Comunicate = true;
				
				_Simulator.Number_Crash_Aircraft[i] = 1;
			}
		}
		
		else if(_Loading_Position_Terrain_Coliision.Return_Value_Of_Check_Position(_Transform_x_y.Get_Transform_x_y(2),_Transform_x_y.Get_Transform_x_y(1)) == 2)
		{
			if(_Aircraft.Get_Altitude() < 685)
			{
				_Simulator.Accepted_Draw_Collision_Comunicate = true;
				
				_Simulator.Number_Crash_Aircraft[i] = 1;
			}
		}
		
		else if(_Loading_Position_Terrain_Coliision.Return_Value_Of_Check_Position(_Transform_x_y.Get_Transform_x_y(2),_Transform_x_y.Get_Transform_x_y(1)) == 3)
		{
			if(_Aircraft.Get_Altitude() < 458)
			{
				_Simulator.Accepted_Draw_Collision_Comunicate = true;
				
				_Simulator.Number_Crash_Aircraft[i] = 1;
			}
		}
		
		else if(_Loading_Position_Terrain_Coliision.Return_Value_Of_Check_Position(_Transform_x_y.Get_Transform_x_y(2),_Transform_x_y.Get_Transform_x_y(1)) == 4)
		{
			if(_Aircraft.Get_Altitude() < 318)
			{
				_Simulator.Accepted_Draw_Collision_Comunicate = true;
				
				_Simulator.Number_Crash_Aircraft[i] = 1;
			}
		}
		
		else if(_Loading_Position_Terrain_Coliision.Return_Value_Of_Check_Position(_Transform_x_y.Get_Transform_x_y(2),_Transform_x_y.Get_Transform_x_y(1)) == 5)
		{
			if(_Aircraft.Get_Altitude() < 128)
			{
				_Simulator.Accepted_Draw_Collision_Comunicate = true;
				
				_Simulator.Number_Crash_Aircraft[i] = 1;
			}
		}
		
		else if(_Loading_Position_Terrain_Coliision.Return_Value_Of_Check_Position(_Transform_x_y.Get_Transform_x_y(2),_Transform_x_y.Get_Transform_x_y(1)) == 6)
		{
			if(_Aircraft.Get_Altitude() < 678)
			{
				_Simulator.Accepted_Draw_Collision_Comunicate = true;
				
				_Simulator.Number_Crash_Aircraft[i] = 1;
			}
		}
		
		else if(_Loading_Position_Terrain_Coliision.Return_Value_Of_Check_Position(_Transform_x_y.Get_Transform_x_y(2),_Transform_x_y.Get_Transform_x_y(1))==7)
		{
			if(_Aircraft.Get_Altitude() < 2250)
			{
				_Simulator.Accepted_Draw_Collision_Comunicate = true;
				
				_Simulator.Number_Crash_Aircraft[i] = 1;
			}
		}
		
		else if(_Loading_Position_Terrain_Coliision.Return_Value_Of_Check_Position(_Transform_x_y.Get_Transform_x_y(2),_Transform_x_y.Get_Transform_x_y(1)) == 8)
		{
			if(_Aircraft.Get_Altitude() < 3120)
			{
				_Simulator.Accepted_Draw_Collision_Comunicate = true;
				
				_Simulator.Number_Crash_Aircraft[i] = 1;
			}
		}
	}
}
