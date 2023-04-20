package com.bl.basic_core_program;

public class HarmonicNumber
{
    public static void main(String[] args)
    {
        int N = 10; //Harmonic Value
        double result = 0;

        while (N != 0)
        {
            result = result + (double) 1/N ;

            System.out.println(result);
            N--;
        }
        System.out.println("Nth Harmonic Vlalue is:" + result);
    }
}
