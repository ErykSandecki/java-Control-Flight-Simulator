package Control_Flight_Simulator_Calculations;

import Control_Flight_Simulator_Aircraft.Aircraft;

public class Speed_Knots 
{
	private int Knots_Actually, Knots_Target;
	
	private  double Speed_Move;
	
	private boolean Speed_Change = true;
	
	private double Indicator;
	
	public boolean Beginner;
	
	private int Beginner_1 = 0;
	
	@SuppressWarnings("unused")
	
	private Aircraft _Aircraft;
	
	public void Add_Speeds(int Knots_Actually, int Knots_Target, Aircraft _Aircraft)
	{
		this.Knots_Actually = Knots_Actually;
		
		this.Knots_Target = Knots_Target;
		
		this._Aircraft = _Aircraft;
		
		if(_Aircraft.Get_Altitude_Height().Get_Add_Altitude() == true)
		{
			return;
		}
		
		else
		{
			if((Speed_Change == true) && (Beginner == true))
			{
				if(Beginner_1 < 3)
				{
					Indicator = 0.25;
				
					Beginner_1++;
				}
			
				else if(Beginner_1 < 8)
				{
					Indicator = 0.5;
				
					Beginner_1++;
				}
			
				else
				{
					Beginner = false;
				
					Beginner_1 = 0;
				}
			}
		
			if((Speed_Change == true) && (Beginner == false))
			{
				if(this.Knots_Actually < this.Knots_Target - 8)
				{
					Indicator = 1.05;
				}
		
				else if (this.Knots_Actually < this.Knots_Target - 3)
				{
					Indicator = 0.5;
				}
		
				else
				{
					Indicator = 0.25;
				}
			}
		
			if(Speed_Move >= 4)
			{
				Speed_Change = true;
			
				this.Knots_Actually++;
			
				Speed_Move = 0;
			}
		
			else
			{
				Speed_Move = Speed_Move + Indicator;
			
				Speed_Change = false;
			}
		}
	}
	
	public void Remove_Speeds(int Knots_Actually, int Knots_Target)
	{
		this.Knots_Actually = Knots_Actually;
		
		this.Knots_Target = Knots_Target;
		
		if((Speed_Change == true) && (Beginner == true))
		{
			if(Beginner_1 < 3)
			{
				Indicator = 0.25;
				
				Beginner_1++;
			}
			
			else if(Beginner_1 < 8)
			{
				Indicator = 0.5;
				
				Beginner_1++;
			}
			
			else
			{
				Beginner = false;
				
				Beginner_1 = 0;
			}
		}
		
		if((Speed_Change == true) && (Beginner == false))
		{
			if(this.Knots_Actually > this.Knots_Target + 25)
			{
				Indicator = 1.05;
			}
		
			else if (this.Knots_Actually > this.Knots_Target + 10)
			{
				Indicator = 0.5;
			}
		
			else
			{
				Indicator = 0.25;
			}
		}
		
		if(Speed_Move >= 4)
		{
			Speed_Change = true;
			
			this.Knots_Actually--;
			
			Speed_Move = 0;
		}
		
		else
		{
			Speed_Move = Speed_Move + Indicator;
			
			Speed_Change = false;
		}
	}
	
	public int Speeds()
	{
		return Knots_Actually;
	}
}
