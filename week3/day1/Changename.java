package week3.day1;

public class Changename {

	public static void main(String[] args) {
		
		 String test = "changeme";
		 
		 char[] charArray = test.toCharArray();
		 
		 
		 for (int i = charArray.length - 1; i >=0 ; i--) 
		 {
			if(i % 2==1)
			{
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
			
		}
		 System.out.println(charArray);
	}

}
