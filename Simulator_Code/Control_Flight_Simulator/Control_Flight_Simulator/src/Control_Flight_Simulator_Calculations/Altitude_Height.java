package Control_Flight_Simulator_Calculations;

public class Altitude_Height 
{
	private int Altitude_Actually, Altitude_Target;
	
	private double Speed;
	
	private double Speed_Move;
	
	private boolean Altitude_Change = true;
	
	private double Speed_Aircraft;
	
	public boolean Beginner = false;
	
	private int Beginner_1 = 0;
	
	public boolean Add_Altitude = false;
	
	public void Add_Altitude(int Altitude_Actually, int Altitude_Target, double Speed , double Speed_Aircraft)
	{
		this.Altitude_Actually = Altitude_Actually;
		
		this.Altitude_Target = Altitude_Target;
		
		this.Speed = Speed;
		
		this.Speed_Aircraft = Speed_Aircraft;
		
		Add_Altitude = true;
		
		if((Altitude_Change == true) && (Beginner == true))
		{
			if(Beginner_1 < 3)
			{
				Speed_Move = this.Speed_Aircraft / 2 / 300;
				
				Beginner_1++;
			}
			
			else if(Beginner_1 < 25)
			{
				Speed_Move = this.Speed_Aircraft * 555;
				
				Beginner_1++;
			}
			
			else if(Beginner_1 < 50)
			{
				Speed_Move = this.Speed_Aircraft * 855;
				
				Beginner_1++;
			}
			
			else if(Beginner_1 < 100)
			{
				Speed_Move = this.Speed_Aircraft * 955;
				
				Beginner_1++;
			}
			
			else
			{
				Beginner = false;
				
				Beginner_1 = 0;
			}
		}
		
		if((Altitude_Change == true) && (Beginner == false))
		{
			 if(this.Altitude_Actually < this.Altitude_Target - 500)
			{
				Speed_Move = this.Speed_Aircraft * 975 ;
			}
			
			else if(this.Altitude_Actually < this.Altitude_Target - 100)
			{
				Speed_Move = this.Speed_Aircraft * 955;
			}
			
			else if(this.Altitude_Actually < this.Altitude_Target - 50)
			{
				Speed_Move = this.Speed_Aircraft * 855;
			}
		
			else if (this.Altitude_Actually < this.Altitude_Target - 10)
			{
				Speed_Move = this.Speed_Aircraft * 555;
			}
		
			else
			{
				Speed_Move = this.Speed_Aircraft / 2 / 300;
			}
		}
		
		if(Speed_Move >= this.Speed)
		{
			Altitude_Change = true;
			
			this.Altitude_Actually++;
		}
		
		else
		{
			Speed_Move = Speed_Move + this.Speed_Aircraft;
			
			Altitude_Change = false;
		}
	}
	
	public void Remove_Altitude(int Knots_Actually, int Knots_Target, double Speed, double Speed_Aircraft)
	{
		this.Altitude_Actually = Knots_Actually;
		
		this.Altitude_Target = Knots_Target;
		
		this.Speed = Speed;
		
		this.Speed_Aircraft = Speed_Aircraft;
		
		Add_Altitude = false;
		
		if((Altitude_Change == true) && (Beginner == true))
		{
			if(Beginner_1 < 3)
			{
				Speed_Move = this.Speed_Aircraft / 2 / 300;
				
				Beginner_1++;
			}
			
			else if(Beginner_1 < 25)
			{
				Speed_Move = this.Speed_Aircraft * 555;
				
				Beginner_1++;
			}
			
			else if(Beginner_1 < 50)
			{
				Speed_Move = this.Speed_Aircraft * 855;
				
				Beginner_1++;
			}
			
			else if(Beginner_1 < 100)
			{
				Speed_Move = this.Speed_Aircraft * 955;
				
				Beginner_1++;
			}
			
			else
			{
				Beginner = false;
				
				Beginner_1 = 0;
			}
		}
		
		if((Altitude_Change == true) && (Beginner == false))
		{
			 if(this.Altitude_Actually > this.Altitude_Target + 500)
				{
					Speed_Move = this.Speed_Aircraft * 975 ;
				}
				
				else if(this.Altitude_Actually > this.Altitude_Target + 100)
				{
					Speed_Move = this.Speed_Aircraft * 955;
				}
				
				else if(this.Altitude_Actually > this.Altitude_Target + 50)
				{
					Speed_Move = this.Speed_Aircraft * 855;
				}
			
				else if (this.Altitude_Actually > this.Altitude_Target + 10)
				{
					Speed_Move = this.Speed_Aircraft * 555;
				}
			
				else
				{
					Speed_Move = this.Speed_Aircraft / 2 / 300;
				}
		}
		
		if(Speed_Move >= this.Speed)
		{
			Altitude_Change = true;
			
			this.Altitude_Actually--;
		}
		
		else
		{
			Speed_Move = Speed_Move + this.Speed_Aircraft;
			
			Altitude_Change = false;
		}
	}
	
	public int Altitude()
	{
		return Altitude_Actually;
	}
}
