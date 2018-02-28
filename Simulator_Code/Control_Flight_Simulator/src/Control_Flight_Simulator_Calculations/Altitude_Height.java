package Control_Flight_Simulator_Calculations;

public class Altitude_Height 
{
	private int Altitude_Actually, Altitude_Target;
	
	private double Speed_Move;
	
	private boolean Altitude_Change = true;
	
	private int Speed_Aircraft;
	
	private boolean Beginner = true;
	
	private int Beginner_1 = 0;
	
	private boolean Add_Altitude = false;
	
	private double indicator;
	
	public void Set_Add_Altitude(boolean decision)
	{
		Add_Altitude = decision;
	}
	
	public void Set_Beginner_1(boolean decision)
	{
		Beginner = decision;
	}
	
	public boolean Get_Add_Altitude()
	{
		return Add_Altitude;
	}
	
	public void Add_Altitude(int Altitude_Actually, int Altitude_Target, int Speed_Aircraft)
	{
		this.Altitude_Actually = Altitude_Actually;
		
		this.Altitude_Target = Altitude_Target;
		
		this.Speed_Aircraft = Speed_Aircraft;
		
		Add_Altitude = true;
		
		if((Altitude_Change == true) && (Beginner == true))
		{
			if(Beginner_1 < 25)
			{
				indicator =  this.Speed_Aircraft * 0.1;
				
				Beginner_1=Beginner_1 + 5;
			}
			
			else if(Beginner_1 < 50)
			{
				indicator =  this.Speed_Aircraft * 0.25;
				
				Beginner_1=Beginner_1 + 5;
			}
			
			else if(Beginner_1 < 100)
			{
				indicator =  this.Speed_Aircraft * 0.5;
				
				Beginner_1=Beginner_1 + 5;
			}
			
			else if(Beginner_1 < 125)
			{
				indicator =  this.Speed_Aircraft;
				
				Beginner_1=Beginner_1 + 5;
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
				 indicator =  this.Speed_Aircraft;
			}
			
			else if(this.Altitude_Actually < this.Altitude_Target - 100)
			{
				indicator =  this.Speed_Aircraft * 0.5;
			}
			
			else if(this.Altitude_Actually < this.Altitude_Target - 50)
			{
				indicator =  this.Speed_Aircraft * 0.25;
			}
		
			else 
			{
				indicator =  this.Speed_Aircraft * 0.1;
			}
		}
		
		if(Speed_Move >= 200)
		{
			Altitude_Change = true;
			
			if(indicator ==  200)
			{
				this.Altitude_Actually= this.Altitude_Actually + 10;
				
				Speed_Move = 0;
			}
			
			else
			{
				this.Altitude_Actually= this.Altitude_Actually + 5;
				
				Speed_Move = 0;
			}
		}
		
		else
		{
			Speed_Move = Speed_Move + indicator;
			
			Altitude_Change = false;
		}
	}
	
	public void Remove_Altitude(int Knots_Actually, int Knots_Target, int Speed_Aircraft)
	{
		this.Altitude_Actually = Knots_Actually;
		
		this.Altitude_Target = Knots_Target;
		
		this.Speed_Aircraft = Speed_Aircraft;
		
		Add_Altitude = false;
		
		if((Altitude_Change == true) && (Beginner == true))
		{
			if(Beginner_1 < 25)
			{
				indicator = this.Speed_Aircraft * 0.1;
				
				Beginner_1=Beginner_1 + 5;
			}
			
			else if(Beginner_1 < 50)
			{
				indicator =  this.Speed_Aircraft * 0.25;
				
				Beginner_1=Beginner_1 + 5;
			}
			
			else if(Beginner_1 < 100)
			{
				indicator =  this.Speed_Aircraft * 0.5;
				
				Beginner_1=Beginner_1 + 5;
			}
			
			else if(Beginner_1 < 125)
			{
				indicator =  this.Speed_Aircraft;
				
				Beginner_1=Beginner_1 + 5;
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
				 indicator =  this.Speed_Aircraft;
			}
			
			else if(this.Altitude_Actually > this.Altitude_Target + 100)
			{
				indicator =  this.Speed_Aircraft * 0.5;
			}
			
			else if(this.Altitude_Actually > this.Altitude_Target + 50)
			{
				indicator = this.Speed_Aircraft * 0.25;
			}
		
			else 
			{
				indicator =  this.Speed_Aircraft * 0.1;
			}
		}
		
		if(Speed_Move >= 200)
		{
			Altitude_Change = true;
			
			if(indicator ==  200)
			{
				this.Altitude_Actually= this.Altitude_Actually - 10;
				
				Speed_Move = 0;
			}
			
			else
			{
				this.Altitude_Actually= this.Altitude_Actually - 5;
				
				Speed_Move = 0;
			}
		}
		
		else
		{
			Speed_Move = Speed_Move + indicator;
			
			Altitude_Change = false;
		}
	}
	
	public int Altitude()
	{
		return Altitude_Actually;
	}
}
