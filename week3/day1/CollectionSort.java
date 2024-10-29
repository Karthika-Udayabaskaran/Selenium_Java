package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		
		String[] name = {"HCL", "Wipro," ,"Aspire","Systems", "CTS"};
		
		List <String> Company = new ArrayList <String> ();
		
		for (String cn : name) {
			
			Company.add(cn)	;
			Collections.sort(Company);
	
	}
	
		
		for (int i =Company.size()-1 ; i >=0 ; i--) {
			
			System.out.print(Company.get(i));
            if (i != 0) {
                System.out.print(", ");
            }
		}
		
	
	}

}
