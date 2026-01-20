package week1;
import java.util.Scanner;


public class Second {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a;
		int area;
		int perimeter;
		double length;
		
		System.out.print("Please enter side a: ");
		a = input.nextInt();
		
		area = a*a;
		perimeter = 2*(a+a);
		length = a*Math.sqrt(2);
		
		System.out.print("area: " + area + "\n");
		System.out.print("perimeter: " + perimeter + "\n");
		System.out.print("length: " + length + "\n");
		
	}

}
