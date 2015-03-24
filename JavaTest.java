import java.util.Scanner;
public class JavaTest {
    public static void main (String [] args){
        int n;
		int sum = 0; 
		Scanner sr = new Scanner(System.in);
		System.out.print("Entering integer: ");
		n = sr.nextInt();
		do
		sum = sum + (n % 10);
		while((n/=10) != 0);
		System.out.println("Sum of the numbers: " +sum );
	}
}