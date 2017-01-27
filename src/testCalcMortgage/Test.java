package testCalcMortgage;

import java.util.Scanner;

public class Test {

		public static void main (String args[]){
			
			Scanner input = new Scanner(System.in);
			
			double l; // mortgage amount
			System.out.print("Enter mortgage amount:");
			l = input.nextDouble();
			//System.out.println(l);
			
			float r; // interest rate
			System.out.print("Enter monthly interest rate: ");
			r = input.nextFloat();
			//System.out.println(r);
			
			int n; // number of payments
			System.out.print("Enter number of monthly payments: ");
			n = input.nextInt();
			//System.out.println(n);
		}
}
