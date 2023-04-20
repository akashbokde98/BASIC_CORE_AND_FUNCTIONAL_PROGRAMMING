package com.bl.basic_core_program;
import java.util.Scanner;
public class OddEven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number To Check Odd or Even:");
        float num = sc.nextFloat();
        //Computing Number Whether Odd Or Even.
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }
}
