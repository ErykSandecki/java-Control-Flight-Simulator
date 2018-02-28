package Control_Flight_Simulator_Tile;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key_Manager implements KeyListener
{
	private boolean Select_1 = false, Select_2 = false , Select_3 = false, Select_4 = false, Select_5 = false, Select_6 = false, Select_7 = false, Select_8 = false;
	
	public boolean Get_Select(int i)
	{
		if(i == 1)
		{
			return Select_1;
		}
		
		else if(i == 2)
		{
			return Select_2;
		}
		
		else if(i == 3)
		{
			return Select_3;
		}
		
		else if(i == 4)
		{
			return Select_4;
		}
		
		else if(i == 5)
		{
			return Select_5;
		}
		
		else if(i == 6)
		{
			return Select_6;
		}
		
		else if(i == 7)
		{
			return Select_7;
		}
		
		else if(i == 8)
		{
			return Select_8;
		}
		
		else
		{
			return false;
		}
	}

	public void keyPressed(KeyEvent e) 
	{
		int Key= e.getKeyCode();
		
		if(Key == KeyEvent.VK_F1)
		{
			Select_1 = true;
		}
		
		else if(Key == KeyEvent.VK_F2)
		{
			Select_2 = true;
		}
		
		else if(Key == KeyEvent.VK_F3)
		{
			Select_3 = true;
		}
		
		else if(Key == KeyEvent.VK_F4)
		{
			Select_4 = true;
		}
		
		else if(Key == KeyEvent.VK_F5)
		{
			Select_5 = true;
		}
		else if(Key == KeyEvent.VK_F9)
		{
			Select_6 = true;
		}
		
		else if(Key == KeyEvent.VK_Y)
		{
			Select_7 = true;
		}
		
		else if(Key == KeyEvent.VK_N)
		{
			Select_8 = true;
		}
		
	}
	
	public void keyReleased(KeyEvent e) 
	{
		Select_1 = false;
		
		Select_2 = false;
		
		Select_3 = false;
		
		Select_4 = false;
		
		Select_5 = false;
		
		Select_6 = false;
		
		Select_7 = false;
		
		Select_8 = false;
	}

	
	public void keyTyped(KeyEvent e) 
	{
	
	}

}
