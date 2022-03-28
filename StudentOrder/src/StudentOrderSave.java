import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class StudentOrderSave 
{
	public static void main(String[] args) {
//		startAll1();
		startAll2();
	}
	
	public static void startAll1() {
		System.out.println("Do you want to create new student order? \n(y/n)");
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine();

		if  (ans.equals("y") || ans.equals("Y") || ans.equals("yes") || ans.equals("Yes") || ans.equals("YES")) {
			List<StudentOrder> soList = new ArrayList<>();
			do {
				soList.add(saveStudentOrder1());	
				System.out.println("Do you want to create new student order? \n(y/n)");
				ans = scanner.nextLine();
			}
			while (ans.equals("y") || ans.equals("Y") || ans.equals("yes") || ans.equals("Yes") || ans.equals("YES"));
			printStudentOrder1(soList);
		}
	}
	
	public static void startAll2() {
		String ans = JOptionPane.showInputDialog("Do you want to create new student order? \n(y/)");
		if  (ans.equals("y") || ans.equals("Y") || ans.equals("yes") || ans.equals("Yes") || ans.equals("YES")) {
			List<StudentOrder> soList = new ArrayList<>();
			do {
				soList.add(saveStudentOrder2());
				ans = JOptionPane.showInputDialog("Do you want to create new student order? \n(y/)");
			}
			while (ans.equals("y") || ans.equals("Y") || ans.equals("yes") || ans.equals("Yes") || ans.equals("YES"));
			printStudentOrder2(soList);
		}

	}
	
	public static void startAll3() {

		
		StudentOrder so1;
		so1 = new StudentOrder();
		
		so1.husband.firstName = "Petya";
		so1.husband.lastName = "Smith";
		so1.husband.age = 17;
		so1.wife.firstName = "Lola";
		so1.wife.lastName = "Coca-Cola";
		so1.wife.age = 15;
	}
	
	public static StudentOrder saveStudentOrder1() {
		StudentOrder so = new StudentOrder();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is husband's first name?");
		so.husband.firstName = scanner.nextLine();
		
		System.out.println("What is husband's last name?");
		so.husband.lastName = scanner.nextLine();
		
		System.out.println("What is husband's years old?");
		so.husband.age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("What is wife's first name?");
		so.wife.firstName = scanner.nextLine();
		
		System.out.println("What is wife's last name?");
		so.wife.lastName = scanner.nextLine();
		
		System.out.println("What is wife's years old?");
		so.wife.age = scanner.nextInt();
		scanner.nextLine();
		
		return so;
	}
	
	public static StudentOrder saveStudentOrder2() {
		StudentOrder so = new StudentOrder();

		so.husband.firstName = JOptionPane.showInputDialog("What is husband's first name?");
		so.husband.lastName = JOptionPane.showInputDialog("What is husband's last name?");
		so.husband.age = Integer.parseInt(JOptionPane.showInputDialog("What is husband's years old?"));
		
		so.wife.firstName = JOptionPane.showInputDialog("What is wife's first name?");
		so.wife.lastName = JOptionPane.showInputDialog("What is wife's last name?");
		so.wife.age = Integer.parseInt(JOptionPane.showInputDialog("What is wife's years old?"));
		
		return so;
		
	}
	
	public static void printStudentOrder1(List<StudentOrder> soList) {
		int i = 1;
		for(StudentOrder studentOrder: soList) {
			System.out.println("Student Order #" + i + ":");
			System.out.println("Husband: " + studentOrder.husband.firstName + " " + studentOrder.husband.lastName 
								+ ", age: " + studentOrder.husband.age);
			System.out.println("Wife: " + studentOrder.wife.firstName + " " + studentOrder.wife.lastName 
								+ ", age: " + studentOrder.wife.age);
			System.out.println("");
			i++;
		}
	}
	
	public static void printStudentOrder2(List<StudentOrder> soList) {
		int i = 1;
		for(StudentOrder studentOrder: soList) {
			JOptionPane.showMessageDialog(null, "Student Order #" + i + ":" + "\nHusband: " + studentOrder.husband.firstName + 
											" " + studentOrder.husband.lastName + ", age: " + studentOrder.husband.age + 
											"\nWife: " + studentOrder.wife.firstName + " " + studentOrder.wife.lastName + 
											", age: " + studentOrder.wife.age);
			i++;
		}
	}
}
