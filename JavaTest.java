import java.util.Scanner;
public class JavaTest {
	public static void main(String[] args) {
		int year;
		int day;
		int month;
		int hour;
		Scanner in = new Scanner(System.in);
		System.out.print("Year: ");
		year = in.nextInt();
		System.out.print("Month: ");
	    month = in.nextInt();
		System.out.print("Day: ");
		day = in.nextInt();
		System.out.print(year+".");
		System.out.print(month+".");
		System.out.print(day+".");
	}
}
