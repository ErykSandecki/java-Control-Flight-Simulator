package Control_Flight_Simulator_Acceptable_Parametric;

import Control_Flight_Simulator_Tile.Simulator;

public class Acceptable_Parametr_All_Types_Course 
{	
	public boolean Check_Acceptable_Course(int HDG, Simulator _Simulator )
	{
		if((HDG >= 1) && (HDG <= 360))
		{
			return true;
		}
		
		else
		{
			_Simulator.Get_JLabel(1,1).setText("Your Course is not accepted!");
			
			return false;
		}
	}
}
