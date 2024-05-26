/*
Problem statement
Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Increasing Letter Triangle.

Example:
Input: ‘N’ = 3

Output:

A
A B
A B C
 */

import java.util.Scanner;

public class Pattern14 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print14(n);
    }

    public static void print14(int n){
        for(int i =0; i<n; i++){
            for(int j = 0; j <= i;j++){
                char c = (char)((int)'A'+j);
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
