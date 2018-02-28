package Control_Flight_Simulator_Communicate_Aircraft;

import java.awt.Color;

import Control_Flight_Simulator_Tile.Simulator;

public class Change_Parametr_Show_Dialog 
{
  private Simulator _Simulator;
	
  public Change_Parametr_Show_Dialog(Simulator _Simulator)
  {
	  this._Simulator = _Simulator;
  }
  
  public void Dialog_Change_Parametr(Object z)
  {
	  String Check;
	  
	  for(int i = 0; i < 5; i++)
	  {
	  if((_Simulator.Get_All_Boolean(1, i) == true) && (_Simulator.Get_Aircraft(i) != null))
		{	
		  	for(int j = 0; j < 5; j++)
		  	{
		  		if(j == i)
		  		{
		  			_Simulator.Get_JLabel(2, j).setForeground(Color.RED);
		  			
		  			_Simulator.Get_JLabel(2, j).setText("F" + (j + 1) + " : " + (j + 1) + ". Aircraft Communicate");
		  		}
		  		
		  		else
		  		{
		  			_Simulator.Get_JLabel(2, j).setForeground(Color.BLACK);
		  			
		  			_Simulator.Get_JLabel(2, j).setText("F" + (j + 1) + " : " + (j + 1) + ". Aircraft Communicate");
		  	    }
		  	}
			
		  	if(((z == _Simulator.Get_JButton(1, 0)) || (z == _Simulator.Get_JTextField(1, 0))) && (_Simulator.Get_All_Boolean(5, i) == true))
		  	{	
		  		Check = _Simulator.Get_JTextField(1, 0).getText();
			
		  		for(int j = 0 ; j<Check.length(); j++)
		  		{
		  			if((Check.charAt(j) != '0') && (Check.charAt(j) != '1') && (Check.charAt(j) != '2') && (Check.charAt(j) != '3') && (Check.charAt(j) != '4') && (Check.charAt(j) != '5') && (Check.charAt(j) != '6') && (Check.charAt(j) != '7') && (Check.charAt(j) != '8') && (Check.charAt(j) != '9'))
		  			{
		  				_Simulator.Get_JLabel(1, 0).setText("Error : Empty parametric!");
				  
		  				_Simulator.Get_JTextField(1, 0).setText("");
				  
		  				return;
		  			}
		  		}
		  
		  		_Simulator.Get_JLabel(1, 0).setText(""); 
						
		  		if(_Simulator.Get_JTextField(1, 0).getText().equals(""))
		  		{
		  			_Simulator.Get_JLabel(1, 0).setText("Error : Empty parametric!");
		  		}
				
		  		else if(_Simulator.Get_Aircraft(i).Get_Random_Type_Aircraft().Random() == 1)
		  		{
		  			if(_Simulator.Get_Aircraft(i).Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_Simulator.Get_JTextField(1, 0).getText()), _Simulator) == true)
		  			{
		  				_Simulator.Get_Aircraft(i).Set_Target(1, Integer.parseInt(_Simulator.Get_JTextField(1, 0).getText()));
					
		  				_Simulator.Set_Boolean_All(4, i, true);
					
		  				_Simulator.Get_Aircraft(i).Set_Turn(1, false);
					
		  				_Simulator.Get_JText_Area(i+1).setText(_Simulator.Get_Aircraft(i).Get_Generate_Text_Change_Parametr().Change_Altitude());
					
		  				_Simulator.Set_Int_All(2, 0, 1);
					
		  				_Simulator.Set_Boolean_All(6, 0, false); 
					
		  				_Simulator.Set_Boolean_All(5, i , false);			
		  			}
					
		  			else
		  			{
		  				_Simulator.Get_JTextField(1, 0).setText("");
		  			}
		  		}
				
		  		else if(_Simulator.Get_Aircraft(i).Get_Random_Type_Aircraft().Random() == 2)
		  		{
		  			if(_Simulator.Get_Aircraft(i).Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_Simulator.Get_JTextField(1, 0).getText()), _Simulator) == true)
		  			{
		  				_Simulator.Get_Aircraft(i).Set_Target(1, Integer.parseInt(_Simulator.Get_JTextField(1, 0).getText()));
					
		  				_Simulator.Set_Boolean_All(4, i, true);
					
		  				_Simulator.Get_Aircraft(i).Set_Turn(1, false);
					
		  				_Simulator.Get_JText_Area(i+1).setText(_Simulator.Get_Aircraft(i).Get_Generate_Text_Change_Parametr().Change_Altitude());
					
		  				_Simulator.Set_Int_All(2, 0, 1);
					
		  				_Simulator.Set_Boolean_All(6, 0, false);
					
		  				_Simulator.Set_Boolean_All(5, i , false);
		  			}

		  			else
		  			{
		  				_Simulator.Get_JTextField(1, 0).setText("");
		  			}
		  		}
				
