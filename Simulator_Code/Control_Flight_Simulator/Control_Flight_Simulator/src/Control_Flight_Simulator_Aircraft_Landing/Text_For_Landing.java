package Control_Flight_Simulator_Aircraft_Landing;

import Control_Flight_Simulator_Tile.Simulator;

public class Text_For_Landing 
{
	Simulator _Simulator;
	
	public Text_For_Landing(Simulator _Simulator)
	{
		this._Simulator = _Simulator;
	}
	
	public void Text_Landing()
	{
		int j = 1;
		
		for(int i = 0 ; i < 5; i++)
		{
			if(_Simulator.Get_Aircraft(i) == null)
			{
				_Simulator.Set_Variable_For_Text_For_Landing(1, i, false);
				
				_Simulator.Set_Variable_For_Text_For_Landing(2, i, false);
				
				_Simulator.Set_Variable_For_Text_For_Landing(3, i, false);
				
				_Simulator.Set_Variable_For_Text_For_Landing(4, i, false);
				
				_Simulator.Set_JText_Area(j, "");
			}
			
			if((_Simulator.Get_Aircraft(i) != null) && (_Simulator.Get_Aircraft(i).Get_Generate_Text_With_Pilot() != null) && (_Simulator.Get_Variable_For_Text_For_Landing(4, i) == true))
			{
				_Simulator.Set_JText_Area(j, _Simulator.Get_Aircraft(i).Get_Generate_Text_With_Pilot().Not_Landing());
				
				_Simulator.Set_Variable_For_Text_For_Landing(3, i, false);
			}
			
			if((_Simulator.Get_Aircraft(i) != null) && (_Simulator.Get_Aircraft(i).Get_Generate_Text_With_Pilot() != null) && (_Simulator.Get_Variable_For_Text_For_Landing(3, i) == true))
			{
				_Simulator.Set_JText_Area(j, _Simulator.Get_Aircraft(i).Get_Generate_Text_With_Pilot().Option_Landing());
				
				_Simulator.Set_Variable_For_Text_For_Landing(3, i, false);
			}
			
			if((_Simulator.Get_Aircraft(i) != null) && (_Simulator.Get_Aircraft(i).Get_Generate_Text_With_Pilot() != null) && (_Simulator.Get_Variable_For_Text_For_Landing(2, i) == false))
			{
				_Simulator.Set_JText_Area(j, _Simulator.Get_Aircraft(i).Get_Generate_Text_With_Pilot().Position_Beginner());
				
				_Simulator.Set_Variable_For_Text_For_Landing(2, i, true);
				
				_Simulator.Set_Variable_For_Text_For_Landing(1, i, true);
			}
			
			j++;
		}
	}
}
