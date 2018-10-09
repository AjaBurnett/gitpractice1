import java.util.Scanner;

public class helloWorld {

	public static void main(String[] args) {

		System.out.println("Hello Word!");

		// this is an example of a single line comment
		// here's another line
		// let's try a third line
		// yay!

		/*
		 * this is a multiline comment multiline comments are useful for creating your
		 * own documentation
		 */

		System.out.print("hello");
		System.out.println("world");
       
		// this is a Scanner object
				Scanner scan = new Scanner(System.in);
				
			System.out.println("Enter your age");
			int userAge = scan.nextInt();
			System.out.println(userAge);
			
			//garbage line to clean out my scanner
			//necessary when going from a numeric type to scan.nextline
			scan.nextLine();
				
				System.out.println("Please enter your first and last name:");
				String userName =scan.nextLine();
				System.out.println(userName);
				
             //primitive data types
				byte b = 127;
				short s = 128;
				int i = 133333; 
				long l = 1234578912345457L; 
				float f = 56.7f; //can use a "cast" ((float)), uppercase F or lower case f
				double d = 56.7; //anything with a decimal point is assumed to be  double
				char c = '@'; //char's user single quotes, strings use double quotes
				boolean bool = true; //true or false is the end result
				
				//this is a constant and cannot change
				//string is not a primitive type
				final String TEST = "hello";
				
				System.out.println(9%5); //modulus produces a remainder
				
				String words = "this is a sentance";
				
				words += " and I added some words";
				System.out.println(words);
				
				int nums = 5;
				nums += 12;
				System.out.println(nums);
				
				//implicit casting example
			
				int age = 35;
				double myAge = age;
				System.out.println(myAge);
				
				
					
				
				//explicit casting
				//when going from a more precise data type to less precise
				
				
				double shoppingTotal = 258.54
						int newTotal = (int) shoppingTotal;
			
						
						
				
		//you should close the scanner at the very end of the program to avoid complications
		scan.close();
	}

}
