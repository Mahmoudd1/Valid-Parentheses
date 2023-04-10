import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.isValid("()"));  // Input: s = "()" , Output: true
        System.out.println(sol.isValid("()[]{}"));  //Input: s = "()[]{}" , Output: true
        System.out.println(sol.isValid("(]"));  //Input: s = "(]" , Output: false
        System.out.println(sol.isValid("["));   //Input: s = "[" , Output: false
        System.out.println(sol.isValid("}"));   //Input: s = "}" , Output: false

    }
}