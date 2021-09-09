package assignment_5;



		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.Collections;
		import java.util.List;
		import java.util.Scanner;


		public class Generics3 {
		public static final <H> void swap (H[] a, int x, int y) {
		H t = a[x];
		a[x] = a[y];
		a[y] = t;
		}



		private static void test() {
			Scanner sc = new Scanner(System.in);
			String a[] = {"Hii","Goodmorning"};
			swap(a, 0, 1);
			System.out.println("a:"+Arrays.toString(a));
			
		}
		
	}

