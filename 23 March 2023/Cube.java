import java.util.Scanner;

public class Cube 
{
	public static void main(String[] args) {
		int a;
		System.out.print("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.println("The cube of given is: " +(a*a*a));
	}

}
