//brute force approach
public class Largest_element {
    public static void main(String[] args) {
        int arr[] = {12, 45, 67, -30};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
 
}



//recursive approach
