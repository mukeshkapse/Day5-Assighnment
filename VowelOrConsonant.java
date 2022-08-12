package com.bridgelabz.basiccoreprograming;

import java.util.Scanner;

public class VowelOrConsonant
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Alphabate");
        String Alphabate = scanner.nextLine();
        System.out.print(Alphabate);
        //String Alphabate;
       //Vowel a,e,i,o,u;
        if (Alphabate.length()<=1)
        {
        switch (Alphabate){
            case "a":
                System.out.println("  Vowel");
                break;
            case "e":
                System.out.println("  Vowel");
                break;
            case "i":
                System.out.println("  Vowel");
                break;
            case "o":
                System.out.println("  Vowel");
                break;
            case "u":
                System.out.println("  Vowel");
                break;
            default:
                System.out.println("  Consonate");
            }

        }
        else{
            System.out.println("  Not A Valid Alphabate Plz Enter Again");
    }
}}
