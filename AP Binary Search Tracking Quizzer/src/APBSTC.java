import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class APBSTC
	{

	public static void main(String[] args)
		{
		int addingNums = 0;
		String name;
		ArrayList listOfNums = new ArrayList();
	
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("Welcome user. What is your name?");
		name = userInput1.nextLine();
		
		do			
			{
			System.out.println(name + ", imput your numbers one at a time and press enter after each imput. \nAdd numbers between one and twenty. If you've finished adding \nnumbers to the ArrayList imput '-1'");
			Scanner userInput2 = new Scanner(System.in);
			addingNums = userInput2.nextInt();
			if(addingNums >= 1 && addingNums <= 20 && userInput2.hasNextInt())
				{
				listOfNums.add(addingNums);
				}
				
			else if(addingNums <= 0 && addingNums != -1)
				{
				System.out.println("Please only imput numbers in the range of 1 - 20 inclusive.");
				}
			}	
		while(addingNums != -1);

		Collections.sort(listOfNums);
		
			int target = (int)(Math.random() * listOfNums.size()) + 1;
			int left = 0;
			int right = listOfNums.size() - 1;
			
			while (left <= right)
				{
				int middle = (left + right) / 2;
				if (target < ((int)listOfNums.get(middle)))
				{
				right = middle - 1;
				}
				else if (target > ((int)listOfNums.get(middle)))
					{
					left = middle + 1;
					}
				else
					{
					System.out.println(middle);
					}
				}
			System.out.println(-1);
			
		}
	}