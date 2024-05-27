package com.trishit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       String fruit = in.next();

       if (fruit.equals("mango")) {
           System.out.println("KING OF FRUIT");
       }
        if (fruit.equals("apple")) {
            System.out.println("A SWEET RED FRUIT");
        }
        else if (fruit.equals("orange")) {
            System.out.println("AN ORANGE FRUIT");
        }
        else {
            System.out.println("NO FRUIT");
        }
        }

}
