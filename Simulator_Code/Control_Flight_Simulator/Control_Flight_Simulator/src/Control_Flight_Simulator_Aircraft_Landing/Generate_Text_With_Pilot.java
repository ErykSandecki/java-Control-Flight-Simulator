package Control_Flight_Simulator_Aircraft_Landing;

import Control_Flight_Simulator_Aircraft.Aircraft;

public class Generate_Text_With_Pilot 
{
	private int Position;
	
	private Aircraft _Aircraft;
	
	public Generate_Text_With_Pilot(int Position, Aircraft _Aircraft)
	{
		this.Position = Position;
		
		this._Aircraft = _Aircraft;
	}
	
	public String Position_Beginner()
	{
		if(Position == 1)
		{
			return "Charles de Gaule Tower, "+ _Aircraft.Get_Name_Fly() + " is 10 miles\n" + "North-West asking for permission to land." + "\n Y : Accepted." + "\n N : Not Accepted";
		}
		
		else if(Position == 2)
		{
			return "Charles de Gaule Tower, "+ _Aircraft.Get_Name_Fly() + " is 10 miles\n" + "North-East asking for permission to land." + "\n Y : Accepted." + "\n N : Not Accepted";
		}
		
		else if(Position == 3)
		{
			return "Charles de Gaule Tower, "+ _Aircraft.Get_Name_Fly() + " is 10 miles\n" + "South-West asking for permission to land." + "\n Y : Accepted." + "\n N : Not Accepted";
		}
		
		else
		{
			return "Charles de Gaule Tower, "+ _Aircraft.Get_Name_Fly() + " is 10 miles\n" + "South-East asking for permission to land." + "\n Y : Accepted." + "\n N : Not Accepted";
		}
	}
	
	public String Accepted_Landing()
	{
		return "must";
	}
	
	public String Option_Landing()
	{
		return "Change Runway for Aircraft: " + "\n 1 : 12L (2,5km)" + "\n 1 : 12R (3,8km)" + "\n 1 : 12L (3,8km)" + "\n 1 : 12R (2,5km)";
	}
	
	public String Not_Landing()
	{
		return "Charles de Gaule Tower, "+ _Aircraft.Get_Name_Fly() + " you don't accepted for landing!";
	}
}
