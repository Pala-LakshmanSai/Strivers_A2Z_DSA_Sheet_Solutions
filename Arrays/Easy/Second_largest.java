//brute force approach (via sorting(only applicable for non repeating array))

// import java.util.Arrays;

// public class Second_largest{ 
// 	public static void main(String[] args) {
// 		int[] arr = {1, 4, 6, 2, -6, -10, 13, 40, -100};
// 		bubble(arr);
// 		System.out.println(arr[1]);
// 		System.out.println(arr[arr.length - 2]);
// 	}
// 	public static void bubble (int arr[]) {
// 		boolean swapped;
// 		for (int i = 0; i < arr.length - 1; i++) {
// 			swapped = false;
// 			for (int j = 1; j < arr.length - i; j++) {
// 				if (arr[j - 1] > arr[j]) {
// 					swap(arr, j - 1, j);
// 					swapped = true;
// 				}
// 			} 
// 			if (!swapped) {
// 				break;
// 			}
// 		}
// 	}
// 	public static void swap (int[] arr, int a, int b) {
// 		int temp = arr[a];
// 		arr[a] = arr[b];
// 		arr[b] = temp;
// 	}
// }



//better approach
// public class Second_largest {
// 	public static void main(String[] args) {
// 		int[] arr = {1, 4, 6, 2, -6, -10, 13, 40, -100};
// 		int large = Integer.MIN_VALUE;
// 		int small = Integer.MAX_VALUE;
// 		for (int i = 0; i < arr.length; i++) {
// 			if (arr[i] > large) {
// 				large = arr[i];
// 			}
// 			if (arr[i] < small) {
// 				small = arr[i];
// 			}
// 		}
// 		int second_large = Integer.MIN_VALUE;
// 		int second_small = Integer.MAX_VALUE;
// 		for (int i = 0; i < arr.length; i++) {
// 			if (arr[i] < second_small && arr[i] != small) {
// 			second_small = arr[i];
// 			}
// 			if (arr[i] > second_large && arr[i] != large) {
// 				second_large = arr[i];
// 			}
// 		}
// 		System.out.println(second_large);
// 		System.out.println(second_small);
// 	}
// }



//optimal approach

import java.util.Arrays;

public class Second_largest {
	public static void main(String[] args) {
		int arr[] = {10, 1, 2, 3, 7, 7, 5, -10};
		int sL = SecondLargest(arr);
		int sS = secondSmallest(arr);
		int[] ans = {sL, sS};
		System.out.println(Arrays.toString(ans));
	}
	public static int SecondLargest (int[] arr) {
		int large = arr[0];
		int second_large = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > large) {
				second_large = large;
				large = arr[i];
			}
			if (arr[i] < large) {
				if (arr[i] > second_large) {
					second_large = arr[i];
				}
			}
		}
		return second_large;
	}
	public static int secondSmallest (int[] arr) {
		int small = arr[0];
		int second_small = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < small) {
				second_small = small;
				small = arr[i];
			}
			if (arr[i] > small) {
				if (arr[i] < second_small) {
					second_small = arr[i];
				}
			}
		}
		return second_small;
	}
}