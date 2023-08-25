public class PalindromeArray {
    public static void main(String[] args) {
        int arr[] = {2,2,3,2,1};
        int begin =0;
        int end = arr.length -1;
        isPalindrome(arr,begin,end);
        boolean ans = isPalindrome(arr,begin,end);
        System.out.println(ans);
    }

    public static boolean isPalindrome(int arr[], int begin, int end){
        //basecase
        if(begin >= end){
            return true;
        }

        //recursieFunction

        if(arr[begin] != arr[end]){
            return false;
        }
       return isPalindrome(arr,begin+1,end-1);

    }


}
