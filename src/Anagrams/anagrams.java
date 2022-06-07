package Anagrams;

import java.sql.SQLOutput;

public class anagrams {

    public static void main(String[] args) {

        //reverse words
        String str = "a1bcd";
        String str1 = "ef!gh";

        String s = new StringBuilder(str).reverse().toString();
        System.out.print(s + " ");
        String x = new StringBuilder(str1).reverse().toString();
        System.out.print(x);
        System.out.println();

        String str2 = "a1bcd!@#kgnr";
        char [] charArray = str2.toCharArray();
        System.out.print(str2);
        reverse(charArray);
        String rev = new String(charArray);
        System.out.println(rev);
    }
    //reverse words without non-letters
    public static void reverse(char[] str2) {

        int i = 0;
        int j = str2.length-1;
        while(i<j) {
            if(!Character.isLetter(str2[i])) {
                i++;
            }
            else if(!Character.isLetter(str2[j])) {
                j--;
                char x = str2[i];
                str2[i] = str2[j];
                str2[j] = x;
                i++;
                j--;
            }
        }
    }
}
