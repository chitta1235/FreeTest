package javasession3;

public class ReverseNumber1 {

	public static void main(String[] args) {
		int num=1234, reversed=0;
		while(num!=0){
			int digits=num%10;
			reversed=reversed*10+digits;
			num/=10;
			
		}
		System.out.println("reversed number is"+reversed);

	}

}
