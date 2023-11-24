import java.util.ArrayList;
import java.util.Arrays;
//my answer
// public class Remove_duplicates {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 5));
//         for (int i = 0; i < arr.size() - 1; i++) {
//             if (arr.get(i) == arr.get(i + 1)) {
//                 arr.remove(i);
//                 i = i - 1;
//             }
//         }
//         System.out.println(arr);
//     }
// }



//optimal solution
public class Remove_duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        System.out.println(i + 1);
    }
}