				else if(_Simulator.Get_Aircraft(i).Get_Random_Type_Aircraft().Random() == 3)
				{
					if(_Simulator.Get_Aircraft(i).Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Altitude_Of_Office_Aircraft(Integer.parseInt(_Simulator.Get_JTextField(1, 0).getText()), _Simulator) == true)
					{
						_Simulator.Get_Aircraft(i).Set_Target(1, Integer.parseInt(_Simulator.Get_JTextField(1, 0).getText()));
						
						_Simulator.Set_Boolean_All(4, i, true);
						
						_Simulator.Get_Aircraft(i).Set_Turn(1, false);
						
						_Simulator.Get_JText_Area(i+1).setText(_Simulator.Get_Aircraft(i).Get_Generate_Text_Change_Parametr().Change_Altitude());
						
						_Simulator.Set_Int_All(2, 0, 1);
						
						_Simulator.Set_Boolean_All(6, 0, false);
						
						_Simulator.Set_Boolean_All(5, i , false);
					}
					
					else
					{
						_Simulator.Get_JTextField(1, 0).setText("");
					}
				}
					
			}
	  	
			else if(((z == _Simulator.Get_JButton(1, 1)) || (z == _Simulator.Get_JTextField(1, 1))) && (_Simulator.Get_All_Boolean(5, i) == true))
			{
				Check = _Simulator.Get_JTextField(1, 1).getText();
				
				for(int j = 0 ; j<Check.length(); j++)
				{
				  if((Check.charAt(j) != '0') && (Check.charAt(j) != '1') && (Check.charAt(j) != '2') && (Check.charAt(j) != '3') && (Check.charAt(j) != '4') && (Check.charAt(j) != '5') && (Check.charAt(j) != '6') && (Check.charAt(j) != '7') && (Check.charAt(j) != '8') && (Check.charAt(j) != '9'))
				  {
					  _Simulator.Get_JLabel(1, 1).setText("Error : Empty parametric!");
					  
					  _Simulator.Get_JTextField(1, 1).setText("");
					  
					  return;
				  }
				}
				
				if(_Simulator.Get_JTextField(1, 1).getText().equals(""))
				{
					_Simulator.Get_JLabel(1, 1).setText("Error : Empty parametric!");
				}
				
				else if((_Simulator.Get_Aircraft(i).Get_Random_Type_Aircraft().Random() == 1) || (_Simulator.Get_Aircraft(i).Get_Random_Type_Aircraft().Random() == 2) || (_Simulator.Get_Aircraft(i).Get_Random_Type_Aircraft().Random() == 3))
				{
					_Simulator.Get_JLabel(1, 1).setText("");
					
					if((_Simulator.Get_Aircraft(i).Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Acceptable_Course(Integer.parseInt(_Simulator.Get_JTextField(1, 1).getText()), _Simulator) == true) || (_Simulator.Get_Aircraft(i).Get_Physic_Type_Of_Aircraft().Get_Passenger_Aircraft().Check_Acceptable_Course(Integer.parseInt(_Simulator.Get_JTextField(1, 1).getText()), _Simulator) == true) || (_Simulator.Get_Aircraft(i).Get_Physic_Type_Of_Aircraft().Get_Passenger_Aircraft().Check_Acceptable_Course(Integer.parseInt(_Simulator.Get_JTextField(1, 1).getText()), _Simulator) == true))
					{
						_Simulator.Get_Aircraft(i).Get_Angle().Check_Turn(_Simulator.Get_Aircraft(i).Get_HDG(), Integer.parseInt(_Simulator.Get_JTextField(1, 1).getText()));
						
						_Simulator.Get_Aircraft(i).Set_Target(2, Integer.parseInt(_Simulator.Get_JTextField(1, 1).getText()));
						
						_Simulator.Set_Boolean_All(4, i, true);
						
						_Simulator.Get_Aircraft(i).Set_Turn(2, false);
						
						_Simulator.Get_JText_Area(i+1).setText(_Simulator.Get_Aircraft(i).Get_Generate_Text_Change_Parametr().Change_Course());
						
						_Simulator.Set_Int_All(2, 0, 2);
						
						_Simulator.Set_Boolean_All(6, 0, false);
						
						_Simulator.Set_Boolean_All(5, i , false);
					}
					
					else
					{
						_Simulator.Get_JTextField(1, 1).setText("");
					}
				}
			}
				
		
			else if(((z == _Simulator.Get_JButton(1, 2))||(z == _Simulator.Get_JTextField(1, 2))) && (_Simulator.Get_All_Boolean(5, i) == true))
			{
				_Simulator.Get_JLabel(1, 2).setText("");
				
				 Check = _Simulator.Get_JTextField(1, 2).getText();
		
				for(int j = 0 ; j<Check.length(); j++)
				{
				  if((Check.charAt(j) != '0') && (Check.charAt(j) != '1') && (Check.charAt(j) != '2') && (Check.charAt(j) != '3') && (Check.charAt(j) != '4') && (Check.charAt(j) != '5') && (Check.charAt(j) != '6') && (Check.charAt(j) != '7') && (Check.charAt(j) != '8') && (Check.charAt(j) != '9'))
				  {
					  _Simulator.Get_JLabel(1, 2).setText("Error : Empty parametric!");
					  
					  _Simulator.Get_JTextField(1, 2).setText("");
					  
					  return;
				  }
				}
				
				if(_Simulator.Get_JTextField(1, 2).getText().equals(""))
				{
					_Simulator.Get_JLabel(1, 2).setText("Error : Empty parametric!");
				}
				
				else if(_Simulator.Get_Aircraft(i).Get_Random_Type_Aircraft().Random() == 1)
				{
					if(_Simulator.Get_Aircraft(i).Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_Simulator.Get_JTextField(1, 2).getText()), _Simulator) == true)
					{
						_Simulator.Get_Aircraft(i).Set_Target(3, Integer.parseInt(_Simulator.Get_JTextField(1, 2).getText()));
						
						_Simulator.Set_Boolean_All(4, i, true);
						
						_Simulator.Get_Aircraft(i).Set_Turn(3, false);
						
						_Simulator.Get_JText_Area(i+1).setText(_Simulator.Get_Aircraft(i).Get_Generate_Text_Change_Parametr().Change_Speed());
						
						_Simulator.Set_Int_All(2, 0, 3);
						
						_Simulator.Set_Boolean_All(6, 0, false);
						
						_Simulator.Set_Boolean_All(5, i , false);
					}
					
					else
					{
						_Simulator.Get_JTextField(1, 2).setText("");
					}
				}
				
				else if(_Simulator.Get_Aircraft(i).Get_Random_Type_Aircraft().Random() == 2)
				{
					if(_Simulator.Get_Aircraft(i).Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_Simulator.Get_JTextField(1, 2).getText()), _Simulator) == true)
					{
						_Simulator.Get_Aircraft(i).Set_Target(3, Integer.parseInt(_Simulator.Get_JTextField(1, 2).getText()));
						
						_Simulator.Set_Boolean_All(4, i, true);
						
						_Simulator.Get_Aircraft(i).Set_Turn(3, false);
						
						_Simulator.Get_JText_Area(i+1).setText(_Simulator.Get_Aircraft(i).Get_Generate_Text_Change_Parametr().Change_Speed());
						
						_Simulator.Set_Int_All(2, 0, 3);
						
						_Simulator.Set_Boolean_All(6, 0, false);
						
						_Simulator.Set_Boolean_All(5, i , false);
					}
					
					else
					{
						_Simulator.Get_JTextField(1, 2).setText("");
					}
				}
				
				else if(_Simulator.Get_Aircraft(i).Get_Random_Type_Aircraft().Random() == 3)
				{
					if(_Simulator.Get_Aircraft(i).Get_Physic_Type_Of_Aircraft().Get_Office_Aircraft().Check_Knots_Of_Office_Aircraft(Integer.parseInt(_Simulator.Get_JTextField(1, 2).getText()), _Simulator) == true)
					{
						_Simulator.Get_Aircraft(i).Set_Target(3, Integer.parseInt(_Simulator.Get_JTextField(1, 2).getText()));
						
						_Simulator.Set_Boolean_All(4, i, true);
						
						_Simulator.Get_Aircraft(i).Set_Turn(3, false);
						
						_Simulator.Get_JText_Area(i+1).setText(_Simulator.Get_Aircraft(i).Get_Generate_Text_Change_Parametr().Change_Speed());
						
						_Simulator.Set_Int_All(2, 0, 3);
						
						_Simulator.Set_Boolean_All(6, 0, false);
			
						_Simulator.Set_Boolean_All(5, i , false);			
					}
					
					else
					{
						_Simulator.Get_JTextField(1, 2).setText("");
					}
				}
			}
		}	
	  }
  }
}

