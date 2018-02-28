package Control_Flight_Simulator_System_Landing;

public class Generate_Position_On_Runway 
{
	private int Runway_1_y [][] = new int[2][161], Runway_2_y [][] = new int[2][161], Runway_3_y [][] = new int[2][161], Runway_4_y [][] = new int[2][161];
	
	private int Runway_1_x [] = new int[161], Runway_2_x [] = new int[161], Runway_3_x[] = new int[161], Runway_4_x [] = new int[161];
	
	public Generate_Position_On_Runway()
	{
		Set_Beginner_Position();
		
		Generate_Position_Runway();
	}
	
	// Generate Position on Runway when Aircraft is near //
	
	public void Generate_Position_Runway()
	{
		int j=1;
		
		for(int i = 0; i < 20; i++)
		{
			// 1 Step //
			
			Runway_1_x[j] = Runway_1_x[j-1] + 1;
			
			Runway_2_x[j] = Runway_2_x[j-1] + 1;
			
			Runway_3_x[j] = Runway_3_x[j-1] + 1;
			
			Runway_4_x[j] = Runway_4_x[j-1] + 1;
			
			Runway_1_y[0][j] = Runway_1_y[0][j-1] + 1;
			
			Runway_1_y[1][j] = Runway_1_y[1][j-1] + 1;
			
			Runway_2_y[0][j] = Runway_2_y[0][j-1] + 1;
			
			Runway_2_y[1][j] = Runway_2_y[1][j-1] + 1;
			
			Runway_3_y[0][j] = Runway_3_y[0][j-1] + 1;
			
			Runway_3_y[1][j] = Runway_3_y[1][j-1] + 1;
			
			Runway_4_y[0][j] = Runway_4_y[0][j-1] + 1;
			
			Runway_4_y[1][j] = Runway_4_y[1][j-1] + 1;
			
			// end 1 Step //
			
			j++;
			
			// 2 Step //
			
			Runway_1_x[j] = Runway_1_x[j-1] + 1;
			
			Runway_2_x[j] = Runway_2_x[j-1] + 1;
			
			Runway_3_x[j] = Runway_3_x[j-1] + 1;
			
			Runway_4_x[j] = Runway_4_x[j-1] + 1;
			
			Runway_1_y[0][j] = Runway_1_y[0][j-1] + 0;
			
			Runway_1_y[1][j] = Runway_1_y[1][j-1] + 0;
			
			Runway_2_y[0][j] = Runway_2_y[0][j-1] + 0;
			
			Runway_2_y[1][j] = Runway_2_y[1][j-1] + 0;
			
			Runway_3_y[0][j] = Runway_3_y[0][j-1] + 0;
			
			Runway_3_y[1][j] = Runway_3_y[1][j-1] + 0;
			
			Runway_4_y[0][j] = Runway_4_y[0][j-1] + 0;
			
			Runway_4_y[1][j] = Runway_4_y[1][j-1] + 0;
			
			// end 2 Step //
			
			j++;
			
			// 3 Step //
			
			Runway_1_x[j] = Runway_1_x[j-1] + 1;
			
			Runway_2_x[j] = Runway_2_x[j-1] + 1;
			
			Runway_3_x[j] = Runway_3_x[j-1] + 1;
			
			Runway_4_x[j] = Runway_4_x[j-1] + 1;
			
			Runway_1_y[0][j] = Runway_1_y[0][j-1] + 1;
			
			Runway_1_y[1][j] = Runway_1_y[1][j-1] + 1;
			
			Runway_2_y[0][j] = Runway_2_y[0][j-1] + 1;
			
			Runway_2_y[1][j] = Runway_2_y[1][j-1] + 1;
			
			Runway_3_y[0][j] = Runway_3_y[0][j-1] + 1;
			
			Runway_3_y[1][j] = Runway_3_y[1][j-1] + 1;
			
			Runway_4_y[0][j] = Runway_4_y[0][j-1] + 1;
			
			Runway_4_y[1][j] = Runway_4_y[1][j-1] + 1;
			
			// end 3 Step //
			
			j++;
			
			// 4 Step //
			
			Runway_1_x[j] = Runway_1_x[j-1] + 1;
			
			Runway_2_x[j] = Runway_2_x[j-1] + 1;
			
			Runway_3_x[j] = Runway_3_x[j-1] + 1;
			
			Runway_4_x[j] = Runway_4_x[j-1] + 1;
			
			Runway_1_y[0][j] = Runway_1_y[0][j-1] + 0;
			
			Runway_1_y[1][j] = Runway_1_y[1][j-1] + 0;
			
			Runway_2_y[0][j] = Runway_2_y[0][j-1] + 0;
			
			Runway_2_y[1][j] = Runway_2_y[1][j-1] + 0;
			
			Runway_3_y[0][j] = Runway_3_y[0][j-1] + 0;
			
			Runway_3_y[1][j] = Runway_3_y[1][j-1] + 0;
			
			Runway_4_y[0][j] = Runway_4_y[0][j-1] + 0;
			
			Runway_4_y[1][j] = Runway_4_y[1][j-1] + 0;
			
			// end 4 Step //
			
			j++;
			
			// 5 Step //
			
			Runway_1_x[j] = Runway_1_x[j-1] + 1;
			
			Runway_2_x[j] = Runway_2_x[j-1] + 1;
			
			Runway_3_x[j] = Runway_3_x[j-1] + 1;
			
			Runway_4_x[j] = Runway_4_x[j-1] + 1;
			
			Runway_1_y[0][j] = Runway_1_y[0][j-1] + 1;
			
			Runway_1_y[1][j] = Runway_1_y[1][j-1] + 1;
			
			Runway_2_y[0][j] = Runway_2_y[0][j-1] + 1;
			
			Runway_2_y[1][j] = Runway_2_y[1][j-1] + 1;
			
			Runway_3_y[0][j] = Runway_3_y[0][j-1] + 1;
			
			Runway_3_y[1][j] = Runway_3_y[1][j-1] + 1;
			
			Runway_4_y[0][j] = Runway_4_y[0][j-1] + 1;
			
			Runway_4_y[1][j] = Runway_4_y[1][j-1] + 1;
			
			// end 5 Step //
			
			j++;
			
			// 6 Step //
			
			Runway_1_x[j] = Runway_1_x[j-1] + 1;
			
			Runway_2_x[j] = Runway_2_x[j-1] + 1;
			
			Runway_3_x[j] = Runway_3_x[j-1] + 1;
			
			Runway_4_x[j] = Runway_4_x[j-1] + 1;
			
			Runway_1_y[0][j] = Runway_1_y[0][j-1] + 0;
			
			Runway_1_y[1][j] = Runway_1_y[1][j-1] + 0;
			
			Runway_2_y[0][j] = Runway_2_y[0][j-1] + 0;
			
			Runway_2_y[1][j] = Runway_2_y[1][j-1] + 0;
			
			Runway_3_y[0][j] = Runway_3_y[0][j-1] + 0;
			
			Runway_3_y[1][j] = Runway_3_y[1][j-1] + 0;
			
			Runway_4_y[0][j] = Runway_4_y[0][j-1] + 0;
			
			Runway_4_y[1][j] = Runway_4_y[1][j-1] + 0;
			
			// end 6 Step //
			
			j++;
			
			// 7 Step //
			
			Runway_1_x[j] = Runway_1_x[j-1] + 1;
			
			Runway_2_x[j] = Runway_2_x[j-1] + 1;
			
			Runway_3_x[j] = Runway_3_x[j-1] + 1;
			
			Runway_4_x[j] = Runway_4_x[j-1] + 1;
			
			Runway_1_y[0][j] = Runway_1_y[0][j-1] + 1;
			
			Runway_1_y[1][j] = Runway_1_y[1][j-1] + 1;
			
			Runway_2_y[0][j] = Runway_2_y[0][j-1] + 1;
			
			Runway_2_y[1][j] = Runway_2_y[1][j-1] + 1;
			
			Runway_3_y[0][j] = Runway_3_y[0][j-1] + 1;
			
			Runway_3_y[1][j] = Runway_3_y[1][j-1] + 1;
			
			Runway_4_y[0][j] = Runway_4_y[0][j-1] + 1;
			
			Runway_4_y[1][j] = Runway_4_y[1][j-1] + 1;
			
			// end 7 Step //
			
			j++;
		}
	}
	
