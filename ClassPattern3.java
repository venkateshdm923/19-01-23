package com.bridgelabz.secondpack;

public class ClassPattern3 {

	public static void main(String args[]) {

		int i, j;

		for (i = 1; i <= 5; i++) // loop for rows
		{

			for (j = 5; j >= i; j--) // loop for columns
			{

				System.out.print(j);
			}

			System.out.println();
		}
	}
}
//expected output
//54321
//5432
//543
//54
//5