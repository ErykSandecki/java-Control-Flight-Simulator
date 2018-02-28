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
		
	  _Simulator.Create_JLabel();
	
	  _Simulator.Get_JLabel_Main().setBounds(30,0,200,50);
	  
	  _Simulator.Get_Frame().add(_Simulator.Get_JLabel_Main());
	 	
	  _Simulator.Get_JLabel(1).setBounds(150,150,200,50);
	  
	  _Simulator.Get_Frame().add(_Simulator.Get_JLabel(1));
	  
	  _Simulator.Get_JLabel(2).setBounds(150,250,200,50);
	  
	  _Simulator.Get_Frame().add(_Simulator.Get_JLabel(2));
	  
	  _Simulator.Get_JLabel(3).setBounds(150,50,200,50);
	  
	  _Simulator.Get_Frame().add(_Simulator.Get_JLabel(3));
	  
	  for(int i = 4; i < 9; i++)
	  {
		  _Simulator.Get_JLabel(i).setBounds(25,380 + Tab,300,20);
		  
		  _Simulator.Get_Frame().add(_Simulator.Get_JLabel(i));
		  
		  Tab = Tab + 120;
	  }
	}
	
	public void JTextField()
	{
		_Simulator.Create_JTextField();
		
		_Simulator.Get_JTextField(1).addKeyListener(_Simulator.Get_Key());
		
		_Simulator.Get_JTextField(1).setBounds(50, 150, 100, 50);
		
		_Simulator.Get_Frame().add(_Simulator.Get_JTextField(1));
		
		_Simulator.Get_JTextField(1).addActionListener(_Simulator);
		
		_Simulator.Get_JTextField(2).addKeyListener(_Simulator.Get_Key());
		
		_Simulator.Get_JTextField(2).setBounds(50, 250, 100, 50);
		
		_Simulator.Get_Frame().add(_Simulator.Get_JTextField(2));
		
		_Simulator.Get_JTextField(2).addActionListener(_Simulator);
		
		_Simulator.Get_JTextField(3).addKeyListener(_Simulator.Get_Key());
		
		_Simulator.Get_JTextField(3).setBounds(50, 50, 100, 50);
		
		_Simulator.Get_Frame().add(_Simulator.Get_JTextField(3));
		
		_Simulator.Get_JTextField(3).addActionListener(_Simulator);
	}
	
	public void JButton()
	{
		_Simulator.Create_JButton();
		
		_Simulator.Get_JButton(1).addKeyListener(_Simulator.Get_Key());
		
		_Simulator.Get_JButton(1).setBounds(50, 200, 100, 50);
		
		_Simulator.Get_JButton(1).setBackground(Color.BLUE);
		
		_Simulator.Get_JButton(1).setForeground(Color.WHITE);
		
		_Simulator.Get_Frame().add(_Simulator.Get_JButton(1));
		
		_Simulator.Get_JButton(1).addActionListener(_Simulator);
		
		_Simulator.Get_JButton(2).addKeyListener(_Simulator.Get_Key());
		
		_Simulator.Get_JButton(2).setBounds(50, 300, 100, 50);
		
		_Simulator.Get_JButton(2).setBackground(Color.GREEN);
		
		_Simulator.Get_JButton(2).setForeground(Color.WHITE);
		
		_Simulator.Get_Frame().add(_Simulator.Get_JButton(2));
		
		_Simulator.Get_JButton(2).addActionListener(_Simulator);
		
		_Simulator.Get_JButton(3).addKeyListener(_Simulator.Get_Key());
		
		_Simulator.Get_JButton(3).setBounds(50, 100, 100, 50);
		
		_Simulator.Get_JButton(3).setBackground(Color.RED);
		
		_Simulator.Get_JButton(3).setForeground(Color.WHITE);
		
		_Simulator.Get_Frame().add(_Simulator.Get_JButton(3));
		
		_Simulator.Get_JButton(3).addActionListener(_Simulator);
	}
}
