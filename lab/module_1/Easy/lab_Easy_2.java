/*

Problem Statement
Olivia is exploring the world of programming and has just started learning arrays. 
Today, she is curious to know how many vowels are there in a given character array. 
Guide her in writing the program.

Input format :
The input consists of a string.

Output format :
The output prints the count of vowels present in the given string.
Refer to the sample output for formatting specifications.

Code constraints :
The character array can have a maximum length of 1000.

Sample test cases :

Input 1 :
Programming

Output 1 :
3

Input 2 :
Hello

Output 2 :
2

Input 3 :
AeIoU

Output 3 :
5
*/

import java.util.Scanner;

class vowels
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String inp = input.next();
        
        inp = inp.toLowerCase();
        char[] ch_input = inp.toCharArray();
        
        int count = 0;
        
        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
        
        for (char i : ch_input)
        {
            for (char j : vowels)
            {
                if (i == j)
                    count++;
            }
        }
        
        System.out.println(count);
    }
}
