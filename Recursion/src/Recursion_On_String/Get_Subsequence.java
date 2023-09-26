package Recursion_On_String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Get_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String restStr = str.substring(1);
        ArrayList<String> rres = gss(restStr);

        ArrayList<String> mres = new ArrayList<>();
        for(String strr: rres ){
            mres.add(""+ strr);
        }
        for(String strr: rres ){
            mres.add(ch+ strr);
        }
        Collections.sort(mres);
        return mres;
    }
}
