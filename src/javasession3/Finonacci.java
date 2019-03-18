package javasession3;

import java.util.Scanner;

class Baga{
	int fibo(int n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}
}
public class Finonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Fibonacci term is:");
		int n=sc.nextInt();
		System.out.println("fibonacii series is:\n");
		Baga c=new Baga();
		for(int i=0;i<n;i++){
			System.out.print(""+c.fibo(i));
			
		}
		

	}

}
