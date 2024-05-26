import java.util.Scanner;

/*
Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Diamond.

Example:
Input: ‘N’ = 3

Output:

  *
 ***
*****
*****
 ***
  *
 */
public class Pattern9 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print9(n);
    }
    public static void print9(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <(n-i-1); j++){
                System.out.print(" ");
            }
            for(int j = 0; j <(2*i+1); j++){
                System.out.print("*");
            }
            for(int j = 0; j <(n-i-1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = n-1; i >=0; i--){
            for(int j = 0; j <(n-i-1); j++){
                System.out.print(" ");
            }
            for(int j = 0; j <(2*i+1); j++){
                System.out.print("*");
            }
            for(int j = 0; j <(n-i-1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
