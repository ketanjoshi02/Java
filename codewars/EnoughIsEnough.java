package codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EnoughIsEnough {

	public static void main(String[] args) {
		int[] elements = {1,2,3,1,2,1,1,2,0,0,0,0};
		int maxOccurrences = 3;
		for(int i:deleteNth(elements, maxOccurrences)) 
		{
			System.out.print(i+" ");
		}

	}
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		 
		List<Integer> arr = Arrays.stream(elements).boxed().collect(Collectors.toList());
		if(maxOccurrences==0)
		{
			arr.removeAll(arr);
		}
		else {
			for(int i=0;i<arr.size();i++) {
				while(Collections.frequency(arr,arr.get(i))>maxOccurrences) {
					arr.remove(arr.lastIndexOf(arr.get(i)) );
				}
			}
		}
		return arr.stream().mapToInt(i->i).toArray();
	}
}