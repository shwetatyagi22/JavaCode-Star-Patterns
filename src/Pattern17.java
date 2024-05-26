/*
Problem statement
Sam is curious about Alpha-Hills, so he decided to create Alpha-Hills of different sizes.

An Alpha-hill is represented by a triangle, where alphabets are filled in palindromic order.

For every value of ‘N’, help sam to return the corresponding Alpha-Hill.

Example:
Input: ‘N’ = 3

Output:
    A
  A B A
A B C B A
 */

import java.util.Scanner;

public class Pattern17{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print15(n);
    }

    public static void print15(int n){

        for(int i =0; i < n; i++){
            for(int j = 0; j < (n-i-1);j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int b =(2*n-1)/2;
            for(int j = 1; j <= (2*i+1);j++){
                System.out.print(ch);
                if(j>b) ch--;
                else
                    ch++;
            }
            for(int j = 0; j < (n-i-1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}