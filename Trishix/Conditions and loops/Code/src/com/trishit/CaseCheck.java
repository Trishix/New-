package com.trishit;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       char ch = sc.next().trim().charAt(0);
//        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");

        } else {
            System.out.println("Lowercase");
        }
    }
}
