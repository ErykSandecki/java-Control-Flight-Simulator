package Control_Flight_Simulator_System_Landing;

import Control_Flight_Simulator_Aircraft.Aircraft;
import Control_Flight_Simulator_Tile.Simulator;

public class Sterring_Final_Aircraft
{
	private boolean Step[] = new boolean [7];
	
	private Simulator _Simulator;
	
	public Sterring_Final_Aircraft(Simulator _Simulator)
	{
		this._Simulator = _Simulator;
		
		Step[0] = true;
		
		for(int i = 1; i < 7; i++)
		{
			Step[i] = false;
		}
	}
	
	public void Check_Landing(Aircraft _Aircraft)
	{
		// Step Runway 1 //
		
		if(_Aircraft.Get_Runway() == 1)
		{
			if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 351) && (Step[0] == true))
			{	
				_Aircraft.Set_Target(1, 150);
				
				_Aircraft.Set_Altitude(_Aircraft.Get_Target(1));
				
				Step[0] = false;
				
				Step[1] = true;
			}
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 439) && (Step[1] == true))
			{
				_Aircraft.Get_Speed_Knots().Beginner = true;
				
				_Aircraft.Set_Target(3, 10);
				
				_Aircraft.Set_Knots(_Aircraft.Get_Target(3));
				
				_Aircraft.y =444;
				
				Step[1] = false;
				
				Step[2] = true;
			}
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 534) && (Step[2] == true))
			{	
				_Aircraft.Set_Target(2, 175);
				
				_Aircraft.Set_HDG(_Aircraft.Get_Target(2));
				
				Step[2] = false;
				
				Step[3] = true;
			}
			
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(2) > 523) && (Step[3] == true))
			{	
				_Aircraft.Set_Target(2, 120);
				
				_Aircraft.Set_HDG(_Aircraft.Get_Target(2));
				
				Step[3] = false;
				
				Step[4] = true;
			}
			
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 545) && (Step[4] == true))
			{	
				_Aircraft.Set_Target(2, 220);
				
				_Aircraft.Set_HDG(_Aircraft.Get_Target(2));
				
				Step[4] = false;
				
				Step[5] = true;
			}
				
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(2) > 541) && (Step[5] == true))
			{	
				_Aircraft.Set_Target(2, 300);
				
				_Aircraft.Set_HDG(_Aircraft.Get_Target(2));
				
				Step[5] = false;
				
				Step[6] = true;
			}
			
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) == 510) && (Step[6] == true))
			{	
				_Aircraft.Set_Target(3, 0);
				
				_Aircraft.Set_Knots(_Aircraft.Get_Target(3));
				
				Step[6] = false;
				
				_Aircraft = null;
				
				return;
			}
		}
		
		// End Step Runway 1 //
		
		// Step Runway 2 //
		
		else if(_Aircraft.Get_Runway() == 2)
		{
			if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 363) && (Step[0] == true))
			{		
				_Aircraft.Set_Target(1, 150);
				
				_Aircraft.Set_Altitude(_Aircraft.Get_Target(1));
				
				Step[0] = false;
				
				Step[1] = true;
			}
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 439) && (Step[1] == true))
			{
				_Aircraft.Get_Speed_Knots().Beginner = true;
				
				_Aircraft.Set_Target(3, 10);
				
				_Aircraft.Set_Knots(_Aircraft.Get_Target(3));
				
				_Aircraft.y =461;
				
				Step[1] = false;
				
				Step[4] = true;
			}
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 545) && (Step[4] == true))
			{	
				_Aircraft.Set_Target(2, 220);
				
				_Aircraft.Set_HDG(_Aircraft.Get_Target(2));
				
				Step[4] = false;
				
				Step[5] = true;
			}
				
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(2) > 541) && (Step[5] == true))
			{	
				_Aircraft.Set_Target(2, 300);
				
				_Aircraft.Set_HDG(_Aircraft.Get_Target(2));
				
				Step[5] = false;
				
				Step[6] = true;
			}
			
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) == 510) && (Step[6] == true))
			{	
				_Aircraft.Set_Target(3, 0);
				
				_Aircraft.Set_Knots(_Aircraft.Get_Target(3));
				
				Step[6] = false;
				
				_Aircraft = null;
				
				return;
			}
		}
		
		// End Step Runway 2 //
		
		// Step Runway 3 //
		
		else if(_Aircraft.Get_Runway() == 3)
		{
			if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 349) && (Step[0] == true))
			{	
				_Aircraft.Set_Target(1, 150);
				
				_Aircraft.Set_Altitude(_Aircraft.Get_Target(1));
				
				Step[0] = false;
				
				Step[1] = true;
			}
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 429) && (Step[1] == true))
			{
				_Aircraft.Get_Speed_Knots().Beginner = true;
				
				_Aircraft.Set_Target(3, 10);
				
				_Aircraft.Set_Knots(_Aircraft.Get_Target(3));
				
				_Aircraft.y= 486;
				
				Step[1] = false;
				
				Step[4] = true;
			}
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 535) && (Step[4] == true))
			{	
				_Aircraft.Set_Target(2, 350);
				
				_Aircraft.Set_HDG(_Aircraft.Get_Target(2));
				
				Step[4] = false;
				
				Step[5] = true;
			}
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(2) < 545) && (Step[5] == true))
			{	
				_Aircraft.Set_Target(2, 300);
				
				_Aircraft.Set_HDG(_Aircraft.Get_Target(2));
				
				Step[5] = false;
				
				Step[6] = true;
			}
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) == 510) && (Step[6] == true))
			{	
				_Aircraft.Set_Target(3, 0);
				
				_Aircraft.Set_Knots(_Aircraft.Get_Target(3));
				
				Step[6] = false;
				
				_Aircraft = null;
				
				return;
			}
		}
		
		// End Step Runway 3 //
		
		// Step Runway 4 //
		
		else if(_Aircraft.Get_Runway() == 4)
		{
			if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 320) && (Step[0] == true))
			{
				_Aircraft.Set_Target(1, 150);
				
				_Aircraft.Set_Altitude(_Aircraft.Get_Target(1));
				
				Step[0] = false;
				
				Step[1] = true;
			}
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 409) && (Step[1] == true))
			{
				_Aircraft.Get_Speed_Knots().Beginner = true;
				
				_Aircraft.Set_Target(3, 10);
				
				_Aircraft.Set_Knots(_Aircraft.Get_Target(3));
				
				Step[1] = false;
				
				Step[2] = true;
				
				_Aircraft.y = 495;
			}
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 505) && (Step[2] == true))
			{	
				_Aircraft.Set_Target(2, 65);
				
				_Aircraft.Set_HDG(_Aircraft.Get_Target(2));
				
				Step[2] = false;
				
				Step[3] = true;
			}
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(2) < 552) && (Step[3] == true))
			{	
				_Aircraft.Set_Target(2, 120);
				
				_Aircraft.Set_HDG(_Aircraft.Get_Target(2));
				
				Step[3] = false;
				
				Step[4] = true;
			}
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 535) && (Step[4] == true))
			{	
				_Aircraft.Set_Target(2, 350);
				
				_Aircraft.Set_HDG(_Aircraft.Get_Target(2));
				
				Step[4] = false;
				
				Step[5] = true;
			}
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(2) < 545) && (Step[5] == true))
			{	
				_Aircraft.Set_Target(2, 300);
				
				_Aircraft.Set_HDG(_Aircraft.Get_Target(2));
				
				Step[5] = false;
				
				Step[6] = true;
			}
			
			else if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) == 510) && (Step[6] == true))
			{	
				_Aircraft.Set_Target(3, 0);
				
				_Aircraft.Set_Knots(_Aircraft.Get_Target(3));
				
				Step[6] = false;
				
				_Aircraft = null;
				
				return;
			}
			
			// End Step Runway 4 //
		}
	}
}
