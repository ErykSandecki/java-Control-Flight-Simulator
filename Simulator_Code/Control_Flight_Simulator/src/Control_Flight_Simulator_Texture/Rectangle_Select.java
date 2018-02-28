package Control_Flight_Simulator_Texture;

import Control_Flight_Simulator_Tile.Simulator;

public class Rectangle_Select 
{
	private Simulator _Simulator;
	
	public Rectangle_Select(Simulator _Simulator)
	{
		this._Simulator = _Simulator;
	}
	
	public void Rectangle_Select_Fly()
	{
		int j = 298;
		
		if(_Simulator.Get_All_Int(1) > 5)
		{
			for(int i = 0; i < 5; i++)
			{
				if((_Simulator.Get_All_Boolean(1, i) == true) && (_Simulator.Get_Aircraft(i) != null))
				{
					_Simulator.Get_Graphics().drawImage(_Simulator.Get_Load_Image(3), 1008, j, null);
				}
				
				j = j + 110;
			}
			
			_Simulator.Set_Int_All(1, 0, _Simulator.Get_All_Int(1) + 1);
		}
		
		if(_Simulator.Get_All_Int(1) > 10)
		{
			_Simulator.Set_Int_All(1, 0, 1);
		}
		
		else
		{
			_Simulator.Set_Int_All(1, 0, _Simulator.Get_All_Int(1) + 1);
		}
		
		
	}
}
