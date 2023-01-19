package com.bridgelabz.secondpack;

public class ClassPattern2 {
////

	public static void main(String args[]) {

		int i, j, n = 5;

		for (i = 0; i < 5; i++) // loop for rows
		{

			for (j = n; j > 0; j--) // loop for columns
			{

				System.out.print(j + " ");
			}
			n--;
			System.out.println();
		}
	}
}
//expected output
//5 4 3 2 1
//4 3 2 1
//3 2 1
//2 1
//1