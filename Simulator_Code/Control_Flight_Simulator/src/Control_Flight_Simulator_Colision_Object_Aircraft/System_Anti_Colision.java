package Control_Flight_Simulator_Colision_Object_Aircraft;

import Control_Flight_Simulator_Tile.Simulator;

public class System_Anti_Colision
{
	private Simulator _Simulator;
	
	public System_Anti_Colision(Simulator _Simulator)
	{
		this._Simulator = _Simulator;
	}
	
	public void Check(int id)
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
					
					if(((_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) < 1000) || (_Simulator.Get_Transform_x_y().Get_Transform_x_y(1) > 0) || (_Simulator.Get_Transform_x_y().Get_Transform_x_y(2) > 0) || (_Simulator.Get_Transform_x_y().Get_Transform_x_y(2) < 1000)) && (_Simulator.Get_Aircraft(i).Get_Altitude()>150))
					{	
						for(int j = 0 ; j < 30; j++)
						{
							// Check Altitude //
								
							if(_Simulator.Get_Aircraft(id).Get_Altitude() + j + 1 == _Simulator.Get_Aircraft(i).Get_Altitude() - (j + 1))
							{		
								for(int k = 0; k < 120; k++)
								{
									if(_Simulator.Get_Aircraft(id).x_time[k] == _Simulator.Get_Aircraft(i).x_time[k])
									{
										for(int l = 0; l < 120; l++)
										{
											if(_Simulator.Get_Aircraft(id).y_time[l] == _Simulator.Get_Aircraft(i).y_time[l])
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										
											else if(_Simulator.Get_Aircraft(id).y_time[l] + 1 == _Simulator.Get_Aircraft(i).y_time[l] - 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										
											else if(_Simulator.Get_Aircraft(id).y_time[l] - 1 == _Simulator.Get_Aircraft(i).y_time[l] + 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										}
									  }
									
									else if(_Simulator.Get_Aircraft(id).x_time[k] + 1 == _Simulator.Get_Aircraft(i).x_time[k] - 1)
									{
										
										for(int l = 0; l < 120; l++)
										{
											if(_Simulator.Get_Aircraft(id).y_time[l] == _Simulator.Get_Aircraft(i).y_time[l])
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
									
											else if(_Simulator.Get_Aircraft(id).y_time[l] + 1 == _Simulator.Get_Aircraft(i).y_time[l] - 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
									
											else if(_Simulator.Get_Aircraft(id).y_time[l] - 1 == _Simulator.Get_Aircraft(i).y_time[l] + 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										}
									
									}
									
									else if(_Simulator.Get_Aircraft(id).x_time[k] - 1 == _Simulator.Get_Aircraft(i).x_time[k] + 1)
									{
										
										for(int l = 0; l < 120; l++)
										{
											if(_Simulator.Get_Aircraft(id).y_time[l] == _Simulator.Get_Aircraft(i).y_time[l])
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
									
											else if(_Simulator.Get_Aircraft(id).y_time[l] + 1 == _Simulator.Get_Aircraft(i).y_time[l] - 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
									
											else if(_Simulator.Get_Aircraft(id).y_time[l] - 1 == _Simulator.Get_Aircraft(i).y_time[l] + 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										}
									}
								}
							}
								
							else if(_Simulator.Get_Aircraft(id).Get_Altitude() - (j + 1) == _Simulator.Get_Aircraft(i).Get_Altitude() + j + 1)
							{
								for(int k = 0; k < 120; k++)
								{
									if(_Simulator.Get_Aircraft(id).x_time[k] == _Simulator.Get_Aircraft(i).x_time[k])
									{
										for(int l = 0; l < 120; l++)
										{
											if(_Simulator.Get_Aircraft(id).y_time[l] == _Simulator.Get_Aircraft(i).y_time[l])
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										
											else if(_Simulator.Get_Aircraft(id).y_time[l] + 1 == _Simulator.Get_Aircraft(i).y_time[l] - 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										
											else if(_Simulator.Get_Aircraft(id).y_time[l] - 1 == _Simulator.Get_Aircraft(i).y_time[l] + 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										}
									}
									
									else if(_Simulator.Get_Aircraft(id).x_time[k] + 1 == _Simulator.Get_Aircraft(i).x_time[k] - 1)
									{
										
										for(int l = 0; l < 120; l++)
										{
											if(_Simulator.Get_Aircraft(id).y_time[l] == _Simulator.Get_Aircraft(i).y_time[l])
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
									
											else if(_Simulator.Get_Aircraft(id).y_time[l] + 1 == _Simulator.Get_Aircraft(i).y_time[l] - 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
									
											else if(_Simulator.Get_Aircraft(id).y_time[l] - 1 == _Simulator.Get_Aircraft(i).y_time[l] + 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										}
									
									}
									
									else if(_Simulator.Get_Aircraft(id).x_time[k] - 1 == _Simulator.Get_Aircraft(i).x_time[k] + 1)
									{
										
										for(int l = 0; l < 120; l++)
										{
											if(_Simulator.Get_Aircraft(id).y_time[l] == _Simulator.Get_Aircraft(i).y_time[l])
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
									
											else if(_Simulator.Get_Aircraft(id).y_time[l] + 1 == _Simulator.Get_Aircraft(i).y_time[l] - 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
									
											else if(_Simulator.Get_Aircraft(id).y_time[l] - 1 == _Simulator.Get_Aircraft(i).y_time[l] + 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										}
									}
								}
							}
								
							else if(_Simulator.Get_Aircraft(id).Get_Altitude() == _Simulator.Get_Aircraft(i).Get_Altitude())
							{
								for(int k = 0; k < 120; k++)
								{
									if(_Simulator.Get_Aircraft(id).x_time[k] == _Simulator.Get_Aircraft(i).x_time[k])
									{
										for(int l = 0; l < 120; l++)
										{
											if(_Simulator.Get_Aircraft(id).y_time[l] == _Simulator.Get_Aircraft(i).y_time[l])
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										
											else if(_Simulator.Get_Aircraft(id).y_time[l] + 1 == _Simulator.Get_Aircraft(i).y_time[l] - 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										
											else if(_Simulator.Get_Aircraft(id).y_time[l] - 1 == _Simulator.Get_Aircraft(i).y_time[l] + 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										}
									}
									
									else if(_Simulator.Get_Aircraft(id).x_time[k] + 1 == _Simulator.Get_Aircraft(i).x_time[k] - 1)
									{
										
										for(int l = 0; l < 120; l++)
										{
											if(_Simulator.Get_Aircraft(id).y_time[l] == _Simulator.Get_Aircraft(i).y_time[l])
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
									
											else if(_Simulator.Get_Aircraft(id).y_time[l] + 1 == _Simulator.Get_Aircraft(i).y_time[l] - 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
									
											else if(_Simulator.Get_Aircraft(id).y_time[l] - 1 == _Simulator.Get_Aircraft(i).y_time[l] + 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										}
									
									}
									
									else if(_Simulator.Get_Aircraft(id).x_time[k] - 1 == _Simulator.Get_Aircraft(i).x_time[k] + 1)
									{
										
										for(int l = 0; l < 120; l++)
										{
											if(_Simulator.Get_Aircraft(id).y_time[l] == _Simulator.Get_Aircraft(i).y_time[l])
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
									
											else if(_Simulator.Get_Aircraft(id).y_time[l] + 1 == _Simulator.Get_Aircraft(i).y_time[l] - 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
									
											else if(_Simulator.Get_Aircraft(id).y_time[l] - 1 == _Simulator.Get_Aircraft(i).y_time[l] + 1)
											{
												_Simulator.Crash_Allert[id] = true;
												
												break;
											}
										}
									}
								}	
							}
						}
					}
				}
			}
		}
	}
}
