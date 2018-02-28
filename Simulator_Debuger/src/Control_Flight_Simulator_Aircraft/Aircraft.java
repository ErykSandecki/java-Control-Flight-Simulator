package Control_Flight_Simulator_Aircraft;

import java.awt.image.BufferedImage;

import java.io.BufferedReader;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;
import java.util.Random;

import Control_Flight_Simulator_Acceptable_Parametric.Acceptable_Parametr_All_Types_Course;
import Control_Flight_Simulator_Aircraft_Landing.Decision_Aircraft_Landing;
import Control_Flight_Simulator_Aircraft_Landing.Generate_Text_Change_Parametr;
import Control_Flight_Simulator_Aircraft_Landing.Generate_Text_With_Pilot;
import Control_Flight_Simulator_Aircraft_Landing.Show_Text_Decision;
import Control_Flight_Simulator_Calculations.Altitude_Height;

import Control_Flight_Simulator_Calculations.Angle_Heading;

import Control_Flight_Simulator_Calculations.Calculations;

import Control_Flight_Simulator_Calculations.Move_Degress;

import Control_Flight_Simulator_Calculations.Random_Altitude;

import Control_Flight_Simulator_Calculations.Random_Heading_To_Position_Start;

import Control_Flight_Simulator_Calculations.Random_Speed_Aircraft;

import Control_Flight_Simulator_Calculations.Speed_Knots;
import Control_Flight_Simulator_Colision_Terrain_Aircraft.Transform_x_y;
import Control_Flight_Simulator_Display.Sprite_Sheet;

import Control_Flight_Simulator_System_Landing.Check_Position_Landing;

import Control_Flight_Simulator_Texture.Image;

import Control_Flight_Simulator_Tile.Simulator;

@SuppressWarnings("unused")

public class Aircraft 
{
	private int Knots;
	
	private int Target_HDG;
	
	private int Target_Knots;
	
	private int HDG;
	
	private int Altitude;
	
	private double Speed;
	
	public double x, y;
	
	public double x1, y1;
	
	public double x_time[] = new double [120];
	
	public double y_time[] = new double [120];
	
	private Calculations _Calculations;
	
	private BufferedImage Load_Image, Load_Image_Raw;
	
	private BufferedReader _Buffered_Reader;
	
	private FileReader File;
	
	private String Line[] = new String [360];
	
	private Move_Degress _Move_Degress;
	
	private boolean Change = false;
	
	private boolean Change_Raw[] = new boolean [4];
	
	public Sprite_Sheet _Sprite_Sheet;
	
	private Random_Heading_To_Position_Start _Random_Heading_To_Position_Start;
	
	private boolean Turn_Angle = false;
	
	private Angle_Heading _Angle_Heading;
		
	private Speed_Knots _Speed_Knots;
	
	private boolean Change_Speed = false;
	
	private Altitude_Height _Altitude_Height;
	
	private int Target_Altitude;
	
	private boolean Change_Altitude = false;
	
	private Random_Type_Aircraft _Random_Type_Aircraft; 
	
	private String Name_Aircraft;
	
	private Random_Speed_Aircraft _Random_Speed_Aircraft;
	
	private Number_Fly_Aircraft _Number_Fly_Aircraft;
	
	private String Name_Fly;
	
	private Random_Altitude _Random_Altitude;
	
	private Physic_Type_Of_Aircraft _Physic_Type_Of_Aircraft;
	
	private Random _Random = new Random();
	
	private int Random;
	
	private boolean UP = false, DOWN = false;
	
	private int Check_Runway = 0;
	
	private Decision_Aircraft_Landing _Decision_Aircraft_Landing;
	
	private Transform_x_y _Transform_x_y;
	
	@SuppressWarnings("unused")
	
	private Acceptable_Parametr_All_Types_Course _Acceptable_Parametr_All_Types_Course;
	
	private Generate_Text_With_Pilot  _Generate_Text_With_Pilot ;
	
	private Generate_Text_Change_Parametr _Generate_Text_Change_Parametr;
	
	private Simulator _Simulator;
	
	private Show_Text_Decision _Show_Text_Decision;
	
	private boolean Landing_Decision = false;
	
	private boolean Not_Landing = false;
	
	private boolean Accepted_Landing = false;
	
	private boolean Key_1_2_3_4 = false;
	
	private boolean Beginner = true;
	
	private int id;
	
	private int time_sec = 0;
	
