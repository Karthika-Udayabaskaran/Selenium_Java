package week1.day1;


import java.util.Arrays;
import java.util.Iterator;

public class PrintDuplicateValues {

	public static void main(String[] args) {
		
		//{2,7,5,7,9,3,3}
		
		int[] num= {2,5,7,5,7,9,3,2};
		
		int arrlength = num.length;
		System.out.println("Length of the array: " +arrlength);
		
		
		Arrays.sort(num);
		System.out.println("First Sorted Number: " +num[1]); 
	
	for (int i = 1; i < arrlength-1; i++) {
		
		if(num[i]==num[i-1])
		{
			System.out.println("Duplicate Value:" +num[i]);
		}
			
		
	}
	}

}
