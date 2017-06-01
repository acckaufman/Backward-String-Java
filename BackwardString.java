package chapter8;

/*Amanda Kaufman
Chapter 8
Programming Challenge 1
BackwardString Class
This class accepts a string input from the user and displays it backward.
*/

import java.util.Scanner;

public class BackwardString {
	
	private String inputString;
	
	//Constructor that accepts a string argument and assigns it to inputString
	public BackwardString(String s)
	{
		inputString = s;
	}
	
	//Method to reverse and display inputString.
	public void reverseString()
	{
		//Convert the input string into a temporary character array.
		char[] backwardsDisplay;
		
		//Store a copy of inputString in the temporary character array.
		backwardsDisplay = inputString.toCharArray();
		
		//Use a for loop to work backwards from the end of the string
		//(retrieved using the .length attribute of the array), and
		//display the characters in reverse order.
		for(int index = (backwardsDisplay.length - 1); index >= 0; index--)
			System.out.print(backwardsDisplay[index]);
	}
	
	public static void main(String[] args) 
	{
		//Create a Scanner keyboard object for input.
		Scanner keyboard = new Scanner(System.in);
		
		//Create a string for user input.
		String input;
				
		//Get the user's input
		System.out.print("Enter something: ");
		input = keyboard.nextLine();
		
		//Create a new BackwardString object and initialize it with the user's input.
		BackwardString toReverse = new BackwardString(input);
		
		//Use the BackwardString method reverseString() to display the string backward.
		toReverse.reverseString();
		
		keyboard.close();
	}	

}
