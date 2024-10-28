package week3.day1;

public class StringMethods {

	public static void main(String[] args) {
		String str ="Testleaf123";
		//retrive the number
		String replaceAll = str.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		
		//retrieve the alpha
		String replaceAllalpha = str.replaceAll("[^A-z]", "");
		System.out.println(replaceAllalpha);
		
		//replace the character
		String re=str.replace("f", "0");
		System.out.println(re);
		
		//String to int
		
		String str1 ="123";
		int parseInt = Integer.parseInt(str1);
		System.out.println(parseInt+10);
		
		int i=23;
		String string = Integer.toString(i);
		System.out.println(string+"kar");
		
		String[] split = str.split("Test");
	
		System.out.println(split[0]);
		System.out.println(split[1]);
		//System.out.println(split[2]);
	
		for (int j=0; j<split.length; j++) {
			//System.out.println(split[0]);
		//	
		}
		
		
		
	}

}
