package Control_Flight_Simulator_Aircraft;

import Control_Flight_Simulator_Acceptable_Parametric.Acceptable_Parametr_Office_Aircraft;

import Control_Flight_Simulator_Acceptable_Parametric.Acceptable_Parametr_Passenger_Aircraft;

import Control_Flight_Simulator_Acceptable_Parametric.Acceptable_Parametr_Turistic_Aircraft;

public class Physic_Type_Of_Aircraft 
{
	private Acceptable_Parametr_Office_Aircraft _Acceptable_Parametr_Office_Aircraft;
	
	private Acceptable_Parametr_Passenger_Aircraft _Acceptable_Parametr_Passenger_Aircraft;
	
	private Acceptable_Parametr_Turistic_Aircraft _Acceptable_Parametr_Turistic_Aircraft;
	
	@SuppressWarnings("unused")
	
	public Physic_Type_Of_Aircraft()
	{
		_Acceptable_Parametr_Office_Aircraft = new Acceptable_Parametr_Office_Aircraft();
		
		_Acceptable_Parametr_Passenger_Aircraft = new Acceptable_Parametr_Passenger_Aircraft();
		
		_Acceptable_Parametr_Turistic_Aircraft = new Acceptable_Parametr_Turistic_Aircraft();
	}
	
		
	public Acceptable_Parametr_Office_Aircraft Get_Office_Aircraft()
	{
		return _Acceptable_Parametr_Office_Aircraft;
	}
	
	public Acceptable_Parametr_Passenger_Aircraft Get_Passenger_Aircraft()
	{
		return _Acceptable_Parametr_Passenger_Aircraft;
	}
	
	public Acceptable_Parametr_Turistic_Aircraft Get_Turistic_Aircraft()
	{
		return _Acceptable_Parametr_Turistic_Aircraft; 
	}
}
