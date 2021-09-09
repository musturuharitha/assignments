package assign_4;
import java.util.Scanner;
		class UnsupportedOperationalException extends Exception{
			
		}

		public class Exception2 {
			public static void main(String args[]) {
			Scanner sc =  new Scanner(System.in);
				System.out.println("Enter first number: ");
				int a = sc.nextInt();
				System.out.println("Enter the number to be divided: ");
				int b = sc.nextInt();
				try {
					if(b==0) {
    throw new UnsupportedOperationalException();
						
					}
				int c=a/b;
					System.out.println(c);
					
				}

				catch(UnsupportedOperationalException e) {
					System.out.println(e);
				}
			}
	}

