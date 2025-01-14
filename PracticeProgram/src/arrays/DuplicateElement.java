package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 4, 3, 2, 2, 1, 3};
		
		// BRUTE FORCE METHOD
		System.out.print("Duplicate element are : ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if((arr[i] == arr[j]) && (i != j)) {
					System.out.print(arr[j] + " ");
				}
			}
		}
		
		
		// SET INTERFACE 
		System.out.print("\nDuplicate elements are : ");
		Set<Integer> s = new HashSet<>();
		
		for(int no : arr) {
			if(s.add(no) == false) {
				System.out.print(no + " ");
			}
		}
		
		Map<Integer, Integer> hm = new HashMap<>();
		for(int no : arr) {
			Integer count = hm.get(no);
			if(count == null) {
				hm.put(no, 1);
			} else {
				count = count + 1;
				hm.put(no, count);
			}
		}
		System.out.print("\nDuplicate elements are : ");
		Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
		for(Map.Entry<Integer, Integer> me : es) {
			if(me.getValue() > 1) {
				System.out.print(me.getKey() + " ");
			}
		}
	}

}
