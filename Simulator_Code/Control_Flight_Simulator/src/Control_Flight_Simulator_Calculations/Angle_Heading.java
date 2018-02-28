package Control_Flight_Simulator_Calculations;

public class Angle_Heading 
{
	private int Heading_Actually, Heading_Target;
	
	private int Angle_Way_1;
	
	private int Angle_Way_2;
	
	private double Speed;
	
	private int Knots;
	
	private double Speed_Angle;
	
	private boolean Angle_Change = true;
	
	private double Speed_Aircraft;
	
	public boolean Beginner = false;
	
	private int Beginner_1 = 0;
	
	private boolean Turn_Left = false , Turn_Right = false;
	
	public void Turn(int Heading_Actually,int Heading_Target,double Speed, int Knots, double Speed_Aircraft)
	{
		this.Heading_Actually = Heading_Actually;
		
		this.Heading_Target = Heading_Target;
		
		this.Speed = Speed;
		
		this.Knots = Knots;
		
		this.Speed_Aircraft = Speed_Aircraft;
		
		if(this.Heading_Actually > this.Heading_Target)
		{
			Angle_Way_1 = this.Heading_Actually - this.Heading_Target;
			
			Angle_Way_2 = 360 - Angle_Way_1;
			
			if(Angle_Way_1 < Angle_Way_2)
			{
				Left_Turn_1();
				
				Turn_Left = true;
			}
			
			else
			{
				Right_Turn_2();
				
				Turn_Right = true;
			}
		}
		
		else if(this.Heading_Actually < this.Heading_Target)
		{
			Angle_Way_1 = this.Heading_Target - this.Heading_Actually;
			
			Angle_Way_2 = 360 - Angle_Way_1;
			
			if(Angle_Way_1 < Angle_Way_2)
			{
				Right_Turn_1();
				
				Turn_Right = true;
			}
			
			else
			{
				Left_Turn_2();
				
				Turn_Left = true;
			}
		}
		
		else
		{
			return;
		}
	}
	
	public void Check_Turn(int Heading_Actually,int Heading_Target)
	{
		this.Heading_Actually = Heading_Actually;
			
		this.Heading_Target = Heading_Target;
			
		if(this.Heading_Actually > this.Heading_Target)
		{
			Angle_Way_1 = this.Heading_Actually - this.Heading_Target;
				
			Angle_Way_2 = 360 - Angle_Way_1;
				
			if(Angle_Way_1 < Angle_Way_2)
			{
				Turn_Left = true;
					
				Turn_Right = false;
			}
				
			else
			{
				Turn_Right = true;
					
				Turn_Left = false;
			}
		}
			
		else if(this.Heading_Actually < this.Heading_Target)
		{
			Angle_Way_1 = this.Heading_Target - this.Heading_Actually;
				
			Angle_Way_2 = 360 - Angle_Way_1;
				
			if(Angle_Way_1 < Angle_Way_2)
			{
				Turn_Right = true;
					
				Turn_Left = false;
			}
				
			else
			{
				Turn_Left = true;
					
				Turn_Right = false;
			}
		}
			
		else
		{
			return;
		}
	}
	
	@SuppressWarnings("null")
	
	public boolean Get_Turn_Direction(int choose)
	{
		if(choose == 1)
		{
			return Turn_Left;
		}
		
		else if(choose == 2)
		{
			return Turn_Right;
		}
		
		else
		{
			return (Boolean) null;
		}
	}
	
	public void Set_Turn_Direction()
	{
		Turn_Left = false;
		
		Turn_Right = false;
	}
	
	public void Left_Turn_1()
	{
		if((Angle_Change == true) && (Beginner == true))
		{
			if(Beginner_1 < 3)
			{
				Speed_Angle = (double)Knots / 2 / 300 ;
				
				Beginner_1++;
			}
			
			else if(Beginner_1 < 8)
			{
				Speed_Angle = (double)Knots / 2 / 100 ;
				
				Beginner_1++;
			}
			
			else
			{
				Beginner = false;
				
				Beginner_1=0;
			}
		}
		
		if((Angle_Change == true) && (Beginner == false))
		{
			if(Angle_Way_1>25)
			{
				Speed_Angle = (double)Knots / 2 / 50 ;
			}
		
			else if ((Angle_Way_1 >= 10) && (Angle_Way_1 <= 25))
			{
				Speed_Angle = (double)Knots / 2 / 100 ;
			}
		
			else
			{
				Speed_Angle = (double)Knots / 2 / 300 ;
			}
		}
		
		if(Speed_Angle >= Speed)
		{
			Angle_Change = true;
			
			Heading_Actually--;
			
			if(Heading_Actually == 0)
			{
				Heading_Actually = 360;
			}
		}
		
		else
		{
			Speed_Angle = Speed_Angle + Speed_Aircraft;
			
			Angle_Change = false;
		}
	}
	
