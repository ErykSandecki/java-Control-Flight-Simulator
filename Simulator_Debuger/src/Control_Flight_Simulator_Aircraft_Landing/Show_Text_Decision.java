package Control_Flight_Simulator_Aircraft_Landing;

import Control_Flight_Simulator_Aircraft.Aircraft;

import Control_Flight_Simulator_Tile.Simulator;

public class Show_Text_Decision
{
	private Simulator _Simulator;
	
	private Aircraft _Aircraft;
	
	private int time = 0;
	
	public Show_Text_Decision(Simulator _Simulator, Aircraft _Aircraft )
	{
		this._Simulator = _Simulator;
		
		this._Aircraft = _Aircraft;
	}
	
	public void Show_Beginner_Text(int id)
	{
		_Simulator.Get_JText_Area(id + 1).setText(_Aircraft.Get_Generate_Text_With_Pilot().Position_Beginner());
			
		_Simulator.Set_Accepted_Button_Y_N(id, true);
	}
	
	public void Not_Landing(int id)
	{
		if(time == 0)
		{
			_Simulator.Get_JText_Area(id + 1).setText(_Aircraft.Get_Generate_Text_With_Pilot().Not_Landing());
		}
		
		else if (time == 35)
		{
			_Simulator.Get_JText_Area(id + 1).setText("");
			
			time = 0;
			
			_Aircraft.Set_Boolean_Aircraft_Landing(2, false);
			
			_Simulator.Set_Boolean_All(5, id, true);
			
			_Aircraft.Set_Random(1);
			
			return;
		}
		
		time++;
	}
	
	public void Accepted_Landing(int id)
	{
		if(time == 0)
		{
			_Simulator.Get_JText_Area(id + 1).setText(_Aircraft.Get_Generate_Text_With_Pilot().Accepted_Landing(_Aircraft.Get_Runway()));
		}
		
		else if (time == 35)
		{
			_Simulator.Get_JText_Area(id + 1).setText(_Aircraft.Get_Generate_Text_With_Pilot().Answer_For_Runway(_Aircraft.Get_Runway()));
		}
		
		else if(time == 70)
		{
			_Simulator.Get_JText_Area(id + 1).setText("");
			
			time = 0;
			
			_Aircraft.Set_Boolean_Aircraft_Landing(3, false);
			
			_Simulator.Set_Boolean_All(5, id, true);
			
			_Simulator.Set_Number_Runway(id,_Aircraft.Get_Runway() );
		}
		
		time++;
	}	
}
