package Test;
import java.util.Scanner;

public class Burpppp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How long is your burp? :");
		int burpLength = sc.nextInt();
		
		String str ="";
		
		for(int i =0;i<burpLength;i++) {
			str += 'r';
		}
		System.out.println("Bu"+str+"p");
		
		sc.close();
	}

}
