package javasession3;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class DuplicatesElementofArray {

	public static void main(String[] args) {
		Integer[] numbers={1,2,3,4,5,5,6,6,7,8};
		System.out.println(Arrays.toString(numbers));
		LinkedHashSet<Integer> linkedHashset=new LinkedHashSet(Arrays.asList(numbers));
		Integer[]  numbersWithoutDuplicates=linkedHashset.toArray(new Integer[]{});
		System.out.println(Arrays.toString(numbersWithoutDuplicates));
		
		

	}

}
