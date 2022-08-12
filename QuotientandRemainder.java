package com.bridgelabz.basiccoreprograming;

import javax.swing.*;
import java.util.Scanner;

public class QuotientandRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Divider No.");
        int Divider = scanner.nextInt();
        System.out.println("Enter The Divisor No. ");
        int Divisor = scanner.nextInt();
        Double Quotientand = (double) (Divider/Divisor);
        System.out.println("Quotientand is "+Quotientand);
        int remainder = Divider % Divisor;
        System.out.println("Remainder is "+remainder);
}}
