package arrays;

public class SecondSmallestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 6, 8, 2, 4, 3, 1, 5, 7 };

		// first approach
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Second smallest element is : " + a[1]);

		// Second approach
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < smallest) {
				secondSmallest = smallest;
				smallest = a[i];
			} else if (a[i] < secondSmallest && a[i] != smallest) {
				secondSmallest = a[i];
			}
		}
		if (secondSmallest == Integer.MAX_VALUE) {
			System.out.println("There is no second smallest element in list");
		} else {
			System.out.println("Second smallest element is : " + secondSmallest);
		}
	}

}
