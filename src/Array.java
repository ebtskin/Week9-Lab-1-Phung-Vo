// Beginning of lab 1:

import java.util.Arrays;

public class Array

{

	public static void main(String[] args) 


	{


		int[] arrayNums;
		int average;
		arrayNums = new int [6];

		arrayNums[0] = 123;
		arrayNums[1] = 456;
		arrayNums[2] = 479;
		arrayNums[3] = 135;
		arrayNums[4] = 246;
		arrayNums[5] = 135;

		
		Arrays.sort(arrayNums);
		
		
		int k;

		for (k=0; k<arrayNums.length; k++)
		
		{
			System.out.println("Number: " + arrayNums[k]);
			
		}
		
		int total = 0;
		int i;

		for (i=0; i<arrayNums.length; i++)
			total +=arrayNums[i];
		
		{
			System.out.println("Toal: " + total);
			
		}
		
		average = total / 6;
		
		System.out.println("average: " + average);
	}





}