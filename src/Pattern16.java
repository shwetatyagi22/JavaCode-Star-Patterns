/*
Problem statement
Sam is curious about Alpha-Ramp, so he decided to create Alpha-Ramp of different sizes.

An Alpha-Ramp is represented by a triangle, where alphabets are filled from the top in order.

For every value of ‘N’, help sam to return the corresponding Alpha-Ramp.

Example:
Input: ‘N’ = 3

Output:
A
B B
C C C
 */

import java.util.Scanner;

public class Pattern16 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print15(n);
    }

    public static void print15(int n){
        for(int i =0; i<n; i++){
            char c = (char)((int)'A'+i);
            for(int j = 0; j <= i;j++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
