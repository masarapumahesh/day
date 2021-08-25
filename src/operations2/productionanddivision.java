package operations2;
import java.util.Scanner;

public class productionanddivision {

	public static void main(String[] args) {
		System.out.println("enter two numbers");
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("multiplication: "+(num1*num2));
		System.out.println("division: "+(num1/num2));
		
	}

}
