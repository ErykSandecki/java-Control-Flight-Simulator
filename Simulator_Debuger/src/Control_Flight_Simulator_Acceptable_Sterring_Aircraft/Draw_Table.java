package Control_Flight_Simulator_Acceptable_Sterring_Aircraft;

import java.awt.Color;

import Control_Flight_Simulator_Tile.Simulator;

public class Draw_Table 
{
private Simulator _Simulator;
	
	public Draw_Table(Simulator _Simulator)
	{
		this._Simulator = _Simulator;
	}
	
	public void Draw_Table_Main()
	{
		int j = 0;
		
		for(int i = 315; i <= 759; i = i + 110)
		{
			if(_Simulator.Get_Aircraft(j) == null)
			{
				Draw_Empty_Parametrs();
			}
			
			else
			{
				_Simulator.Get_Graphics().setColor(Color.YELLOW);
					
				_Simulator.Get_Graphics().drawString(_Simulator.Get_Aircraft(j).Get_Name_Fly(),1100, i);
					
				_Simulator.Get_Graphics().drawString(_Simulator.Get_Aircraft(j).Get_Name_Aircraft(),1163, 20 + i);
					
				_Simulator.Get_Graphics().setColor(Color.RED);
					
				_Simulator.Get_Graphics().drawString(Integer.toString(_Simulator.Get_Aircraft(j).Get_Altitude()),1128, 40 + i);
					
				_Simulator.Get_Graphics().setColor(Color.BLUE);
					
				_Simulator.Get_Graphics().drawString(Integer.toString(_Simulator.Get_Aircraft(j).Get_HDG()),1128, 60 + i);
					
				_Simulator.Get_Graphics().setColor(Color.GREEN);
					
				_Simulator.Get_Graphics().drawString(Integer.toString(_Simulator.Get_Aircraft(j).Get_Knots()),1128, 80 + i);
					
				_Simulator.Get_Graphics().setColor(Color.RED);
					
				if(_Simulator.Get_Aircraft(j).Get_Changer_Parametric(1) == true)
				{
					_Simulator.Get_Graphics().drawString("----->   "+Integer.toString(_Simulator.Get_Aircraft(j).Get_Target(1)),1165, 40 + i);
				}
					
				_Simulator.Get_Graphics().setColor(Color.BLUE);
					
				if(_Simulator.Get_Aircraft(j).Get_Changer_Parametric(2) == true)
				{
					_Simulator.Get_Graphics().drawString("----->   "+Integer.toString(_Simulator.Get_Aircraft(j).Get_Target(2)),1165, 60 + i);
				}
					
				_Simulator.Get_Graphics().setColor(Color.GREEN);
					
				if(_Simulator.Get_Aircraft(j).Get_Changer_Parametric(3) == true)
				{
					_Simulator.Get_Graphics().drawString("----->   "+Integer.toString(_Simulator.Get_Aircraft(j).Get_Target(3)),1165, 80 + i);
				}
				
				Draw_Empty_Parametrs();
				
				if (_Simulator.Get_Aircraft(j).Get_Random() == 2)
				{
					_Simulator.Get_Graphics().setColor(Color.CYAN);
					
					if(_Simulator.Get_Number_Runway(j) == 1)
					{
						_Simulator.Get_Graphics().drawString("Landing 12L (2,5) :", 1250,i);
					}
					
					else if(_Simulator.Get_Number_Runway(j) == 2)
					{
						_Simulator.Get_Graphics().drawString("Landing 12L (3,8) :", 1250,i);
					}
					
					else if(_Simulator.Get_Number_Runway(j) == 3)
					{
						_Simulator.Get_Graphics().drawString("Landing 12R (3,8) :", 1250,i);
					}
					
					else if(_Simulator.Get_Number_Runway(j) == 4)
					{
						_Simulator.Get_Graphics().drawString("Landing 12R (2,5) :", 1250,i);
					}
					
					else
					{
						_Simulator.Get_Graphics().drawString("Check :", 1250,i);
					}
				}
					
				else if(_Simulator.Get_Aircraft(j) != null)
				{
					_Simulator.Get_Graphics().setColor(Color.MAGENTA);
					
					_Simulator.Get_Graphics().drawString("Flight :", 1250,i);
				}
			}
			
			j++;
		}
	}	
	
	public void Draw_Empty_Parametrs()
	{
		for(int i = 315; i <= 759; i = i + 110)
		{
			_Simulator.Get_Graphics().setColor(Color.LIGHT_GRAY);
		
			_Simulator.Get_Graphics().drawString("Fly Name :", 1036,i);
	
			_Simulator.Get_Graphics().drawString("Aircraft Name of Type :", 1036,i+20);
	
			_Simulator.Get_Graphics().drawString("Altitude in Feet :", 1036,i+40);
	
			_Simulator.Get_Graphics().drawString("Course in HDG :", 1036,i+60);
	
			_Simulator.Get_Graphics().drawString("Speed in Knots :", 1036,i+80);
	
			_Simulator.Get_Graphics().drawString("Status :", 1200,i);
		}
	}
}
