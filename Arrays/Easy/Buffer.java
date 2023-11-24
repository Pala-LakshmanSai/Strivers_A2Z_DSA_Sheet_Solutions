import java.util.ArrayList;

public class Buffer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;
        int count = 0;
        int sum = 0;
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum > k) {
                continue;
            }
            sum += arr[i];
            if (sum == k) {
                sum  = 0;
                l = Math.max(l, count);
                count = 0;
            }
            count++;
            sum +=arr[i];
        }
        System.out.println(l);
    }    
}