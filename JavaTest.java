import java.util.Scanner;
public class JavaTest {
	int a;
	Scanner sr;
	public static void main (String [] args){
		JavaTest app = new JavaTest();
		app.begin();
	}
	void begin (){
		sr = new Scanner(System.in);
		a=1;
		while(a!=0) { 
			System.out.print("Select the task: ");
			a = sr.nextInt();
			if (a ==1) {
				zadanie1 ();
			}
			if (a ==2) {
				zadanie2 ();
			}
			if (a ==3) {
				zadanie3 ();
			}
		}
		
	}
	void zadanie1 (){
		int n;
		System.out.print("Enter the number:");
		n = sr.nextInt();
		if( n % 2 == 0) {
			System.out.println(n+ "- is an even number");
		} else {
			System.out.println(n+ " - is an odd number!");
		}
	}

	void zadanie2 (){
		int n;
		int b;
		int a=10;
		System.out.print("Enter the first number: ");
		n = sr.nextInt();
		System.out.print("Enter the second number: ");
		b = sr.nextInt();
		int f =(n-a);
		int z =(b-a);
		if( f < z) {
			System.out.println(n+ " - closer to "+a);
		} else   {
			System.out.println(b+ " - closer to "+a);
		}

	}
	void zadanie3 (){
		int a;
		int b;
		int z;
		double x1;
		double x2;
		System.out.print("Enter the first number a : ");
		a = sr.nextInt();
		System.out.print("Enter the second number b : ");
		b = sr.nextInt();
		System.out.print("Enter the third number c : ");
		z = sr.nextInt();
	    double D = (b*b) -4*a*z;
		double x = Math.sqrt(D);
		if (x>0) {
			x1 = (-1 * b - x)/(2 * a);
			x2 = (-1 * b + x)/(2 * a);
			System.out.println("Obtained two roots: " +x1+" and "+x2);
		}
		else if (x == 0) {
			   x2=x1=(-1*(b/2*a));
			System.out.println("Obtained two equal roots: " +x1+" = "+x2);
		}
		else if (x < 0) {
			System.out.println("No roots!");
		}
	}
}


