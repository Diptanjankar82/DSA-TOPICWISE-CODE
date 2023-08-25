import java.util.Arrays;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "sipun";

        boolean isPalindrome = palindrome(str,0);
        System.out.println(isPalindrome);
    }
    public static boolean palindrome(String str, int start){
        if(start >= str.length()/2){
            return true;
        }
        if(str.charAt(start) != str.charAt(str.length()-start-1)){
            return false;
        }
        return palindrome(str, start+1);

    }
}
