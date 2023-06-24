package Test;
import java.util.Scanner;

public class PoliceBike {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your speed:");
		int speed = sc.nextInt();
		System.out.println("Is it your bday today?");
		boolean isBday = sc.nextBoolean();
		
		if(isBday==true) {
			speed =speed- 5;
		}
		
		if(speed >=80) {
				System.out.println("High Ticket!");
			}
		else if(speed >=60) {
			System.out.println("Mid Ticket!");
			
		}
		else {
			System.out.println("No Ticket!");
		}
		sc.close();
		
		
	}

}
