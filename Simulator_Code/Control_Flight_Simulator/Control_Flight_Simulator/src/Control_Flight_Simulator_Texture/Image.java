package Control_Flight_Simulator_Texture;

import java.awt.image.BufferedImage;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Image 
{
  public static BufferedImage _BufferedImage(String path)
  {
	  try 
	  {
		return ImageIO.read(Image.class.getResource(path));
	  } 
	  
	  catch (IOException e) 
	  {
		e.printStackTrace();
		
		System.exit(1);
	  }
	  
	  return null;
  }
  
  
}
