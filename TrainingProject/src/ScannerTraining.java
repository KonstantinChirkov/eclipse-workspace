import java.util.Scanner;

public class ScannerTraining {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's ur name? ");
		String name = scanner.nextLine();
		
		System.out.println("How old are u? ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("What's your favorite music style? ");
		String musStyle = scanner.nextLine();
		
		System.out.println("You're name is \"" + name + "\"");
		System.out.println("You're " + age + "years old");		
		System.out.println("Your favorite music style is " + musStyle);		
	}
}