	private Indicator_spacer _Indicator_spacer;
	
	public Aircraft(Simulator _Simulator, int id)
	{	
		this._Simulator = _Simulator;
		
		this.id = id;
		
		Initialization();
	}
	
	public Indicator_spacer Get_Indicator_spacer()
	{
		return _Indicator_spacer;
	}
	
	public Move_Degress Get_Move_Degress()
	{
	  return _Move_Degress;
	}
	
	@SuppressWarnings("null")
	
	public boolean Get_Boolean_Aircraft_Landing(int choose)
	{
		if(choose == 1)
		{
			return Landing_Decision;
		}
		
		else if (choose == 2)
		{
			return Not_Landing;
		}
		
		else if(choose == 3)
		{
			return Accepted_Landing;
		}
		
		else if (choose == 4)
		{
			return Key_1_2_3_4;
		}
		
		else
		{
			return (Boolean) null;
		}
	}
	
	public void Set_Boolean_Aircraft_Landing(int choose, boolean decision)
	{
		if(choose == 1)
		{
			Landing_Decision = decision;
		}
		
		else if(choose == 2)
		{
			Not_Landing = decision;
		}
		
		else if (choose == 3)
		{
			Accepted_Landing = decision;
		}
		
		else if(choose == 4)
		{
			Key_1_2_3_4 = decision;
		}
	}
	
	public int Get_Random()
	{
		return Random;
	}
	
	public void Set_Random(int value)
	{
		Random = value;
	}
	
	public boolean Get_Change_Raw(int i)
	{
		return Change_Raw[i];
	}
	
	public Physic_Type_Of_Aircraft Get_Physic_Type_Of_Aircraft()
	{
		return _Physic_Type_Of_Aircraft;
	}
	
	public Random_Type_Aircraft Get_Random_Type_Aircraft()
	{
		return _Random_Type_Aircraft;
	}
	
	public BufferedImage Get_Buffered_Image(int choose)
	{
		if(choose == 1)
		{
			return Load_Image;
		}
		
		else if (choose == 2)
		{
			return Load_Image_Raw;
		}
		
		else
		{
			return null;
		}	
	}
	
	@SuppressWarnings("null")
	
	public boolean Get_Changer_Parametric(int choose)
	{
		if(choose == 1)
		{
			return Change_Altitude ;
		}
		
		else if (choose == 2)
		{
			return Turn_Angle;
		}
		
		else if (choose == 3)
		{
			return Change_Speed;
		}
		
		else 
		{
			return  (Boolean) null;
		}
	}
	
	@SuppressWarnings("null")
	
	public int Get_Target(int choose)
	{
		if(choose == 1)
		{
			return Target_Altitude;
		}
		
		else if (choose == 2)
		{
			return Target_HDG;
		}
		
		else if (choose == 3)
		{
			return Target_Knots;
		}
		
		else 
		{
			return (Integer) null;
		}
	}
	
	public void Set_Runway(int value)
	{
		Check_Runway = value;
	}
	
	public int Get_Runway()
	{
		return Check_Runway;
	}
	
	public void Set_Target(int choose, int value)
	{
		if(choose == 1)
		{
			Target_Altitude = value;
		}
		
		else if (choose == 2)
		{
			Target_HDG = value;
		}
		
		else if (choose == 3)
		{
			Target_Knots = value;
		}	
	}
	
	public void Set_Turn(int choose , boolean decision)
	{
		if(choose == 1)
		{
			Change_Altitude = decision;
		}
		
		else if (choose == 2)
		{
			Turn_Angle = decision;
		}
		
		else if (choose == 3)
		{
			Change_Speed = decision;
		}
	}
	
	public Generate_Text_Change_Parametr Get_Generate_Text_Change_Parametr()
	{
		return _Generate_Text_Change_Parametr;
	}
	
	public Generate_Text_With_Pilot Get_Generate_Text_With_Pilot()
	{
		return _Generate_Text_With_Pilot;
	}
	
	public Speed_Knots Get_Speed_Knots()
	{
		return _Speed_Knots;
	}
	
	public Angle_Heading Get_Angle()
	{
		return _Angle_Heading;
	}
	
	public Altitude_Height Get_Altitude_Height()
	{
		return _Altitude_Height;
	}
	
	public String Get_Type_Aircraft()
	{
		return Name_Aircraft;
	}
	
	public String Get_Name_Fly()
	{
		return Name_Fly;
	}
	
