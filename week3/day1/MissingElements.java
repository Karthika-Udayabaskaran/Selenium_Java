package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {

		Integer[] numbersArray = {1, 2, 3, 4, 10, 6, 8};

		// Step 2: Convert array to list for easier manipulation

		List <Integer> miss = new ArrayList <Integer> ();

		for (Integer i : numbersArray) {

			miss.add(i);
		}

		Collections.sort(miss);

		for (int i = 0; i <= miss.size(); i++) {

			int current = miss.get(i);
			int next = miss.get(i + 1);

			// If there is a gap, print missing numbers
			for (int j = current + 1; j < next; j++) {
				System.out.print(j + " ");
			}
		}
	}
}
