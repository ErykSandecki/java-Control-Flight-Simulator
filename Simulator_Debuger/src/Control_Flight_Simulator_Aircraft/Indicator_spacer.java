package Control_Flight_Simulator_Aircraft;

import java.awt.image.BufferedImage;

import Control_Flight_Simulator_Texture.Image;

import Control_Flight_Simulator_Tile.Simulator;

public class Indicator_spacer 
{	
	private Simulator _Simulator;
	
	private Aircraft _Aircraft;
	
	private int id;
	
	private BufferedImage Load_Indicator[] = new BufferedImage[100];
	
	private double x = 0, y = 0;
	
	private int j = 0;
	
	public Indicator_spacer(Simulator _Simulator, int id, Aircraft _Aircraft) 
	{
		this._Simulator = _Simulator;
		
		this.id = id;
		
		this._Aircraft = _Aircraft;
		
		for(int i = 0; i < 100; i++)
		{
			Load_Indicator[i] = Image._BufferedImage("/Map/Point.gif");
		}
	}
	
	public void Show_Next_Position()
	{
		if(_Simulator.Get_All_Boolean(1, id) == true)
		{
			for(int i = 20; i < 500; i = i + 50)
			{
				y =6 + _Aircraft.y;
		
				x =6 +  _Aircraft.x;
		
				if(_Aircraft.Get_HDG() == 360)
				{
					y = y - i ;
				}
		
				else if(_Aircraft.Get_HDG() == 90)
				{
					x = i + x ;
				}
							
				else if(_Aircraft.Get_HDG() == 180)
				{
					y = i + y;
				}
		
				else if(_Aircraft.Get_HDG() == 270)
				{
					x = x - i;
				}
		
				else
				{
					x = (x + (i* _Aircraft.Get_Move_Degress().Solution_Degress_x(_Aircraft.Get_HDG())));
			
					y = (y  - (i* _Aircraft.Get_Move_Degress().Solution_Degress_y(_Aircraft.Get_HDG())));					
				}
					
				if(x>990)
				{
					continue;
				}
				
				else
				{
					_Simulator.Get_Graphics().drawImage(Load_Indicator[j], (int) x, (int) y, null);
				}
					
				j++;
					
				if(j == 100)
				{
					j = 0;
				}
			}
		}
	}
}