	public void Left_Turn_2()
	{
		if((Angle_Change == true) && (Beginner == true))
		{
			if(Beginner_1 < 3)
			{
				Speed_Angle = (double)Knots / 2 / 300 ;
				
				Beginner_1++;
			}
			
			else if(Beginner_1 < 8)
			{
				Speed_Angle = (double)Knots / 2 / 100 ;
				
				Beginner_1++;
			}
			
			else
			{
				Beginner = false;
				
				Beginner_1=0;
			}
		}
		
		if((Angle_Change == true) && (Beginner == false))
		{
			if(Angle_Way_2>25)
			{
				Speed_Angle = (double)Knots / 2 / 50 ;
			}
		
			else if ((Angle_Way_2 >= 10) && (Angle_Way_2 <= 25))
			{
				Speed_Angle = (double)Knots / 2 / 100 ;
			}
		
			else
			{
				Speed_Angle = (double)Knots / 2 / 300 ;
			}
		}
		
		if(Speed_Angle >= Speed)
		{
			Angle_Change = true;
			
			Heading_Actually--;
			
			if(Heading_Actually == 0)
			{
				Heading_Actually = 360;
			}
		}
		
		else
		{
			Speed_Angle = Speed_Angle + Speed_Aircraft;
			
			Angle_Change = false;
		}
	}
	
	public void Right_Turn_1()
	{
		if((Angle_Change == true) && (Beginner == true))
		{
			if(Beginner_1 < 3)
			{
				Speed_Angle = (double)Knots / 2 / 300 ;
				
				Beginner_1++;
			}
			
			else if(Beginner_1 < 8)
			{
				Speed_Angle = (double)Knots / 2 / 100 ;
				
				Beginner_1++;
			}
			
			else
			{
				Beginner = false;
				
				Beginner_1=0;
			}
		}
		
		if((Angle_Change == true) && (Beginner == false))
		{
			if(Angle_Way_1>25)
			{
				Speed_Angle = (double)Knots / 2 / 50 ;
			}
		
			else if ((Angle_Way_1 >= 10) && (Angle_Way_1 <= 25))
			{
				Speed_Angle = (double)Knots / 2 / 100 ;
			}
		
			else
			{
				Speed_Angle = (double)Knots / 2 / 300 ;
			}
		}
		
		if(Speed_Angle >= Speed)
		{
			Angle_Change = true;
			
			Heading_Actually++;
			
			if(Heading_Actually == 361)
			{
				Heading_Actually = 1;
			}
		}
		
		else
		{
			Speed_Angle = Speed_Angle + Speed_Aircraft;
			
			Angle_Change = false;
		}
	}
	
	public void Right_Turn_2()
	{
		if((Angle_Change == true) && (Beginner == true))
		{
			if(Beginner_1 < 3)
			{
				Speed_Angle = (double)Knots / 2 / 300 ;
				
				Beginner_1++;
			}
			
			else if(Beginner_1 < 8)
			{
				Speed_Angle = (double)Knots / 2 / 100 ;
				
				Beginner_1++;
			}
			
			else
			{
				Beginner = false;
				
				Beginner_1=0;
			}
		}
		
		if((Angle_Change == true) && (Beginner == false))
		{
			if(Angle_Way_2>25)
			{
				Speed_Angle = (double)Knots / 2 / 50 ;
			}
		
			else if ((Angle_Way_2 >= 10) && (Angle_Way_2 <= 25))
			{
				Speed_Angle = (double)Knots / 2 / 100 ;
			}
		
			else
			{
				Speed_Angle = (double)Knots / 2 / 300 ;
			}
		}
		
		if(Speed_Angle >= Speed)
		{
			Angle_Change = true;
			
			Heading_Actually++;
			
			if(Heading_Actually == 361)
			{
				Heading_Actually = 1;
			}
		}
		
		else
		{
			Speed_Angle = Speed_Angle + Speed_Aircraft;
			
			Angle_Change = false;
		}
	}
	
	public int Angle_Turn()
	{
		return Heading_Actually;
	}
}
