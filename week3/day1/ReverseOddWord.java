package week3.day1;

public class ReverseOddWord {

	public static void main(String[] args) {
		String test = "I am a software tester";
		
		 // Step 2: Split the string into words and store them in an array
        String[] split = test.split(" ");
        
        for (int i = 0; i < split.length; i++) {

			
            if (i % 2 == 1) {
                // Convert the word at the odd position to a character array
                char[] chars = split[i].toCharArray();
                
                // Reverse the characters in the word
                for (int j = chars.length - 1; j >= 0; j--) {
                    System.out.print(chars[j]);
                }
            } else {
                System.out.print(split[i]);
            }
            
            if (i < split.length - 1) {
                System.out.print(" ");
            }
        }
    }
}