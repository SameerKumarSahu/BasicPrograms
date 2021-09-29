package Day2;

import java.util.Scanner;

public class Distace {

	public static void main(String[] args) {
		Scanner sc = new  Scanner (System.in) ;
		System.out.println("Enter the vales of X :- ");
		int x =sc.nextInt();
		System.out.println("Enter the vales of Y :- ");
		int y =sc.nextInt();
		double result1 = Math.pow(x,2);
		double result2 = Math.pow(y,2);
		double distace = Math.sqrt(result1 + result2) ;
		System.out.println("Euclidean distance is " +" "+ distace);

	}

}
