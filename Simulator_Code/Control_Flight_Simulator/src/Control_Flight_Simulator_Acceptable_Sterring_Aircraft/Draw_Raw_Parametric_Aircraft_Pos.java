package Control_Flight_Simulator_Acceptable_Sterring_Aircraft;

import java.awt.Color;

import Control_Flight_Simulator_Tile.Simulator;

public class Draw_Raw_Parametric_Aircraft_Pos
{
	private Simulator _Simulator;
	
	public Draw_Raw_Parametric_Aircraft_Pos(Simulator _Simulator)
	{
		this._Simulator = _Simulator;
	}
	
	public void Draw_Raw_Render()
	{
		for(int i = 0; i < 5; i++)
		{
			if(_Simulator.Get_Aircraft(i) == null)
			{
				continue;
			}
		
			else
			{
				if(_Simulator.Get_Aircraft(i).x >= _Simulator.Get_Trim_Image().Width_Image(_Simulator.Get_Aircraft(i).x))
				{
					_Simulator.Get_Graphics().drawImage(_Simulator.Get_Aircraft(i)._Sprite_Sheet.crop(0, 0, (int)_Simulator.Get_Width_Image_Trim().Width(_Simulator.Get_Aircraft(i).x), 18), (int)_Simulator.Get_Aircraft(i).x, (int)_Simulator.Get_Aircraft(i).y, null);
				}
				
				else
				{
					_Simulator.Get_Graphics().drawImage(_Simulator.Get_Aircraft(i).Get_Buffered_Image(1), (int)_Simulator.Get_Aircraft(i).x, (int)_Simulator.Get_Aircraft(i).y, null);
				}
				
				if((_Simulator.Get_Aircraft(i).Get_Change_Raw(0) == false) && (_Simulator.Get_All_Boolean(1, i) == true))
				{
					_Simulator.Get_Graphics().drawImage(_Simulator.Get_Aircraft(i).Get_Buffered_Image(2), (int)_Simulator.Get_Aircraft(i).x+15, (int)_Simulator.Get_Aircraft(i).y+15, null);
					
					_Simulator.Get_Graphics().setColor(Color.yellow);
					
					_Simulator.Get_Graphics().drawString("KTS : " + Integer.toString(_Simulator.Get_Aircraft(i).Get_Knots()), (int)_Simulator.Get_Aircraft(i).x+30,(int)_Simulator.Get_Aircraft(i).y+45);
		
					_Simulator.Get_Graphics().drawString("HDG : " + Integer.toString(_Simulator.Get_Aircraft(i).Get_HDG()), (int)_Simulator.Get_Aircraft(i).x+30,(int)_Simulator.Get_Aircraft(i).y+58);
				
					_Simulator.Get_Graphics().drawString("ALT : " + Integer.toString(_Simulator.Get_Aircraft(i).Get_Altitude()), (int)_Simulator.Get_Aircraft(i).x+30,(int)_Simulator.Get_Aircraft(i).y+71);
					
					_Simulator.Get_Graphics().setColor(Color.red);
					
					_Simulator.Get_Graphics().drawString(i + 1 + ".",(int)_Simulator.Get_Aircraft(i).x+20,(int)_Simulator.Get_Aircraft(i).y+84);
					
					_Simulator.Get_Graphics().setColor(Color.yellow);
					
					_Simulator.Get_Graphics().drawString("FLN : " + _Simulator.Get_Aircraft(i).Get_Name_Fly(), (int)_Simulator.Get_Aircraft(i).x+30,(int)_Simulator.Get_Aircraft(i).y+84);
				}
				
				else if(_Simulator.Get_Aircraft(i).Get_Change_Raw(0) == false)
				{
					_Simulator.Get_Graphics().setColor(Color.yellow);
					
					_Simulator.Get_Graphics().drawString(i + 1 + ".",(int)_Simulator.Get_Aircraft(i).x,(int)_Simulator.Get_Aircraft(i).y + 30);
				}
				
				 if((_Simulator.Get_Aircraft(i).Get_Change_Raw(1) == false) && (_Simulator.Get_All_Boolean(1, i) == true))
				{
					_Simulator.Get_Graphics().drawImage(_Simulator.Get_Aircraft(i).Get_Buffered_Image(2), (int)_Simulator.Get_Aircraft(i).x-30, (int)_Simulator.Get_Aircraft(i).y+15, null);
					
					_Simulator.Get_Graphics().setColor(Color.yellow);
		
					_Simulator.Get_Graphics().drawString("KTS : " + Integer.toString(_Simulator.Get_Aircraft(i).Get_Knots()), (int)_Simulator.Get_Aircraft(i).x-100,(int)_Simulator.Get_Aircraft(i).y+45);
		
					_Simulator.Get_Graphics().drawString("HDG : " + Integer.toString(_Simulator.Get_Aircraft(i).Get_HDG()), (int)_Simulator.Get_Aircraft(i).x-100,(int)_Simulator.Get_Aircraft(i).y+58);
				
					_Simulator.Get_Graphics().drawString("ALT : " + Integer.toString(_Simulator.Get_Aircraft(i).Get_Altitude()), (int)_Simulator.Get_Aircraft(i).x-100,(int)_Simulator.Get_Aircraft(i).y+71);
					
					_Simulator.Get_Graphics().setColor(Color.red);
					
					_Simulator.Get_Graphics().drawString(i + 1 + ".",(int)_Simulator.Get_Aircraft(i).x-110,(int)_Simulator.Get_Aircraft(i).y+84);

					_Simulator.Get_Graphics().setColor(Color.yellow);
					
					_Simulator.Get_Graphics().drawString("FLN : " + _Simulator.Get_Aircraft(i).Get_Name_Fly(), (int)_Simulator.Get_Aircraft(i).x-100,(int)_Simulator.Get_Aircraft(i).y+84);
				}
				
				else if(_Simulator.Get_Aircraft(i).Get_Change_Raw(1) == false)
				{
					_Simulator.Get_Graphics().setColor(Color.yellow);
					
					_Simulator.Get_Graphics().drawString(i + 1 + ".",(int)_Simulator.Get_Aircraft(i).x - 10,(int)_Simulator.Get_Aircraft(i).y + 30);
				}
				
				if((_Simulator.Get_Aircraft(i).Get_Change_Raw(2) == false) && (_Simulator.Get_All_Boolean(1, i) == true))
				{
					_Simulator.Get_Graphics().drawImage(_Simulator.Get_Aircraft(i).Get_Buffered_Image(2), (int)_Simulator.Get_Aircraft(i).x + 20, (int)_Simulator.Get_Aircraft(i).y-15, null);
					
					_Simulator.Get_Graphics().setColor(Color.yellow);
		
					_Simulator.Get_Graphics().drawString("KTS : " + Integer.toString(_Simulator.Get_Aircraft(i).Get_Knots()), (int)_Simulator.Get_Aircraft(i).x+30,(int)_Simulator.Get_Aircraft(i).y-17);
		
					_Simulator.Get_Graphics().drawString("HDG : " + Integer.toString(_Simulator.Get_Aircraft(i).Get_HDG()), (int)_Simulator.Get_Aircraft(i).x+30,(int)_Simulator.Get_Aircraft(i).y-30);
				
					_Simulator.Get_Graphics().drawString("ALT : " + Integer.toString(_Simulator.Get_Aircraft(i).Get_Altitude()), (int)_Simulator.Get_Aircraft(i).x+30,(int)_Simulator.Get_Aircraft(i).y-43);
					
					_Simulator.Get_Graphics().setColor(Color.red);
					
					_Simulator.Get_Graphics().drawString(i + 1 + ".",(int)_Simulator.Get_Aircraft(i).x+20,(int)_Simulator.Get_Aircraft(i).y-56);
					
					_Simulator.Get_Graphics().setColor(Color.yellow);
					
					_Simulator.Get_Graphics().drawString("FLN : " + _Simulator.Get_Aircraft(i).Get_Name_Fly(), (int)_Simulator.Get_Aircraft(i).x+30,(int)_Simulator.Get_Aircraft(i).y-56);
				}
				
				else if(_Simulator.Get_Aircraft(i).Get_Change_Raw(2) == false)
				{
					_Simulator.Get_Graphics().setColor(Color.yellow);
					
					_Simulator.Get_Graphics().drawString(i + 1 + ".",(int)_Simulator.Get_Aircraft(i).x,(int)_Simulator.Get_Aircraft(i).y-10);
				}
				
				if((_Simulator.Get_Aircraft(i).Get_Change_Raw(3) == false) && (_Simulator.Get_All_Boolean(1, i) == true))
				{
					_Simulator.Get_Graphics().drawImage(_Simulator.Get_Aircraft(i).Get_Buffered_Image(2), (int)_Simulator.Get_Aircraft(i).x-30, (int)_Simulator.Get_Aircraft(i).y-15, null);
					
					_Simulator.Get_Graphics().setColor(Color.yellow);
		
					_Simulator.Get_Graphics().drawString("KTS : " + Integer.toString(_Simulator.Get_Aircraft(i).Get_Knots()), (int)_Simulator.Get_Aircraft(i).x-100,(int)_Simulator.Get_Aircraft(i).y-17);
		
					_Simulator.Get_Graphics().drawString("HDG : " + Integer.toString(_Simulator.Get_Aircraft(i).Get_HDG()), (int)_Simulator.Get_Aircraft(i).x-100,(int)_Simulator.Get_Aircraft(i).y-30);
				
					_Simulator.Get_Graphics().drawString("ALT : " + Integer.toString(_Simulator.Get_Aircraft(i).Get_Altitude()), (int)_Simulator.Get_Aircraft(i).x-100,(int)_Simulator.Get_Aircraft(i).y-43);
					
					_Simulator.Get_Graphics().setColor(Color.red);
					
					_Simulator.Get_Graphics().drawString(i + 1 + ".",(int)_Simulator.Get_Aircraft(i).x-110,(int)_Simulator.Get_Aircraft(i).y-56);
					
					_Simulator.Get_Graphics().setColor(Color.yellow);
					
					_Simulator.Get_Graphics().drawString("FLN : " + _Simulator.Get_Aircraft(i).Get_Name_Fly(), (int)_Simulator.Get_Aircraft(i).x-100,(int)_Simulator.Get_Aircraft(i).y-56);
				}
				
				else if(_Simulator.Get_Aircraft(i).Get_Change_Raw(3) == false)
				{
					_Simulator.Get_Graphics().setColor(Color.yellow);
					
					_Simulator.Get_Graphics().drawString(i + 1 + ".",(int)_Simulator.Get_Aircraft(i).x - 10,(int)_Simulator.Get_Aircraft(i).y-10);
				}
			}
		}
	}
}


