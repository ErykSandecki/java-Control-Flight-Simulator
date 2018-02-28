package Control_Flight_Simulator_Tile;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key_Manager implements KeyListener
{
	private boolean Select_1 = false, Select_2 = false , Select_3 = false, Select_4 = false, Select_5 = false, Select_6 = false, Select_7 = false, Select_8 = false;
	
	private boolean Choose_1 = false, Choose_2 = false , Choose_3 = false, Choose_4 = false;
	
	private boolean Colision = false, Landing = false;
	
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
		
		else if(i == 9)
		{
			return Choose_1;
		}
		
		else if(i == 10)
		{
			return Choose_2;
		}
		
		else if(i == 11)
		{
			return Choose_3;
		}
		
		else if(i == 12)
		{
			return Choose_4;
		}
		
		else if(i== 13)
		{
			return Colision;
		}
		
		else if(i== 14)
		{
			return Landing;
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
		
		else if(Key == KeyEvent.VK_1)
		{
			Choose_1 = true;
		}
		
		else if(Key == KeyEvent.VK_2)
		{
			Choose_2 = true;
		}
	
		else if(Key == KeyEvent.VK_3)
		{
			Choose_3 = true;
		}
		
		else if(Key == KeyEvent.VK_4)
		{
			Choose_4 = true;
		}
		
		else if(Key == KeyEvent.VK_K)
		{
			Colision = true;
		}
		
		else if(Key == KeyEvent.VK_L)
		{
			Landing = true;
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
		
		Choose_1 = false;
		
		Choose_2 = false;
		
		Choose_3 = false;
		
		Choose_4 = false;
		
		Colision = false;
		
		Landing = false;
	}

	
	public void keyTyped(KeyEvent e) 
	{
	
	}
}
