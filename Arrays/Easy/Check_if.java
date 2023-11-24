//brute force approach
public class Check_if {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 31, 45};
        System.out.println(check(arr));
    }
    public static int check(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
}



// optimal approach
