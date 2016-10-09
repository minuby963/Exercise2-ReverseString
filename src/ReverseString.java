import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a string:");
		String str = input.nextLine();
		
		String reverse = new String(new StringBuilder().append(str).reverse());
		System.out.println(reverse);
		input.close();
	}

}