	public void Set_Beginner_Position()
	{
		Runway_1_x[0] = 251;
		
		Runway_2_x[0] = 238;
		
		Runway_3_x[0] = 225;
		
		Runway_4_x[0] = 221;
		
		Runway_1_y[0][0] = 335;
		
		Runway_1_y[1][0] = 351;
		
		Runway_2_y[0][0] = 347;
		
		Runway_2_y[1][0] = 363;
		
		Runway_3_y[0][0] = 371;
		
		Runway_3_y[1][0] = 385;
		
		Runway_4_y[0][0] = 388;
		
		Runway_4_y[1][0] = 403;
	}
	
	@SuppressWarnings("null")
	
	public int Get_Area_All_Runway(int Runway,int choose, int Pos , int tab)
	{
		if(Runway == 1)
		{
			if(choose == 1)
			{
			  	return Runway_1_x[tab];
			}
			
			else if(choose == 2)
			{
				return Runway_1_y[Pos][tab];
			}
			
			else
			{
				return (Integer) null;
			}
		}
		
		else if(Runway == 2)
		{
			if(choose == 1)
			{
				return Runway_2_x[tab];
			}
			
			else if(choose == 2)
			{
				return Runway_2_y[Pos][tab];
			}
			
			else
			{
				return (Integer) null;
			}
		}
		
		else if(Runway == 3)
		{
			if(choose == 1)
			{
				return Runway_3_x[tab];
			}
			
			else if(choose == 2)
			{
				return Runway_3_y[Pos][tab];
			}
			
			else
			{
				return (Integer) null;
			}
		}
		
		else if(Runway == 4)
		{
			if(choose == 1)
			{
				return Runway_4_x[tab];
			}
			
			else if(choose == 2)
			{
				return Runway_4_y[Pos][tab];
			}
			
			else
			{
				return (Integer) null;
			}
		}
		
		else
		{
			return (Integer) null;
		}
	}
}
