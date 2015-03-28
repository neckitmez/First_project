public class JavaTest {
	public static void main (String [] args){
		double a = 12.7;
		double n = a - (int) a;
		if (n >= 0.5) {
		a += 1;
		} else a = (int) a;
		System.out.println ("Result rounding = "+( (int)a));
	}
}
