package assign_4;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		
		
						
						Scanner sc =  new Scanner(System.in);
						System.out.println("Enter first number: ");
						int a = sc.nextInt();
						System.out.println("Enter the number to be divided: ");
						int b = sc.nextInt();
						try {
						int c=a/b;
							System.out.println(c);
							
						}

						catch(ArithmeticException e) {
							System.out.println(e);

		


	}
	}
}


