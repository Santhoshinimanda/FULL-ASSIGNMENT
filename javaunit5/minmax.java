package jupiter;

import java.lang.reflect.Array;
import java.util.Arrays;

//create a class of MinMaxFinder
public class MinMaxFinder {
	
		public int[] arr(int [] numbers) {
			Arrays.sort(numbers);
			
			int [] arr1= {numbers[0],numbers[numbers.length-1]};
			
			return arr1;
		}
		
}
