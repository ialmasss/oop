package week1;
import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s;
		s = input.next();
		String rev = "";
		
		for (int i = 0; i < s.length(); i++) {
			rev = s.charAt(i) + rev;
		}

		
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == rev.charAt(i)) {
				System.out.print("This string is Palindrome");
				break;
			}
			else {
				System.out.print("No Palindrome");
				break;
			}
		}
		

	}

}
