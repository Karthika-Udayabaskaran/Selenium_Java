package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebElement;

public class SecondLargest {

	public static void main(String[] args) {

		int[] a= {3, 2, 11, 4, 6, 7};

		List <Integer> asc = new ArrayList <Integer> ();

		for (Integer i : a) {

			asc.add(i);
			Collections.sort(asc);
		}

		System.out.println(asc.get(4));
	}

}
