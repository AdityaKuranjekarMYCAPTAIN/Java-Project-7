import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0 ;
		int b = 1 ;
		int c ;
		System.out.println("How many numbers of fibonacci series do you want to see? ");
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		System.out.print(a+" "+b);
		for(int i=1 ; i<=(f-2) ; i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
//By Aditya Kuranjekar--------------->>>>>>>>>>>>>>>>HAPPY CODING<<<<<<<<<<<<<<<-----------------
