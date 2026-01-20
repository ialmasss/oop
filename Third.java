package week1;
import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num;
		
		System.out.print("Please enter your grade: ");
		num = input.nextInt();
		
		if (num < 50) {
			System.out.print("F");
		}
		else if (num >= 50 && num <= 54) {
			System.out.print("D");
		}
		else if (num >= 55 && num <= 59) {
			System.out.print("D+");
		}
		else if (num >= 60 && num <= 64) {
			System.out.print("C-");
		}
		else if (num >= 65 && num <= 69) {
			System.out.print("C");
		}
		else if (num >= 70 && num <= 74) {
			System.out.print("C+");
		}
		else if (num >= 75 && num <= 79) {
			System.out.print("B-");
		}
		else if (num >= 80 && num <= 84) {
			System.out.print("B");
		}
		else if (num >= 85 && num <= 89) {
			System.out.print("B+");
		}
		else if (num >= 90 && num <= 94) {
			System.out.print("A-");
		}
		else if (num >= 95 && num <= 100) {
			System.out.print("A");
		}

	}

}
