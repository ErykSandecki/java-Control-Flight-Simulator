package Control_Flight_Simulator_Calculations;

public class Trim_Image
{	
	private double Width=999;
	
	public double Width_Image(double Width)
	{
		while(true)
		{
			if(this.Width == 981)
			{
				this.Width = 999;
			
				return 1000;
			}
			else if(Width > this.Width)
			{	
				Width = this.Width;
			
				this.Width = 999;
			
				return Width;
			}
		
			else
			{
				this.Width--;
			}
		}
	}
}
