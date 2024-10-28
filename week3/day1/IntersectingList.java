package week3.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntersectingList {

	public static void main(String[] args) {

		int[] a= {3, 2, 11, 4, 6, 7};

		int[] b= {1, 2, 8, 4, 9, 7};

		List<Integer> l1 =new ArrayList <Integer> ();
		for (Integer i : a) {
			l1.add(i);

		}		

		List<Integer> l2 =new ArrayList <Integer> ();

		for (Integer i : b) {
			l2.add(i);

		}		
		
		for (Integer i : l1) {
			if(l2.contains(i)) {
				System.out.println(i + " ");
			}
			
		}
	}

}
