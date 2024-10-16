package week1.day1;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] score = {89,91,9,95,69,97};

		int length = score.length;
		System.out.println("Length of the array: " +length);
		System.out.println("Value of 5th: " +score[5]);
		
		Arrays.sort(score);
		System.out.println("Minimum Value: " +score[0]);
		
		Arrays.sort(score);
		System.out.println("Maximum Value: " +score [length -1]);
		
		for(int i=0 ; i<length ;i++)
		{
			System.out.println(score[i]);
		}
		

	}

}
