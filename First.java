package week1;

public class First {

	public static void main(String[] args) {
		String name = "Almas";
		int num = name.length();
		
		System.out.print("+");
		for (int i = 0; i < num; i++) {
			System.out.print("-");
		}
		System.out.println("+");
		
		System.out.println("|" + name + "|");
		
		System.out.print("+");
		for (int i = 0; i < num; i++) {
			System.out.print("-");
		}
		System.out.print("+");
		
	}

}
