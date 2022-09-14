package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the starting amount:");
		int setAmount = in.nextInt();
		
		System.out.println("Enter your win limit:");
		int winLimit = in.nextInt();
		
		System.out.println("Enter your win probability (between 0-1):");
		double winChance = in.nextDouble();
		
		System.out.println("Enter the total number of simulations:");
		int totalSimulations = in.nextInt();
		
		int currentSimulations = 0;
		int accRuin = 0;
		
		while (currentSimulations < totalSimulations)
		{
			int startAmount = setAmount; 
			int numPlays = 0;
		while (startAmount >0 && winLimit != startAmount)
		{
			double gamble = (Math.random());
				if (gamble > winChance)
				{ 
					//System.out.println("ruin!");
					startAmount--;
				}
				else
				{
					//System.out.println("success!");
					startAmount++;
				}
				numPlays++;
				
		}
				
				currentSimulations++;		
				System.out.println("Day: " + currentSimulations);
				System.out.println("Finishing amount: " + startAmount);
				System.out.println("Number of Plays: " + numPlays);
			
				if (startAmount == 0)
				{
				accRuin++;	
				}
		}	
		double ruinRate = accRuin / totalSimulations;
		System.out.println("Ruin Rate: " + ruinRate);
	}

}
