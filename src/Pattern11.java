/*
Problem statement
Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the N-Binary Number Triangle.

You are required to print the pattern as shown in the examples below.

Example:
Input: ‘N’ = 3

Output:

1
0 1
1 0 1
*/

import java.util.Scanner;

public class Pattern11 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print11(n);
    }
    public static void print11(int n){
        for(int i =0; i < n ;i++){
            int start = 0;
            if(i%2 == 0){
                start = 1;
            }
            for(int j = 0; j<= i;j++){
                System.out.print(start+" ");
                start = 1-start;
            }
            for(int j = i; j < n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