	public int Get_Knots()
	{
		return Knots;
	}
	
	public int Get_HDG()
	{
		return HDG;
	}
	
	public int Get_Altitude()
	{
		return Altitude;
	}
	
	public String Get_Name_Aircraft()
	{
		return Name_Aircraft;
	}
	
	public void Set_Knots(int Knots)
	{	
		Target_Knots = Knots;
		
		Change_Speed = true;
		
		if(this.Knots < Knots)
		{
			_Speed_Knots.Add_Speeds(this.Knots, Knots, this);
			
			if(_Speed_Knots.Speeds() != this.Knots)
			{
				this.Knots = _Speed_Knots.Speeds();
			}
		}
		
		else if(this.Knots > Knots)
		{
			_Speed_Knots.Remove_Speeds(this.Knots, Knots);
			
			if(_Speed_Knots.Speeds() != this.Knots)
			{
				this.Knots = _Speed_Knots.Speeds();
			}
		}
		
		if(this.Knots == Target_Knots)
		{
			Change_Speed = false;
		}
	}
	
	public void Set_HDG(int HDG)
	{
		Turn_Angle = true;
		
		Target_HDG = HDG;
		
		_Angle_Heading.Turn(this.HDG,HDG,_Calculations.Solution_Angle_Speed(Knots),Knots, Speed);
		
		if(_Angle_Heading.Angle_Turn() != this.HDG)
		{
			this.HDG = _Angle_Heading.Angle_Turn();
		
			Change = true;
		}
		
		if(HDG == this.HDG)
		{
			Turn_Angle = false;
		}
	}
	
	public void Set_Altitude(int Altitude)
	{
		Target_Altitude = Altitude;
		
		Change_Altitude = true;
		
		if((this.Altitude < Altitude ) && (DOWN == false))
		{
			_Altitude_Height.Add_Altitude(this.Altitude, Altitude, Knots);
			
			if(_Altitude_Height.Altitude() != this.Altitude)
			{
				this.Altitude = _Altitude_Height.Altitude();
			}
			
			UP = true;
		}
		
		else if((this.Altitude > Altitude) && (UP == false))
		{
			_Altitude_Height.Remove_Altitude(this.Altitude, Altitude, Knots);
			
			if(_Altitude_Height.Altitude() != this.Altitude)
			{
				this.Altitude = _Altitude_Height.Altitude();
			}
			
			DOWN = true;
		}
		
		if((this.Altitude >= Target_Altitude) && (UP == true))
		{
			Change_Altitude = false;
			
			UP = false;
			
			Change_Altitude = false;
			
			_Altitude_Height.Set_Add_Altitude(false);
			
			_Altitude_Height.Set_Beginner_1(true);
		}
		
		else if((this.Altitude <= Target_Altitude) && (DOWN == true))
		{
			DOWN = false;
			
			Change_Altitude = false;
			
			_Altitude_Height.Set_Add_Altitude(false);
			
			_Altitude_Height.Set_Beginner_1(true);
		}
	}
	
