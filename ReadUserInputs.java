package com.bridgelabz.secondpack;
import java.util.Scanner;
public class ReadUserInputs {
	public static void main(String[] args) {
		
		int num1=0, num2=0, x=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number-");
		num1=sc.nextInt();
		System.out.println("Enter the number-");
		num2=sc.nextInt();
		x=num1*num2;
		System.out.println("Result is= "+x);
	}

}
