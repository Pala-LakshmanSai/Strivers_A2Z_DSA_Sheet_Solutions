import java.util.*;
//brute force approach
// public class Two_sum {
//     public static void main(String[] args) {
//         int arr[] = {1, 6, 5, 8, 11};
//         int target = 14;
//         System.out.println(Arrays.toString(twosum(arr, target)));
//     }
//     public static int[] twosum(int[] arr, int target) {
//         int[] ans = {-1, -1};
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 int sum = arr[i] + arr[j];
//                 if (sum == target) {
//                     ans[0] = i;
//                     ans[1] = j;
//                     return ans;
//                 }
//             }
//         }
//         return ans;
//     }
// }


//optimal approach (two pointer)
