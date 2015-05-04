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
			if (a ==1) zadanie1 ();{
			}if (a ==2) zadanie2 ();{
			}if (a ==3) zadanie3 ();{
			}if (a ==4) zadanie4 ();{
			}if (a ==5) zadanie5 ();{
			}if (a ==6) zadanie6 ();{
			}if (a ==7) zadanie7 ();{
			}if (a ==8) zadanie8 ();{
			}if (a ==9) zadanie9 ();{
			}if (a ==10) zadanie10();{
			}if (a ==11) zadanie11();{
			}
		}
	}
void zadanie10 (){	
		for (int a1=3,a2=2, i=1; i<=12; a1=2*a1-a2-2, i++) {  
		System.out.print(a + " ");
		}
	}
}
void zadanie11 (){	
		for (int a, a1=0,a2=1, i=1; i<=11; a=a1+a2, i++) {  
		System.out.print(a + " ");
		}
	}
}
	
void zadanie3 (){
   	int s = 90;
	while (true) {
		System.out.print(s + " ");
		s = s - 5;
		if(s == -5) {
			break;
			}
		}
	}

void zadanie4 (){	
   	for (int a=2; a<=1048577; a=a*2) {
	if(a == 1048577) {
    break;
		}
		System.out.print(a + " ");
		}
		System.out.print("Stop!");
	}
void zadanie5 (){
	for (int a=2, i=1; i<=10; a=2*a-1, i++) {
		System.out.print(a + " ");
		}
	}
void zadanie6 (){	
   	for (int a=-166; a<=10000; a=a*2+200) {
	if(a == 10000) {
    break;
		}
		System.out.print(a + " ");
		}
		System.out.print("Stop!");
	}
void zadanie7 (){	
	int a;
   	System.out.print("Select the task: ");
	a = sr.nextInt();
	int b=(a/2);
	int d = b-(int)b;
	if (b==1) {
		System.out.println("This number is not easy!");
		}
		if (b==2) {
		System.out.println("This number is not easy!");
		}
		if (b==0) {
		System.out.println("This number is not easy!");
		}
		if (d<1) {
		System.out.println("This number is easy!");
		}
		if (d==0) {
		System.out.println("This number is not easy!");
		}		
	}
	void zadanie8 (){
		int n;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the factorial of a natural number: ");
            n = scan.nextInt();
				if(n < 0) {
					System.out.println("You entered a negative factorial!");
				} else {
				int m = 1;
                for (int i = 1; i <= n; i++)
                m *= i;
                System.out.println(m);
                if (n == 0 || n == 1)
                System.out.println(m);
				}
				} while (n < 0);{
				System.out.println("End");
			}
    }
	void zadanie9 (){
	int n;
        int count = 0;
		System.out.print("Enter your natural number: ");
        n = sr.nextInt();
        System.out.print("Number " + n + " is divided into: " );
        for(int i = 1; i <= n; i++){
			if ((n % i) == 0){
            count++;
            System.out.print(i + " ");
            }
        }
    System.out.println("Number of dividers: " + count);
    }
void zadanie10 (){	
		for (int a1=3,a2=2, i=1; i<=12; a1=2*a1-a2-2, i++) {  
		System.out.print(a + " ");
		}
	}
}
void zadanie11 (){	
		for (int a, a1=0,a2=1, i=1; i<=11; a=a1+a2, i++) {  
		System.out.print(a + " ");
		}
	}
}
