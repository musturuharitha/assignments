package Average;
import java.util.Scanner;

public class interest {

	public static void main(String[] args) {
		double s,h,r;
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		h=sc.nextInt();
		r=sc.nextInt();
		double si,ci;
		si=(s*h*r)/100;
		r=Math.pow(r+1,h);
		ci=(s*r)-s;
		System.out.println(si+","+ci);
	}

}
