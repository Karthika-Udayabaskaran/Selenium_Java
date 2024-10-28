package week3.day1;

public class DuplicateWords {

	public static void main(String[] args) {
		
		      
        String text = "We learn Java basics as part of java sessions in java week1";
        
        // Initialize a variable to keep track of duplicate words found
        int count;

        // Split the text into an array of words
        String[] words = text.split(" ");

        // Iterate over each word in the array using two nested loops
        for (int i = 0; i < words.length; i++) {
            count = 1; // Reset count for each word
            
            // Compare the current word with each other word in the array
            for (int j = i + 1; j < words.length; j++) {
                // Check if words are equal (case-insensitive) and not already marked as duplicate
                if (words[i].equalsIgnoreCase(words[j])) {
                    words[j] = ""; // Replace duplicate word with an empty string
                    count++;
                }
            }
            
            // If there was more than one occurrence, print the modified array
            if (count > 1) {
                words[i] = words[i].toLowerCase(); // Keep the first occurrence as lowercase
            }
        }

        // Build the final output without empty strings
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.equals("")) {
                result.append(word).append(" ");
            }
        }

        // Print the result with duplicates removed
        System.out.println(result.toString().trim());
    }
}
