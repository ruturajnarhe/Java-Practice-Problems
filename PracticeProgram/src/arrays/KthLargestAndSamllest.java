package arrays;

public class KthLargestAndSamllest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 8, 12, 7, 6, 2, 4, 9, 14, 3};
		
		int k = 2;
		
		// largest
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if(i == k-1) {
				System.out.println(k + "th largest element is : " + arr[i]);
				break;
			}
		}
		
		// smallest
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if(i == k - 1) {
				System.out.println(k + "th smallest element is : " + arr[i]);
				break;
			}
		}
	}

}
