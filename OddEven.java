package com.bridgelabz.basiccoreprograming;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A No");
        int Number = sc.nextInt();
        int Result = Number%2;
        if(Result==0){
            System.out.println(Number+"Number Is Even");
        }
        else {
            System.out.println(Number+"Number IS Odd");
    }
}}
