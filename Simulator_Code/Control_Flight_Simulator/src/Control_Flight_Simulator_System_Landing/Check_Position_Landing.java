package Control_Flight_Simulator_System_Landing;

import java.awt.Color;

import Control_Flight_Simulator_Aircraft.Aircraft;
import Control_Flight_Simulator_Tile.Simulator;

public class Check_Position_Landing 
{	
	private boolean Finished_Landing_Decision = false;
	
	private boolean Beginner_Text_Finish_Landing = true;
	
	private boolean  Accepted_Land = false, Not_Accepted_Land = false;
	
	private int time = 0;
	
	private boolean Reset_Check = false;
	
	public void Check_Position(Aircraft _Aircraft, Simulator _Simulator , int Aircraft)
	{
		if((Reset_Check == true) && (_Simulator.Get_Transform_x_y().Get_Transform_x_y(1)>492))
		{	
			Reset_Check = false;
		}
			
		for(int i = 0; i<153; i++)
		{	
			if((Reset_Check == false) && (_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) == _Simulator.Get_Generate_Position_On_Runway().Get_Area_All_Runway(_Aircraft.Get_Runway(), 1, 0, i)) && (_Simulator.Get_Transform_x_y().Get_Transform_x_y(2) > _Simulator.Get_Generate_Position_On_Runway().Get_Area_All_Runway(_Aircraft.Get_Runway(), 2, 0, i) && (_Simulator.Get_Transform_x_y().Get_Transform_x_y(2)<_Simulator.Get_Generate_Position_On_Runway().Get_Area_All_Runway(_Aircraft.Get_Runway(), 2, 1, i))) && (_Aircraft.Get_HDG() == 120) && (_Aircraft.Get_Altitude() < 1500))                           
			{
					_Simulator.Set_Boolean_All(6, 0, false);
					
					_Simulator.Set_Boolean_All(5, Aircraft, false);
					
					if(Beginner_Text_Finish_Landing == true)
					{
						_Simulator.Get_JText_Area(Aircraft + 1).setText(_Aircraft.Get_Generate_Text_With_Pilot().Ils_Runway());
					}
					
					for(int j = 0; j < 5; j++)
					{
						if(j == Aircraft)
						{
							_Simulator.Set_Boolean_All(1, j, true);
							
							_Simulator.Set_Boolean_All(2, j, true);
							
							_Simulator.Get_JLabel(2, j).setForeground(Color.RED);
							
							_Simulator.Get_JLabel(2, j).setText("F" + (j + 1) + " : " + (j + 1) + ". Aircraft Communicate");
						}
				
						else
						{
							_Simulator.Set_Boolean_All(1, j, false);
							
							_Simulator.Set_Boolean_All(2, j, false);
							
							_Simulator.Get_JLabel(2, j).setForeground(Color.BLACK);
							
							_Simulator.Get_JLabel(2, j).setText("F" + (j + 1) + " : " + (j + 1) + ". Aircraft Communicate");
						}
					}
					
					Finished_Landing_Decision = true;
					
					_Simulator.Set_Accepted_Button_Y_N(Aircraft,true);
					
					if(Accepted_Land == true)
					{
						Beginner_Text_Finish_Landing = false;
						
						if(time == 0)
						{
							_Simulator.Get_JText_Area(Aircraft + 1).setText(_Aircraft.Get_Generate_Text_With_Pilot().Accepted_Finished_Landing());
						}
						
						else if (time == 40)
						{
							_Simulator.Get_JText_Area(Aircraft + 1).setText(_Aircraft.Get_Generate_Text_With_Pilot().Answer_Finished_Landing());
						}
						
						else if(time == 80)
						{
							_Simulator.New_Sterring_Final_Aircraft(Aircraft);
							
							Accepted_Land = false;
							
							Reset_Check = true;
							
							_Simulator.Set_Boolean_All(6, 0, true);
							
							time = 0;
							
							_Simulator.Get_JText_Area(Aircraft + 1).setText("");
							
							return;
						}
						
						time++;
					}
					
					else if (Not_Accepted_Land == true)
					{
						
						if(time == 0)
						{
							Beginner_Text_Finish_Landing = false;
							
							_Simulator.Get_JText_Area(Aircraft + 1).setText(_Aircraft.Get_Generate_Text_With_Pilot().Not_Finished_Landing());
						}
						
						else if(time == 40)
						{
							time = 0;
							
							Not_Accepted_Land = false;
							
							_Simulator.Set_Boolean_All(6, 0, true);
							
							_Simulator.Set_Boolean_All(5, Aircraft, true);
							
							_Aircraft.Get_Altitude_Height().Set_Beginner_1(true);
							
							_Aircraft.Set_Target(1, 2000);
							
							_Aircraft.Set_Altitude(_Aircraft.Get_Target(1));
							
							_Simulator.Get_JText_Area(Aircraft + 1).setText("");
							
							Reset_Check = true;
							
							Beginner_Text_Finish_Landing = true;
							
							return;
						}
						
						time++;
				}
			}
		}
	}
	
	public boolean Get_Finished_Landing_Decision()
	{
		return Finished_Landing_Decision;
	}
	
	@SuppressWarnings("null")
	
	public boolean Get_All_Boolean(int choose)
	{
		if(choose == 1)
		{
			return Accepted_Land;
		}
		
		else if (choose == 2)
		{
			return Not_Accepted_Land;
		}
		
		else
		{
			return (Boolean) null;
		}
	}
	
	public void Set_All_Boolean(int choose, boolean decision)
	{
		if(choose == 1)
		{
			Accepted_Land = decision;
		}
		
		else if (choose == 2)
		{
			Not_Accepted_Land = decision;
		}
	}
	
	public void Set_Finished_Landing_Decision()
	{
		Finished_Landing_Decision = false;
	}
}
