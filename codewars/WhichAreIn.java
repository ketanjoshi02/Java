package codewars;

import java.util.Set;
import java.util.TreeSet;

public class WhichAreIn {
	public static void main(String[] args) {
		String[] a1 = {"arp", "live", "strong"};
		String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};
		//String[] a3 = {"tarp", "mice", "bull"};

		for(String l : inArray(a1,a2)) {
			System.out.println(l);
		}
	}
	public static String[] inArray(String[] array1, String[] array2) {		
		Set<String> result = new TreeSet<>();
		for(String ch : array1) 
		{
			for(String container : array2) 
			{
				if(container.contains(ch)) 
				{
					result.add(ch);
				}
			}
		}
		return result.toArray(new String[result.size()]);
	}
}