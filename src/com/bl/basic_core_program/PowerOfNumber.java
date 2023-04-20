package com.bl.basic_core_program;
import java.util.Scanner;

public class PowerOfNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int base = 2;
        int power = 1 ;
        System.out.println("Enter The Power Of "+base+" :");
        int N = in.nextInt();

        if (N > 0 && N < 31)
        {
            for (int i = 1; i <= N; i++)
            {
                power *= base;
                System.out.println(base + "^" + i + " " + power);
            }
        }
        else
        {
            System.out.println("Enterd Power is Out Of Range!");
        }
    }
}
