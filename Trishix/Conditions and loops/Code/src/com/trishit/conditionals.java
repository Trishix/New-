package com.trishit;

public class conditionals {
    public static void main(String[] args) {
       int salary = 25000;
//       if(salary > 10000) {
//           salary = salary + 2000;
//
//       } else {
//           salary = salary + 1000;
//
//       }
        if (salary>10000) {
            salary += 2000;
        } else if (salary>20000) {
            salary += 3000;

        }
         else if (salary>30000) {
             salary += 4000;
        }
        System.out.println(salary);
    }
}
