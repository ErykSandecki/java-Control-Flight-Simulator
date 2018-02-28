package Control_Flight_Simulator_Tile;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.image.BufferStrategy;

import java.awt.image.BufferedImage;

import java.util.Random;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Control_Flight_Simulator_Acceptable_Sterring_Aircraft.Draw_Raw_Parametric_Aircraft_Pos;
import Control_Flight_Simulator_Acceptable_Sterring_Aircraft.Draw_Table;
import Control_Flight_Simulator_Acceptable_Sterring_Aircraft.Select_Aircraft;
import Control_Flight_Simulator_Aircraft.Aircraft;
import Control_Flight_Simulator_Aircraft_Landing.Text_For_Change_Parametric;
import Control_Flight_Simulator_Calculations.Trim_Image;

import Control_Flight_Simulator_Calculations.Width_Image_Trim;
import Control_Flight_Simulator_Colision_Object_Aircraft.Check_Colision_Aircraft;
import Control_Flight_Simulator_Colision_Object_Aircraft.System_Anti_Colision;
import Control_Flight_Simulator_Colision_Terrain_Aircraft.Check_Collision_Terrain;
import Control_Flight_Simulator_Colision_Terrain_Aircraft.Loading_Position_Terrain_Coliision;
import Control_Flight_Simulator_Colision_Terrain_Aircraft.Transform_x_y;
import Control_Flight_Simulator_Communicate_Aircraft.Change_Parametr_Show_Dialog;
import Control_Flight_Simulator_Display.Display;
import Control_Flight_Simulator_System_Landing.Check_Position_Landing;
import Control_Flight_Simulator_System_Landing.Generate_Position_On_Runway;
import Control_Flight_Simulator_System_Landing.Sterring_Final_Aircraft;
import Control_Flight_Simulator_Texture.Image;
import Control_Flight_Simulator_Texture.Rectangle_Select;

public class Simulator extends JFrame implements Runnable, ActionListener
{
	private static final long serialVersionUID = 1L;
	
	//Variable other object //
	
	private Display _Display;
	
	private String Title;
	
	private JFrame _JFrame;
	
	private JLabel Main_JLabel;
	
	private JLabel [] _Aircraft_Comunicate = new JLabel [5];

	private JLabel [] _JLabel_Parametr = new JLabel [3];
	
	private JTextField [] _JTextField_Parametr = new JTextField [3];
	
	private JButton [] _JButton_Parametr = new JButton [3];
	
	private JTextArea _JTextArea_1, _JTextArea_2, _JTextArea_3, _JTextArea_4, _JTextArea_5;
	
	private JScrollPane _JScrollPane_1, _JScrollPane_2, _JScrollPane_3, _JScrollPane_4, _JScrollPane_5;
	
	private Loading_Position_Terrain_Coliision _Loading_Position_Terrain_Coliision;
	
	private Thread _Thread;
	
	private BufferStrategy _BufferStrategy;
	
	private Graphics _Graphics;
	
	private BufferedImage _Load_Image , _Load_Menu, _Load_Rectangle_Select, _Circle;
	
	private Aircraft _Aircraft [];
	
	private Trim_Image _Trim_Image;
	
	private Width_Image_Trim _Width_Image_Trim;
	
	private Key_Manager _Key_Manager;
	
	@SuppressWarnings("unused")
	
	private Frame_Window _Frame_Window;
	
	private Transform_x_y _Transform_x_y;
	
	private Text_For_Change_Parametric _Text_For_Change_Parametric;
	
	private Random _Random = new Random();
	
	private Rectangle_Select _Rectangle_Select;
	
	private Select_Aircraft _Select_Aircraft;
	
	private Draw_Raw_Parametric_Aircraft_Pos _Draw_Raw_Parametric_Aircraft_Pos;
	
	private Draw_Table _Draw_Table ;
	
	private Change_Parametr_Show_Dialog _Change_Parametr_Show_Dialog;
	
	private Check_Collision_Terrain _Check_Collision_Terrain;
	
