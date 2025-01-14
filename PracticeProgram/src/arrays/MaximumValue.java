package arrays;

public class MaximumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 3, 5, 2, 1, 6};
		
		int max = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum value is : " + max);
	}

}
