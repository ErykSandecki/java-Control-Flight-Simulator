package Control_Flight_Simulator_Acceptable_Parametric;

import Control_Flight_Simulator_Tile.Simulator;

public class Acceptable_Parametr_Office_Aircraft extends Acceptable_Parametr_All_Types_Course
{
	private Simulator _Simulator;
	
	public boolean Check_Knots_Of_Office_Aircraft(int Target_Knots, Simulator _Simulator)
	{
		this._Simulator = _Simulator;
		
		if((Target_Knots >= 160) && (Target_Knots <= 320))
		{
			return true;
		}
		
		else if (Target_Knots<160)
		{
			Print_To_Low_Speed();
			
			return false;
		}
		
		else
		{
			Print_To_High_Speed();
			
			return false;
		}
	}
	
	public void Print_To_Low_Speed()
	{
		_Simulator.Get_JLabel(1,2).setText("It's your speed is too low !");
	}
	
	public void Print_To_High_Speed()
	{
		_Simulator.Get_JLabel(1,2).setText("It's your speed is too High !");
	}
	
	public boolean Check_Altitude_Of_Office_Aircraft(int Target_Altitude, Simulator _Simulator)
	{
		this._Simulator = _Simulator;
		
		if((Target_Altitude >= 100) && (Target_Altitude <= 36000))
		{
			return true;
		}
		
		else if (Target_Altitude<100)
		{
			Print_To_Low_Altitude();
			
			return false;
		}
		
		else
		{
			Print_To_High_Altitude();
			
			return false;
		}
	}
	
	public void Print_To_Low_Altitude()
	{
		_Simulator.Get_JLabel(1,0).setText("It's your altitude is too low !");
	}
	
	public void Print_To_High_Altitude()
	{
		_Simulator.Get_JLabel(1,0).setText("It's your altitude is too High !");
	}
}

