package testCalcMortgage;

import java.util.Scanner;

public class Test {

		public static void main (String args[]){
			
			Scanner input = new Scanner(System.in);
			
			double l; // mortgage amount
			System.out.print("Enter mortgage amount: ");
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
			
			//float m; // monthly payment amount
			//m = (r(1 + r) / (1 + r) - 1) * l 
			float x = 1 + r;
			//System.out.println(x);
			
			double m; // amount of monthly payment
			m = (((Math.pow(x, n) * r) / (Math.pow(x, n) - 1)) * l);
			System.out.printf("Monthly payment: %.2f", m);
		}
}
