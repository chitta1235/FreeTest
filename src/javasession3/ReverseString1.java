package javasession3;

public class ReverseString1 {

	public static void main(String[] args) {
	   String str="binay";
	   char[]strArray=str.toCharArray();
	   for(int i=strArray.length-1;i>=0;i--){
		   System.out.print(strArray[i]);
		   
	   }

	}

}
