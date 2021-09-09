package Average;

import java.util.Scanner;

public class armnumber {

	public static void main(String[] args) {
		int n=100;
		int temp=n;
		int digitsCount=0;
		int sum=0;
		for(n=100;n<999;n++) {
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
		while(temp!=0) {
			temp=temp/10;
			digitsCount++;
		}
		temp=n;
		while(temp!=0) {
			sum+=Math.pow(temp%10,digitsCount);
			temp=temp/10;
			
		}
		if(n<100||n>999) {
			System.out.println("unexcepted");
		}
		if(n==sum) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong number");
			
		}
	}

	}

}
