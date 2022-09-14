package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the starting amount:");
		int startAmount = in.nextInt();
		
		System.out.println("Enter your win limit:");
		int winLimit = in.nextInt();
		
		System.out.println("Enter your win probability (between 0-1):");
		double winChance = in.nextDouble();
		
		while (startAmount >0 && winLimit != startAmount)
		{
			double gamble = (Math.random());
				if (gamble > winChance)
				{ 
					System.out.println("ruin!");
					startAmount--;
				}
				else
				{
					System.out.println("success!");
					startAmount++;
				}
		}
			
	}

}
