package Control_Flight_Simulator_Aircraft_Landing;

import Control_Flight_Simulator_Tile.Simulator;

public class Text_For_Change_Parametric 
{
	Simulator _Simulator;
	
	private int Time = 1;
	
	public Text_For_Change_Parametric(Simulator _Simulator)
	{
		this._Simulator = _Simulator;
	}
	
	public void Change_HDG(int i)
	{
		if(Time == 40)
		{
			if(_Simulator.Get_Aircraft(i) != null)
			{
				_Simulator.Get_JText_Area(i+1).setText(_Simulator.Get_Aircraft(i).Get_Generate_Text_Change_Parametr().Answer_Change_Course());
			}
			
			else
			{
				_Simulator.Set_Boolean_All(4, i, false);
				
				_Simulator.Set_Boolean_All(5, i , true);
				
				_Simulator.Set_Boolean_All(6, 0, true);
				
				Time = 0;
			}
		}
			
		else if(Time == 80)
		{
			if(_Simulator.Get_Aircraft(i) != null)
			{
				_Simulator.Get_Aircraft(i).Set_HDG(_Simulator.Get_Aircraft(i).Get_Target(2));
		
				_Simulator.Get_Aircraft(i).Get_Angle().Beginner = true;
				
				_Simulator.Get_JText_Area(i+1).setText("");
				
				_Simulator.Set_Boolean_All(4, i, false);
			
				_Simulator.Set_Boolean_All(5, i , true);
				
				Time = 0;
				
				_Simulator.Get_Aircraft(i).Get_Angle().Set_Turn_Direction();
			
				_Simulator.Set_Boolean_All(6, 0, true);
			}
			
			else
			{
				_Simulator.Set_Boolean_All(4, i, false);
				
				_Simulator.Set_Boolean_All(5, i , true);
				
				_Simulator.Set_Boolean_All(6, 0, true);
				
				Time = 0;
			}
		}	
		Time++;
	}
	
	public void Change_Speed(int i)
	{
		if(Time == 40)
		{
			if(_Simulator.Get_Aircraft(i) != null)
			{
				_Simulator.Get_JText_Area(i+1).setText(_Simulator.Get_Aircraft(i).Get_Generate_Text_Change_Parametr().Answer_Speed());
		
			}
			
			else
			{
				_Simulator.Set_Boolean_All(4, i, false);
				
				_Simulator.Set_Boolean_All(5, i , true);
				
				_Simulator.Set_Boolean_All(6, 0, true);
				
				Time = 0;
			}
		}
		
		else if(Time == 80)
		{
			if(_Simulator.Get_Aircraft(i) != null)
			{
				_Simulator.Get_Aircraft(i).Set_Knots(_Simulator.Get_Aircraft(i).Get_Target(3));
			
				_Simulator.Get_Aircraft(i).Get_Speed_Knots().Beginner = true;
			
				_Simulator.Get_JText_Area(i+1).setText("");
			
				_Simulator.Set_Boolean_All(4, i, false);
			
				_Simulator.Set_Boolean_All(5, i , true);
			
				Time = 0;
			
				_Simulator.Set_Boolean_All(6, 0, true);
			}
			
			else
			{
				_Simulator.Set_Boolean_All(4, i, false);
				
				_Simulator.Set_Boolean_All(5, i , true);
				
				_Simulator.Set_Boolean_All(6, 0, true);
				
				Time = 0;
			}
			
		}
		Time++;
	}
	
	public void Change_Altitude(int i)
	{
		if(Time == 40)
		{
			if(_Simulator.Get_Aircraft(i) != null)
			{
				_Simulator.Get_JText_Area(i+1).setText(_Simulator.Get_Aircraft(i).Get_Generate_Text_Change_Parametr().Answer_Altitude());
			}
		}
		
		else if(Time == 80)
		{
			if(_Simulator.Get_Aircraft(i) != null)
			{
				_Simulator.Get_Aircraft(i).Set_Altitude(_Simulator.Get_Aircraft(i).Get_Target(1));
			
				_Simulator.Get_Aircraft(i).Get_Altitude_Height().Set_Beginner_1(true);
			
				_Simulator.Get_JText_Area(i+1).setText("");
			
				_Simulator.Set_Boolean_All(4, i, false);
		
				_Simulator.Set_Boolean_All(5, i , true);
			
				Time = 0;
			
				_Simulator.Set_Boolean_All(6, 0, true);
			}
			
			else
			{
				_Simulator.Set_Boolean_All(4, i, false);
				
				_Simulator.Set_Boolean_All(5, i , true);
				
				_Simulator.Set_Boolean_All(6, 0, true);
				
				Time = 0;
			}
		}
		
		Time++;
	}
}
