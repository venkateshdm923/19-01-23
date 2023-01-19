package com.bridgelabz.secondpack;

public class ClassPattern1 {

	public static void main(String args[]) {

		int i, j;

		for (i = 5; i >= 1; i--) // loop for rows
		{

			for (j = 5; j >= i; j--) // loop for columns
			{

				System.out.print(j);
			}

			System.out.println();
		}
	}
}

// expected output
// 5
// 54
// 543
// 5432
// 54321