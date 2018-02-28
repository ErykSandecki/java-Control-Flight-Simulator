package Control_Flight_Simulator_Colision_Terrain_Aircraft;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Loading_Position_Terrain_Coliision 
{
	private FileReader _FileReader;
	
	private BufferedReader _BufferedReader;
	
	private String Linia;
	
	private int Position_x_y[][] = new int [1002][1002];
		
	public void Initialization_Position_Terrain()
	{
		try 
		{
			_FileReader = new FileReader("Resources/Textures/Colision_Terrain_Position.txt");
		} 
		
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
		_BufferedReader = new BufferedReader(_FileReader);
		
		int y=0;
		
		for(int i = 0; i < 1001; i++)
		 {
			try 
			{
				Linia = _BufferedReader.readLine();
				
				for(int x=0;x<1001; x++)
				{
					Position_x_y[y][x] = Integer.parseInt(Linia.substring(0 + x, 1 + x));
				}
				
				y++;	
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		 }
		
		try 
		{
			_FileReader.close();
		}
		
		catch (IOException e) 
		{
		         System.out.println("Mistake for close file!");
		         
		         System.exit(3);
		}
	}
	
	public int Return_Value_Of_Check_Position(int y , int x)
	{
		return Position_x_y[y][x];
	}
}
