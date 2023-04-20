package com.bl.basic_core_program;
import java.util.Scanner;
public class LargestNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        float num1 = sc.nextFloat();
        System.out.println("Enter Second Number:");
        float num2 = sc.nextFloat();
        System.out.println("Enter Third Number:");
        float num3 = sc.nextFloat();
        //Checking Largest Number
        if (num1 > num2 && num1 > num3)
        {
            System.out.println(num1 + " is Greater");
        }
        else
        {
            if (num2 > num3)
            {
                System.out.println(num2 + " is Greater");
            }
            else
            {
                System.out.println(num3 +" is Greater");
            }
        }
    }
}
