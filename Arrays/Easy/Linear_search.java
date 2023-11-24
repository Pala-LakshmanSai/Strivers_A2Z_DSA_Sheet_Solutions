public class Linear_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,};
        int target = 22; 
        System.out.println(LS(arr, target));
    }
    public static int LS (int[] arr, int target) {
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }   
        return -1;
    }
}
