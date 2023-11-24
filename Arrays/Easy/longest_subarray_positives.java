public class longest_subarray_positives {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;
        System.out.println(longestSubarrayWithSumK(a, k));
    }
    public static int longestSubarrayWithSumK(int[] a, long k) {
        int length = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum == k) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }
        return length;
    }
}
