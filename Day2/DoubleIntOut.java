package Day2;

import java.util.Scanner;

public class DoubleIntOut {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 3 numbers:-");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double result1= a + b * c;
		double result2= a * b +c ;
		double result3= c + a / b;
		double result4= a % b + c;
		System.out.println("a + b * c = " + result1);
		System.out.println("a * b + c = " + result2);
		System.out.println("c + a / b = " + result3);
		System.out.println("a % b + c = " + result4);


	}

}
