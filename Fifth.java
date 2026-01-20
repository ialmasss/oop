package week1;
import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double balance;
		System.out.print("Please enter your balance: ");
		balance = input.nextInt();
		
		double interest;
		System.out.print("Please enter interest rate: ");
		interest = input.nextInt();
		
		double interestrate = interest / 100;
		
		double newbalance;
		newbalance = balance + (balance*interestrate);
		
		System.out.print("Your new balance: " + newbalance);
		

	}

}
