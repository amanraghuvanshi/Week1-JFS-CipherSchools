package Test;
import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("First Rank");
			break;
		
		case 2:
			System.out.println("SEcond Rank");
			break;
		
		case 3:
			System.out.println("Third Rank");
			break;
		
		default:
			System.out.println("No Rank");
			break;
		}
		
	}
	

}
