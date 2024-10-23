package week1.day1;

import java.util.Arrays;
import java.util.Iterator;

public class FindMissingElement {

	public static void main(String[] args) {

		int[] a =  {1, 4, 3, 2, 8, 6, 7}; 

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {

			//System.out.println(a[i]);

			if (a[i] != i+1) {

				System.out.println(i+1);
				break;
			}

		}}

}
