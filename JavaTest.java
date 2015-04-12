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
			if (a ==4) {
				zadanie4 ();
			}
			if (a ==5) {
				zadanie5 ();
			}
			if (a ==6) {
				zadanie6 ();
			}
			if (a ==7) {
				zadanie7 ();
			}
			if (a ==8) {
				zadanie8 ();
			}
			
			
		}
		
	}
	void zadanie1 (){
		int n;
        n=( (int)(Math.random()*7) - 3 );
		System.out.println("Number of randomly = "+n);
	}

	void zadanie2 (){
		int n;
		int b;
		int c;
		System.out.print("Enter the  number = ");
		n = sr.nextInt();
		b=(2*n+1);
		c=( (int)(Math.random()*b) - n );
		System.out.println("Number of randomly = "+c);
	}
	void zadanie3 (){
		int m;
		int n;
		double z;
		System.out.print("Enter the first number = ");
		m = sr.nextInt();
		System.out.print("Enter the second number = ");
		n = sr.nextInt();
		if (m>=n) {
			System.out.println("Incorrectly entered numbers!");
		} else if (n>=m){
			z = Math.floor( Math.random( ) * (n - m + 1) ) + m;
			System.out.println("Number of randomly = "+z);
		}
	}
		void zadanie4 (){
		int a = 5;
        int b = 155;
        int c = (int) (Math.random()*a + Math.random()*b);
        if(c >= 25 && c <= 100){
			System.out.println("The number " +c+ " is contained in the interval (25,100)");
        }
        else{
            System.out.println("The number "+c+" is not contained in the interval (25,100)");
        }
    }
		void zadanie5 (){
		int n;
        n=( (int)(Math.random()*7) - 3 );
		System.out.println("Number of randomly = "+n);
	}
	void zadanie6 (){
		final int min = 100;
        final int max = 999;
        int first;
        int second;
        int third;
        int value_max;
        int value = (int) (min + Math.random() * (max - min)) ;
        if(value > min && value < max) {
            first = (int) Math.floor(value / 100);
            second = (int) Math.floor((value - first * 100) / 10);
			third = (int) Math.floor(value - first * 100 - second * 10);
            System.out.println("Three-digit number = "  + value);
				if(first > second){
                if (first>third)
                    value_max=first;
                else
                    value_max=third;
                }
                else{
                if (second>third)
                    value_max=second;
                else
                    value_max=third;
                }
				
				System.out.println("The maximum number of = "  + value_max);
 
                }
        }
		void zadanie7 (){
		final int a = 28800;
        final int b = 60;
        final int c = 60;
        int d = (int) (Math.random()* a);
        int n = (d / b) / c;
        System.out.println(d);
        System.out.println("Oсталось " + n + " ч");
    }
	void zadanie8 (){
		boolean a;
		boolean b;
		boolean c;
		System.out.print("Enter the first number = ");
		a = sr.nextInt();
		System.out.print("Enter the second number = ");
		b = sr.nextInt();
		System.out.print("Enter the third number = ");
		c = sr.nextInt();
		if (a<b<c) {
			System.out.println("Increasing sequence: "+a+", "+b+", "+c);
			if (a<c<b) {
				System.out.println("Increasing sequence: "+a+", "+c+", "+b);
				if (c<b<a) {
					System.out.println("Increasing sequence: "+c+", "+b+", "+a);
					if (c<a<b) {
						System.out.println("Increasing sequence: "+c+", "+a+", "+b);
						if (b<a<c) {
							System.out.println("Increasing sequence: "+b+", "+a+", "+c);
							if (b<c<a) {
								System.out.println("Increasing sequence: "+b+", "+c+", "+a);
								
							
							}
						}	
					}
			    }
			}
		}
    }
	

}


			