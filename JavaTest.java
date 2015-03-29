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
			System.out.print("Wibirite nomer zadania: ");
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
		int w;
		int q;
		System.out.print("Enter the dividend = ");
		w = sr.nextInt();
		System.out.print("Enter divider = ");
		q = sr.nextInt();
		System.out.println("Result of the division = "+((double)w/q));
	}

	void zadanie2 (){
		int n;
		int sum = 0;
		System.out.print("Entering integer: ");
		n = sr.nextInt();
		do
		sum = sum + (n % 10);
		while((n/=10) != 0);
		System.out.println("Sum of the numbers: " +sum );

	}
	void zadanie3 (){
		double a = 12.7;
		double n = a - (int) a;
		if (n >= 0.5) {
			a += 1;
		} else a = (int) a;
		System.out.println ("Result rounding = "+( (int)a));
}

}