	private Generate_Position_On_Runway _Generate_Position_On_Runway;
	
	private Check_Position_Landing  _Check_Position_Landing [] = new Check_Position_Landing [5];
	
	private Sterring_Final_Aircraft _Sterring_Final_Aircraft [] = new Sterring_Final_Aircraft[5];
	
	private Check_Colision_Aircraft _Check_Colision_Aircraft;
	
	public Font font = new Font("Helvetica", Font.BOLD, 72);
	
	private System_Anti_Colision _System_Anti_Colision;
	
	//Variable other object //
	
	// Variable boolean //
	
	private boolean Running = false;
	
	private boolean Secwenction_Select [] = new boolean [5];
	
	private boolean Select[] = new boolean [5];
	
	private boolean Accepted_Key = true;
	
	private boolean  Accepteded_Add_Talking_Parametric[] = new boolean [5];
	
	private boolean Accepted_Change_Parametr[] = new boolean [5];
	
	private boolean Accepted_Button_Y_N [] = new boolean [5];
	
	public boolean Accepted_Draw_Collision_Comunicate = false;
	
	public boolean Accepted_Draw_Collision_Comunicate_Aircraft = false;
	
	public boolean Crash_Allert[] = new boolean[5];
	
	// end Variable boolean //
	
	// Variable int //
	
	private int Time_Secwenction = 0;
	
	private int Timer_For_Step_Dialog [] = new int [5];
	
	private int Number_Runway [] = new int [5];
	
	private int Choose_Parametr = 0;
	
	private int Random;
	
	private int Width, Height;
	
	public int Time [] = new int [5];
	
	public int Number_Crash_Aircraft [] = new int [5];
	
	// Variable int //
	
	public Simulator(String Title, int Width,int Height)
	{
		this.Title = Title;
		
		this.Width = Width;
		
		this.Height = Height;	
	}
	
	private void Initialization()
	{
		_Key_Manager = new Key_Manager();
		
		_Display = new Display(Title, Width,  Height);
		
		_Display.getFrame().addKeyListener(_Key_Manager);
		
		_Frame_Window = new Frame_Window(this);
		
		_Load_Image = Image._BufferedImage("/Map/Map_World.png");
		
		_Load_Menu = Image._BufferedImage("/Map/Menu_Simulator.png");
		
		_Load_Rectangle_Select = Image._BufferedImage("/Map/Rectangle_Set.gif");
		
		 _Circle = Image._BufferedImage("/Map/Circle.gif");
		
		_Aircraft = new Aircraft[5];
		
		_Trim_Image = new Trim_Image();
		
		_Width_Image_Trim = new Width_Image_Trim();
		
		_Rectangle_Select = new Rectangle_Select(this);
		
		_Select_Aircraft = new Select_Aircraft(this);
		
		_Draw_Table = new Draw_Table(this);
		
		_Draw_Raw_Parametric_Aircraft_Pos = new Draw_Raw_Parametric_Aircraft_Pos(this);
		
		_Change_Parametr_Show_Dialog = new Change_Parametr_Show_Dialog(this);
		
		_Text_For_Change_Parametric = new Text_For_Change_Parametric(this);
		
		_Transform_x_y = new Transform_x_y(this);
		
		_Loading_Position_Terrain_Coliision = new Loading_Position_Terrain_Coliision();
		
		_Loading_Position_Terrain_Coliision.Initialization_Position_Terrain();
		
		_Check_Collision_Terrain = new Check_Collision_Terrain(_Loading_Position_Terrain_Coliision, this);
		
		_Generate_Position_On_Runway = new Generate_Position_On_Runway();
		
		_Check_Colision_Aircraft  = new Check_Colision_Aircraft(this);
		
		_System_Anti_Colision = new System_Anti_Colision(this);
		
		for(int i = 0; i < 5; i++)
		{
			Secwenction_Select[i] = false;
			
			Timer_For_Step_Dialog[i] = 0;
			
			Number_Runway[i] = 0;
			
			Select[i] = false;
			
			Accepteded_Add_Talking_Parametric[i] = true;
			
			Accepted_Change_Parametr[i] = false;
			
			Accepted_Button_Y_N[i] = false;
			
			_Check_Position_Landing[i]  = new Check_Position_Landing();
			
			Crash_Allert[i] = false; 
			
			Time [i] = 5;
		}
	}
	
