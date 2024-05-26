import java.util.Scanner;

/*
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Triangle.

Example:
Input: ‘N’ = 3

Output:

  *
 ***
*****
 */
public class Pattern7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print7(n);
    }
    public static void print7(int n){
        for(int i =0; i<n;i++){
            for(int j =0; j < (n-i-1); j++){
                System.out.print("-");
            }
            for(int j = 0 ; j < (2*i)+1; j++){
                System.out.print("*");
            }
            for(int j =0; j < (n-i-1); j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
