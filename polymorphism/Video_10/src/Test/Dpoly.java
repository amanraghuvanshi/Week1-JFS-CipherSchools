package Test;

abstract class Doctor {
	abstract void treatPatient();
}

class Physician extends Doctor{
	void treatPatient() {
		System.out.println("Hi! I an Physician \nI treat patients using Medicines.");
		
	}
}
class Surgeon extends Doctor{
	void treatPatient() {
		System.out.println("Hi! I an Surgeon \nI treat patients using Surgery.");
		
	}
}
class Dentist extends Doctor{
	void treatPatient() {
		System.out.println("Hi! I an Dentist \nI treat patients Teeth.");
		
	}
}
public class Dpoly{
	public static void main(String[] args) {
		System.out.println("Hi! , I am Lucy . Receptionist at Max Care");
		System.out.println("Who you are looking for?");
		System.out.println("Press 1. for Physician. Press 2. for Surgeon. Press 3 . for Dentist");
		
		int choice = new java.util.Scanner(System.in).nextInt();
		
		Doctor doc = null;
		
		switch(choice) {
		case 1:
			doc = new Physician();
			break;
			
		case 2:
			doc = new Surgeon();
			break;
		
		case 3:
			doc = new Dentist();
			break;
		default:
			System.out.println("A oh!, Invalid");
			break;
	}
		if(choice < 0 || choice > 3) {
			System.exit(0);
		}
		else {
			doc.treatPatient();
		}
		
}
	
}