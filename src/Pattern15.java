import java.util.Scanner;

/*
Problem statement
Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Reverse Letter Triangle.

You must print a matrix corresponding to the given Reverse Letter Triangle.

Example:
Input: ‘N’ = 3

Output:

A B C
A B
A
 */
public class Pattern15 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print15(n);
    }

    public static void print15(int n){
        for(int i =0; i<n; i++){
            for(int j = 0; j <= (n-i-1);j++){
                char c = (char)((int)'A'+j);
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
