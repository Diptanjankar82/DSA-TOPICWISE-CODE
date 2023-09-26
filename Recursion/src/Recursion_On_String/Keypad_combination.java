package Recursion_On_String;

import java.util.ArrayList;
import java.util.Scanner;

public class Keypad_combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getKPC(str);
        System.out.print(words);
    }

    static String codes [] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str){

        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        //Base case
        char ch = str.charAt(0);
        String restStr = str.substring(1);
        ArrayList<String> rres = getKPC(restStr);

        ArrayList<String> mres = new ArrayList<>();

        String codeforch = codes[ch - '0'];
        for(int i =0; i<codeforch.length();i++){
            char chcode = codeforch.charAt(i);
            for (String rstr: rres
                 ) {
                mres.add(chcode+rstr);
            }
        }
        return mres;

    }

}
