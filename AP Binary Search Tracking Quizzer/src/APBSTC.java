import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class APBSTC
	{

	public static void main(String[] args)
		{
		int addingNums = 0;
		int middle = 0;
		String name;
		ArrayList listOfNums = new ArrayList();
	
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("Welcome user. What is your name?");
		name = userInput1.nextLine();
		
		System.out.println(name + ", imput your numbers one at a time and press enter after each imput. \nAdd numbers between one and twenty. If you've finished adding \nnumbers to the ArrayList imput '-1'");
		do			
			{
			System.out.println();
			System.out.println("Imput a variable or end the program.");
			Scanner userInput2 = new Scanner(System.in);
			addingNums = userInput2.nextInt();
			if(addingNums >= 1 && addingNums <= 20 )
				{
				listOfNums.add(addingNums);
				System.out.println("adding");
				}
			else if(addingNums <= 0 && addingNums != -1 || addingNums >= 21)
				{
				System.out.println("Please only imput numbers in the range of 1 - 20 inclusive.");
				}
			}	
		while(addingNums != -1);
		Collections.sort(listOfNums);
		
		
		int indexOfTarget = (int)(Math.random() * listOfNums.size());	
		//int target = (int)(listOfNums.get(indexOfTarget));
		int target = 7;
		System.out.println("The target number is " + target + ".");
		int counter = 0;
		
		binarySearch( listOfNums, target, counter);
		}

	public static int binarySearch(ArrayList listOfNums, int target, int counter)
		{

		int left = 0;
		int right = listOfNums.size() - 1;
		while (left <= right)
			{
			int middle = (left + right) / 2;
			for(int i = 0; i < listOfNums.size(); i++)
					{
					System.out.print(listOfNums.get(i));
					System.out.print(" ");
					}
			
			Scanner userInput6 = new Scanner(System.in);
			System.out.println();
			System.out.println("What is the 'right' here?");
			int userRight = userInput6.nextInt();
			
			for(int i = 0; i < listOfNums.size() - 1; i++)
				{
				System.out.print(listOfNums.get(i));
				System.out.print(" ");
				}
			
			Scanner userInput5 = new Scanner(System.in);
			System.out.println();
			System.out.println("What is the 'left' here?");
			int userLeft = userInput5.nextInt();
			
			for(int i = 0; i < listOfNums.size() - 1; i++)
				{
				System.out.print(listOfNums.get(i));
				System.out.print(" ");
				}			
			
			Scanner userInput4 = new Scanner(System.in);
			System.out.println();
			System.out.println("What is the 'middle' here?");
			int userMiddle = userInput4.nextInt();
				
			for(int i = 0; i < listOfNums.size() - 1; i++)
				{
				System.out.print(listOfNums.get(i));
				System.out.print(" ");
				}
			
			Scanner userInput7 = new Scanner(System.in);
			System.out.println();
			System.out.println("If " + userMiddle + " is the 'middle' here, what is the number at the index of that 'middle'");
			int ofMiddleIndex = userInput7.nextInt();
			
			if(userLeft == left && userRight == right)
				{
				
				if(userMiddle == middle)
					{
					if (target < ((int)listOfNums.get(middle)) && ((int)listOfNums.get(middle)) == ofMiddleIndex)
						{
						right = middle - 1;
						counter++;
						}
					else if(target < ((int)listOfNums.get(middle)) && ((int)listOfNums.get(middle)) != ofMiddleIndex)
						{
					System.out.println("I'm sorry that is the incorrect imput. Please try again.");
					counter++;
						}
					else if (target > ((int)listOfNums.get(middle)) && ((int)listOfNums.get(middle)) == ofMiddleIndex)
						{
					left = middle + 1;
					counter++;
						}
					else if(target > ((int)listOfNums.get(middle)) && ((int)listOfNums.get(middle)) != ofMiddleIndex )
						{
					System.out.println("I'm sorry that is the incorrect imput. Please try again.");
					counter++;
						}
					else
						{
						return middle;
						}
					}
				}
			else if(userLeft != left)
				{
				System.out.println("Incorrect please try again.");
				counter++;
				}
			else if(userRight != right)
				{
				System.out.println("Incorrect please try again.");
				counter++;
				}
			
			else if(userMiddle != middle)
				{
				System.out.println("I'm sorry that is the incorrect imput. Please try again.");
				counter++;
				}			
			}
			return -1;
		}
}
