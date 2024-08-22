/*

Problem Statement
Imagine you are developing a utility that analyzes data stored in an integer array. 
Your program needs to provide valuable insights into the dataset and one specific requirement is to count the number of elements that are multiples of 3. 
This feature will help the users understand how many values in the dataset are multiples of 3.

Input format :
The first line of input consists of an integer N, representing the number of data stored in the array.
The second line consists of N space-separated integers, representing the data.

Output format :
The output prints the count of data that are multiples of 3.
﻿Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:
1 ≤ N ≤ 20
1 ≤ data ≤ 104

Sample test cases :

Input 1 :
4
3 6 9 12

Output 1 :
4

Input 2 :
4
1 2 4 7

Output 2 :
0

Input 3 :
6
9 15 21 85 43 84

Output 3 :
4
*/

import java.util.Scanner;

class multiples
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int array_size = input.nextInt();
        
        int [] array = new int[100];
        
        int elem = 0;
        int count = 0;
        
        for (int i = 0; i < array_size; i++)
        {
            elem = input.nextInt();
            
            if ((elem % 3) == 0)
                count += 1;
                
        }
        
        System.out.println(count);
    }
}

