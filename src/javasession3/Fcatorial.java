package javasession3;

import java.util.Scanner;

public class Fcatorial {

	public static void main(String[] args) {
		int n,i;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("factorai of "+n+"="+fact);

	}

}
