package Test;

public class Inheritance {
	int height;
	int width;
	
	void display(String item) {
		System.out.println(item +" Width "+width+" Height "+height);
			
	}
	public static void main(String[] args) {
		Chair neelkamal = new Chair();
		neelkamal.foo();
	}

}
class Chair extends Inheritance{
	void foo() {width = 10;height = 20;display("Table");}
}
class Table extends Inheritance{
	void foo() {width = 30;height=50;display("Table");}
}
class Almira extends Inheritance{
	void foo() {width=100;height=200;display("Almira");}
}