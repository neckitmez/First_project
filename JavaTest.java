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
			if (a ==9) {
				zadanie9 ();
			}
		}
	}/*
Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
*/
void zadanie1 (){
	for (int a=1000; a<=9999; a=a+3) {
	if(a == 9999) {
    break;
	}
	System.out.print(a + " ");
}
System.out.print("Stop!");
}
/*
Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
*/
void zadanie2 (){
   	for (int a=1; a<=109; a=a+2) {
	if(a == 109) {
    break;
		}
		System.out.print(a + " ");
		}
		System.out.print("Stop!");
	}
	/*
Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
*/
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
	/*
	Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
	*/
void zadanie4 (){	
   	for (int a=2; a<=1048577; a=a*2) {
	if(a == 1048577) {
    break;
		}
		System.out.print(a + " ");
		}
		System.out.print("Stop!");
	}
	/*	
Выведите на экран все члены последовательности 2an-1–1, где a1=2, которые меньше 10000.
	*/
void zadanie5 (){
	for (int a=2, i=1; i<=10; a=2*a-1, i++) {
		System.out.print(a + " ");
		}
	}
	/*
	Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166.
	*/
void zadanie6 (){	
   	for (int a=-166; a<=10000; a=a*2+200) {
	if(a == 10000) {
    break;
		}
		System.out.print(a + " ");
		}
		System.out.print("Stop!");
	}
/*
Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
*/	
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
	/*
	Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
	*/
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
	/*
	Проверьте, является ли введённое пользователем с клавиатуры натуральное число — простым. Постарайтесь не выполнять лишних действий (например, после того, как вы нашли хотя бы один нетривиальный делитель уже ясно, что число составное и проверку продолжать не нужно). Также учтите, что наименьший делитель натурального числа n, если он вообще имеется, обязательно располагается в отрезке [2; √n].
	*/
	void zadanie9 (){
	int n;
        int count = 0;
		System.out.print("Enter your natural number: ");
        Scanner sr = new Scanner(System.in);
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
}

