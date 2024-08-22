/*

Problem Statement
Arun is tasked with creating a program that prints prime numbers within a given range. 
The program should take two integers, start and end, as input, and output the prime numbers between these two values (inclusive).
Help Arun to complete the task using a 'for' loop.

Input format :
The input consists of two space-separated integers L and U, representing the starting range and ending range of the prime numbers.

Output format :
The output prints the prime numbers from the given starting range to the ending range separated by space.

Refer to the sample output for formatting specifications.

Code constraints :
1 ≤ L, U ≤ 150
L < U

Sample test cases :

Input 1 :
1 23

Output 1 :
2 3 5 7 11 13 17 19 23 

Input 2 :
23 69

Output 2 :
23 29 31 37 41 43 47 53 59 61 67 
*/

// You are using Java

import java.util.Scanner;
import java.lang.Math;

class primes
{
    
    static boolean is_prime(int num)
    {
        if (num <= 1)
            return false;
        
        for (int i = 2; i < num; i++)
        {
            if ((num % i) == 0)
                return false;
        }
        
        return true;
    }
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int lower = input.nextInt();
        int upper = input.nextInt();
        
        for (int i = lower; i <= upper; i++)
        {
            if (is_prime(i))
                System.out.println(i);
        }
    }
}
