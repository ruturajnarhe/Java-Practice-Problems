package arrays;

public class MinimumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {34, 65, 67, 39, 28, 57, 96, 12};
		int min = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimum value of array is : " + min);
	}

}
