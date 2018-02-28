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
	
	public String Answer_For_Runway(int Number)
	{
		if(Number == 1)
		{
			return "Enter Runway 12L (2,5km) "+ _Aircraft.Get_Name_Fly();
		}
		
		else if(Number == 2)
		{
			return "Enter Runway 12L (3,8km) "+ _Aircraft.Get_Name_Fly();
		}
		
		else if(Number == 3)
		{
			return "Enter Runway 12R (3,8km) "+ _Aircraft.Get_Name_Fly();
		}
		
		else if(Number == 4)
		{
			return "Enter Runway 12R (2,5km) "+ _Aircraft.Get_Name_Fly();
		}
		
		else
		{
			return null;
		}
	}
	
	public String Accepted_Landing(int Number)
	{
		if(Number == 1)
		{
			return _Aircraft.Get_Name_Fly() + "Charles de Gaule Tower, \n enter Runway 12L (2,5km) , altimeter 2992.";
		}
		
		else if(Number == 2)
		{
			return _Aircraft.Get_Name_Fly() + "Charles de Gaule Tower, \n enter Runway 12L (3,8km) , altimeter 2992.";
		}
		
		else if(Number == 3)
		{
			return _Aircraft.Get_Name_Fly() + "Charles de Gaule Tower, \n enter Runway 12R (3,8km) , altimeter 2992.";
		}
		
		else if(Number == 4)
		{
			return _Aircraft.Get_Name_Fly() + "Charles de Gaule Tower, \n enter Runway 12R (2,5km) , altimeter 2992.";
		}
		
		else
		{
			return null;
		}
	}
	
	public String Option_Landing()
	{
		return "Change Runway for Aircraft: " + "\n 1 : 12L (2,5km)" + "\n 2 : 12L (3,8km)" + "\n 3 : 12R (3,8km)" + "\n 4 : 12R (2,5km)";
	}
	
	public String Not_Landing()
	{
		return "Charles de Gaule Tower, "+ _Aircraft.Get_Name_Fly() + "\n you don't accepted for landing!";
	}
	
	public String Ils_Runway()
	{
		return "Y. Accepted finish to land. \n N. Not accepted finish to land";
	}
	
	public String Not_Finished_Landing()
	{
		return "Charles de Gaule Tower, "+ _Aircraft.Get_Name_Fly() + "\n you don't accepted to finish for landing, \n go fly level 2000 and turn around!";
	}
	
	public String Accepted_Finished_Landing()
	{
		return "Charles de Gaule Tower, "+ _Aircraft.Get_Name_Fly() + "\n clear to land runway.";
	}
	
	public String Answer_Finished_Landing()
	{
		return "Charles de Gaule Tower,\n clear to land runway.";
	}
}
