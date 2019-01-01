import java.util.Scanner;
public class NewYears 
{
	private static String year;
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		promptForInput();
		System.out.println("Happy New Years, and have a great " + year + ".");
	}
	private static void promptForInput() 
	{
		System.out.print("What year is it for you: ");
		year = userInput.nextLine();
	}
}
