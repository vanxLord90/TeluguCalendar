import java.util.Arrays;
import java.util.Scanner;

public class TeluguYearsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("************************************************");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("            Welcome to TeluguYears!             ");
		System.out.println("          (press any key to continue)             ");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("************************************************");
		Scanner in= new Scanner(System.in);
		String homeScreenInput=in.nextLine();
		System.out.println("In this program, you can find the last year a specific Telugu Samvatsara occurred or "+"\n  the name of a Telugu Samvatsara given a specific year!. Press y or n");
		String input=in.nextLine();

	while(input.equals("y"))	{
		System.out.println("Enter a year after 1900 or a name of a Telugu Samvatsara:");
		String s= in.nextLine();
		
		while(!TeluguYears.isInputValid(s)) {
			System.out.println("This input is empty or blank, please enter either a year after 1900 or the name of a Telugu Samvatsara.");
			s=in.nextLine();
		}
		System.out.println("Input is valid");
		if(!TeluguYears.isString(s)) {
			int i= TeluguYears.convertToInt(s);
			String nameofYear= TeluguYears.yearToName(2022, i);
			System.out.println("You entered a year. The Telugu Samvatsara that corresponds to "+ i +" is "+ nameofYear+"!");
		}
		else {
		while(!TeluguYears.isStringValid(s)) {
			System.out.println(" The String you entered is not the name of a Telugu Samvatsara. Please enter a Telugu Samvatsara name.");
			s=in.nextLine();
		}
		int year= TeluguYears.nameToYears(s);

		System.out.println("The name of the Telugu Samvatsara you entered has last occurred in "+ year);
		}
		System.out.println("Would you like continue. Press y or n");
		s=in.nextLine();
	}
	
	
	
	}
}
		
		
		
		
		
		
		
		
		
		
		
	