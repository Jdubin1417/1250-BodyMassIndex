/**
*File Name: BodyMassIndex.java
*Project Name: Chapter 3 Question 03
*------------------------------------------------------------
*Authors Name and Email: Justin Dubin, dubinj@etsu.edu
*Course-Section: CSCI 1250-901
*Creation Date: 10/20/2020
*Last Modified: (Justin Dubin, 10/20/2020, dubinj@etsu.edu
*------------------------------------------------------------
*/
import javax.swing.JOptionPane;
public class BodyMassIndex
{		
	public static void main(String[] args)
		{
			double weight;
			double height;
			String input;
		//-----------------------------------------------------------------------------------------------------
			input = JOptionPane.showInputDialog(		
				"Enter Weight in lb: ");				//get weight of user in pounds
			weight = Double.parseDouble(input);
		//-----------------------------------------------------------------------------------------------------
			input = JOptionPane.showInputDialog			
				("Enter Height in inches: ");			//get height of user in inches
			height = Double.parseDouble(input);
		//-----------------------------------------------------------------------------------------------------
			System.out.println();
			double heightsq = height * height;				//Equation for BMI
			double bmi = weight * 703/heightsq;
			System.out.println(bmi);	
		}
}