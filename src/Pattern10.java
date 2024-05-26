/*Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.

Example:
Input: ‘N’ = 3

Output:

*
**
***
**
*

 */

import java.util.Scanner;

public class Pattern10 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print10_better(n);
    }
    public static void print10(int n){
        for(int i =0; i < n ;i++){
            for(int j = 0; j<= i;j++){
                System.out.print("* ");
            }
            for(int j = i; j < n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        int stars = (2*n-1);
        for(int i =n; i < stars ;i++){
            for(int j = 0; j < (stars-i);j++){
                System.out.print("* ");
            }
            for(int j = (n-1); j >0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print10_better(int n){
        for(int i =0; i <= (2*n-1) ;i++){
            int stars = i;
            if(i > n){
                stars = (2*n -i);
            }
            for(int j = 1; j <= stars;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
