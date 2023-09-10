package org.basiclogics;

import java.util.Scanner;

public class StringRreverse {
    public static void reverseString()throws Exception{
        System.out.print("Given a string ");
        Scanner sc = new Scanner(System.in);
        String GivenString =sc.next();
        String RevString = "";
        char letter;
        for(int i=0;i<GivenString.length();i++){
            letter = GivenString.charAt(i);
            RevString=letter+RevString;
        }
        System.out.print(RevString);
    }
    public static void main(String[] args) throws Exception {
        reverseString();
    }
}
