package Control_Flight_Simulator_Display;

import java.awt.Canvas;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Display 
{
	private JFrame Frame;
	
	private String Title;
	
	private Canvas _Canvas;
	
	private int Width, Height;
	
	public Display(String Title, int Width,int Height)
	{
		this.Title = Title;
		
		this.Width = Width;
		
		this.Height = Height;
		
		Create_Display();
	}
	
	private void Create_Display()
	{
		Frame = new JFrame(Title);
		
		Frame.setSize(Width, Height);
		
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Frame.setResizable(false);
		
		Frame.setLocation(340, 0);
		
		Frame.setVisible(true);
		
		_Canvas = new Canvas();
		
		_Canvas.setPreferredSize(new Dimension(Width,Height));
		
		_Canvas.setMaximumSize(new Dimension(Width,Height));
		
		_Canvas.setMinimumSize(new Dimension(Width,Height));
		
		Frame.add(_Canvas);
		
		Frame.pack();
		
		_Canvas.setFocusable(false);
	}
	
	public Canvas getCanvas()
	{
		return _Canvas;
	}
	
	public JFrame getFrame()
	{
		return Frame;
	}
}
