package com.trishit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Trishit Swarnakar");
                break;
            case 2:
                System.out.println("Asmit Chanda");
                break;
                case 3:
                    switch (Department) {
                        case "IT":
                            System.out.println("IT Department");
                            break;
                        case "Management":
                            System.out.println("Management Department");
                            break;
                        default:
                            System.out.println("Department not found");


                    }
                    break;
            default:
                System.out.println("Enter correct EmpID");
        }
    }
}
