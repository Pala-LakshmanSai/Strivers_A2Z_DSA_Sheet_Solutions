import java.util.Arrays;
//optimal brute force approach
// public class Left_rotate_by_k {
//     public static void main(String[] args) {
//         int arr[] ={1, 2, 3, 4, 5};
//         int k = 2;
//         int temp[] = new int[arr.length];
//         for (int i = k; i < arr.length; i++) {
//             temp[i - k] = arr[i];
//         }
//         int j = 0;
//         for (int i = arr.length - k; i < arr.length; i++) {
//             temp[i] = arr[j];
//             j++;
//         }
//         System.out.println(Arrays.toString(arr));
//         System.out.println(Arrays.toString(temp));
//     }
// }


//reversal approach
public class Left_rotate_by_k {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; 
        Reverse(arr, 0, k - 1);
        Reverse(arr, k, arr.length - 1);
        Reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void Reverse (int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}