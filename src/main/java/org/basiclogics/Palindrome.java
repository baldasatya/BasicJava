package org.basiclogics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        System.out.print("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int Given_number = sc.nextInt();
        int Orginal_Number = Given_number;
        int Reverse_number = 0;
        while(Orginal_Number!=0){
            int Reminder =Orginal_Number%10;
            Reverse_number=(Reverse_number*10)+Reminder;
          Orginal_Number=  Orginal_Number/10;
        }
        if(Reverse_number==Given_number){
            System.out.print("given number is a palindrome number");
        }
        else{
            System.out.print("Not a palindrome number");
        }
    }
}
