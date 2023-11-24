public class max_consecutive_ones {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 2, 1, 1, 1, 1, 4, 5, 1, 1};
        int count = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }           
            else {
                count = 0;
            }
            ans = Math.max(count, ans);
        }
        System.out.println(ans);
    }    
}
