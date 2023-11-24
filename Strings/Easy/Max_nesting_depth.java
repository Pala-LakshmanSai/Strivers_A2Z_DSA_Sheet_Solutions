public class Max_nesting_depth {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int ans = 0; 
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            }
            if (s.charAt(i) == ')') {
                count--; 
            }
            ans = Math.max (count, ans);
        }
        System.out.println(ans);
    }
}