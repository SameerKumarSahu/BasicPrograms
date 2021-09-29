package Day1;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the values of a :-");
		double a= sc.nextInt();
		System.out.println("Enter the values of b :-");
		double b= sc.nextInt();
		System.out.println("Enter the values of c :-");
		double c= sc.nextInt();
		double delta =b*b - 4*a*c;
		double Root1 = (-b + Math.sqrt(delta))/(2.0*a);
		double Root2 = (-b - Math.sqrt(delta))/(2.0*a);
		if (delta>0.0)
		{
		System.out.println("Root 1 of x is "+Root1 +" && " + "Root 2 of x is "+Root2);
		}
		else if (delta ==0.0)
		{
			System.out.println("The root is " + Root1);
		}
		else
		{
			System.out.println("Roots are not real");
		}
	}

}