	public void Set_Parametric_Aircraft()
	{
		Speed = _Calculations.Solution_Time_Way(Knots);
		
		time_sec++;
		
		if((Turn_Angle == true) || (Beginner == true) || (Change_Speed == true) || (time_sec == 100))
		{
			x1 = x;
			
			y1 = y;
			
			Beginner = false;
			
			for(int j = 0 ; j < 120; j++)
			{
				for(int i = 0 ; i < 10; i++)
				{
					if(HDG == 360)
					{
					  y1 = y1 - Speed;
					  
					  x_time[j] = x1;
						
					  y_time[j] = y1;
						
					  _Transform_x_y.Transform_x_y_time(id, j);
						
					  x_time[j] = _Transform_x_y.Get_Transform_x_y(3);
						
					  y_time[j] = _Transform_x_y.Get_Transform_x_y(4);
					}
					
					else if(HDG == 90)
					{
						x1 = x1 + Speed;
						
						x_time[j] = x1;
						
						y_time[j] = y1;
						
						_Transform_x_y.Transform_x_y_time(id, j);
						
						x_time[j] = _Transform_x_y.Get_Transform_x_y(3);
						
						y_time[j] = _Transform_x_y.Get_Transform_x_y(4);
					}
					
					else if(HDG == 180)
					{
						y1 = y1 + Speed;
						
						x_time[j] = x1;
						
						y_time[j] = y1;
						
						_Transform_x_y.Transform_x_y_time(id, j);
						
						x_time[j] = _Transform_x_y.Get_Transform_x_y(3);
						
						y_time[j] = _Transform_x_y.Get_Transform_x_y(4);
					}
					
					else if(HDG == 270)
					{
						x1 = x1 - Speed;
						
						x_time[j] = x1;
						
						y_time[j] = y1;
						
						_Transform_x_y.Transform_x_y_time(id, j);
						
						x_time[j] = _Transform_x_y.Get_Transform_x_y(3);
						
						y_time[j] = _Transform_x_y.Get_Transform_x_y(4);	
					}
					
					else
					{
						x1 = x1 + (Speed * _Move_Degress.Solution_Degress_x(HDG));
			
						y1 = y1 - (Speed * _Move_Degress.Solution_Degress_y(HDG));
						
						x_time[j] = x1;
						
						y_time[j] = y1;
						
						_Transform_x_y.Transform_x_y_time(id, j);
						
						x_time[j] = _Transform_x_y.Get_Transform_x_y(3);
						
						y_time[j] = _Transform_x_y.Get_Transform_x_y(4);	
					}
				}	
			}
			
			time_sec = 0;
		}
		
		if(Turn_Angle == true)
		{
			Set_HDG(Target_HDG);
		}
		
		if(Change_Speed == true)
		{
			Set_Knots(Target_Knots);
		}
		
		if(Change_Altitude == true)
		{
			Set_Altitude(Target_Altitude);
		}
		
		if(HDG == 360)
		{
		  y = y - Speed;
		}
		
		else if(HDG == 90)
		{
			x = x + Speed;
		}
		
		else if(HDG == 180)
		{
			y = y + Speed;
		}
		
		else if(HDG == 270)
		{
			x = x - Speed;
		}
		
		else
		{
			x = x + (Speed * _Move_Degress.Solution_Degress_x(HDG));
			
			y = y - (Speed * _Move_Degress.Solution_Degress_y(HDG));
		}
		
		if(Change == true)
		{
			_Sprite_Sheet = null;
			
			Load_Image = null;
			
			Load_Image = Image._BufferedImage(Line[HDG-1]);
			
			_Sprite_Sheet = new Sprite_Sheet(Load_Image);
			
			Change = false;
		}
		
		Change_Raw();
		
		if(Not_Landing == true)
		{
			_Show_Text_Decision.Not_Landing(id);
		}
		
		if(Accepted_Landing == true)
		{
			_Show_Text_Decision.Accepted_Landing(id);
		}
	}
	
