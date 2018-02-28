package Control_Flight_Simulator_Aircraft_Landing;

import Control_Flight_Simulator_Aircraft.Aircraft;

public class Generate_Text_Change_Parametr 
{
	private Aircraft _Aircraft;
	
	public Generate_Text_Change_Parametr(Aircraft _Aircraft)
	{
		this._Aircraft = _Aircraft;
	}
	
	public String Change_Course()
	{
		if(_Aircraft.Get_Angle().Get_Turn_Direction(1) == true)
		{
			return _Aircraft.Get_Name_Fly() + " Turn left " + _Aircraft.Get_Target(2) + "."; 
		}
		
		else if(_Aircraft.Get_Angle().Get_Turn_Direction(2) == true)
		{
			return _Aircraft.Get_Name_Fly() + " Turn right " + _Aircraft.Get_Target(2) + "."; 
		}
		
		else
		{
			return null;
		}
	}
	
	public String Answer_Change_Course()
	{
		if(_Aircraft.Get_Angle().Get_Turn_Direction(1) == true)
		{
			return "Charles de Gaule, Turn left heading " + _Aircraft.Get_Target(2) + ".";
		}
		
		else if(_Aircraft.Get_Angle().Get_Turn_Direction(2) == true)
		{
			return "Charles de Gaule, Turn right heading " + _Aircraft.Get_Target(2) + ".";
		}
		
		else
		{
			return null;
		}
	}
	
	public String Change_Speed()
	{
		return _Aircraft.Get_Name_Fly() + " ,Change speed " + _Aircraft.Get_Target(3) + ".";
	}
	
	public String Answer_Speed()
	{
		return "Charles de Gaule, change speed " + _Aircraft.Get_Target(3) + ".";
	}
	
	public String Change_Altitude()
	{
		return _Aircraft.Get_Name_Fly() + " ,Change fly level " + _Aircraft.Get_Target(1) + ".";
	}
	
	public String Answer_Altitude()
	{
		return "Charles de Gaule, change fly level " + _Aircraft.Get_Target(1) + ".";
	}
}
