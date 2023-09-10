package org.basiclogics;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean PrimeNumber(){
        System.out.print("Give a number");
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        boolean prime =true;
//        if(number>1){

            for(int i=2;i<number;i++){
                if(number%i==0){
                    prime =false;
                }
            }
            if(prime==false) {
                System.out.print("notprime");
            }
            else{
                System.out.print("prime");
            }

        return true;
    }
    public static void main(String[] args){
        PrimeNumber();
    }
}