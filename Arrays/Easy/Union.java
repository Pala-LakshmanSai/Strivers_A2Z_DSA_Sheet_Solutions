import java.util.ArrayList;
import java.util.Collections;
//my answer
public class Union {
        public static void main(String[] args) {
        int[] a = {4, 3};
        int[] b = {1, 2, 3, 3};
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : a) {
            arr.add(i);
        }
        for (int i : b) {
            boolean isPresent = false;
            for (int j : a) {
                if (j == i) {
                    isPresent = true;
                }
            }
            if (!isPresent) {
                arr.add(i);
            }
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
// import java.util.HashSet;



//Using set 
// public class Union {
//     public static void main(String[] args) {
//         int[] a = {1, 2, 4, 5};
//         int[] b = {3, 4, 5, 6};
//         HashSet<Integer> arr = new HashSet<>();
//         for (int i = 0; i < a.length; i++) {
//             arr.add(a[i]);
//         }
//         for (int i = 0; i < b.length; i++) {
//             arr.add(b[i]);
//         }
//         System.out.println(arr);
//     }
// }