	public void Update()
	{
		for(int i = 0; i < 5; i++)
		{
			Random = 1+ _Random.nextInt(250);
			
			if(_Aircraft[i] == null)
			{
				if(Random == 10)
				{				
					Select[i] = false;
				
					Secwenction_Select[i] = false;
				
					Accepteded_Add_Talking_Parametric[i] = true; 
				
					_Sterring_Final_Aircraft[i] = null;
				
					_Check_Position_Landing[i] = new Check_Position_Landing();
				
					_Sterring_Final_Aircraft[i] = null;
				
					Get_JLabel(2, i).setForeground(Color.BLACK);
				
					Get_JLabel(2, i).setText("F" + (i + 1) + " : " + (i + 1) + ". Aircraft Communicate");
				
					_Aircraft[i] = new Aircraft(this, i);
				
					continue;
				}
			}
			
			else
			{
				if(_Aircraft[i].Get_Knots() == 0)
				{
					_Aircraft[i] = null;
					
					continue;
				}	
				
				_Aircraft[i].Set_Parametric_Aircraft();
				
				_Transform_x_y.Transform(i);
				
				if((_Aircraft[i].Get_Runway() == 1) || (_Aircraft[i].Get_Runway() == 2) || (_Aircraft[i].Get_Runway() == 3) || (_Aircraft[i].Get_Runway() == 4))
				{
					if(_Check_Position_Landing[i]!=null)
					{
						_Check_Position_Landing[i].Check_Position(_Aircraft[i], this, i);
					}
				}
				
				if(_Sterring_Final_Aircraft [i] != null)
				{
					_Sterring_Final_Aircraft[i].Check_Landing(_Aircraft[i]);
					
					_Check_Position_Landing[i] = null;
				}
				
				if(_Aircraft[i].x > 1000)
				{
					_Aircraft[i] = null;
					
					 continue;
				}
				
				else if(_Aircraft[i].x < -18)
				{
					_Aircraft[i] = null;
					
					 continue;
				}
				
				else if(_Aircraft[i].y <- 18)
				{
					_Aircraft[i] = null;
					
					 continue;
				}
				
				else if(_Aircraft[i].y > 1000)
				{
					_Aircraft[i] = null;
					
					 continue;
				}
				
				if((_Transform_x_y.Get_Transform_x_y(1) > 1000) || (_Transform_x_y.Get_Transform_x_y(1) < 0) || (_Transform_x_y.Get_Transform_x_y(2) < 0) || (_Transform_x_y.Get_Transform_x_y(2) > 1000))
				{	
				  continue;  
				}
				
				else
				{
					if(Accepted_Key == true)
					{
						_Check_Collision_Terrain .Check_Collision_Aircraft_With_Terrain(_Aircraft[i], _Transform_x_y , i);
						
						_Check_Colision_Aircraft.Check_Colision(i);
						
						_System_Anti_Colision.Check(i);
					}
				}	
			}	
		}
	}
	
	@SuppressWarnings("deprecation")
	
