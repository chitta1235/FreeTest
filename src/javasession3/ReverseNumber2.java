package javasession3;

public class ReverseNumber2 {

	public static void main(String[] args) {
		int num=4321,reversed=0;
		while(num!=0){
			int digits=num%10;
			reversed =reversed*10+digits;
			num/=10;
		}
		System.out.println("reversed number is:"+reversed);

	}

}
