package com.javalearn.main;

import java.util.Scanner;
import java.lang.String;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        sc.close();
        System.out.println("The character " + ch + " appears " + count + " times in the string " + str);
    }
}
