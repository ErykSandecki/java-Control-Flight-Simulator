package Control_Flight_Simulator_Aircraft;

import java.util.Random;

public class Number_Fly_Aircraft 
{
	private int Random;
	
	private char Random_Char_Alphabet[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','R','S','T','U','W','Y','Z'};
	
	private char Random_Char_Number[] = {'0','1','2','3','4','5','6','7','8','9'};
	
	private String Name_Fly="";
	
	private Random _Random = new Random();
	
	public Number_Fly_Aircraft()
	{
		for (int i = 0; i < 3; i++)
		{
			Random = _Random.nextInt(23);
			
			Name_Fly = Name_Fly + Random_Char_Alphabet[Random];  
		}
		
		Name_Fly = Name_Fly + " ";
		
		for(int i = 0; i < 4; i++)
		{
			Random = _Random.nextInt(10);
			
			Name_Fly = Name_Fly + Random_Char_Number[Random];
		}
	}
	
	public String Get_Fly_Name()
	{
		return Name_Fly;
	}
}
