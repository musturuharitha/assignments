package Average;
import java.util.Scanner;
public class sorting {

	public static void main(String[] args) {
		int[] arr= {5,12,14,6,78,19,1,28,26,35,37,7,52,55,47};
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
	int t=0;
	for(int i=0;i<15;i++) {
		if(arr[i]==s) {
			t=1;
			
		}
	}
	if(t==1) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
		
	}
	}

}
