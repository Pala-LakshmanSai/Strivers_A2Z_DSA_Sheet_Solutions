import java.util.Arrays;

//brute force approach
public class Left_rotate {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4};
        int[] temp = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            temp[i - 1] = arr[i];
        } 
        temp[arr.length - 1] = arr[0];
        System.out.println(Arrays.toString(temp));
    }
}
//optimal approach
// public class Left_rotate {
//         public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int temp = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             arr[i - 1] = arr[i];
//         }         
//         arr[arr.length - 1] = temp;
//         System.out.println(Arrays.toString(arr));
//     }
// }