	public void Initialization()
	{
		_Random_Type_Aircraft = new Random_Type_Aircraft();
		
		Name_Aircraft = _Random_Type_Aircraft.Name_Aircraft();
		
		Random = 1 + _Random.nextInt(2);
		
		_Random_Altitude = new Random_Altitude(_Random_Type_Aircraft.Random(), x , y);
		
		_Random_Speed_Aircraft = new Random_Speed_Aircraft(_Random_Type_Aircraft.Random());
		
		_Number_Fly_Aircraft = new Number_Fly_Aircraft();
		
		Name_Fly = _Number_Fly_Aircraft.Get_Fly_Name();
		
		_Physic_Type_Of_Aircraft = new Physic_Type_Of_Aircraft();
		
		_Acceptable_Parametr_All_Types_Course = new Acceptable_Parametr_All_Types_Course();
		
		_Generate_Text_Change_Parametr = new Generate_Text_Change_Parametr(this);
		
		_Indicator_spacer = new Indicator_spacer(_Simulator, id, this);
		
		_Transform_x_y = new Transform_x_y(_Simulator);
		
		if(Random == 1)
		{
			_Random_Heading_To_Position_Start = new Random_Heading_To_Position_Start();
			
			HDG = _Random_Heading_To_Position_Start.Get_Random();
			
			x = _Random_Heading_To_Position_Start.set_X();
			
			y = _Random_Heading_To_Position_Start.set_Y();
			
			Altitude = 10000 + _Random_Altitude.Get_Altitude(); 
			
			Knots = 80 + _Random_Speed_Aircraft.Speed();
		}
		
		else if(Random == 2)
		{
			 _Decision_Aircraft_Landing = new  Decision_Aircraft_Landing();
			 
			 x = _Decision_Aircraft_Landing.Set_X();
			 
			 y = _Decision_Aircraft_Landing.Set_Y();
			 
			 HDG = _Decision_Aircraft_Landing.Set_HDG();
			 
			 _Generate_Text_With_Pilot  = new Generate_Text_With_Pilot(_Decision_Aircraft_Landing.Position(), this);
			 
			 Altitude = _Random_Altitude.Get_Altitude(); 
			 
			 Knots = _Random_Speed_Aircraft.Speed();
			 
			 _Show_Text_Decision = new Show_Text_Decision(_Simulator,this);
			 
			 _Show_Text_Decision.Show_Beginner_Text(id);
			 
			 Landing_Decision = true;
			 
			 _Simulator.Set_Boolean_All(5, id, false);
		}
		
		try 
		{
			File = new FileReader("Resources/Textures/Heading.txt");
		} 
		
		catch (FileNotFoundException e) 
		{	
			e.printStackTrace();
		}
		
		_Buffered_Reader = new BufferedReader(File);
		
		for(int i = 0; i < 360; i++)
		 {
			try 
			{
				Line[i] = _Buffered_Reader.readLine();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		 }
		
		try 
		{
		    File.close();
		}
		catch (IOException e) 
		{
			System.out.println("Mistake for close file!");
		         
		    System.exit(3);
		}
		
		Load_Image = Image._BufferedImage(Line[HDG-1]);
		
		_Calculations = new Calculations();
		
		_Move_Degress = new Move_Degress();
		
		_Angle_Heading = new Angle_Heading();
		
		_Speed_Knots = new Speed_Knots();
		
		_Altitude_Height = new Altitude_Height();
		
		_Sprite_Sheet = new Sprite_Sheet(Load_Image);
		
		_Random_Heading_To_Position_Start = null;
			
		if((x < 500) && (y < 500))
		{
			Load_Image_Raw = Image._BufferedImage("/Map/Text_Raw_1.gif");
		
			Change_Raw[0] = false;
		
			Change_Raw[1] = true;
		
			Change_Raw[2] = true;
		
			Change_Raw[3] = true;
		}
		
		else if((x >= 500) && (y < 500))
		{
			Load_Image_Raw = Image._BufferedImage("/Map/Text_Raw_2.gif");
			
			Change_Raw[1] = false;
			
			Change_Raw[0] = true;
			
			Change_Raw[2] = true;
			
			Change_Raw[3] = true;
		}
		
		else if((x < 500) && (y >= 500))
		{
			Load_Image_Raw = Image._BufferedImage("/Map/Text_Raw_3.gif");
			
			Change_Raw[2] = false;
			
			Change_Raw[0] = true;
			
			Change_Raw[1] = true;
			
			Change_Raw[3] = true;
		}
		
		else
		{
			Load_Image_Raw = Image._BufferedImage("/Map/Text_Raw_4.gif");
			
			Change_Raw[3] = false;
			
			Change_Raw[0] = true;
			
			Change_Raw[1] = true;
			
			Change_Raw[2] = true;
		}
	}
	
	public void Change_Raw()
	{
		if((x < 500) && (y < 500) && (Change_Raw[0] == true))
		{
			Load_Image_Raw = Image._BufferedImage("/Map/Text_Raw_1.gif");
		
			Change_Raw[0] = false;
		
			Change_Raw[1] = true;
		
			Change_Raw[2] = true;
		
			Change_Raw[3] = true;
		}
		
		else if((x >= 500) && (y < 500) && (Change_Raw[1] == true))
		{
			Load_Image_Raw = Image._BufferedImage("/Map/Text_Raw_2.gif");
			
			Change_Raw[1] = false;
			
			Change_Raw[0] = true;
			
			Change_Raw[2] = true;
			
			Change_Raw[3] = true;
		}
		
		else if((x < 500) && (y >= 500) && (Change_Raw[2] == true))
		{
			Load_Image_Raw = Image._BufferedImage("/Map/Text_Raw_3.gif");
			
			Change_Raw[2] = false;
			
			Change_Raw[0] = true;
			
			Change_Raw[1] = true;
			
			Change_Raw[3] = true;
		}
		
		else if((x >= 500) && (y >= 500) && (Change_Raw[3] == true))
		{
			Load_Image_Raw = Image._BufferedImage("/Map/Text_Raw_4.gif");
			
			Change_Raw[3] = false;
			
			Change_Raw[0] = true;
			
			Change_Raw[1] = true;
			
			Change_Raw[2] = true;
		}
	}
}
