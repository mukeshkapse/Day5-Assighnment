package com.bridgelabz.basiccoreprograming;

import java.util.Scanner;

public class FindLargeNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Three No.");
         int a = scanner.nextInt();
         int b = scanner.nextInt();
         int c = scanner.nextInt();
        if(a>b && a>c) {
            System.out.println("Largest no is" + a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Largest no is " +b);
    }
        else if (c>a && c>b)
        {
            System.out.println("Larget no is "+c);
        }
        else{
            System.out.println("Two or more Largestinit No is Equal ");
        }
    }}
