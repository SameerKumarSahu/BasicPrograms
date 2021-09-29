package Day2;

import java.util.Scanner;

public class SumofTwoDice {

	public static void main(String[] args) {
		System.out.println("Please enter to roll the dice..!");
		Scanner in = new Scanner(System.in);
		in.nextLine();
		int dice1 = (int) ((Math.random() * 6) + 1);
		System.out.println("Dice1 is " + dice1);
		int dice2 = (int) ((Math.random() * 6) + 1);
		System.out.println("Dice2 is " + dice2);
		int sum = dice1 + dice2;
		System.out.println("Sum of the Dice1 and Dice2 is " + sum);
	}

}
