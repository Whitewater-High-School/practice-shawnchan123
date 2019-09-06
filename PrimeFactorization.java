import java.util.Scanner;

public class PrimeFactorization {
	
		public static void main(String[] args) 
		{
			int num = 0;
			Scanner theKeys = new Scanner(System.in);
			
			System.out.println("Enter an integer: ");
			num = theKeys.nextInt();
			
			System.out.println("The number you entered was " + num + ".");
			System.out.print("Its prime factors are: ");
			int x = 2;
		    for (; x <= num; x++) {
		    	if (num%x==0) {
		    		if (x==num) {
		    			System.out.print(x);
		    		}
		    		else
		    		System.out.print(x+"x");
		    		num = num/x;
		    		x = 1;
		    	}
		    }
			
				
			theKeys.close();
		}
	}


