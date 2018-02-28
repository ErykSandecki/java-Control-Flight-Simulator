package Control_Flight_Simulator_Display;

import java.awt.image.BufferedImage;

public class Sprite_Sheet 
{
	private BufferedImage Sheet;
	
	public Sprite_Sheet(BufferedImage Sheet)
	{
		this.Sheet = Sheet;
	}
	
	public BufferedImage crop(int x, int y, int width, int height)
	{
		return Sheet.getSubimage(x, y, width, height);
	}
	
}
