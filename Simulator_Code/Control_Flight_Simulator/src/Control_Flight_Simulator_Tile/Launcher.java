package Control_Flight_Simulator_Tile;

public class Launcher
{ 
	// Object Variable //
	
	private static Simulator _Simulator;
	
	// End Object Variable //
	
	public static void main(String args[])
	{
		 _Simulator = new Simulator("Tower Control Flight Simulator",1400,1000);
		
		_Simulator.start();
	}
}
