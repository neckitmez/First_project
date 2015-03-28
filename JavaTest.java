import java.util.Scanner;
public class JavaTest {
	public static void main (String [] args){
		int w;
		int q;
		Scanner sr = new Scanner(System.in);
		System.out.print("Enter the dividend = ");
		w = sr.nextInt();
		System.out.print("Enter divider = ");
		q = sr.nextInt();
		System.out.println("Result of the division = "+((double)w/q));
	}
}
