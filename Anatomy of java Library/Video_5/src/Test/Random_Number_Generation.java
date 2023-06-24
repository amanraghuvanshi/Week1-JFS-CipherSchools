package Test;
import java.util.Random;
import java.util.Scanner;
public class Random_Number_Generation {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int computerchoice = rnd.nextInt(20);
		
		for(int i =0;i<6;i++) {
			System.out.println("Enter a number between 0 to 20");
			int userchoice = sc.nextInt();
			
			if(userchoice > computerchoice) {
				System.out.println("Your guess is too high");
			}
			else if(userchoice < computerchoice) {
				System.out.println("Your guess is too low");
			}
			else {
				System.out.println("You guessed it right!");
				break;
			}
		}
		sc.close();
	}

}
