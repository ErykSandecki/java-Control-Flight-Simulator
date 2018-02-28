package Control_Flight_Simulator_Tile;

import java.awt.Color;

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

import Control_Flight_Simulator_Aircraft.Aircraft;
import Control_Flight_Simulator_Aircraft_Landing.Text_For_Landing;
import Control_Flight_Simulator_Calculations.Trim_Image;

import Control_Flight_Simulator_Calculations.Width_Image_Trim;

import Control_Flight_Simulator_Display.Display;

import Control_Flight_Simulator_Texture.Image;

public class Simulator extends JFrame implements Runnable, ActionListener
{
	private static final long serialVersionUID = 1L;

	private Display _Display;
	
	private String Title;
	
	private JFrame _JFrame;
	
	private JLabel _JLabel,_JLabel_1 , _JLabel_2 , _JLabel_3, _Aircraft_Comunicate_1, _Aircraft_Comunicate_2, _Aircraft_Comunicate_3, _Aircraft_Comunicate_4, _Aircraft_Comunicate_5;
	
	private JTextField _JTextField_1, _JTextField_2, _JTextField_3;
	
	private JButton _JButton_1,_JButton_2, _JButton_3;
	
	private JTextArea _JTextArea_1, _JTextArea_2, _JTextArea_3, _JTextArea_4, _JTextArea_5;
	
	private JScrollPane _JScrollPane_1, _JScrollPane_2, _JScrollPane_3, _JScrollPane_4, _JScrollPane_5;
	
	private boolean Running = false;
	
	private int Width, Height;
	
	private Thread _Thread;
	
	private BufferStrategy _BufferStrategy;
	
	private Graphics _Graphics;
	
	private BufferedImage _Load_Image , _Load_Menu, _Load_Rectangle_Select;
	
	private Aircraft _Aircraft [];
	
	private Trim_Image _Trim_Image;
	
	private Width_Image_Trim _Width_Image_Trim;
	
	private Key_Manager _Key_Manager;
	
	@SuppressWarnings("unused")
	
	private Frame_Window _Frame_Window;
	
	private int Random;
	
	private boolean Secwenction_Select [] = new boolean [5];
	
	private Random _Random = new Random();
	
	private int Time_Secwenction = 0;
	
	private boolean Select_1 = false, Select_2 = false , Select_3 = false, Select_4 = false, Select_5 = false;
	
	private boolean Set_Text_Beginner[] = new boolean [5];
	
	private boolean Accepted_Landing[] = new boolean [5];
	
	private boolean Beginner_Accepted_Landing[] = new boolean [5];
	
	private boolean Not_Accepted_Landing[] = new boolean [5];
	
	private Text_For_Landing  _Text_For_Landing;
	
	public Simulator(String Title, int Width,int Height)
	{
		this.Title = Title;
		
		this.Width = Width;
		
		this.Height = Height;	
	}
	
	public void Set_JText_Area(int choose, String Description)
	{
		if(choose == 1)
		{
			_JTextArea_1.setText(Description);
		}
		
		else if(choose == 2)
		{
			_JTextArea_2.setText(Description);
		}
		
		else if(choose == 3)
		{
			_JTextArea_3.setText(Description);
		}
		
		else if(choose == 4)
		{
			_JTextArea_4.setText(Description);
		}
		
		else if(choose == 5)
		{
			_JTextArea_5.setText(Description);
		}
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
		_JLabel = new JLabel("Enter Parametr Aircraft");
		
		_JLabel_1 = new JLabel("");
		
		_JLabel_2 = new JLabel(" ");
		
		_JLabel_3 = new JLabel(" ");
		
		_Aircraft_Comunicate_1 = new JLabel("F1 : 1. Aircraft Communicate");
		
		_Aircraft_Comunicate_2 = new JLabel("F2 : 2. Aircraft Communicate");
		
		_Aircraft_Comunicate_3 = new JLabel("F3 : 3. Aircraft Communicate");
		
		_Aircraft_Comunicate_4 = new JLabel("F4 : 4. Aircraft Communicate");
		
		_Aircraft_Comunicate_5 = new JLabel("F5 : 5. Aircraft Communicate");
	}
	
	public void Create_JTextField()
	{
		_JTextField_1 = new JTextField();
		
		_JTextField_2 = new JTextField();
		
		_JTextField_3 = new JTextField();
	}
	
	public void Create_JButton()
	{
		_JButton_1 = new JButton("Course");
		
		_JButton_2 = new JButton("Speed");
		
		_JButton_3 = new JButton("Altitude");
	}
	
	public JFrame Get_Frame()
	{
		return _JFrame;
	}
	
	public JLabel Get_JLabel_Main()
	{
		return _JLabel;
	}
	
	public JLabel Get_JLabel(int choose)
	{
		if(choose == 1)
		{
			return _JLabel_1;
		}
		
		else if(choose == 2)
		{
			return _JLabel_2;
		}
		
		else if(choose == 3)
		{
			return _JLabel_3;
		}
		
		else if(choose == 4)
		{
			return _Aircraft_Comunicate_1;
		}
		
		else if(choose == 5)
		{
			return _Aircraft_Comunicate_2;
		}
		
		else if(choose == 6)
		{
			return _Aircraft_Comunicate_3;
		}
		
		else if(choose == 7)
		{
			return _Aircraft_Comunicate_4;
		}
		
		else if(choose == 8)
		{
			return _Aircraft_Comunicate_5;
		}
		else
		{
			return null;
		}
	}
	
	public JTextField Get_JTextField(int choose)
	{
		if(choose == 1)
		{
			return _JTextField_1;
		}
		
		else if(choose == 2)
		{
			return _JTextField_2;
		}
		
		else if(choose == 3)
		{
			return _JTextField_3;
		}
		
		else
		{
			return null;
		}
	}
	
