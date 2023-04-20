package com.bl.basic_core_program;

public class SwapNumbers
{
    public static void main(String[] args)
    {
        int num1 = 12;
        int num2 = 24;
        int temp = 0;

        System.out.println("---Before Swaping---");
        System.out.println("First Number:" + num1);
        System.out.println("Second Number:" + num2);

        //First Number Assigned to Temporary.
        temp = num1;
        //Second Number Assigned to First Number.
        num1 = num2;
        //Temp Assigned to Second Number.
        num2 = temp;

        System.out.println("---After Swaping---");
        System.out.println("First Number:" + num1);
        System.out.println("Second Number:" + num2);
    }
}