	public void Render()
	{
		_BufferStrategy = _Display.getCanvas().getBufferStrategy();
		
		if(_BufferStrategy == null)
		{
			_Display.getCanvas().createBufferStrategy(3);
			
			return;
		}
		
		_Graphics = _BufferStrategy.getDrawGraphics();
		
		_Graphics.clearRect(0, 0, Width, Height);
		
		Draw();
		
		Draw_Table_Information();
		
		for(int i = 0; i < 5; i++)
		{
			if(Crash_Allert[i] == true)
			{
				Time[i]++;
				
				_Graphics.setColor(Color.GRAY);
				
				if(i == 0)
				{
					_Graphics.drawString("Aircraft : "+ ( i + 1) + " Probably Colision", 1030, 920);
				}
				
				else if(i == 1)
				{
					_Graphics.drawString("Aircraft : "+ ( i + 1) + " Probably Colision", 1030, 935);
				}
				
				else if(i == 2)
				{
					_Graphics.drawString("Aircraft : "+ ( i + 1) + " Probably Colision", 1030, 950);
				}
				
				else if(i == 3)
				{
					_Graphics.drawString("Aircraft : "+ ( i + 1) + " Probably Colision", 1030, 965);
				}
				
				else if(i == 4)
				{
					_Graphics.drawString("Aircraft : "+ ( i + 1) + " Probably Colision", 1030, 980);
				}
				
				if(Time[i] == 50)
				{
					Time[i] = 0;
					
					Crash_Allert[i] = false;
				}
			}
		}
		
		if(Accepted_Draw_Collision_Comunicate == true)
		{		
			_Graphics.setFont(font);
			
			_Graphics.setColor(Color.LIGHT_GRAY);
			
			_Graphics.drawString("Collision With Terrain !!", 150, 520);
		}
		
		if(Accepted_Draw_Collision_Comunicate_Aircraft == true)
		{
			_Graphics.setFont(font);
			
			_Graphics.setColor(Color.LIGHT_GRAY);
			
			_Graphics.drawString("Collision With Aircraft !!", 150, 520);
		}
		
		for(int i = 0; i < 5;i ++)
		{
			if(Number_Crash_Aircraft[i] == 1)
			{
				 _Graphics.drawImage( _Circle,(int)_Aircraft[i].x - 9, (int)_Aircraft[i].y - 7, null);
			}
		}
		_BufferStrategy.show();
		
		if((Accepted_Draw_Collision_Comunicate == true) || (Accepted_Draw_Collision_Comunicate_Aircraft == true))
		{
			_Thread.stop();
		}

		_Graphics.dispose();
	}
	
