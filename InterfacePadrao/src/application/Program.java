package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new UsaInterestService(1.0);
		double payment = is.payment(amount, months);
		
		System.out.println();
		
		System.out.println("Interest Service USA");
		System.out.print("Payment after " + months + " monts: $");
		System.out.println(String.format("%.2f", payment));
		
		System.out.println();
		
		InterestService isBr = new BrazilInterestService(2.0);
		payment = isBr.payment(amount, months);
		System.out.println("Interest Service Brazil");
		System.out.print("Payment after " + months + " monts: R$");
		System.out.println(String.format("%.2f", payment));

		
		sc.close();
	}
}