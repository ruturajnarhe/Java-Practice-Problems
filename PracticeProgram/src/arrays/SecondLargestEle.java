package arrays;
import java.lang.Integer;

public class SecondLargestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {6, 8, 2, 4, 3, 1, 5, 7};
		
		// first approach
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Second largest element is : " + a[1]);
		
		
		// Second approach
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} else if(a[i] > secondLargest && a[i] != largest) {
				secondLargest = a[i];
			}
		}
		if(secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest element in the list");
		} else {
			System.out.println("Second largest element is : " + secondLargest);
		}
 	}

}
