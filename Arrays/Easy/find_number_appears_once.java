//optimal approach
// public class find_number_appears_once {
//     public static void main(String[] args) {
//         int[] arr = {4, 1, 2, 1, 2};
//         int ans = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             ans = ans ^ arr[i];
//         }
//         System.out.println(ans);
//     }
// }


//brute force approach
public class find_number_appears_once {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 3, 4, 5, 2, 1, 2};
        for (int i : arr) {
            int count = 0;
            for (int j : arr) {
                if (i == j) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(i);
                return;
            }
            count = 0;
        }
    }
}