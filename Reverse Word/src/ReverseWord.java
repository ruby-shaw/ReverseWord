import  java.util.Scanner;

public class ReverseWord
{
	public static void main(String[] args)
{
	Scanner userInput = new Scanner(System.in);

	System.out.println("Input your word");

	String word = userInput.nextLine();
	
	String [] reverse = word.split("");

	for(int i = word.length()-1; i >=0; i--)
	{
		System.out.print(reverse[i]);
	    
	}
}
}