package com.bl.basic_core_program;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //Taking User Input As Year.
        System.out.println("Enter Year:");
        int year = scan.nextInt();
        //Logic To Determine Leap Year.
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is Not a Leap Year");
    }
}
