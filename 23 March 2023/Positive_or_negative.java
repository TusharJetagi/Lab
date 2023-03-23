import java.util.Scanner;

public class Positive_or_negative 
{
public static void main(String[] args) {
	int a;
	System.out.println("Enter any number: ");
	Scanner sc = new Scanner(System.in);
	a=sc.nextInt();
	
	if(a>0) {
		System.out.println("Number is positive.");
	}
	else if(a<0) {
		System.out.println("Number is negative.");
	}
	else {
		System.out.println("Number is zero");
	}
}
}
