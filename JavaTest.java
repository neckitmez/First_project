import java.util.Scanner;
public class JavaTest {
    public static void main (String [] args){
        int a;
        int b;
        int q;
        int d;
        int e;
        int f;
		int z;
        Scanner in = new Scanner(System.in);
        System.out.println("The volume of the first vessel: ");   
        a=in.nextInt();       
        System.out.println("The volume of the two vessel: ");            
        b=in.nextInt();      
        System.out.println("The desired amount: ");            
        q=in.nextInt();  
     	System.out.println("The result: " +cmp (a,b));  
        d = (a-b);
		System.out.println("The result: " +cmp (d,q));  
        e =(b-d);
		System.out.println("The result: " + cmp (e,q));  
        f =(a-e);
		System.out.println("The result: " +cmp (f,q));  
		z =(f-b);
		System.out.println("The result: " +cmp (z,q));   
    }
	 static boolean cmp (int first, int second){
		if (first==second) return true;
		else return false;
	}
}