	public void run()
	{
		Initialization();
		
		while(Running)
		{
			Update();
			
			Render();
			
			Change_Parametric_Aircraft(this);
			
			try
			{
				Thread.sleep(100);
			}
			
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		stop();
	}
	
	public synchronized void start()
	{
		if(Running)
		{
			return;
		}
		
		Running = true;
		
		_Thread = new Thread(this);
		
		_Thread.start();	
	}
	
	public synchronized void stop()
	{
		if(!Running)
		{
			return;
		}
		
		Running = false;
		
		try
		{
			_Thread.join();
		} 
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	public Generate_Position_On_Runway Get_Generate_Position_On_Runway()
	{
		return _Generate_Position_On_Runway;
	}
	
	public Transform_x_y Get_Transform_x_y()
	{
		return _Transform_x_y;
	}
	
	public BufferedImage Get_Load_Image(int choose)
	{
		if(choose == 1)
		{
			return _Load_Image;
		}
		
		else if (choose == 2)
		{
			return _Load_Menu;
		}
		
		else if (choose == 3)
		{
			return _Load_Rectangle_Select;
		}
		
		else 
		{
			return null;
		}
	}
	
	public boolean Get_Accepted_Button_Y_N(int tab)
	{
		return Accepted_Button_Y_N[tab];
	}
	
	public void Set_Accepted_Button_Y_N(int tab, boolean decision)
	{
		Accepted_Button_Y_N[tab] = decision;
	}
	
	public void New_Sterring_Final_Aircraft(int Aircraft)
	{
		_Sterring_Final_Aircraft[Aircraft] = new Sterring_Final_Aircraft(this);
	}
	
	public Key_Manager Get_Key()
	{
		return _Key_Manager;
	}
	
	public void Create_Frame()
	{
		_JFrame = new JFrame();
	}
	
	public void Create_Scroll_Pane(int choose)
	{
		if(choose == 1)
		{
			_JScrollPane_1 = new JScrollPane(_JTextArea_1);
		}
		
		else if (choose == 2)
		{
			_JScrollPane_2 = new JScrollPane(_JTextArea_2);
		}
		
		else if (choose == 3)
		{
			_JScrollPane_3 = new JScrollPane(_JTextArea_3);
		}
		
		else if (choose == 4)
		{
			_JScrollPane_4 = new JScrollPane(_JTextArea_4);
		}
		
		else if (choose == 5)
		{
			_JScrollPane_5 = new JScrollPane(_JTextArea_5);
		}
	}
	
	public void Create_Text_Area(int choose)
	{
		if(choose == 1)
		{
			_JTextArea_1 = new JTextArea();
		}
		
		else if (choose == 2)
		{
			_JTextArea_2 = new JTextArea();
		}
		
		else if (choose == 3)
		{
			_JTextArea_3 = new JTextArea();
		}
		
		else if (choose == 4)
		{
			_JTextArea_4 = new JTextArea();
		}
		
		else if (choose == 5)
		{
			_JTextArea_5 = new JTextArea();
		}	
	}
	
	public void Create_JLabel()
	{
		Main_JLabel = new JLabel("Enter Parametr Aircraft");
		
		for(int i = 0 ; i < 3; i++)
		{
			_JLabel_Parametr[i] = new JLabel("");
		}
		
		for(int i = 0; i < 5; i++)
		{
			_Aircraft_Comunicate[i] = new JLabel("F" + (i + 1) + " : " + (i + 1) + ". Aircraft Communicate");
		}
	}
	
	public void Create_JTextField()
	{
		for(int i = 0; i < 3; i++)
		{
			_JTextField_Parametr[i] = new JTextField();
		}
	}
	
	public void Create_JButton()
	{
		_JButton_Parametr[0] = new JButton("Altitude");
		
		_JButton_Parametr[1] = new JButton("Course");
		
		_JButton_Parametr[2] = new JButton("Speed");
	}
	
	public JFrame Get_Frame()
	{
		return _JFrame;
	}
	
	public JLabel Get_JLabel_Main()
	{
		return Main_JLabel;
	}
	
	public JLabel Get_JLabel(int choose , int tab)
	{
		if(choose == 1)
		{
			return _JLabel_Parametr[tab];
		}
		
		else if(choose == 2)
		{
			return _Aircraft_Comunicate[tab];
		}
		
		else
		{
			return null;
		}
	}
	
	public JTextField Get_JTextField(int choose, int tab)
	{
		if(choose == 1)
		{
			return _JTextField_Parametr[tab];
		}
		
		else
		{
			return null;
		}
	}
	
	public JButton Get_JButton(int choose, int tab)
	{
		if(choose == 1)
		{
			return _JButton_Parametr[tab];
		}
		
		else
		{
			return null;
		}
	}
	
	public JTextArea Get_JText_Area(int choose)
	{
		if(choose == 1)
		{
			return _JTextArea_1;
		}
		
		else if (choose == 2)
		{
			return _JTextArea_2;
		}
		
		else if (choose == 3)
		{
			return _JTextArea_3;
		}
		
		else if (choose == 4)
		{
			return _JTextArea_4;
		}
		
		else if (choose == 5)
		{
			return _JTextArea_5;
		}
		
		else
		{
			return null;
		}
	}
	
	public Check_Position_Landing Get_Check_Position_Landing(int tab)
	{
		return _Check_Position_Landing[tab];
	}
	
	public Text_For_Change_Parametric Get__Text_For_Change_Parametric()
	{
		return _Text_For_Change_Parametric;
	}
	
	public JScrollPane Get_Scroll_Pane(int choose)
	{
		if(choose == 1)
		{
			return _JScrollPane_1;
		}
		
		else if (choose == 2)
		{
			return _JScrollPane_2;
		}
		
		else if (choose == 3)
		{
			return _JScrollPane_3;
		}
		
		else if (choose == 4)
		{
			return _JScrollPane_4;
		}
		
		else if (choose == 5)
		{
			return _JScrollPane_5;
		}
		
		else
		{
			return null;
		}
	}
	
	public Trim_Image Get_Trim_Image()
	{
		return _Trim_Image;
	}
	
	public Width_Image_Trim Get_Width_Image_Trim()
	{
		return _Width_Image_Trim;
	}
	
	@SuppressWarnings("null")
	
	public int Get_All_Int(int choose)
	{
		if(choose == 1)
		{
			return Time_Secwenction;
		}
		
		else if(choose == 2)
		{
			return Choose_Parametr;
		}
		
		else
		{
			return (Integer) null;
		}
	}
	
	@SuppressWarnings("null")
	
	public boolean Get_All_Boolean(int choose, int tab)
	{
		if(choose == 1)
		{
			return Select[tab];
		}
		
		else if(choose == 2)
		{
			return Secwenction_Select[tab];
		}
		
		
		else if (choose == 4)
		{
			return Accepted_Change_Parametr[tab];
		}
		
		else if (choose == 5)
		{
			return Accepteded_Add_Talking_Parametric[tab];
		}
		
		else if (choose == 6)
		{
			return Accepted_Key;
		}
		
		else
		{
			return (Boolean) null;
		}
	}
	
	public void Set_Int_All(int choose , int tab , int value)
	{
		if(choose == 1)
		{
			Time_Secwenction = value;
		}
		
		else if(choose == 2)
		{
			Choose_Parametr = value;
		}
	}
	
	public void Set_Boolean_All(int choose , int tab , boolean decision)
	{
		if(choose == 1)
		{
			Select[tab] = decision;
		}
		
		else if(choose == 2)
		{
			Secwenction_Select[tab] = decision;
		}
		
		else if (choose == 4)
		{
			Accepted_Change_Parametr[tab] = decision;
		}
		
		else if (choose == 5)
		{
			Accepteded_Add_Talking_Parametric[tab] = decision;
		}
		
		else if (choose == 6)
		{
			Accepted_Key = decision;
		}
	}
	
	public Graphics Get_Graphics()
	{
		return _Graphics;
	}
	
	public void Draw()
	{
		_Graphics.drawImage(_Load_Image, 0, 0, null);
		
		_Graphics.drawImage(_Load_Menu, 1000, 0, null);
		
		_Rectangle_Select.Rectangle_Select_Fly();
		
		_Draw_Raw_Parametric_Aircraft_Pos.Draw_Raw_Render();
		
		for(int i = 0 ; i < 5; i++)
		{
			if(_Aircraft[i] != null)
			{
				_Aircraft[i].Get_Indicator_spacer().Show_Next_Position();
			}
		}
		
		Select();
	}
	
	public void Draw_Table_Information()
	{		
		_Draw_Table.Draw_Table_Main();
	}
	
	public void Select()
	{	
		_Select_Aircraft.Select();
	}
	
	public int Get_Timer_For_Step_Dialog(int tab)
	{
		return Timer_For_Step_Dialog[tab];
	}
	
	public void Set_Timer_For_Step_Dialog(int tab, int value)
	{
		Timer_For_Step_Dialog[tab] = value;
	}
	
	public int Get_Number_Runway(int tab)
	{
		return Number_Runway[tab];
	}
	
	public void Set_Number_Runway(int tab, int value)
	{
		Number_Runway[tab] = value;
	}
	
	public Aircraft Get_Aircraft(int tab)
	{
		return _Aircraft[tab];
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		Object z = e.getSource();
		
		Change_Parametric_Aircraft(z);
	}
	
	public void Change_Parametric_Aircraft(Object z)
	{	
		_Change_Parametr_Show_Dialog.Dialog_Change_Parametr(z);
		
		Set_And_Communicate();
	}
	
	public void Set_And_Communicate()
	{
		for(int i = 0; i < 5; i++ )
		{
			if(Accepted_Change_Parametr[i] == true)
			{
				if(Choose_Parametr == 1)
				{
					_Text_For_Change_Parametric.Change_Altitude(i);
				}
				
				else if(Choose_Parametr == 2)
				{
					_Text_For_Change_Parametric.Change_HDG(i);
				}
				
				else if(Choose_Parametr == 3)
				{
					_Text_For_Change_Parametric.Change_Speed(i);
				}
			}
		}
	}		
}