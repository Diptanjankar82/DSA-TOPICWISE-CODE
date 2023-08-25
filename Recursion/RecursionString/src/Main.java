public class Main {
    public static void main(String[] args) {
     String str = "Diptanjan";
     int start =0;
     int end = str.length()-1;
     char [] charArray = str.toCharArray();
      reverseString(charArray,start,end);
        System.out.println(charArray);
    }

    static void reverseString(char[]charArray,int start, int end){
            if(start >= end){
                return;
            }
            swap(charArray,start,end);
            reverseString(charArray,start+1, end-1);
    }

    public static void swap(char[]charArray, int a , int b){
        char temp= charArray[a];
        charArray[a] = charArray[b];
        charArray[b] = temp;
    }
}