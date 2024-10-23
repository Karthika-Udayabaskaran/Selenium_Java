package week1.day1;

public class Library {

	public static void main(String[] args) {

		Library lib= new Library();
		System.out.println(lib.addBook("psychology of Money"));
		lib.issueBook();
	}


	String addBook(String bookTitle)
	{
		// Print the statement "Book added successfully"
		//Add a return statement to return the bookTitle.
		System.out.println("Book added successfully");
		return bookTitle;

	}

	void issueBook() {
		// Print the statement "Book issued successfully".

		System.out.println("Book issued successfully");
	}


}
