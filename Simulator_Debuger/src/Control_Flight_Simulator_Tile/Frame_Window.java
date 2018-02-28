package Control_Flight_Simulator_Tile;

import java.awt.Color;

import javax.swing.JFrame;

public class Frame_Window 
{
	private Simulator _Simulator;
	
	public Frame_Window(Simulator _Simulator)
	{
		this._Simulator = _Simulator;
		
		Create_Frame();
	}

	public void Create_Frame()
	{
		_Simulator.Create_Frame();
		
		_Simulator.Get_Frame().setSize(350, 1034);
		
		_Simulator.Get_Frame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		_Simulator.Get_Frame().setTitle("Text_Input");
		
		_Simulator.Get_Frame().setLayout(null);
		
		_Simulator.Get_Frame().setLocation(0, 0);
		
		_Simulator.Get_Frame().addKeyListener(_Simulator.Get_Key());
		
		JLabel();
		
		JTextField();
		
		JButton();
		
		JTextArea();
		
		JScrollPane();
		
		_Simulator.Get_Frame().setVisible(true);
	}
	
	public void JScrollPane()
	{
		int Tab = 0;
		
		for (int i = 1; i < 6; i++)
		{
			_Simulator.Create_Scroll_Pane(i);
			
			_Simulator.Get_Scroll_Pane(i).setBounds(25, 400 + Tab, 300, 100);
			
			_Simulator.Get_Frame().add(_Simulator.Get_Scroll_Pane(i));
			
			Tab = Tab + 120;
		}
	}
	
	public void JTextArea()
	{
		for (int i = 1; i < 6; i++)
		{
			_Simulator.Create_Text_Area(i);
			
			_Simulator.Get_JText_Area(i).setWrapStyleWord(true);
			
			_Simulator.Get_JText_Area(i).addKeyListener(_Simulator.Get_Key());
		}
	}
	
	public void JLabel()
	{
	  int Tab = 0;
	  
	  int j = 0;
	  
	  _Simulator.Create_JLabel();
	
	  _Simulator.Get_JLabel_Main().setBounds(30,0,200,50);
	  
	  _Simulator.Get_Frame().add(_Simulator.Get_JLabel_Main());
	 	
	  for(int i = 0 ; i < 3 ; i++)
	  {
		_Simulator.Get_JLabel(1, i).setBounds(150,50 + j,200,50);
	  
	  	_Simulator.Get_Frame().add(_Simulator.Get_JLabel(1, i));
	  	
	  	j = j + 100;
	  }
	  for(int i = 0; i < 5; i++)
	  {
		  _Simulator.Get_JLabel(2,i).setBounds(25,380 + Tab,300,20);
		  
		  _Simulator.Get_Frame().add(_Simulator.Get_JLabel(2,i));
		  
		  Tab = Tab + 120;
	  }
	}
	
	public void JTextField()
	{
		_Simulator.Create_JTextField();
		
		int j = 0;
		
		for(int i = 0; i < 3; i++)
		{
			_Simulator.Get_JTextField(1,i).addKeyListener(_Simulator.Get_Key());
		
			_Simulator.Get_JTextField(1,i).setBounds(50, 50 + j, 100, 50);
		
			_Simulator.Get_Frame().add(_Simulator.Get_JTextField(1,i));
		
			_Simulator.Get_JTextField(1,i).addActionListener(_Simulator);
		
			j = j + 100;
		}
	}
	
	public void JButton()
	{
		_Simulator.Create_JButton();
		
		int j = 0;
		
		for(int i = 0; i < 3; i++)
		{
			_Simulator.Get_JButton(1,i).addKeyListener(_Simulator.Get_Key());
		
			_Simulator.Get_JButton(1,i).setBounds(50, 100 + j, 100, 50);
		
			_Simulator.Get_Frame().add(_Simulator.Get_JButton(1,i));
		
			_Simulator.Get_JButton(1,i).addActionListener(_Simulator);
		
			j = j + 100;
		}
		
		_Simulator.Get_JButton(1,0).setBackground(Color.RED);
		
		_Simulator.Get_JButton(1,0).setForeground(Color.WHITE);
		
		_Simulator.Get_JButton(1,1).setBackground(Color.BLUE);
		
		_Simulator.Get_JButton(1,1).setForeground(Color.WHITE);
		
		_Simulator.Get_JButton(1,2).setBackground(Color.GREEN);
		
		_Simulator.Get_JButton(1,2).setForeground(Color.WHITE);
	}
}
