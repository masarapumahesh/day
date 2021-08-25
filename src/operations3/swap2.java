package operations3;
import java.util.Scanner;
public class swap2 {

	public static void main(String[] args) {
		
		int a,b;
		System.out.print("enter two numbers");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print("Before Swapping "+a+" "+b);
		
	a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping "+a+" "+b);
		

	}

}
