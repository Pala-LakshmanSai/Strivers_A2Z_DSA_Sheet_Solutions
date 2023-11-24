//my answer
// public class find_missing {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 4, 5};
//         System.out.println(missing(arr));
//     }
//     public static int missing(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != i + 1) {
//                 return i + 1;    
//             }
//         }   
//         return -1;
//     }
// }



//optimal approach(using xor)
public class find_missing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            xor1 ^= i + 1;
            xor2 ^= arr[i]; 
        }
        xor1 += arr.length;
        System.out.println(xor1 ^ xor2);
    }
}