package com.bl.basic_core_program;
import java.util.Scanner;
public class VowelConsonant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Alphabet Character:");
        char ch = Character.toUpperCase(sc.next().charAt(0));//Converting Character to Upper Case.
        //Checking Character Whether Vowel or Consonant.
        switch (ch)
        {
            case 'A':
                System.out.println("Vowel");
                break;

            case 'E':
                System.out.println("Vowel");
                break;

            case 'I':
                System.out.println("Vowel");
                break;

            case 'O':
                System.out.println("Vowel");
                break;

            case 'U':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");
        }
    }
}
