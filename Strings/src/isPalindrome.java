public class isPalindrome {
    public static void main(String[] args) {
        String str = "ram";
        System.out.println(checkpalindrome(str));
    }

    private static boolean checkpalindrome(String str) {
        int n = str.length();
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
