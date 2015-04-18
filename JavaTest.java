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
		}
	}
void zadanie1 (){
		int a;
		int b;
		int c;
		System.out.print("Enter the first number: ");
		a = sr.nextInt();
		System.out.print("Enter the second number: ");
		b = sr.nextInt();
		System.out.print("Enter the third number: ");
		c = sr.nextInt();
			if (a<=b && b<=c){
				System.out.println("Increasing sequence: " +a+","+b+","+c);
			}else{
				if (a<=c && c<=b) {
					System.out.println("Increasing sequence: " +a+","+c+","+b);
				}else{
					if (b<=c && c<=a){
						System.out.println("Increasing sequence: " +b+","+c+","+a);
					}else{
						if (b<=a && a<=c) {
							System.out.println("Increasing sequence: " +b+","+a+" "+c);
								}else{ 
									if (c<=b && b<=a) {
										System.out.println("Increasing sequence: " +c+","+b+","+a);
											}else{ 
												if (c<=a && a<=b) {
													System.out.println("Increasing sequence: " +c+","+a+","+b);
														}else{ 
														}
												}									
										}
								}		
						}	
				}	
		}	

void zadanie2 (){
    int a =( (int)(Math.random()*28801) );
	System.out.println(a);
	int c=((int)a/3600);
	if (c<=0){
		System.out.println("Less than an hour.");
		}else{
		System.out.println("It remains to "+c+" hours.");
		} 
	}	
}
	



