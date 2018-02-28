package Control_Flight_Simulator_Acceptable_Sterring_Aircraft;

import java.awt.Color;

import Control_Flight_Simulator_Tile.Simulator;

public class Select_Aircraft 
{
	Simulator _Simulator;
	
	public Select_Aircraft(Simulator _Simulator)
	{
		this._Simulator = _Simulator;
	}
	
	public void Select()
	{
		// Selected Key F1 - F4//
		
		for(int i = 0; i < 5; i++)
		{
			if(_Simulator.Get_Key().Get_Select(i+1) && (_Simulator.Get_All_Boolean(6, 0) == true))
			{
				for(int j = 0; j < 5; j++)
				{
					if(j == i)
					{
						_Simulator.Set_Boolean_All(1, j, true);
						
						_Simulator.Set_Boolean_All(2, j, true);
					}
			
					else
					{
						_Simulator.Set_Boolean_All(1, j, false);
						
						_Simulator.Set_Boolean_All(2, j, false);
						
						_Simulator.Get_JLabel(2, j).setForeground(Color.BLACK);
						
						_Simulator.Get_JLabel(2, j).setText("F" + (j + 1) + " : " + (j + 1) + ". Aircraft Communicate");
					}
				}
			}
		}
		
		// End Selected Key F1 - F4//
		
		// Not All Selected Key F6 //
		
		if(_Simulator.Get_Key().Get_Select(6))
		{
			for(int i = 0; i < 5; i++)
			{
				_Simulator.Set_Boolean_All(1, i, false);
				
				_Simulator.Set_Boolean_All(2, i, false);
				
				_Simulator.Get_JLabel(2, i).setForeground(Color.BLACK);
				
				_Simulator.Get_JLabel(2, i).setText("F" + (i + 1) + " : " + (i + 1) + ". Aircraft Communicate");
				
			}
		}
		
		// End Not All Selected Key F6 //
		
		for(int j = 0; j < 5; j++)
		{
			// Accepted Key "Y" //
			
			if(_Simulator.Get_Key().Get_Select(7) && (_Simulator.Get_Accepted_Button_Y_N(j) == true) && (_Simulator.Get_All_Boolean(1, j)== true))
			{
				_Simulator.Set_Boolean_All(5, j, false);
				
				if(_Simulator.Get_Check_Position_Landing(j).Get_Finished_Landing_Decision() == true)
				{
					_Simulator.Get_Check_Position_Landing(j).Set_Finished_Landing_Decision();
					
					_Simulator.Get_Check_Position_Landing(j).Set_All_Boolean(1, true);
				}
				
				if(_Simulator.Get_Aircraft(j).Get_Boolean_Aircraft_Landing(1) == true)
				{
					_Simulator.Get_Aircraft(j).Set_Boolean_Aircraft_Landing(1, false);
					
					_Simulator.Get_JText_Area(j+1).setText(_Simulator.Get_Aircraft(j).Get_Generate_Text_With_Pilot().Option_Landing());
					
					_Simulator.Get_Aircraft(j).Set_Boolean_Aircraft_Landing(4, true);
				}
				
				_Simulator.Set_Accepted_Button_Y_N(j, false);
			}
			
			// End Accepted Key "Y" //
			
			// Not Accepted Key "N" //
			
			if(_Simulator.Get_Key().Get_Select(8) && (_Simulator.Get_All_Boolean(1, j) == true) && (_Simulator.Get_Accepted_Button_Y_N(j) == true))
			{
				_Simulator.Set_Boolean_All(5, j, false);
				
				if(_Simulator.Get_Check_Position_Landing(j).Get_Finished_Landing_Decision() == true)
				{
					_Simulator.Get_Check_Position_Landing(j).Set_Finished_Landing_Decision();
					
					_Simulator.Get_Check_Position_Landing(j).Set_All_Boolean(2, true);
				}
				
				if(_Simulator.Get_Aircraft(j).Get_Boolean_Aircraft_Landing(1) == true)
				{
					_Simulator.Get_Aircraft(j).Set_Boolean_Aircraft_Landing(1, false);
					
					_Simulator.Get_Aircraft(j).Set_Boolean_Aircraft_Landing(2, true);
				}
				
				_Simulator.Set_Accepted_Button_Y_N(j, false);
			}
			
			// End Not Accepted Key "N" //
	
		}

		// Select Runway Key 1 - 4 //
		
		for (int j = 9; j < 13; j++)
		{
			for(int i =0; i < 5; i++)
			{
				if((_Simulator.Get_All_Boolean(1, i)==true) &&(_Simulator.Get_Key().Get_Select(j)) && (_Simulator.Get_Aircraft(i).Get_Boolean_Aircraft_Landing(4) == true))
				{
					_Simulator.Get_Aircraft(i).Set_Runway(j-8);
					
					_Simulator.Get_Aircraft(i).Set_Boolean_Aircraft_Landing(4, false);
					
					_Simulator.Get_Aircraft(i).Set_Boolean_Aircraft_Landing(3, true);
				}
			}
		}
		
		// End Select Runway Key 1 - 4 //
	}
}