	public JButton Get_JButton(int choose)
	{
		if(choose == 1)
		{
			return _JButton_1;
		}
		
		else if(choose == 2)
		{
			return _JButton_2;
		}
		
		else if(choose == 3)
		{
			return _JButton_3;
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
	
	private void Initialization()
	{
		_Key_Manager = new Key_Manager();
		
		_Display = new Display(Title, Width,  Height);
		
		_Display.getFrame().addKeyListener(_Key_Manager);
		
		_Frame_Window = new Frame_Window(this);
		
		_Load_Image = Image._BufferedImage("/Map/Map_World.png");
		
		_Load_Menu = Image._BufferedImage("/Map/Menu_Simulator.png");
		
		_Load_Rectangle_Select = Image._BufferedImage("/Map/Rectangle_Set.gif");
		
		_Aircraft = new Aircraft[5];
		
		_Trim_Image = new Trim_Image();
		
		_Width_Image_Trim = new Width_Image_Trim();
		
		_Text_For_Landing = new Text_For_Landing(this);
		
		for(int i = 0; i < 5; i++)
		{
			Secwenction_Select[i] = false;
			
			Beginner_Accepted_Landing[i] = false;
			
			Not_Accepted_Landing[i] = false;
		}
		
	}
	
	public void Update()
	{
		for(int i = 0; i < 5; i++)
		{
			Random = _Random.nextInt(1001); // dodac 2 zera
			
			if(Random == 100)
			{
				if(_Aircraft[i] == null)
				{
					_Aircraft[i] = new Aircraft();
				}
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			if(_Aircraft[i] == null)
			{
				continue;
			}
			
			else
			{
				_Aircraft[i].Set_Parametric_Aircraft();
				
				if(_Aircraft[i].x > 1000)
				{
					_Aircraft[i] = null;
				}
				
				else if(_Aircraft[i].x < -18)
				{
					_Aircraft[i] = null;
				}
				
				else if(_Aircraft[i].y <- 18)
				{
					_Aircraft[i] = null;
				}
				
				else if(_Aircraft[i].y > 1000)
				{
					_Aircraft[i] = null;
				}
			}	
		}	
	}
	
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
				
		_BufferStrategy.show();
		
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
				Thread.sleep(1);
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

	public void Draw()
	{
		_Graphics.drawImage(_Load_Image, 0, 0, null);
		
		_Graphics.drawImage(_Load_Menu, 1000, 0, null);

		Select();
		
		if(Time_Secwenction > 500)
		{
			if(Select_1 == true)
			{
				_Graphics.drawImage(_Load_Rectangle_Select, 1008, 298, null);
			}
		
			else if(Select_2 == true)
			{
				_Graphics.drawImage(_Load_Rectangle_Select, 1008, 408, null);
			}
		
			else if(Select_3 == true)
			{
				_Graphics.drawImage(_Load_Rectangle_Select, 1008, 518, null);
			}
		
			else if(Select_4 == true)
			{
				_Graphics.drawImage(_Load_Rectangle_Select, 1008, 628, null);
			}
		
			else if(Select_5 == true)
			{
				_Graphics.drawImage(_Load_Rectangle_Select, 1008, 738, null);
			}
			
			Time_Secwenction++;
		}
		
		else
		{
			Time_Secwenction++;
		}
		
		if(Time_Secwenction == 1000)
		{
			Time_Secwenction = 1;
		}
		
		for(int i = 0; i < 5; i++)
		{
			if(_Aircraft[i] == null)
			{
				continue;
			}
		
			else
			{
				if(_Aircraft[i].x >= _Trim_Image.Width_Image(_Aircraft[i].x))
				{
					_Graphics.drawImage(_Aircraft[i]._Sprite_Sheet.crop(0, 0, (int)_Width_Image_Trim.Width(_Aircraft[i].x), 18), (int)_Aircraft[i].x, (int)_Aircraft[i].y, null);
				}
				
				else
				{
					_Graphics.drawImage(_Aircraft[i].Get_Buffered_Image(1), (int)_Aircraft[i].x, (int)_Aircraft[i].y, null);
				}
					
				if(_Aircraft[i].Get_Change_Raw(0) == false)
				{
					_Graphics.drawImage(_Aircraft[i].Get_Buffered_Image(2), (int)_Aircraft[i].x+15, (int)_Aircraft[i].y+15, null);
					
					if((Secwenction_Select[i] == true) && (Time_Secwenction > 500))
					{
						_Graphics.setColor(Color.red);
					}
					
					else
					{
						_Graphics.setColor(Color.yellow);
					}
					
					_Graphics.drawString("KTS : " + Integer.toString(_Aircraft[i].Get_Knots()), (int)_Aircraft[i].x+30,(int)_Aircraft[i].y+45);
		
					_Graphics.drawString("HDG : " + Integer.toString(_Aircraft[i].Get_HDG()), (int)_Aircraft[i].x+30,(int)_Aircraft[i].y+58);
				
					_Graphics.drawString("ALT : " + Integer.toString(_Aircraft[i].Get_Altitude()), (int)_Aircraft[i].x+30,(int)_Aircraft[i].y+71);
					
					_Graphics.setColor(Color.red);
					
					_Graphics.drawString(i + 1 + ".",(int)_Aircraft[i].x+20,(int)_Aircraft[i].y+84);
					
					if((Secwenction_Select[i] == true) && (Time_Secwenction > 500))
					{
						_Graphics.setColor(Color.red);
					}
					
					else
					{
						_Graphics.setColor(Color.yellow);
					}
					
					_Graphics.drawString("FLN : " + _Aircraft[i].Get_Name_Fly(), (int)_Aircraft[i].x+30,(int)_Aircraft[i].y+84);
				}
				
				else if(_Aircraft[i].Get_Change_Raw(1) == false)
				{
					_Graphics.drawImage(_Aircraft[i].Get_Buffered_Image(2), (int)_Aircraft[i].x-30, (int)_Aircraft[i].y+15, null);
					
					if((Secwenction_Select[i] == true) && (Time_Secwenction > 500))
					{
						_Graphics.setColor(Color.red);
					}
					
					else
					{
						_Graphics.setColor(Color.yellow);
					}
		
					_Graphics.drawString("KTS : " + Integer.toString(_Aircraft[i].Get_Knots()), (int)_Aircraft[i].x-100,(int)_Aircraft[i].y+45);
		
					_Graphics.drawString("HDG : " + Integer.toString(_Aircraft[i].Get_HDG()), (int)_Aircraft[i].x-100,(int)_Aircraft[i].y+58);
				
					_Graphics.drawString("ALT : " + Integer.toString(_Aircraft[i].Get_Altitude()), (int)_Aircraft[i].x-100,(int)_Aircraft[i].y+71);
					
					_Graphics.setColor(Color.red);
					
					_Graphics.drawString(i + 1 + ".",(int)_Aircraft[i].x-110,(int)_Aircraft[i].y+84);
					
					if((Secwenction_Select[i] == true) && (Time_Secwenction > 500))
					{
						_Graphics.setColor(Color.red);
					}
					
					else
					{
						_Graphics.setColor(Color.yellow);
					}
					
					_Graphics.drawString("FLN : " + _Aircraft[i].Get_Name_Fly(), (int)_Aircraft[i].x-100,(int)_Aircraft[i].y+84);
				}
				
				else if(_Aircraft[i].Get_Change_Raw(2) == false)
				{
					_Graphics.drawImage(_Aircraft[i].Get_Buffered_Image(2), (int)_Aircraft[i].x+20, (int)_Aircraft[i].y-15, null);
					
					if((Secwenction_Select[i] == true) && (Time_Secwenction > 500))
					{
						_Graphics.setColor(Color.red);
					}
					
					else
					{
						_Graphics.setColor(Color.yellow);
					}
		
					_Graphics.drawString("KTS : " + Integer.toString(_Aircraft[i].Get_Knots()), (int)_Aircraft[i].x+30,(int)_Aircraft[i].y-17);
		
					_Graphics.drawString("HDG : " + Integer.toString(_Aircraft[i].Get_HDG()), (int)_Aircraft[i].x+30,(int)_Aircraft[i].y-30);
				
					_Graphics.drawString("ALT : " + Integer.toString(_Aircraft[i].Get_Altitude()), (int)_Aircraft[i].x+30,(int)_Aircraft[i].y-43);
					
					_Graphics.setColor(Color.red);
					
					_Graphics.drawString(i + 1 + ".",(int)_Aircraft[i].x+20,(int)_Aircraft[i].y-56);
					
					if((Secwenction_Select[i] == true) && (Time_Secwenction > 500))
					{
						_Graphics.setColor(Color.red);
					}
					
					else
					{
						_Graphics.setColor(Color.yellow);
					}
					
					_Graphics.drawString("FLN : " + _Aircraft[i].Get_Name_Fly(), (int)_Aircraft[i].x+30,(int)_Aircraft[i].y-56);
				}
				
				else
				{
					_Graphics.drawImage(_Aircraft[i].Get_Buffered_Image(2), (int)_Aircraft[i].x-30, (int)_Aircraft[i].y-15, null);
					
					if((Secwenction_Select[i] == true) && (Time_Secwenction > 500))
					{
						_Graphics.setColor(Color.red);
					}
					
					else
					{
						_Graphics.setColor(Color.yellow);
					}
		
					_Graphics.drawString("KTS : " + Integer.toString(_Aircraft[i].Get_Knots()), (int)_Aircraft[i].x-100,(int)_Aircraft[i].y-17);
		
					_Graphics.drawString("HDG : " + Integer.toString(_Aircraft[i].Get_HDG()), (int)_Aircraft[i].x-100,(int)_Aircraft[i].y-30);
				
					_Graphics.drawString("ALT : " + Integer.toString(_Aircraft[i].Get_Altitude()), (int)_Aircraft[i].x-100,(int)_Aircraft[i].y-43);
					
					_Graphics.setColor(Color.red);
					
					_Graphics.drawString(i + 1 + ".",(int)_Aircraft[i].x-110,(int)_Aircraft[i].y-56);
					
					if((Secwenction_Select[i] == true) && (Time_Secwenction > 500))
					{
						_Graphics.setColor(Color.red);
					}
					
					else
					{
						_Graphics.setColor(Color.yellow);
					}
					
					_Graphics.drawString("FLN : " + _Aircraft[i].Get_Name_Fly(), (int)_Aircraft[i].x-100,(int)_Aircraft[i].y-56);
				}
			}
		}

	}
	
	public void Draw_Table_Information()
	{	
		for(int i = 0; i < 5; i++)
		{
			if(_Aircraft[i] == null)
			{
				continue;
			}
			
			else
			{
				if(i==0)
				{
					_Graphics.setColor(Color.YELLOW);
					
					_Graphics.drawString(_Aircraft[i].Get_Name_Fly(),1100,315);
					
					_Graphics.drawString(_Aircraft[i].Get_Name_Aircraft(),1163,315 + 20);
					
					_Graphics.setColor(Color.RED);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_Altitude()),1128,315 + 40);
					
					_Graphics.setColor(Color.BLUE);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_HDG()),1128,315 + 60);
					
					_Graphics.setColor(Color.GREEN);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_Knots()),1128,315 + 80);
					
					_Graphics.setColor(Color.RED);
					
					if(_Aircraft[i].Get_Changer_Parametric(1) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(1)),1165,315 + 40);
					}
					
					_Graphics.setColor(Color.BLUE);
					
					if(_Aircraft[i].Get_Changer_Parametric(2) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(2)),1165,315 + 60);
					}
					
					_Graphics.setColor(Color.GREEN);
					
					if(_Aircraft[i].Get_Changer_Parametric(3) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(3)),1165,315 + 80);
					}
					
				}
				
				else if(i == 1)
				{
					_Graphics.setColor(Color.YELLOW);
					
					_Graphics.drawString(_Aircraft[i].Get_Name_Fly(),1100,315 + 110);
					
					_Graphics.drawString(_Aircraft[i].Get_Name_Aircraft(),1163,315 + 20 + 110);
					
					_Graphics.setColor(Color.RED);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_Altitude()),1128,315 + 40 + 110);
					
					_Graphics.setColor(Color.BLUE);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_HDG()),1128,315 + 60 + 110);
					
					_Graphics.setColor(Color.GREEN);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_Knots()),1128,315 + 80 + 110);
					
					_Graphics.setColor(Color.RED);
					
					if(_Aircraft[i].Get_Changer_Parametric(1) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(1)),1165,315 + 40 + 110);
					}
					
					_Graphics.setColor(Color.BLUE);
					
					if(_Aircraft[i].Get_Changer_Parametric(2) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(2)),1165,315 + 60 + 110);
					}
					
					_Graphics.setColor(Color.GREEN);
					
					if(_Aircraft[i].Get_Changer_Parametric(3) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(3)),1165,315 + 80 + 110);
					}
				}
				
				else if(i == 2)
				{
					_Graphics.setColor(Color.YELLOW);
					
					_Graphics.drawString(_Aircraft[i].Get_Name_Fly(),1100,315 + 220);
					
					_Graphics.drawString(_Aircraft[i].Get_Name_Aircraft(),1163,315 + 20 + 220);
					
					_Graphics.setColor(Color.RED);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_Altitude()),1128,315 + 40 + 220);
					
					_Graphics.setColor(Color.BLUE);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_HDG()),1128,315 + 60 + 220);
					
					_Graphics.setColor(Color.GREEN);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_Knots()),1128,315 + 80 + 220);
					
					_Graphics.setColor(Color.RED);
					
					if(_Aircraft[i].Get_Changer_Parametric(1) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(1)),1165,315 + 40 + 220);
					}
					
					_Graphics.setColor(Color.BLUE);
					
					if(_Aircraft[i].Get_Changer_Parametric(2) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(2)),1165,315 + 60 + 220);
					}
					
					_Graphics.setColor(Color.GREEN);
					
					if(_Aircraft[i].Get_Changer_Parametric(3) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(3)),1165,315 + 80 + 220);
					}
				}
				
				else if(i == 3)
				{
					_Graphics.setColor(Color.YELLOW);
					
					_Graphics.drawString(_Aircraft[i].Get_Name_Fly(),1100,315 + 330);
					
					_Graphics.drawString(_Aircraft[i].Get_Name_Aircraft(),1163,315 + 20 + 330);
					
					_Graphics.setColor(Color.RED);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_Altitude()),1128,315 + 40 + 330);
					
					_Graphics.setColor(Color.BLUE);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_HDG()),1128,315 + 60 + 330);
					
					_Graphics.setColor(Color.GREEN);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_Knots()),1128,315 + 80 + 330);
					
					_Graphics.setColor(Color.RED);
					
					if(_Aircraft[i].Get_Changer_Parametric(1) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(1)),1165,315 + 40 + 330);
					}
					
					_Graphics.setColor(Color.BLUE);
					
					if(_Aircraft[i].Get_Changer_Parametric(2) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(2)),1165,315 + 60 + 330);
					}
					
					_Graphics.setColor(Color.GREEN);
					
					if(_Aircraft[i].Get_Changer_Parametric(3) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(3)),1165,315 + 80 + 330);
					}
				}
				
				else
				{
					_Graphics.setColor(Color.YELLOW);
					
					_Graphics.drawString(_Aircraft[i].Get_Name_Fly(),1100,315 + 440);
					
					_Graphics.drawString(_Aircraft[i].Get_Name_Aircraft(),1163,315 + 20 + 440);
					
					_Graphics.setColor(Color.RED);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_Altitude()),1128,315 + 40 + 440);
					
					_Graphics.setColor(Color.BLUE);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_HDG()),1128,315 + 60 + 440);
					
					_Graphics.setColor(Color.GREEN);
					
					_Graphics.drawString(Integer.toString(_Aircraft[i].Get_Knots()),1128,315 + 80 + 440);
					
					_Graphics.setColor(Color.RED);
					
					if(_Aircraft[i].Get_Changer_Parametric(1) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(1)),1165,315 + 40 + 440);
					}
					
					_Graphics.setColor(Color.BLUE);
					
					if(_Aircraft[i].Get_Changer_Parametric(2) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(2)),1165,315 + 60 + 440);
					}
					
					_Graphics.setColor(Color.GREEN);
					
					if(_Aircraft[i].Get_Changer_Parametric(3) == true)
					{
						_Graphics.drawString("----->   "+Integer.toString(_Aircraft[i].Get_Target(3)),1165,315 + 80 + 440);
					}
				}
			}
		}
		
		for(int i = 315; i <= 759; i = i + 110)
		{
		_Graphics.setColor(Color.LIGHT_GRAY);
		
		_Graphics.drawString("Fly Name :", 1036,i);
		
		_Graphics.drawString("Aircraft Name of Type :", 1036,i+20);
		
		_Graphics.drawString("Altitude in Feet :", 1036,i+40);
		
		_Graphics.drawString("Course in HDG :", 1036,i+60);
		
		_Graphics.drawString("Speed in Knots :", 1036,i+80);
		
		
		}
	}
	
	public void Select()
	{
		if(Get_Key().Get_Select(1))
		{
			Select_1 = true;
			
			Select_2 = false;
			
			Select_3 = false;
			
			Select_4 = false;
			
			Select_5 = false;
			
			Secwenction_Select[0] = true;
			
			Secwenction_Select[1] = false;
			
			Secwenction_Select[2] = false;
			
			Secwenction_Select[3] = false;
			
			Secwenction_Select[4] = false;
		}
		
		else if(Get_Key().Get_Select(2))
		{
			Select_2 = true;
			
			Select_1 = false;
			
			Select_3 = false;
			
			Select_4 = false;
			
			Select_5 = false;
			
			Secwenction_Select[1] = true;
			
			Secwenction_Select[0] = false;
			
			Secwenction_Select[2] = false;
			
			Secwenction_Select[3] = false;
			
			Secwenction_Select[4] = false;
		}
		
		else if(Get_Key().Get_Select(3))
		{
			Select_3 = true;
			
			Select_1 = false;
			
			Select_2 = false;
			
			Select_4 = false;
			
			Select_5 = false;
			
			Secwenction_Select[2] = true;
			
			Secwenction_Select[0] = false;
			
			Secwenction_Select[1] = false;
			
			Secwenction_Select[3] = false;
			
			Secwenction_Select[4] = false;
		}
		
		else if(Get_Key().Get_Select(4))
		{
			Select_4 = true;
			
			Select_1 = false;
			
			Select_2 = false;
			
			Select_3 = false;
			
			Select_5 = false;
			
			Secwenction_Select[3] = true;
			
			Secwenction_Select[0] = false;
			
			Secwenction_Select[1] = false;
			
			Secwenction_Select[2] = false;
			
			Secwenction_Select[4] = false;
		}
		
		else if(Get_Key().Get_Select(5))
		{
			Select_5 = true;
			
			Select_1 = false;
			
			Select_2 = false;
			
			Select_3 = false;
			
			Select_4 = false;
			
			Secwenction_Select[4] = true;
			
			Secwenction_Select[0] = false;
			
			Secwenction_Select[1] = false;
			
			Secwenction_Select[2] = false;
			
			Secwenction_Select[3] = false;
		}
		
		else if(Get_Key().Get_Select(6))
		{
			Select_1 = false;
			
			Select_2 = false;
			
			Select_3 = false;
			
			Select_4 = false;
			
			Select_5 = false;
			
			Secwenction_Select[0] = false;
			
			Secwenction_Select[1] = false;
			
			Secwenction_Select[2] = false;
			
			Secwenction_Select[3] = false;
			
			Secwenction_Select[4] = false;
		}
		
		else if(Get_Key().Get_Select(7))
		{
			if((Select_1 == true) && ( Beginner_Accepted_Landing[0] == true))
			{
				Accepted_Landing[0] = true;
				
				Beginner_Accepted_Landing[0] = false;
			}
			
			else if((Select_2 == true) && ( Beginner_Accepted_Landing[1] == true))
			{
				Accepted_Landing[1] = true;
				
				Beginner_Accepted_Landing[1] = false;
			}
			
			else if((Select_3 == true) && ( Beginner_Accepted_Landing[2] == true))
			{
				Accepted_Landing[2] = true;
				
				Beginner_Accepted_Landing[2] = false;
			}
			
			else if((Select_4 == true) && ( Beginner_Accepted_Landing[3] == true))
			{
				Accepted_Landing[3] = true;
				
				Beginner_Accepted_Landing[3] = false;
			}
			
			else if((Select_5 == true) && ( Beginner_Accepted_Landing[4] == true))
			{
				Accepted_Landing[4] = true;
				
				Beginner_Accepted_Landing[4] = false;
			}
		}
		
		else if(Get_Key().Get_Select(8))
		{
			if((Select_1 == true) && ( Beginner_Accepted_Landing[0] ==true))
			{
				Not_Accepted_Landing[0] = true;
				
				Beginner_Accepted_Landing[0] = false;
			}
			
			else if((Select_2 == true) && ( Beginner_Accepted_Landing[1] ==true))
			{
				Not_Accepted_Landing[1] = true;
				
				Beginner_Accepted_Landing[1] = false;
			}
			
			else if((Select_3 == true) && ( Beginner_Accepted_Landing[2] ==true))
			{
				Not_Accepted_Landing[2] = true;
				
				Beginner_Accepted_Landing[2] = false;
			}
			
			else if((Select_4 == true) && ( Beginner_Accepted_Landing[3] ==true))
			{
				Not_Accepted_Landing[3] = true;
				
				Beginner_Accepted_Landing[3] = false;
			}
			
			else if((Select_5 == true) && ( Beginner_Accepted_Landing[4] ==true))
			{
				Not_Accepted_Landing[4] = true;
				
				Beginner_Accepted_Landing[4] = false;
			}
		}
	}
	
	public Aircraft Get_Aircraft(int tab)
	{
		return _Aircraft[tab];
	}
	
	@SuppressWarnings("null")
	
	public boolean Get_Variable_For_Text_For_Landing(int choose, int tab)
	{
		if (choose == 1)
		{
			return Beginner_Accepted_Landing[tab];
		}
		
		else if (choose == 2)
		{
			return Set_Text_Beginner[tab];
		}
		
		else if (choose == 3)
		{
			return Accepted_Landing[tab];
		}
		
		else if (choose == 4)
		{
			return Not_Accepted_Landing[tab]; 
		}
		
		else
		{
			return (Boolean) null;
		}
	}
	
	public void Set_Variable_For_Text_For_Landing(int choose, int tab , boolean decision)
	{
		if (choose == 1)
		{
			Beginner_Accepted_Landing[tab] = decision;
		}
		
		else if (choose == 2)
		{
			Set_Text_Beginner[tab] = decision;
		}
		
		else if (choose == 3)
		{
			Accepted_Landing[tab] = decision;
		}
		
		else if (choose == 4)
		{
			Not_Accepted_Landing[tab] = decision;
		}
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		Object z = e.getSource();
		
		Change_Parametric_Aircraft(z);
	}
	
	public void Change_Parametric_Aircraft(Object z)
	{	
		_Text_For_Landing.Text_Landing();
		
		if((Select_1 == true) && (_Aircraft [0] != null))
		{	
			_Aircraft_Comunicate_1.setForeground(Color.RED);
			
			_Aircraft_Comunicate_1.setText("F1 : 1. Aircraft Communicate");
			
			_Aircraft_Comunicate_2.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_2.setText("F2 : 2. Aircraft Communicate");

			_Aircraft_Comunicate_3.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_3.setText("F3 : 3. Aircraft Communicate");
			
			_Aircraft_Comunicate_4.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_4.setText("F4 : 4. Aircraft Communicate");
			
			_Aircraft_Comunicate_5.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_5.setText("F5 : 5. Aircraft Communicate");
			
			if((z == _JButton_1)||(z == _JTextField_1))
			{	
				_JLabel_1.setText(""); 
						
				if(_JTextField_1.getText().equals(""))
				{
					_JLabel_1.setText("Error : Empty parametric!");
				}
				
				else
				{
					if((_Aircraft[0].Get_Random_Type_Aircraft().Random() == 1) || (_Aircraft[0].Get_Random_Type_Aircraft().Random() == 2) || (_Aircraft[0].Get_Random_Type_Aircraft().Random() == 3))
					{
						if((_Aircraft[0].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true) || (_Aircraft[0].Get_Physic_Type_Of_Aircraft().Get_Passenger_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true)||(_Aircraft[0].Get_Physic_Type_Of_Aircraft().Get_Passenger_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true))
						{
							_Aircraft[0].Set_HDG(Integer.parseInt(_JTextField_1.getText()));
							
							_Aircraft[0].Get_Angle().Beginner = true;
						}
						
						else
						{
							_JTextField_1.setText("");
						}
					}
				}
			}
	
			else if((z == _JButton_2)||(z == _JTextField_2))
			{
				_JLabel_2.setText("");
				
				if(_JTextField_2.getText().equals(""))
				{
					_JLabel_2.setText("Error : Empty parametric!");
				}
				
				else if(_Aircraft[0].Get_Random_Type_Aircraft().Random() == 1)
				{
					if(_Aircraft[0].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[0].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[0].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
				
				else if(_Aircraft[0].Get_Random_Type_Aircraft().Random() == 2)
				{
					if(_Aircraft[0].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[0].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[0].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
				
				else if(_Aircraft[0].Get_Random_Type_Aircraft().Random() == 3)
				{
					if(_Aircraft[0].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[0].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[0].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
			}
		
			else if((z == _JButton_3)||(z == _JTextField_3))
			{
				_JLabel_3.setText("");
				
				if(_JTextField_3.getText().equals(""))
				{
					_JLabel_3.setText("Error : Empty parametric!");
				}
				
				else if(_Aircraft[0].Get_Random_Type_Aircraft().Random() == 1)
				{
					if(_Aircraft[0].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{
						_Aircraft[0].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[0].Get_Altitude_Height().Beginner = true;
					}
					
					else
					{
						_JTextField_3.setText("");
					}
				}
				
				else if(_Aircraft[0].Get_Random_Type_Aircraft().Random() == 2)
				{
					if(_Aircraft[0].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{
						_Aircraft[0].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[0].Get_Altitude_Height().Beginner = true;
					}

					else
					{
						_JTextField_3.setText("");
					}
				}
				
				else if(_Aircraft[0].Get_Random_Type_Aircraft().Random() == 3)
				{
					if(_Aircraft[0].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{
						_Aircraft[0].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[0].Get_Altitude_Height().Beginner = true;
					}
					
					else
					{
						_JTextField_3.setText("");
					}
				}
			}
		}
		
		else if((Select_2 == true) && (_Aircraft [1] != null))
		{
			_Aircraft_Comunicate_2.setForeground(Color.RED);
			
			_Aircraft_Comunicate_2.setText("F2 : 2. Aircraft Communicate");
			
			_Aircraft_Comunicate_1.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_1.setText("F1 : 1. Aircraft Communicate");

			_Aircraft_Comunicate_3.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_3.setText("F3 : 3. Aircraft Communicate");
			
			_Aircraft_Comunicate_4.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_4.setText("F4 : 4. Aircraft Communicate");
			
			_Aircraft_Comunicate_5.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_5.setText("F5 : 5. Aircraft Communicate");
			
			if((z == _JButton_1)||(z == _JTextField_1))
			{
				_JLabel_1.setText("");
				
				if(_JTextField_1.getText().equals(""))
				{
					_JLabel_1.setText("Error : Empty parametric!");
				}
				
				else
				{
					if((_Aircraft[1].Get_Random_Type_Aircraft().Random() == 1) || (_Aircraft[1].Get_Random_Type_Aircraft().Random() == 2) || (_Aircraft[1].Get_Random_Type_Aircraft().Random() == 3))
					{
						if((_Aircraft[1].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true) || (_Aircraft[1].Get_Physic_Type_Of_Aircraft().Get_Passenger_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true)||(_Aircraft[1].Get_Physic_Type_Of_Aircraft().Get_Passenger_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true))
						{
							_Aircraft[1].Set_HDG(Integer.parseInt(_JTextField_1.getText()));
							
							_Aircraft[1].Get_Angle().Beginner = true;
						}
						
						else
						{
							_JTextField_1.setText("");
						}
					}
				}
			}
	
			else if((z == _JButton_2)||(z == _JTextField_2))
			{
				_JLabel_2.setText("");
				
				if(_JTextField_2.getText().equals(""))
				{
					_JLabel_2.setText("Error : Empty parametric!");
				}
				
				else if(_Aircraft[1].Get_Random_Type_Aircraft().Random() == 1)
				{
					if(_Aircraft[1].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[1].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[1].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
				
				else if(_Aircraft[1].Get_Random_Type_Aircraft().Random() == 2)
				{
					if(_Aircraft[1].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[1].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[1].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
				
				else if(_Aircraft[1].Get_Random_Type_Aircraft().Random() == 3)
				{
					if(_Aircraft[1].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[1].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[1].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
			}
		
			else if((z == _JButton_3)||(z == _JTextField_3))
			{
				_JLabel_3.setText("");
				
				if(_JTextField_3.getText().equals(""))
				{
					_JLabel_3.setText("Error : Empty parametric!");
				}
				
				else if(_Aircraft[1].Get_Random_Type_Aircraft().Random() == 1)
				{
					if(_Aircraft[1].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{
						_Aircraft[1].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[1].Get_Altitude_Height().Beginner = true;
					}
					
					else
					{
						_JTextField_3.setText("");
					}
				}
				
				else if(_Aircraft[1].Get_Random_Type_Aircraft().Random() == 2)
				{
					if(_Aircraft[1].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{
						_Aircraft[1].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[1].Get_Altitude_Height().Beginner = true;
					}
					
					else
					{
						_JTextField_3.setText("");
					}
				}
				
				else if(_Aircraft[1].Get_Random_Type_Aircraft().Random() == 3)
				{
					if(_Aircraft[1].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{
						_Aircraft[1].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[1].Get_Altitude_Height().Beginner = true;
					}
					
					else
					{
						_JTextField_3.setText("");
					}
				}
			}
		}
		
		else if((Select_3 == true) && (_Aircraft [2] != null))
		{
			_Aircraft_Comunicate_3.setForeground(Color.RED);
			
			_Aircraft_Comunicate_3.setText("F3 : 3. Aircraft Communicate");
			
			_Aircraft_Comunicate_2.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_2.setText("F2 : 2. Aircraft Communicate");

			_Aircraft_Comunicate_1.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_1.setText("F1 : 1. Aircraft Communicate");
			
			_Aircraft_Comunicate_4.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_4.setText("F4 : 4. Aircraft Communicate");
			
			_Aircraft_Comunicate_5.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_5.setText("F5 : 5. Aircraft Communicate");
			
			if((z == _JButton_1)||(z == _JTextField_1))
			{
				_JLabel_1.setText("");
				
				if(_JTextField_1.getText().equals(""))
				{
					_JLabel_1.setText("Error : Empty parametric!");
				}

				else
				{
					if((_Aircraft[2].Get_Random_Type_Aircraft().Random() == 1) || (_Aircraft[2].Get_Random_Type_Aircraft().Random() == 2) || (_Aircraft[2].Get_Random_Type_Aircraft().Random() == 3))
					{
						if((_Aircraft[2].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true) || (_Aircraft[2].Get_Physic_Type_Of_Aircraft().Get_Passenger_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true)||(_Aircraft[2].Get_Physic_Type_Of_Aircraft().Get_Passenger_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true))
						{
							_Aircraft[2].Set_HDG(Integer.parseInt(_JTextField_1.getText()));
							
							_Aircraft[2].Get_Angle().Beginner = true;
						}
						
						else
						{
							_JTextField_1.setText("");
						}
					}
				}
			}
	
			else if((z == _JButton_2)||(z == _JTextField_2))
			{
				_JLabel_2.setText("");
				
				if(_JTextField_2.getText().equals(""))
				{
					_JLabel_2.setText("Error : Empty parametric!");
				}
				
				else if(_Aircraft[2].Get_Random_Type_Aircraft().Random() == 1)
				{
					if(_Aircraft[2].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[2].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[2].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
				
				else if(_Aircraft[2].Get_Random_Type_Aircraft().Random() == 2)
				{
					if(_Aircraft[2].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[2].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[2].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
				
				else if(_Aircraft[2].Get_Random_Type_Aircraft().Random() == 3)
				{
					if(_Aircraft[2].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[2].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[2].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
			}
		
			else if((z == _JButton_3)||(z == _JTextField_3))
			{
				_JLabel_3.setText("");
				
				if(_JTextField_3.getText().equals(""))
				{
					_JLabel_3.setText("Error : Empty parametric!");
				}
				
				else if(_Aircraft[2].Get_Random_Type_Aircraft().Random() == 1)
				{
					if(_Aircraft[2].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{
						_Aircraft[2].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[2].Get_Altitude_Height().Beginner = true;
					}
					
					else
					{
						_JTextField_3.setText("");
					}
				}
				
				else if(_Aircraft[2].Get_Random_Type_Aircraft().Random() == 2)
				{
					if(_Aircraft[2].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{
						_Aircraft[2].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[2].Get_Altitude_Height().Beginner = true;
					}
					
					else
					{
						_JTextField_3.setText("");
					}
				}
				
				else if(_Aircraft[2].Get_Random_Type_Aircraft().Random() == 3)
				{
					if(_Aircraft[2].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{
						_Aircraft[2].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[2].Get_Altitude_Height().Beginner = true;
					}
					
					else
					{
						_JTextField_3.setText("");
					}
				}
			}
		}
		
		else if((Select_4 == true) && (_Aircraft [3] != null))
		{
			_Aircraft_Comunicate_4.setForeground(Color.RED);
			
			_Aircraft_Comunicate_4.setText("F4 : 4. Aircraft Communicate");
			
			_Aircraft_Comunicate_2.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_2.setText("F2 : 2. Aircraft Communicate");

			_Aircraft_Comunicate_3.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_3.setText("F3 : 3. Aircraft Communicate");
			
			_Aircraft_Comunicate_1.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_1.setText("F1 : 1. Aircraft Communicate");
			
			_Aircraft_Comunicate_5.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_5.setText("F5 : 5. Aircraft Communicate");
			
			if((z == _JButton_1)||(z == _JTextField_1))
			{
				_JLabel_1.setText("");
				
				if(_JTextField_1.getText().equals(""))
				{
					_JLabel_1.setText("Error : Empty parametric!");
				}

				else
				{
					if((_Aircraft[3].Get_Random_Type_Aircraft().Random() == 1) || (_Aircraft[3].Get_Random_Type_Aircraft().Random() == 2) || (_Aircraft[3].Get_Random_Type_Aircraft().Random() == 3))
					{
						if((_Aircraft[3].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true) || (_Aircraft[3].Get_Physic_Type_Of_Aircraft().Get_Passenger_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true)||(_Aircraft[3].Get_Physic_Type_Of_Aircraft().Get_Passenger_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true))
						{
							_Aircraft[3].Set_HDG(Integer.parseInt(_JTextField_1.getText()));
							
							_Aircraft[3].Get_Angle().Beginner = true;
						}
						
						else
						{
							_JTextField_1.setText("");
						}
					}
				}
			}
	
			else if((z == _JButton_2)||(z == _JTextField_2))
			{
				_JLabel_2.setText("");
				
				if(_JTextField_2.getText().equals(""))
				{
					_JLabel_2.setText("Error : Empty parametric!");
				}
				
				else if(_Aircraft[3].Get_Random_Type_Aircraft().Random() == 1)
				{
					if(_Aircraft[3].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[3].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[3].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
				
				else if(_Aircraft[3].Get_Random_Type_Aircraft().Random() == 2)
				{
					if(_Aircraft[3].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[3].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[3].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
				
				else if(_Aircraft[3].Get_Random_Type_Aircraft().Random() == 3)
				{
					if(_Aircraft[3].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[3].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[3].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
			}
		
			else if((z == _JButton_3)||(z == _JTextField_3))
			{
				_JLabel_3.setText("");
				
				if(_JTextField_3.getText().equals(""))
				{
					_JLabel_3.setText("Error : Empty parametric!");
				}
				
				else if(_Aircraft[3].Get_Random_Type_Aircraft().Random() == 1)
				{
					if(_Aircraft[3].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{	
						_Aircraft[3].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[3].Get_Altitude_Height().Beginner = true;
					}
					
					else
					{
						_JTextField_3.setText("");
					}
				}
				
				else if(_Aircraft[3].Get_Random_Type_Aircraft().Random() == 2)
				{
					if(_Aircraft[3].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{
						_Aircraft[3].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[3].Get_Altitude_Height().Beginner = true;
					}
					
					else
					{
						_JTextField_3.setText("");
					}
				}
				
				else if(_Aircraft[3].Get_Random_Type_Aircraft().Random() == 3)
				{
					if(_Aircraft[3].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{
						_Aircraft[3].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[3].Get_Altitude_Height().Beginner = true;
					}
					
					else
					{
						_JTextField_3.setText("");
					}
				}
			}
		}
		
		else if((Select_5 == true) && (_Aircraft [4] != null))
		{
			_Aircraft_Comunicate_5.setForeground(Color.RED);
			
			_Aircraft_Comunicate_5.setText("F5 : 5. Aircraft Communicate");
			
			_Aircraft_Comunicate_2.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_2.setText("F2 : 2. Aircraft Communicate");

			_Aircraft_Comunicate_3.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_3.setText("F3 : 3. Aircraft Communicate");
			
			_Aircraft_Comunicate_4.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_4.setText("F4 : 4. Aircraft Communicate");
			
			_Aircraft_Comunicate_1.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_1.setText("F1 : 1. Aircraft Communicate");
			
			if((z == _JButton_1)||(z == _JTextField_1))
			{
				_JLabel_1.setText("");
				
				if(_JTextField_1.getText().equals(""))
				{
					_JLabel_1.setText("Error : Empty parametric!");
				}
				
				else
				{
					if((_Aircraft[4].Get_Random_Type_Aircraft().Random() == 1) || (_Aircraft[4].Get_Random_Type_Aircraft().Random() == 2) || (_Aircraft[4].Get_Random_Type_Aircraft().Random() == 3))
					{
						if((_Aircraft[4].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true) || (_Aircraft[4].Get_Physic_Type_Of_Aircraft().Get_Passenger_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true)||(_Aircraft[4].Get_Physic_Type_Of_Aircraft().Get_Passenger_Aircraft().Check_Acceptable_Course(Integer.parseInt(_JTextField_1.getText()), this) == true))
						{
							_Aircraft[4].Set_HDG(Integer.parseInt(_JTextField_1.getText()));
							
							_Aircraft[4].Get_Angle().Beginner = true;
						}
						
						else
						{
							_JTextField_1.setText("");
						}
					}
				}
			}
	
			else if((z == _JButton_2)||(z == _JTextField_2))
			{
				_JLabel_2.setText("");
				
				if(_JTextField_2.getText().equals(""))
				{
					_JLabel_2.setText("Error : Empty parametric!");
				}
				
				else if(_Aircraft[4].Get_Random_Type_Aircraft().Random() == 1)
				{
					if(_Aircraft[4].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[4].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[4].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
				
				else if(_Aircraft[4].Get_Random_Type_Aircraft().Random() == 2)
				{
					if(_Aircraft[4].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[4].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[4].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
				
				else if(_Aircraft[4].Get_Random_Type_Aircraft().Random() == 3)
				{
					if(_Aircraft[4].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_JTextField_2.getText()), this) == true)
					{
						_Aircraft[4].Set_Knots(Integer.parseInt(_JTextField_2.getText()));
						
						_Aircraft[4].Get_Speed_Knots().Beginner = true;
					}
					
					else
					{
						_JTextField_2.setText("");
					}
				}
			}
		
			else if((z == _JButton_3)||(z == _JTextField_3))
			{
				_JLabel_3.setText("");
				
				if(_JTextField_3.getText().equals(""))
				{
					_JLabel_3.setText("Error : Empty parametric!");
				}
				
				else if(_Aircraft[4].Get_Random_Type_Aircraft().Random() == 1)
				{
					if(_Aircraft[4].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{
						_Aircraft[4].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[4].Get_Altitude_Height().Beginner = true;
					}
					
					else
					{
						_JTextField_3.setText("");
					}
				}
				
				else if(_Aircraft[4].Get_Random_Type_Aircraft().Random() == 2)
				{
					if(_Aircraft[4].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{
						_Aircraft[4].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[4].Get_Altitude_Height().Beginner = true;
					}
					
					else
					{
						_JTextField_3.setText("");
					}
				}
				
				else if(_Aircraft[4].Get_Random_Type_Aircraft().Random() == 3)
				{
					if(_Aircraft[4].Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_JTextField_3.getText()), this) == true)
					{
						_Aircraft[4].Set_Altitude(Integer.parseInt(_JTextField_3.getText()));
					
						_Aircraft[4].Get_Altitude_Height().Beginner = true;
					}
					
					else
					{
						_JTextField_3.setText("");
					}
				}
			}
		}
		
		else
		{
			_Aircraft_Comunicate_1.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_1.setText("F1 : 1. Aircraft Communicate");
			
			_Aircraft_Comunicate_2.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_2.setText("F2 : 2. Aircraft Communicate");

			_Aircraft_Comunicate_3.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_3.setText("F3 : 3. Aircraft Communicate");
			
			_Aircraft_Comunicate_4.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_4.setText("F4 : 4. Aircraft Communicate");
			
			_Aircraft_Comunicate_5.setForeground(Color.BLACK);
			
			_Aircraft_Comunicate_5.setText("F5 : 5. Aircraft Communicate");
		}
	}
	
}
