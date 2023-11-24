import java.util.ArrayList;
import java.util.Arrays;
//brute force approach
// public class Move_zeros_to_end {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 2, 0, 0, 3};
//         System.out.println(Arrays.toString(moveZeros(arr)));
//     }
//     public static int[] moveZeros(int[] a) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] != 0) {
//                 arr.add(a[i]);
//             }
//         }
//         for (int i = 0; i < arr.size(); i++) {
//             a[i] = arr.get(i);
//         }
//         int nz = arr.size();
//         for (int i = nz; i < a.length; i++) {
//             a[i] = 0;
//         }
//         return a;
//     }
// }



//optimal approach(2 pointer)
public class Move_zeros_to_end {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 0, 2, 4};
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            System.out.println(Arrays.toString(arr));           
            return;
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
