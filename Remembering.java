import java.util.Scanner;

public class Remembering {

	
			public static void main(String[] args) 
			{
				int num = 0;
				Scanner theKeys = new Scanner(System.in);
				
				System.out.println("Enter an integer: ");
				num = theKeys.nextInt();
				
				System.out.println("The number you entered was " + num + ".");
				System.out.print("Its factors are: ");
				int x = 1;
			    for (; x <= num; x++) {
			    	if (num%x == 0) {
			    		if (x==num) {
			    			System.out.print(x);
			    		}
			    		else
			    		System.out.print(x+",");
			    	}
			    }
				
					
				theKeys.close();
			}

	}

