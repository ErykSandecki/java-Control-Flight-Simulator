package Control_Flight_Simulator_Colision_Object_Aircraft;

import Control_Flight_Simulator_Tile.Simulator;

public class Check_Colision_Aircraft 
{
	private Simulator _Simulator;
	
	private int bufor_x_id;
	
	private int bufor_x_i;
	
	private int bufor_y_id;
	
	private int bufor_y_i;
	
	public Check_Colision_Aircraft(Simulator _Simulator)
	{
		this._Simulator = _Simulator;
	}
	
	public void Check_Colision(int id)
	{
		for(int i = 0; i < 5; i++)
		{
			if(i == id)
			{
				continue;
			}
			
			else
			{
				if(_Simulator.Get_Aircraft(i)!=null)
				{
					_Simulator.Get_Transform_x_y().Transform(i);
					
					if((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) < 1000) || (_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 0) || (_Simulator.Get_Transform_x_y().Get_Transform_x_y(2) > 0) || (_Simulator.Get_Transform_x_y().Get_Transform_x_y(2) < 1000))
					{	
						for(int j = 0 ; j<30 ; j++)
						{
							// Check Altitude //
						
							if(_Simulator.Get_Aircraft(id).Get_Altitude() + j + 1 == _Simulator.Get_Aircraft(i).Get_Altitude() - (j + 1))
							{
								// Transform Variable x //
								
								Transform_Variable_X(id, i);
														
								if(bufor_x_id == bufor_x_i)
								{
									// Transform Variable y //
								
									Transform_Variable_Y(id, i);
								
									if(bufor_y_id == bufor_y_i)
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
									
									else if(bufor_y_id + 1 == bufor_y_i - 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
								
									else if(bufor_y_id - 1 == bufor_y_i + 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
								
									// End Transform Variable y //
								}
								
								else if(bufor_x_id + 1 == bufor_x_i - 1 )
								{
									// Transform Variable y //
								
									Transform_Variable_Y(id, i);
								
									if(bufor_y_id == bufor_y_i)
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
									
									else if(bufor_y_id + 1 == bufor_y_i - 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
								
									else if(bufor_y_id - 1 == bufor_y_i + 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
								
									// End Transform Variable y //
								}
							
								else if(bufor_x_id - 1 == bufor_x_i + 1 )
								{
									// Transform Variable y //
								
									Transform_Variable_Y(id, i);
								
									if(bufor_y_id == bufor_y_i)
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
									
									else if(bufor_y_id + 1 == bufor_y_i - 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
								
									else if(bufor_y_id - 1 == bufor_y_i + 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
								
									// End Transform Variable y //
								}
							
								// End Transform Variable //
							}
					
							else if(_Simulator.Get_Aircraft(id).Get_Altitude() - (j + 1) == _Simulator.Get_Aircraft(i).Get_Altitude() + j + 1)
							{
								// Transform Variable x //
							
								Transform_Variable_X(id, i);
							
								if(bufor_x_id == bufor_x_i)
								{
									// Transform Variable y //
								
									Transform_Variable_Y(id, i);
								
									if(bufor_y_id == bufor_y_i)
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
									
									else if(bufor_y_id + 1 == bufor_y_i - 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
								
									else if(bufor_y_id - 1 == bufor_y_i + 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
									}
								
									// End Transform Variable y //
								}
								
								else if(bufor_x_id + 1 == bufor_x_i - 1 )
								{
									// Transform Variable y //
								
									Transform_Variable_Y(id, i);
								
									if(bufor_y_id == bufor_y_i)
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
									
									else if(bufor_y_id + 1 == bufor_y_i - 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
									
									else if(bufor_y_id - 1 == bufor_y_i + 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
								
									// End Transform Variable y //
								}
							
								else if(bufor_x_id - 1 == bufor_x_i + 1 )
								{
									// Transform Variable y //
								
									Transform_Variable_Y(id,i);
								
									if(bufor_y_id == bufor_y_i)
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;

										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
									
									else if(bufor_y_id + 1 == bufor_y_i - 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
								
									else if(bufor_y_id - 1 == bufor_y_i + 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
								
									// End Transform Variable y //
								}
							
								// End Transform Variable //
							
							}
						
							else if(_Simulator.Get_Aircraft(id).Get_Altitude() == _Simulator.Get_Aircraft(i).Get_Altitude())
							{
								// Transform Variable x //
							
								Transform_Variable_X(id,i);
							
								if(bufor_x_id == bufor_x_i)
									{
										// Transform Variable y //
								
										Transform_Variable_Y(id,i);
								
										if(bufor_y_id == bufor_y_i)
										{
											_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
											
											_Simulator.Number_Crash_Aircraft[id] = 1;
											
											_Simulator.Number_Crash_Aircraft[i] = 1;
										}
									
										else if(bufor_y_id + 1 == bufor_y_i - 1 )
										{
											_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
											
											_Simulator.Number_Crash_Aircraft[id] = 1;
											
											_Simulator.Number_Crash_Aircraft[i] = 1;
										}
								
										else if(bufor_y_id - 1 == bufor_y_i + 1 )
										{
											_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
											
											_Simulator.Number_Crash_Aircraft[id] = 1;
											
											_Simulator.Number_Crash_Aircraft[i] = 1;
										}
								
										// End Transform Variable y //
									}
								
								else if(bufor_x_id + 1 == bufor_x_i - 1 )
								{
									// Transform Variable y //
								
									Transform_Variable_Y(id, i);
								
									if(bufor_y_id == bufor_y_i)
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
									
									else if(bufor_y_id + 1 == bufor_y_i - 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;

										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
								
									else if(bufor_y_id - 1 == bufor_y_i + 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
								
									// End Transform Variable y //
								}
							
								else if(bufor_x_id - 1 == bufor_x_i + 1 )
								{
									// Transform Variable y //
								
									Transform_Variable_Y(id, i);
								
									if(bufor_y_id == bufor_y_i)
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
									
									else if(bufor_y_id + 1 == bufor_y_i - 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
								
									else if(bufor_y_id - 1 == bufor_y_i + 1 )
									{
										_Simulator.Accepted_Draw_Collision_Comunicate_Aircraft = true;
										
										_Simulator.Number_Crash_Aircraft[id] = 1;
										
										_Simulator.Number_Crash_Aircraft[i] = 1;
									}
								
									// End Transform Variable y //
								}
							
								// End Transform Variable //
							}
						
							// End Check Altitude //
						}
					}
				}
			}
		}
	}
	
	public void Transform_Variable_X(int id, int i)
	{
		_Simulator.Get_Transform_x_y().Transform(id);
		
		bufor_x_id = _Simulator.Get_Transform_x_y().Get_Transform_x_y(1);
		
		_Simulator.Get_Transform_x_y().Transform(i);
		
		bufor_x_i = _Simulator.Get_Transform_x_y().Get_Transform_x_y(1);
	}
	
	public void Transform_Variable_Y(int id, int i)
	{
		_Simulator.Get_Transform_x_y().Transform(id);
		
		bufor_y_id = _Simulator.Get_Transform_x_y().Get_Transform_x_y(2);
		
		_Simulator.Get_Transform_x_y().Transform(i);
		
		bufor_y_i = _Simulator.Get_Transform_x_y().Get_Transform_x_y(2);
	}
}
