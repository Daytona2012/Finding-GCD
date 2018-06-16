import java.util.Scanner;

public class FindGCD {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder");
		System.out.println();
		
		//Declarations and Initialization
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		int firstNum;
		int secondNum;
		int div;
		
		while(choice.equalsIgnoreCase("y")) {
			
			//User input
			System.out.print("Enter first number: ");
			firstNum = sc.nextInt();
			System.out.print("Enter second number:");
			secondNum = sc.nextInt();
			
			// Finding which number is greater
		    if(firstNum > secondNum) {
		    	div = firstNum;
		    } else {
		    	div = secondNum;
		    }
		    
		    //Finds the GCD
		    while((firstNum % div != 0)||(secondNum % div != 0)) {
		    	div--;
		    }
			
		    System.out.println("Greatest common divisor: " + div);
         	System.out.println();	    
			
         	//Checks if user wants to continue
			System.out.print("Continue (y/n): ");
			choice = sc.next();
			System.out.println();
		}

	}

}
