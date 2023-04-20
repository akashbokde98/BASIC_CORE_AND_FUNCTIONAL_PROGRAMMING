package com.bl.basic_core_program;
import java.lang.Math;
import java.util.Random;

public class FlipCoin
{
    public static void main(String[] args)
    {
        int head = 0;
        int tail = 0;
        int numOfFlip = 2;

        for (int i = 1; i <= numOfFlip; i++)
        {
            int value =(int)(Math.random() * 2);
            if (value == 1)
                System.out.println("Head");
            else
                System.out.println("Tail");
        }
    }
}
