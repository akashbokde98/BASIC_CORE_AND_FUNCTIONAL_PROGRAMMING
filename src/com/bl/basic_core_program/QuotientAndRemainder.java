package com.bl.basic_core_program;
import java.util.Scanner;

public class QuotientAndRemainder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dividend:");
        float dividend = sc.nextFloat();
        System.out.println("Enter Divisor:");
        float divisor = sc.nextFloat();
        //Computing Quotient and Remainder.
        float remainder = dividend % divisor;
        float quotient = dividend / divisor;
        System.out.println("Quotient:" + quotient);
        System.out.println("Remainder:" + remainder);
    }
}
