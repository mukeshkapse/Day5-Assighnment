package com.bridgelabz.basiccoreprograming;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

        int n, thc = 0, ttc = 0;
        double heads, tails;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The Number You Want To Flip: ");
        n = scan.nextInt();


        for (int i = 0; i < n; i++) {
            double random = Math.random();
            if (random < 0.5)
                ttc++;
            else
                thc++;
        }

        heads = thc / (double) n * 100;
        tails = thc / (double) n * 100;
        System.out.println("Parcentage of Head: " + heads );
        System.out.println("Percentage of Tails: " + tails );
}}
