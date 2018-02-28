package Control_Flight_Simulator_Aircraft;

import java.io.BufferedReader;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;

import java.util.Random;

public class Random_Type_Aircraft 
{
	private FileReader File;
	
	private BufferedReader _Buffered_Reader;
	
	private String Name_Aircraft_Random;
	
	private Random _Random = new Random();
	
	private int Random;
	
	private int Random_Copy;
	
	public Random_Type_Aircraft()
	{
		Random = 1 + _Random.nextInt(3);
		
		Random_Copy = Random;
		
		if(Random == 1)
		{
			Office_Aircraft();
		}
		
		else if (Random == 2)
		{
			Passenger_Aircraft();
		}
		
		else
		{
			Turistic_Aircraft();
		}
	}
	
	public int Random()
	{
		return Random_Copy;
	}
	
	public void Office_Aircraft()
	{
		try 
		{
			File = new FileReader("Resources/Textures/Office_Aircraft.txt");
		} 
		
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
		_Buffered_Reader = new BufferedReader(File);
		
		while(true)
		{
			Random = _Random.nextInt(13);
			
			for(int i = 0; i < Random; i++)
		 	{
				try 
				{
					Name_Aircraft_Random = _Buffered_Reader.readLine();
				} 
				
				catch (IOException e) 
				{
				
					e.printStackTrace();
				}
		 	}
		
			if(Name_Aircraft_Random == null)
			{
				continue;
			}
			
			else
			{	
				try 
				{
					File.close();
				}
				catch (IOException e) 
				{
					System.out.println("Mistake for close file!");
		         
					System.exit(3);
				}
			
				break;
			}
		}
	}
	
	public void Passenger_Aircraft()
	{
		try 
		{
			File = new FileReader("Resources/Textures/Passenger.txt");
		} 
		
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
		_Buffered_Reader = new BufferedReader(File);
		
		while(true)
		{
			Random = _Random.nextInt(57);	
		
			for(int i = 0; i <= Random; i++)
			{
				try 
				{
					Name_Aircraft_Random = _Buffered_Reader.readLine();
				} 
			
				catch (IOException e) 
				{
					e.printStackTrace();
				}
		 	}
		
			if(Name_Aircraft_Random == null)
			{
				continue;
			}
			
			else
			{	
				try 
				{
					File.close();
				}
				
				catch (IOException e) 
				{
					System.out.println("Mistake for close file!");
		         
					System.exit(3);
				}
				
				break;
			}
		}
	}
	
	public void Turistic_Aircraft()
	{
		try 
		{
			File = new FileReader("Resources/Textures/Turistic.txt");
		} 
		
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
		_Buffered_Reader = new BufferedReader(File);
		
		while(true)
		{
			Random = _Random.nextInt(17);
			
			for(int i = 0; i < Random; i++)
			{
				try 
				{
					Name_Aircraft_Random = _Buffered_Reader.readLine();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
			
			if(Name_Aircraft_Random == null)
			{
				continue;
			}
			
			else
			{	
				try 
				{
					File.close();
				}
				catch (IOException e) 
				{
					System.out.println("Mistake for close file!");
		         
					System.exit(3);
				}
				
				break;
			}
		}
	}
	
	public String Name_Aircraft()
	{
		return Name_Aircraft_Random;
	}
}
