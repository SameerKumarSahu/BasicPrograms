package Day2;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 3 numbers:-");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int result1= a + b * c;
		int result2= a * b +c ;
		int result3= c + a / b;
		int result4= a % b + c;
		System.out.println("a + b * c = " + result1);
		System.out.println("a * b + c = " + result2);
		System.out.println("c + a / b = " + result3);
		System.out.println("a % b + c = " + result4);
		
		

	}

}
