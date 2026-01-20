package week1;
import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b, c, d;
		double s;
		
		System.out.print("Please enter a, b, c: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		d = b*b - 4*a*c;
		s = Math.sqrt(d);
		
		if (d < 0) {
			System.out.print("Error: D is negative");
		}
		else if (d == 0) {
			System.out.print(-b/(2*a));
		}
		else if (d > 0) {
			System.out.println((-b+s)/(2*a));
			System.out.print((-b-s)/(2*a));
		}

	}

}
