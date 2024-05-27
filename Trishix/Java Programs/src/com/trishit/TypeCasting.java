package com.trishit;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

//        automatic type promotion in expressions
        int a = 258;
        byte b = (byte)(a);
        System.out.println(b);

    }
}
